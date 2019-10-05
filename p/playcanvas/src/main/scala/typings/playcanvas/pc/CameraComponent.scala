package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.CalculateMatrix
import typings.playcanvas.pc.callbacks.VrCamera
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.CameraComponent
  * @extends pc.Component
  * @classdesc The Camera Component enables an Entity to render the scene. A scene requires at least one
  * enabled camera component to be rendered. Note that multiple camera components can be enabled
  * simultaneously (for split-screen or offscreen rendering, for example).
  * @description Create a new Camera Component.
  * @param {pc.CameraComponentSystem} system The ComponentSystem that created this Component.
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @example
  * // Add a pc.CameraComponent to an entity
  * var entity = new pc.Entity();
  * entity.addComponent('camera', {
  *     nearClip: 1,
  *     farClip: 100,
  *     fov: 55
  * });
  * @example
  * // Get the pc.CameraComponent on an entity
  * var cameraComponent = entity.camera;
  * @example
  * // Update a property on a camera component
  * entity.camera.nearClip = 2;
  * @property {Number} projection The type of projection used to render the camera. Can be:
  * <ul>
  *     <li>{@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum resembles a truncated pyramid.</li>
  *     <li>{@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera frustum is a cuboid.</li>
  * </ul>
  * Defaults to pc.PROJECTION_PERSPECTIVE.
  * @property {Number} nearClip The distance from the camera before which no rendering will take place.
  * @property {Number} farClip The distance from the camera after which no rendering will take place.
  * @property {Number} aspectRatioMode The aspect ratio mode of the camera. Can be pc.ASPECT_AUTO (default) or pc.ASPECT_MANUAL. ASPECT_AUTO will always be current render target's width divided by height. ASPECT_MANUAL will use the aspectRatio value instead.
  * @property {Number} aspectRatio The aspect ratio (width divided by height) of the camera. If aspectRatioMode is ASPECT_AUTO, then this value will be automatically calculated every frame, and you can only read it. If it's ASPECT_MANUAL, you can set the value.
  * @property {Boolean} horizontalFov Set which axis to use for the Field of View calculation. Defaults to false (use Y-axis).
  * @property {Number} fov The field of view of the camera in degrees. Usually this is the Y-axis field of
  * view, see {@link pc.CameraComponent#horizontalFov}. Used for {@link pc.PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
  * @property {Number} orthoHeight The half-height of the orthographic view window (in the Y-axis). Used for
  * {@link pc.PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
  * @property {Number} priority Controls the order in which cameras are rendered. Cameras with smaller values for priority are rendered first.
  * @property {pc.Color} clearColor The color used to clear the canvas to before the camera starts to render.
  * @property {Boolean} clearColorBuffer If true the camera will clear the color buffer to the color set in clearColor.
  * @property {Boolean} clearDepthBuffer If true the camera will clear the depth buffer.
  * @property {Boolean} clearStencilBuffer If true the camera will clear the stencil buffer.
  * @property {pc.Vec4} rect Controls where on the screen the camera will be rendered in normalized screen coordinates.
  * @property {pc.Vec4} scissorRect Clips all pixels which are not in the rectangle.
  * The order of the values is [x, y, width, height].
  * @property {pc.PostEffectQueue} postEffects The post effects queue for this camera. Use this to add or remove post effects from the camera.
  * @property {Boolean} frustumCulling Controls the culling of mesh instances against the camera frustum, i.e. if objects outside of camera should be omitted from rendering.
  * If true, culling is enabled.
  * If false, all mesh instances in the scene are rendered by the camera, regardless of visibility. Defaults to false.
  * @property {pc.callbacks.CalculateMatrix} calculateTransform Custom function you can provide to calculate the camera transformation matrix manually. Can be used for complex effects like reflections. Function is called using component's scope.
  * Arguments:
  *     <li>{pc.Mat4} transformMatrix: output of the function</li>
  *     <li>{Number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.</li>
  * @property {pc.callbacks.CalculateMatrix} calculateProjection Custom function you can provide to calculate the camera projection matrix manually. Can be used for complex effects like doing oblique projection. Function is called using component's scope.
  * Arguments:
  *     <li>{pc.Mat4} transformMatrix: output of the function</li>
  *     <li>{Number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.</li>
  * @property {Boolean} cullFaces If true the camera will take material.cull into account. Otherwise both front and back faces will be rendered.
  * @property {Boolean} flipFaces If true the camera will invert front and back faces. Can be useful for reflection rendering.
  * @property {Number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this camera should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  */
@JSGlobal("pc.CameraComponent")
@js.native
class CameraComponent protected () extends Component {
  def this(system: CameraComponentSystem, entity: Entity) = this()
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
    * <li>{pc.Mat4} transformMatrix: output of the function</li>
    * <li>{Number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.</li>
    */
  @JSName("calculateProjection")
  var calculateProjection_Original: CalculateMatrix = js.native
  /**
    * Custom function you can provide to calculate the camera transformation matrix manually. Can be used for complex effects like reflections. Function is called using component's scope.
    * Arguments:
    * <li>{pc.Mat4} transformMatrix: output of the function</li>
    * <li>{Number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.</li>
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
    * @readonly
    * @name pc.CameraComponent#frustum
    * @type pc.Frustum
    * @description Queries the camera's frustum shape.
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
  var layers: js.Array[Number] = js.native
  /**
    * The distance from the camera before which no rendering will take place.
    */
  var nearClip: Double = js.native
  /**
    * @readonly
    * @name pc.CameraComponent#node
    * @type pc.GraphNode
    * @description Queries the camera's GraphNode. Can be used to get position and rotation.
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
    * <ul>
    * <li>{@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum resembles a truncated pyramid.</li>
    * <li>{@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera frustum is a cuboid.</li>
    * </ul>
    * Defaults to pc.PROJECTION_PERSPECTIVE.
    */
  var projection: Double = js.native
  /**
    * @readonly
    * @name pc.CameraComponent#projectionMatrix
    * @type pc.Mat4
    * @description Queries the camera's projection matrix.
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
    * @readonly
    * @name pc.CameraComponent#viewMatrix
    * @type pc.Mat4
    * @description Queries the camera's view matrix.
    */
  val viewMatrix: Mat4 = js.native
  /**
    * @name pc.CameraComponent#vrDisplay
    * @type pc.VrDisplay
    * @description The {@link pc.VrDisplay} that the camera is current displaying to. This is set automatically by calls to {@link pc.CameraComponent#enterVr}
    * or {@link pc.CameraComponent#exitVr}. Setting this property to a display directly enables the camera to use the transformation information
    * from a display without rendering stereo to it, e.g. for "magic window" style experiences.
    * @example
    * // enable magic window style interface
    * var display = this.app.vr.display;
    * if (display) {
    *     this.entity.camera.vrDisplay = display;
    * }
    *
    * var camera = this.entity.camera;
    * camera.enterVr(function (err) {
    * if (err) { return; }
    *     var display = camera.vrDisplay; // access presenting pc.VrDisplay
    * });
    */
  var vrDisplay: VrDisplay = js.native
  /**
    * @function
    * @name pc.CameraComponent#calculateAspectRatio
    * @description Calculates aspect ratio value for a given render target.
    * @param {pc.RenderTarget} [rt] Optional render target. If unspecified, the backbuffer is assumed.
    * @returns {Number} The aspect ratio of the render target (or backbuffer).
    */
  def calculateAspectRatio(): Double = js.native
  def calculateAspectRatio(rt: RenderTarget): Double = js.native
  /**
    * Custom function you can provide to calculate the camera projection matrix manually. Can be used for complex effects like doing oblique projection. Function is called using component's scope.
    * Arguments:
    * <li>{pc.Mat4} transformMatrix: output of the function</li>
    * <li>{Number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.</li>
    */
  def calculateProjection(transformMatrix: Mat4, view: Double): Unit = js.native
  /**
    * Custom function you can provide to calculate the camera transformation matrix manually. Can be used for complex effects like reflections. Function is called using component's scope.
    * Arguments:
    * <li>{pc.Mat4} transformMatrix: output of the function</li>
    * <li>{Number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.</li>
    */
  def calculateTransform(transformMatrix: Mat4, view: Double): Unit = js.native
  /**
    * @function
    * @name pc.CameraComponent#enterVr
    * @description Attempt to start presenting this camera to a {@link pc.VrDisplay}.
    * @param {pc.callbacks.VrCamera} callback Function called once to indicate success of failure. The callback takes one argument (err).
    * On success it returns null on failure it returns the error message.
    * @example
    * // On an entity with a camera component
    * this.entity.camera.enterVr(function (err) {
    *     if (err) {
    *         console.error(err);
    *         return;
    *     } else {
    *         // in VR!
    *     }
    * });
    */
  def enterVr(callback: VrCamera): Unit = js.native
  /** @function
    * @name pc.CameraComponent#enterVr
    * @variation 2
    * @description Attempt to start presenting this camera to a {@link pc.VrDisplay}.
    * @param {pc.VrDisplay} display The VrDisplay to present. If not supplied this uses {@link pc.VrManager#display} as the default
    * @param {pc.callbacks.VrCamera} callback Function called once to indicate success of failure. The callback takes one argument (err).
    * On success it returns null on failure it returns the error message.
    * @example
    * // On an entity with a camera component
    * this.entity.camera.enterVr(function (err) {
    *     if (err) {
    *         console.error(err);
    *         return;
    *     } else {
    *         // in VR!
    *     }
    * });
    */
  def enterVr(display: VrDisplay, callback: VrCamera): Unit = js.native
  /**
    * @function
    * @name pc.CameraComponent#exitVr
    * @description Attempt to stop presenting this camera.
    * @param {pc.callbacks.VrCamera} callback Function called once to indicate success of failure. The callback takes one argument (err).
    * On success it returns null on failure it returns the error message.
    * @example
    * this.entity.camera.exitVr(function (err) {
    *     if (err) {
    *         console.error(err);
    *     } else {
    *
    *     }
    * });
    */
  def exitVr(callback: VrCamera): Unit = js.native
  /**
    * @function
    * @name pc.CameraComponent#screenToWorld
    * @description Convert a point from 2D screen space to 3D world space.
    * @param {Number} screenx x coordinate on PlayCanvas' canvas element.
    * @param {Number} screeny y coordinate on PlayCanvas' canvas element.
    * @param {Number} cameraz The distance from the camera in world space to create the new point.
    * @param {pc.Vec3} [worldCoord] 3D vector to receive world coordinate result.
    * @example
    * // Get the start and end points of a 3D ray fired from a screen click position
    * var start = entity.camera.screenToWorld(clickX, clickY, entity.camera.nearClip);
    * var end = entity.camera.screenToWorld(clickX, clickY, entity.camera.farClip);
    *
    * // Use the ray coordinates to perform a raycast
    * app.systems.rigidbody.raycastFirst(start, end, function (result) {
    *     console.log("Entity " + result.entity.name + " was selected");
    * });
    * @returns {pc.Vec3} The world space coordinate.
    */
  def screenToWorld(screenx: Double, screeny: Double, cameraz: Double): Vec3 = js.native
  def screenToWorld(screenx: Double, screeny: Double, cameraz: Double, worldCoord: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.CameraComponent#worldToScreen
    * @description Convert a point from 3D world space to 2D screen space.
    * @param {pc.Vec3} worldCoord The world space coordinate.
    * @param {pc.Vec3} [screenCoord] 3D vector to receive screen coordinate result.
    * @returns {pc.Vec3} The screen space coordinate.
    */
  def worldToScreen(worldCoord: Vec3): Vec3 = js.native
  def worldToScreen(worldCoord: Vec3, screenCoord: Vec3): Vec3 = js.native
}

