package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.CalculateMatrix
import typings.playcanvas.pc.callbacks.XrError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Camera Component.
  * @example
  * // Add a pc.CameraComponent to an entity
  var entity = new pc.Entity();
  entity.addComponent('camera', {
  nearClip: 1,
  farClip: 100,
  fov: 55
  });
  * @example
  * // Get the pc.CameraComponent on an entity
  var cameraComponent = entity.camera;
  * @example
  * // Update a property on a camera component
  entity.camera.nearClip = 2;
  * @property projection - The type of projection used to render the camera. Can be:
  
  * {@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum resembles a truncated pyramid.
  * {@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera frustum is a cuboid.
  
  Defaults to pc.PROJECTION_PERSPECTIVE.
  * @property nearClip - The distance from the camera before which no rendering will take place.
  * @property farClip - The distance from the camera after which no rendering will take place.
  * @property aspectRatioMode - The aspect ratio mode of the camera. Can be pc.ASPECT_AUTO (default) or pc.ASPECT_MANUAL. ASPECT_AUTO will always be current render target's width divided by height. ASPECT_MANUAL will use the aspectRatio value instead.
  * @property aspectRatio - The aspect ratio (width divided by height) of the camera. If aspectRatioMode is ASPECT_AUTO, then this value will be automatically calculated every frame, and you can only read it. If it's ASPECT_MANUAL, you can set the value.
  * @property horizontalFov - Set which axis to use for the Field of View calculation. Defaults to false (use Y-axis).
  * @property fov - The field of view of the camera in degrees. Usually this is the Y-axis field of
  view, see {@link pc.CameraComponent#horizontalFov}. Used for {@link pc.PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
  * @property orthoHeight - The half-height of the orthographic view window (in the Y-axis). Used for
  {@link pc.PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
  * @property priority - Controls the order in which cameras are rendered. Cameras with smaller values for priority are rendered first.
  * @property clearColor - The color used to clear the canvas to before the camera starts to render.
  * @property clearColorBuffer - If true the camera will clear the color buffer to the color set in clearColor.
  * @property clearDepthBuffer - If true the camera will clear the depth buffer.
  * @property clearStencilBuffer - If true the camera will clear the stencil buffer.
  * @property rect - Controls where on the screen the camera will be rendered in normalized screen coordinates.
  * @property scissorRect - Clips all pixels which are not in the rectangle.
  The order of the values is [x, y, width, height].
  * @property postEffects - The post effects queue for this camera. Use this to add or remove post effects from the camera.
  * @property frustumCulling - Controls the culling of mesh instances against the camera frustum, i.e. if objects outside of camera should be omitted from rendering.
  If true, culling is enabled.
  If false, all mesh instances in the scene are rendered by the camera, regardless of visibility. Defaults to false.
  * @property calculateTransform - Custom function you can provide to calculate the camera transformation matrix manually. Can be used for complex effects like reflections. Function is called using component's scope.
  Arguments:
  
  * {pc.Mat4} transformMatrix: output of the function.
  * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
  * @property calculateProjection - Custom function you can provide to calculate the camera projection matrix manually. Can be used for complex effects like doing oblique projection. Function is called using component's scope.
  Arguments:
  
  * {pc.Mat4} transformMatrix: output of the function
  * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
  * @property cullFaces - If true the camera will take material.cull into account. Otherwise both front and back faces will be rendered.
  * @property flipFaces - If true the camera will invert front and back faces. Can be useful for reflection rendering.
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this camera should belong.
  Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait CameraComponent extends Component {
  /**
    * The aspect ratio (width divided by height) of the camera. If aspectRatioMode is ASPECT_AUTO, then this value will be automatically calculated every frame, and you can only read it. If it's ASPECT_MANUAL, you can set the value.
    */
  var aspectRatio: Double = js.native
  /**
    * The aspect ratio mode of the camera. Can be pc.ASPECT_AUTO (default) or pc.ASPECT_MANUAL. ASPECT_AUTO will always be current render target's width divided by height. ASPECT_MANUAL will use the aspectRatio value instead.
    */
  var aspectRatioMode: Double = js.native
  /**
    * Custom function you can provide to calculate the camera projection matrix manually. Can be used for complex effects like doing oblique projection. Function is called using component's scope.
    * Arguments:
    * * {pc.Mat4} transformMatrix: output of the function
    * * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
    */
  @JSName("calculateProjection")
  var calculateProjection_Original: CalculateMatrix = js.native
  /**
    * Custom function you can provide to calculate the camera transformation matrix manually. Can be used for complex effects like reflections. Function is called using component's scope.
    * Arguments:
    * * {pc.Mat4} transformMatrix: output of the function.
    * * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
    */
  @JSName("calculateTransform")
  var calculateTransform_Original: CalculateMatrix = js.native
  /**
    * The color used to clear the canvas to before the camera starts to render.
    */
  var clearColor: Color = js.native
  /**
    * If true the camera will clear the color buffer to the color set in clearColor.
    */
  var clearColorBuffer: Boolean = js.native
  /**
    * If true the camera will clear the depth buffer.
    */
  var clearDepthBuffer: Boolean = js.native
  /**
    * If true the camera will clear the stencil buffer.
    */
  var clearStencilBuffer: Boolean = js.native
  /**
    * If true the camera will take material.cull into account. Otherwise both front and back faces will be rendered.
    */
  var cullFaces: Boolean = js.native
  /**
    * The distance from the camera after which no rendering will take place.
    */
  var farClip: Double = js.native
  /**
    * If true the camera will invert front and back faces. Can be useful for reflection rendering.
    */
  var flipFaces: Boolean = js.native
  /**
    * The field of view of the camera in degrees. Usually this is the Y-axis field of
    * view, see {@link pc.CameraComponent#horizontalFov}. Used for {@link pc.PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
    */
  var fov: Double = js.native
  /**
    * Queries the camera's frustum shape.
    */
  val frustum: Frustum = js.native
  /**
    * Controls the culling of mesh instances against the camera frustum, i.e. if objects outside of camera should be omitted from rendering.
    * If true, culling is enabled.
    * If false, all mesh instances in the scene are rendered by the camera, regardless of visibility. Defaults to false.
    */
  var frustumCulling: Boolean = js.native
  /**
    * Set which axis to use for the Field of View calculation. Defaults to false (use Y-axis).
    */
  var horizontalFov: Boolean = js.native
  /**
    * An array of layer IDs ({@link pc.Layer#id}) to which this camera should belong.
    * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
    */
  var layers: js.Array[Double] = js.native
  /**
    * The distance from the camera before which no rendering will take place.
    */
  var nearClip: Double = js.native
  /**
    * Queries the camera's GraphNode. Can be used to get position and rotation.
    */
  val node: GraphNode = js.native
  /**
    * The half-height of the orthographic view window (in the Y-axis). Used for
    * {@link pc.PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
    */
  var orthoHeight: Double = js.native
  /**
    * The post effects queue for this camera. Use this to add or remove post effects from the camera.
    */
  var postEffects: PostEffectQueue = js.native
  /**
    * Controls the order in which cameras are rendered. Cameras with smaller values for priority are rendered first.
    */
  var priority: Double = js.native
  /**
    * The type of projection used to render the camera. Can be:
    * * {@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum resembles a truncated pyramid.
    * * {@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera frustum is a cuboid.
    * Defaults to pc.PROJECTION_PERSPECTIVE.
    */
  var projection: Double = js.native
  /**
    * Queries the camera's projection matrix.
    */
  val projectionMatrix: Mat4 = js.native
  /**
    * Controls where on the screen the camera will be rendered in normalized screen coordinates.
    */
  var rect: Vec4 = js.native
  /**
    * Clips all pixels which are not in the rectangle.
    * The order of the values is [x, y, width, height].
    */
  var scissorRect: Vec4 = js.native
  /**
    * Queries the camera's view matrix.
    */
  val viewMatrix: Mat4 = js.native
  /**
    * Calculates aspect ratio value for a given render target.
    * @param [rt] - Optional render target. If unspecified, the backbuffer is assumed.
    * @returns The aspect ratio of the render target (or backbuffer).
    */
  def calculateAspectRatio(): Double = js.native
  def calculateAspectRatio(rt: RenderTarget): Double = js.native
  /**
    * Custom function you can provide to calculate the camera projection matrix manually. Can be used for complex effects like doing oblique projection. Function is called using component's scope.
    * Arguments:
    * * {pc.Mat4} transformMatrix: output of the function
    * * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
    */
  def calculateProjection(transformMatrix: Mat4, view: Double): Unit = js.native
  /**
    * Custom function you can provide to calculate the camera transformation matrix manually. Can be used for complex effects like reflections. Function is called using component's scope.
    * Arguments:
    * * {pc.Mat4} transformMatrix: output of the function.
    * * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
    */
  def calculateTransform(transformMatrix: Mat4, view: Double): Unit = js.native
  /**
    * Attempt to end XR session of this camera
    * @example
    * // On an entity with a camera component
    this.entity.camera.endXr(function (err) {
    // not anymore in XR
    });
    * @param [callback] - Optional callback function called once session is ended. The callback has one argument Error - it is null if successfully ended XR session.
    */
  def endXr(): Unit = js.native
  def endXr(callback: XrError): Unit = js.native
  /**
    * Convert a point from 2D screen space to 3D world space.
    * @example
    * // Get the start and end points of a 3D ray fired from a screen click position
    var start = entity.camera.screenToWorld(clickX, clickY, entity.camera.nearClip);
    var end = entity.camera.screenToWorld(clickX, clickY, entity.camera.farClip);
    
    // Use the ray coordinates to perform a raycast
    app.systems.rigidbody.raycastFirst(start, end, function (result) {
    console.log("Entity " + result.entity.name + " was selected");
    });
    * @param screenx - X coordinate on PlayCanvas' canvas element.
    * @param screeny - Y coordinate on PlayCanvas' canvas element.
    * @param cameraz - The distance from the camera in world space to create the new point.
    * @param [worldCoord] - 3D vector to receive world coordinate result.
    * @returns The world space coordinate.
    */
  def screenToWorld(screenx: Double, screeny: Double, cameraz: Double): Vec3 = js.native
  def screenToWorld(screenx: Double, screeny: Double, cameraz: Double, worldCoord: Vec3): Vec3 = js.native
  /**
    * Attempt to start XR session with this camera
    * @example
    * // On an entity with a camera component
    this.entity.camera.startXr(pc.XRTYPE_VR, pc.XRSPACE_LOCAL, function (err) {
    if (err) {
    // failed to start XR session
    } else {
    // in XR
    }
    });
    * @param type - The type of session. Can be one of the following:
    
    * {@link pc.XRTYPE_INLINE}: Inline - always available type of session. It has limited feature availability and is rendered into HTML element.
    * {@link pc.XRTYPE_VR}: Immersive VR - session that provides exclusive access to the VR device with the best available tracking features.
    * {@link pc.XRTYPE_AR}: Immersive AR - session that provides exclusive access to the VR/AR device that is intended to be blended with the real-world environment.
    * @param spaceType - reference space type. Can be one of the following:
    
    * {@link pc.XRSPACE_VIEWER}: Viewer - always supported space with some basic tracking capabilities.
    * {@link pc.XRSPACE_LOCAL}: Local - represents a tracking space with a native origin near the viewer at the time of creation. It is meant for seated or basic local XR sessions.
    * {@link pc.XRSPACE_LOCALFLOOR}: Local Floor - represents a tracking space with a native origin at the floor in a safe position for the user to stand. The y axis equals 0 at floor level. Floor level value might be estimated by the underlying platform. It is meant for seated or basic local XR sessions.
    * {@link pc.XRSPACE_BOUNDEDFLOOR}: Bounded Floor - represents a tracking space with its native origin at the floor, where the user is expected to move within a pre-established boundary.
    * {@link pc.XRSPACE_UNBOUNDED}: Unbounded - represents a tracking space where the user is expected to move freely around their environment, potentially long distances from their starting point.
    * @param [callback] - Optional callback function called once the session is started. The callback has one argument Error - it is null if the XR session started successfully.
    */
  def startXr(`type`: String, spaceType: String): Unit = js.native
  def startXr(`type`: String, spaceType: String, callback: XrError): Unit = js.native
  /**
    * Convert a point from 3D world space to 2D screen space.
    * @param worldCoord - The world space coordinate.
    * @param [screenCoord] - 3D vector to receive screen coordinate result.
    * @returns The screen space coordinate.
    */
  def worldToScreen(worldCoord: Vec3): Vec3 = js.native
  def worldToScreen(worldCoord: Vec3, screenCoord: Vec3): Vec3 = js.native
}

