package typings.playcanvas.pc

import typings.playcanvas.anon.Callback
import typings.playcanvas.pc.callbacks.CalculateMatrix
import typings.playcanvas.pc.callbacks.XrError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * @property projection - The type of projection used to render the camera.
  Can be:
  
  * {@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum
  resembles a truncated pyramid.
  * {@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera
  frustum is a cuboid.
  
  Defaults to pc.PROJECTION_PERSPECTIVE.
  * @property aspectRatio - The aspect ratio (width divided by height) of the
  camera. If aspectRatioMode is pc.ASPECT_AUTO, then this value will be automatically
  calculated every frame, and you can only read it. If it's ASPECT_MANUAL, you can set
  the value.
  * @property aspectRatioMode - The aspect ratio mode of the camera. Can be:
  
  * {@link pc.ASPECT_AUTO}: aspect ratio will be calculated from the current render
  target's width divided by height.
  * {@link pc.ASPECT_MANUAL}: use the aspectRatio value.
  
  Defaults to pc.ASPECT_AUTO.
  * @property clearColor - The color used to clear the canvas to before the
  camera starts to render. Defaults to [0.75, 0.75, 0.75, 1].
  * @property clearColorBuffer - If true the camera will clear the color buffer
  to the color set in clearColor. Defaults to true.
  * @property clearDepthBuffer - If true the camera will clear the depth buffer.
  Defaults to true.
  * @property clearStencilBuffer - If true the camera will clear the stencil
  buffer. Defaults to true.
  * @property farClip - The distance from the camera after which no rendering
  will take place. Defaults to 1000.
  * @property fov - The field of view of the camera in degrees. Usually this is
  the Y-axis field of view, see {@link pc.CameraComponent#horizontalFov}. Used for
  {@link pc.PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
  * @property horizontalFov - Set which axis to use for the Field of View
  calculation. Defaults to false.
  * @property nearClip - The distance from the camera before which no rendering
  will take place. Defaults to 0.1.
  * @property orthoHeight - The half-height of the orthographic view window (in
  the Y-axis). Used for {@link pc.PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
  * @property priority - Controls the order in which cameras are rendered. Cameras
  with smaller values for priority are rendered first. Defaults to 0.
  * @property rect - Controls where on the screen the camera will be rendered in
  normalized screen coordinates. Defaults to [0, 0, 1, 1].
  * @property scissorRect - Clips all pixels which are not in the rectangle.
  The order of the values is [x, y, width, height]. Defaults to [0, 0, 1, 1].
  * @property postEffects - The post effects queue for this camera.
  Use this to add or remove post effects from the camera.
  * @property frustumCulling - Controls the culling of mesh instances against
  the camera frustum, i.e. if objects outside of camera should be omitted from rendering.
  If false, all mesh instances in the scene are rendered by the camera, regardless of
  visibility. Defaults to false.
  * @property calculateTransform - Custom function you can
  provide to calculate the camera transformation matrix manually. Can be used for complex
  effects like reflections. Function is called using component's scope.
  Arguments:
  * {pc.Mat4} transformMatrix: output of the function.
  * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT.
  Left and right are only used in stereo rendering.
  * @property calculateProjection - Custom function you can
  provide to calculate the camera projection matrix manually. Can be used for complex
  effects like doing oblique projection. Function is called using component's scope.
  Arguments:
  * {pc.Mat4} transformMatrix: output of the function
  * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT.
  Left and right are only used in stereo rendering.
  * @property cullFaces - If true the camera will take material.cull into account.
  Otherwise both front and back faces will be rendered. Defaults to true.
  * @property flipFaces - If true the camera will invert front and back faces.
  Can be useful for reflection rendering. Defaults to false.
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this
  camera should belong. Don't push/pop/splice or modify this array, if you want to
  change it, set a new one instead. Defaults to [LAYERID_WORLD, LAYERID_DEPTH,
  LAYERID_SKYBOX, LAYERID_UI, LAYERID_IMMEDIATE].
  * @param system - The ComponentSystem that created this
  Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait CameraComponent
  extends StObject
     with Component {
  
  /**
    * The aspect ratio (width divided by height) of the
    * camera. If aspectRatioMode is pc.ASPECT_AUTO, then this value will be automatically
    * calculated every frame, and you can only read it. If it's ASPECT_MANUAL, you can set
    * the value.
    */
  var aspectRatio: Double = js.native
  
  /**
    * The aspect ratio mode of the camera. Can be:
    * * {@link pc.ASPECT_AUTO}: aspect ratio will be calculated from the current render
    * target's width divided by height.
    * * {@link pc.ASPECT_MANUAL}: use the aspectRatio value.
    * Defaults to pc.ASPECT_AUTO.
    */
  var aspectRatioMode: Double = js.native
  
  /**
    * Calculates aspect ratio value for a given render target.
    * @param [rt] - Optional render target. If unspecified, the
    backbuffer is assumed.
    * @returns The aspect ratio of the render target (or backbuffer).
    */
  def calculateAspectRatio(): Double = js.native
  def calculateAspectRatio(rt: RenderTarget): Double = js.native
  
  /**
    * Custom function you can
    * provide to calculate the camera projection matrix manually. Can be used for complex
    * effects like doing oblique projection. Function is called using component's scope.
    * Arguments:
    * * {pc.Mat4} transformMatrix: output of the function
    * * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT.
    * Left and right are only used in stereo rendering.
    */
  def calculateProjection(transformMatrix: Mat4, view: Double): Unit = js.native
  /**
    * Custom function you can
    * provide to calculate the camera projection matrix manually. Can be used for complex
    * effects like doing oblique projection. Function is called using component's scope.
    * Arguments:
    * * {pc.Mat4} transformMatrix: output of the function
    * * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT.
    * Left and right are only used in stereo rendering.
    */
  @JSName("calculateProjection")
  var calculateProjection_Original: CalculateMatrix = js.native
  
  /**
    * Custom function you can
    * provide to calculate the camera transformation matrix manually. Can be used for complex
    * effects like reflections. Function is called using component's scope.
    * Arguments:
    * * {pc.Mat4} transformMatrix: output of the function.
    * * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT.
    * Left and right are only used in stereo rendering.
    */
  def calculateTransform(transformMatrix: Mat4, view: Double): Unit = js.native
  /**
    * Custom function you can
    * provide to calculate the camera transformation matrix manually. Can be used for complex
    * effects like reflections. Function is called using component's scope.
    * Arguments:
    * * {pc.Mat4} transformMatrix: output of the function.
    * * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT.
    * Left and right are only used in stereo rendering.
    */
  @JSName("calculateTransform")
  var calculateTransform_Original: CalculateMatrix = js.native
  
  /**
    * The color used to clear the canvas to before the
    * camera starts to render. Defaults to [0.75, 0.75, 0.75, 1].
    */
  var clearColor: Color = js.native
  
  /**
    * If true the camera will clear the color buffer
    * to the color set in clearColor. Defaults to true.
    */
  var clearColorBuffer: Boolean = js.native
  
  /**
    * If true the camera will clear the depth buffer.
    * Defaults to true.
    */
  var clearDepthBuffer: Boolean = js.native
  
  /**
    * If true the camera will clear the stencil
    * buffer. Defaults to true.
    */
  var clearStencilBuffer: Boolean = js.native
  
  /**
    * If true the camera will take material.cull into account.
    * Otherwise both front and back faces will be rendered. Defaults to true.
    */
  var cullFaces: Boolean = js.native
  
  /**
    * Attempt to end XR session of this camera
    * @example
    * // On an entity with a camera component
    this.entity.camera.endXr(function (err) {
    // not anymore in XR
    });
    * @param [callback] - Optional callback function called once
    session is ended. The callback has one argument Error - it is null if successfully
    ended XR session.
    */
  def endXr(): Unit = js.native
  def endXr(callback: XrError): Unit = js.native
  
  /**
    * The distance from the camera after which no rendering
    * will take place. Defaults to 1000.
    */
  var farClip: Double = js.native
  
  /**
    * If true the camera will invert front and back faces.
    * Can be useful for reflection rendering. Defaults to false.
    */
  var flipFaces: Boolean = js.native
  
  /**
    * The field of view of the camera in degrees. Usually this is
    * the Y-axis field of view, see {@link pc.CameraComponent#horizontalFov}. Used for
    * {@link pc.PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
    */
  var fov: Double = js.native
  
  /**
    * Queries the camera's frustum shape.
    */
  val frustum: Frustum = js.native
  
  /**
    * Controls the culling of mesh instances against
    * the camera frustum, i.e. if objects outside of camera should be omitted from rendering.
    * If false, all mesh instances in the scene are rendered by the camera, regardless of
    * visibility. Defaults to false.
    */
  var frustumCulling: Boolean = js.native
  
  /**
    * Set which axis to use for the Field of View
    * calculation. Defaults to false.
    */
  var horizontalFov: Boolean = js.native
  
  /**
    * An array of layer IDs ({@link pc.Layer#id}) to which this
    * camera should belong. Don't push/pop/splice or modify this array, if you want to
    * change it, set a new one instead. Defaults to [LAYERID_WORLD, LAYERID_DEPTH,
    * LAYERID_SKYBOX, LAYERID_UI, LAYERID_IMMEDIATE].
    */
  var layers: js.Array[Double] = js.native
  
  /**
    * The distance from the camera before which no rendering
    * will take place. Defaults to 0.1.
    */
  var nearClip: Double = js.native
  
  /**
    * The half-height of the orthographic view window (in
    * the Y-axis). Used for {@link pc.PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
    */
  var orthoHeight: Double = js.native
  
  /**
    * The post effects queue for this camera.
    * Use this to add or remove post effects from the camera.
    */
  var postEffects: PostEffectQueue = js.native
  
  /**
    * Controls the order in which cameras are rendered. Cameras
    * with smaller values for priority are rendered first. Defaults to 0.
    */
  var priority: Double = js.native
  
  /**
    * The type of projection used to render the camera.
    * Can be:
    * * {@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum
    * resembles a truncated pyramid.
    * * {@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera
    * frustum is a cuboid.
    * Defaults to pc.PROJECTION_PERSPECTIVE.
    */
  var projection: Double = js.native
  
  /**
    * Queries the camera's projection matrix.
    */
  val projectionMatrix: Mat4 = js.native
  
  /**
    * Controls where on the screen the camera will be rendered in
    * normalized screen coordinates. Defaults to [0, 0, 1, 1].
    */
  var rect: Vec4 = js.native
  
  /**
    * Clips all pixels which are not in the rectangle.
    * The order of the values is [x, y, width, height]. Defaults to [0, 0, 1, 1].
    */
  var scissorRect: Vec4 = js.native
  
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
    * @param cameraz - The distance from the camera in world space to create
    the new point.
    * @param [worldCoord] - 3D vector to receive world coordinate result.
    * @returns The world space coordinate.
    */
  def screenToWorld(screenx: Double, screeny: Double, cameraz: Double): Vec3 = js.native
  def screenToWorld(screenx: Double, screeny: Double, cameraz: Double, worldCoord: Vec3): Vec3 = js.native
  
  /**
    * Attempt to start XR session with this camera
    * @example
    * // On an entity with a camera component
    this.entity.camera.startXr(pc.XRTYPE_VR, pc.XRSPACE_LOCAL, {
    callback: function (err) {
    if (err) {
    // failed to start XR session
    } else {
    // in XR
    }
    }
    });
    * @param type - The type of session. Can be one of the following:
    
    * {@link pc.XRTYPE_INLINE}: Inline - always available type of session. It has
    limited feature availability and is rendered into HTML element.
    * {@link pc.XRTYPE_VR}: Immersive VR - session that provides exclusive access
    to the VR device with the best available tracking features.
    * {@link pc.XRTYPE_AR}: Immersive AR - session that provides exclusive access
    to the VR/AR device that is intended to be blended with the real-world environment.
    * @param spaceType - reference space type. Can be one of the following:
    
    * {@link pc.XRSPACE_VIEWER}: Viewer - always supported space with some basic
    tracking capabilities.
    * {@link pc.XRSPACE_LOCAL}: Local - represents a tracking space with a native
    origin near the viewer at the time of creation. It is meant for seated or basic
    local XR sessions.
    * {@link pc.XRSPACE_LOCALFLOOR}: Local Floor - represents a tracking space with
    a native origin at the floor in a safe position for the user to stand. The y-axis
    equals 0 at floor level. Floor level value might be estimated by the underlying
    platform. It is meant for seated or basic local XR sessions.
    * {@link pc.XRSPACE_BOUNDEDFLOOR}: Bounded Floor - represents a tracking space
    with its native origin at the floor, where the user is expected to move within a
    pre-established boundary.
    * {@link pc.XRSPACE_UNBOUNDED}: Unbounded - represents a tracking space where the
    user is expected to move freely around their environment, potentially long
    distances from their starting point.
    * @param [options] - object with options for XR session initialization.
    * @param [options.optionalFeatures] - Optional features for XRSession start. It is used for getting access to additional WebXR spec extensions.
    * @param [options.callback] - Optional callback function called once
    the session is started. The callback has one argument Error - it is null if the XR
    session started successfully.
    */
  def startXr(`type`: String, spaceType: String): Unit = js.native
  def startXr(`type`: String, spaceType: String, options: Callback): Unit = js.native
  
  /**
    * Queries the camera's view matrix.
    */
  val viewMatrix: Mat4 = js.native
  
  /**
    * Convert a point from 3D world space to 2D screen space.
    * @param worldCoord - The world space coordinate.
    * @param [screenCoord] - 3D vector to receive screen coordinate result.
    * @returns The screen space coordinate.
    */
  def worldToScreen(worldCoord: Vec3): Vec3 = js.native
  def worldToScreen(worldCoord: Vec3, screenCoord: Vec3): Vec3 = js.native
}
