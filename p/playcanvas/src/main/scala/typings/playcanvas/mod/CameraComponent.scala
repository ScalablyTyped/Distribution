package typings.playcanvas.mod

import typings.playcanvas.anon.Callback
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link CameraComponent#calculateTransform} and {@link CameraComponent#calculateProjection}.
  *
  * @callback CalculateMatrixCallback
  * @param {Mat4} transformMatrix - Output of the function.
  * @param {number} view - Type of view. Can be {@link VIEW_CENTER}, {@link VIEW_LEFT} or {@link VIEW_RIGHT}. Left and right are only used in stereo rendering.
  */
/**
  * The Camera Component enables an Entity to render the scene. A scene requires at least one
  * enabled camera component to be rendered. Note that multiple camera components can be enabled
  * simultaneously (for split-screen or offscreen rendering, for example).
  *
  * ```javascript
  * // Add a pc.CameraComponent to an entity
  * var entity = new pc.Entity();
  * entity.addComponent('camera', {
  *     nearClip: 1,
  *     farClip: 100,
  *     fov: 55
  * });
  *
  * // Get the pc.CameraComponent on an entity
  * var cameraComponent = entity.camera;
  *
  * // Update a property on a camera component
  * entity.camera.nearClip = 2;
  * ```
  *
  * @property {number} projection The type of projection used to render the camera. Can be:
  *
  * - {@link PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum
  * resembles a truncated pyramid.
  * - {@link PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera
  * frustum is a cuboid.
  *
  * Defaults to {@link PROJECTION_PERSPECTIVE}.
  * @property {number} aspectRatio The aspect ratio (width divided by height) of the camera. If
  * aspectRatioMode is {@link ASPECT_AUTO}, then this value will be automatically calculated every
  * frame, and you can only read it. If it's ASPECT_MANUAL, you can set the value.
  * @property {number} aspectRatioMode The aspect ratio mode of the camera. Can be:
  *
  * - {@link ASPECT_AUTO}: aspect ratio will be calculated from the current render
  * target's width divided by height.
  * - {@link ASPECT_MANUAL}: use the aspectRatio value.
  *
  * Defaults to {@link ASPECT_AUTO}.
  * @property {Color} clearColor The color used to clear the canvas to before the camera starts to
  * render. Defaults to [0.75, 0.75, 0.75, 1].
  * @property {number} farClip The distance from the camera after which no rendering will take
  * place. Defaults to 1000.
  * @property {number} fov The field of view of the camera in degrees. Usually this is the Y-axis
  * field of view, see {@link CameraComponent#horizontalFov}. Used for
  * {@link PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
  * @property {boolean} horizontalFov Set which axis to use for the Field of View calculation.
  * Defaults to false.
  * @property {number} nearClip The distance from the camera before which no rendering will take
  * place. Defaults to 0.1.
  * @property {number} orthoHeight The half-height of the orthographic view window (in the Y-axis).
  * Used for {@link PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
  * @property {Vec4} scissorRect Clips all pixels which are not in the rectangle. The order of the
  * values is [x, y, width, height]. Defaults to [0, 0, 1, 1].
  * @property {boolean} frustumCulling Controls the culling of mesh instances against the camera
  * frustum, i.e. if objects outside of camera should be omitted from rendering. If false, all mesh
  * instances in the scene are rendered by the camera, regardless of visibility. Defaults to false.
  * @property {CalculateMatrixCallback} calculateTransform Custom function you can provide to
  * calculate the camera transformation matrix manually. Can be used for complex effects like
  * reflections. Function is called using component's scope. Arguments:
  *
  * - {@link Mat4} transformMatrix: output of the function.
  * - view: Type of view. Can be {@link VIEW_CENTER}, {@link VIEW_LEFT} or {@link VIEW_RIGHT}.
  *
  * Left and right are only used in stereo rendering.
  * @property {CalculateMatrixCallback} calculateProjection Custom function you can provide to
  * calculate the camera projection matrix manually. Can be used for complex effects like doing
  * oblique projection. Function is called using component's scope. Arguments:
  *
  * - {@link Mat4} transformMatrix: output of the function
  * - view: Type of view. Can be {@link VIEW_CENTER}, {@link VIEW_LEFT} or {@link VIEW_RIGHT}.
  *
  * Left and right are only used in stereo rendering.
  * @property {boolean} cullFaces If true the camera will take material.cull into account. Otherwise
  * both front and back faces will be rendered. Defaults to true.
  * @property {boolean} flipFaces If true the camera will invert front and back faces. Can be useful
  * for reflection rendering. Defaults to false.
  * @augments Component
  */
@JSImport("playcanvas", "CameraComponent")
@js.native
open class CameraComponent protected () extends Component {
  /**
    * Create a new CameraComponent instance.
    *
    * @param {CameraComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: CameraComponentSystem, entity: Entity) = this()
  
  var _camera: Camera = js.native
  
  var _disablePostEffectsLayer: Double = js.native
  
  def _enableDepthLayer(value: Any): Boolean = js.native
  
  var _postEffects: PostEffectQueue = js.native
  
  var _priority: Double = js.native
  
  /**
    * A counter of requests of color map rendering.
    *
    * @type {number}
    * @private
    */
  /* private */ var _renderSceneColorMap: Any = js.native
  
  /**
    * A counter of requests of depth map rendering.
    *
    * @type {number}
    * @private
    */
  /* private */ var _renderSceneDepthMap: Any = js.native
  
  def addCameraToLayers(): Unit = js.native
  
  var aspectRatio: Double = js.native
  
  def aspectRatioMode: Double = js.native
  def aspectRatioMode_=(arg: Double): Unit = js.native
  
  /**
    * Calculates aspect ratio value for a given render target.
    *
    * @param {RenderTarget} [rt] - Optional render target. If unspecified, the backbuffer is used.
    * @returns {number} The aspect ratio of the render target (or backbuffer).
    */
  def calculateAspectRatio(): Double = js.native
  def calculateAspectRatio(rt: RenderTarget): Double = js.native
  
  def calculateProjection: CalculateMatrixCallback = js.native
  def calculateProjection_=(arg: CalculateMatrixCallback): Unit = js.native
  
  def calculateTransform: CalculateMatrixCallback = js.native
  def calculateTransform_=(arg: CalculateMatrixCallback): Unit = js.native
  
  /**
    * Queries the camera component's underlying Camera instance.
    *
    * @type {Camera}
    * @ignore
    */
  def camera: Camera = js.native
  
  def clearColor: Color = js.native
  
  def clearColorBuffer: Boolean = js.native
  /**
    * If true the camera will clear the color buffer to the color set in clearColor. Defaults to true.
    *
    * @type {boolean}
    */
  def clearColorBuffer_=(arg: Boolean): Unit = js.native
  
  def clearColor_=(arg: Color): Unit = js.native
  
  def clearDepthBuffer: Boolean = js.native
  /**
    * If true the camera will clear the depth buffer. Defaults to true.
    *
    * @type {boolean}
    */
  def clearDepthBuffer_=(arg: Boolean): Unit = js.native
  
  def clearStencilBuffer: Boolean = js.native
  /**
    * If true the camera will clear the stencil buffer. Defaults to true.
    *
    * @type {boolean}
    */
  def clearStencilBuffer_=(arg: Boolean): Unit = js.native
  
  def copy(source: Any): Unit = js.native
  
  def cullFaces: Boolean = js.native
  def cullFaces_=(arg: Boolean): Unit = js.native
  
  def dirtyLayerCompositionCameras(): Unit = js.native
  
  def disablePostEffectsLayer: Double = js.native
  /**
    * Layer ID of a layer on which the postprocessing of the camera stops being applied to.
    * Defaults to LAYERID_UI, which causes post processing to not be applied to UI layer and any
    * following layers for the camera. Set to undefined for post-processing to be applied to all
    * layers of the camera.
    *
    * @type {number}
    */
  def disablePostEffectsLayer_=(arg: Double): Unit = js.native
  
  /**
    * Attempt to end XR session of this camera.
    *
    * @param {XrErrorCallback} [callback] - Optional callback function called once session is
    * ended. The callback has one argument Error - it is null if successfully ended XR session.
    * @example
    * // On an entity with a camera component
    * this.entity.camera.endXr(function (err) {
    *     // not anymore in XR
    * });
    */
  def endXr(): Unit = js.native
  def endXr(callback: XrErrorCallback): Unit = js.native
  
  def farClip: Double = js.native
  def farClip_=(arg: Double): Unit = js.native
  
  def flipFaces: Boolean = js.native
  def flipFaces_=(arg: Boolean): Unit = js.native
  
  def fov: Double = js.native
  def fov_=(arg: Double): Unit = js.native
  
  /**
    * Prepare the camera for frame rendering.
    *
    * @param {RenderTarget} rt - Render target to which rendering will be performed. Will affect
    * camera's aspect ratio, if aspectRatioMode is {@link ASPECT_AUTO}.
    * @ignore
    */
  def frameUpdate(rt: RenderTarget): Unit = js.native
  
  /**
    * Queries the camera's frustum shape.
    *
    * @type {Frustum}
    */
  def frustum: Frustum = js.native
  
  def frustumCulling: Boolean = js.native
  def frustumCulling_=(arg: Boolean): Unit = js.native
  
  def horizontalFov: Boolean = js.native
  def horizontalFov_=(arg: Boolean): Unit = js.native
  
  def layers: js.Array[Double] = js.native
  
  def layersSet: Set[Double] = js.native
  
  /**
    * An array of layer IDs ({@link Layer#id}) to which this camera should belong. Don't push,
    * pop, splice or modify this array, if you want to change it, set a new one instead. Defaults
    * to [LAYERID_WORLD, LAYERID_DEPTH, LAYERID_SKYBOX, LAYERID_UI, LAYERID_IMMEDIATE].
    *
    * @type {number[]}
    */
  def layers_=(arg: js.Array[Double]): Unit = js.native
  
  def nearClip: Double = js.native
  def nearClip_=(arg: Double): Unit = js.native
  
  def onAppPrerender(): Unit = js.native
  
  def onLayerAdded(layer: Any): Unit = js.native
  
  def onLayerRemoved(layer: Any): Unit = js.native
  
  def onLayersChanged(oldComp: Any, newComp: Any): Unit = js.native
  
  /**
    * Custom function that is called after the camera renders the scene.
    *
    * @type {Function}
    */
  var onPostRender: js.Function = js.native
  
  /**
    * Custom function that is called when postprocessing should execute.
    *
    * @type {Function}
    * @ignore
    */
  var onPostprocessing: js.Function = js.native
  
  /**
    * Custom function that is called before the camera renders the scene.
    *
    * @type {Function}
    */
  var onPreRender: js.Function = js.native
  
  def onRemove(): Unit = js.native
  
  def orthoHeight: Double = js.native
  def orthoHeight_=(arg: Double): Unit = js.native
  
  def postEffects: PostEffectQueue = js.native
  
  /**
    * The post effects queue for this camera. Use this to add or remove post effects from the camera.
    *
    * @type {PostEffectQueue}
    */
  def postEffectsEnabled: PostEffectQueue = js.native
  
  def priority: Double = js.native
  /**
    * Controls the order in which cameras are rendered. Cameras with smaller values for priority
    * are rendered first. Defaults to 0.
    *
    * @type {number}
    */
  def priority_=(arg: Double): Unit = js.native
  
  def projection: Double = js.native
  
  /**
    * Queries the camera's projection matrix.
    *
    * @type {Mat4}
    */
  def projectionMatrix: Mat4 = js.native
  
  def projection_=(arg: Double): Unit = js.native
  
  def rect: Vec4 = js.native
  /**
    * Controls where on the screen the camera will be rendered in normalized screen coordinates.
    * Defaults to [0, 0, 1, 1].
    *
    * @type {Vec4}
    */
  def rect_=(arg: Vec4): Unit = js.native
  
  def removeCameraFromLayers(): Unit = js.native
  
  def renderSceneColorMap: Boolean = js.native
  
  def renderSceneDepthMap: Boolean = js.native
  
  def renderTarget: Any = js.native
  /**
    * Render target to which rendering of the cameras is performed. If not set, it will render
    * simply to the screen.
    *
    * @type {RenderTarget}
    */
  def renderTarget_=(arg: Any): Unit = js.native
  
  /**
    * Request the scene to generate a texture containing the scene color map. Note that this call
    * is accummulative, and for each enable request, a disable request need to be called.
    *
    * @param {boolean} enabled - True to request the generation, false to disable it.
    */
  def requestSceneColorMap(enabled: Boolean): Unit = js.native
  
  /**
    * Request the scene to generate a texture containing the scene depth map. Note that this call
    * is accummulative, and for each enable request, a disable request need to be called.
    *
    * @param {boolean} enabled - True to request the generation, false to disable it.
    */
  def requestSceneDepthMap(enabled: Boolean): Unit = js.native
  
  def scissorRect: Vec4 = js.native
  def scissorRect_=(arg: Vec4): Unit = js.native
  
  /**
    * Convert a point from 2D screen space to 3D world space.
    *
    * @param {number} screenx - X coordinate on PlayCanvas' canvas element. Should be in the range
    * 0 to `canvas.offsetWidth` of the application's canvas element.
    * @param {number} screeny - Y coordinate on PlayCanvas' canvas element. Should be in the range
    * 0 to `canvas.offsetHeight` of the application's canvas element.
    * @param {number} cameraz - The distance from the camera in world space to create the new
    * point.
    * @param {Vec3} [worldCoord] - 3D vector to receive world coordinate result.
    * @example
    * // Get the start and end points of a 3D ray fired from a screen click position
    * var start = entity.camera.screenToWorld(clickX, clickY, entity.camera.nearClip);
    * var end = entity.camera.screenToWorld(clickX, clickY, entity.camera.farClip);
    *
    * // Use the ray coordinates to perform a raycast
    * app.systems.rigidbody.raycastFirst(start, end, function (result) {
    *     console.log("Entity " + result.entity.name + " was selected");
    * });
    * @returns {Vec3} The world space coordinate.
    */
  def screenToWorld(screenx: Double, screeny: Double, cameraz: Double): Vec3 = js.native
  def screenToWorld(screenx: Double, screeny: Double, cameraz: Double, worldCoord: Vec3): Vec3 = js.native
  
  /**
    * Attempt to start XR session with this camera.
    *
    * @param {string} type - The type of session. Can be one of the following:
    *
    * - {@link XRTYPE_INLINE}: Inline - always available type of session. It has limited feature
    * availability and is rendered into HTML element.
    * - {@link XRTYPE_VR}: Immersive VR - session that provides exclusive access to the VR device
    * with the best available tracking features.
    * - {@link XRTYPE_AR}: Immersive AR - session that provides exclusive access to the VR/AR
    * device that is intended to be blended with the real-world environment.
    *
    * @param {string} spaceType - Reference space type. Can be one of the following:
    *
    * - {@link XRSPACE_VIEWER}: Viewer - always supported space with some basic tracking
    * capabilities.
    * - {@link XRSPACE_LOCAL}: Local - represents a tracking space with a native origin near the
    * viewer at the time of creation. It is meant for seated or basic local XR sessions.
    * - {@link XRSPACE_LOCALFLOOR}: Local Floor - represents a tracking space with a native origin
    * at the floor in a safe position for the user to stand. The y-axis equals 0 at floor level.
    * Floor level value might be estimated by the underlying platform. It is meant for seated or
    * basic local XR sessions.
    * - {@link XRSPACE_BOUNDEDFLOOR}: Bounded Floor - represents a tracking space with its native
    * origin at the floor, where the user is expected to move within a pre-established boundary.
    * - {@link XRSPACE_UNBOUNDED}: Unbounded - represents a tracking space where the user is
    * expected to move freely around their environment, potentially long distances from their
    * starting point.
    *
    * @param {object} [options] - Object with options for XR session initialization.
    * @param {string[]} [options.optionalFeatures] - Optional features for XRSession start. It is
    * used for getting access to additional WebXR spec extensions.
    * @param {boolean} [options.imageTracking] - Set to true to attempt to enable {@link XrImageTracking}.
    * @param {boolean} [options.planeDetection] - Set to true to attempt to enable {@link XrPlaneDetection}.
    * @param {XrErrorCallback} [options.callback] - Optional callback function called once the
    * session is started. The callback has one argument Error - it is null if the XR session
    * started successfully.
    * @param {object} [options.depthSensing] - Optional object with depth sensing parameters to
    * attempt to enable {@link XrDepthSensing}.
    * @param {string} [options.depthSensing.usagePreference] - Optional usage preference for depth
    * sensing, can be 'cpu-optimized' or 'gpu-optimized' (XRDEPTHSENSINGUSAGE_*), defaults to
    * 'cpu-optimized'. Most preferred and supported will be chosen by the underlying depth sensing
    * system.
    * @param {string} [options.depthSensing.dataFormatPreference] - Optional data format
    * preference for depth sensing. Can be 'luminance-alpha' or 'float32' (XRDEPTHSENSINGFORMAT_*),
    * defaults to 'luminance-alpha'. Most preferred and supported will be chosen by the underlying
    * depth sensing system.
    * @example
    * // On an entity with a camera component
    * this.entity.camera.startXr(pc.XRTYPE_VR, pc.XRSPACE_LOCAL, {
    *     callback: function (err) {
    *         if (err) {
    *             // failed to start XR session
    *         } else {
    *             // in XR
    *         }
    *     }
    * });
    */
  def startXr(`type`: String, spaceType: String): Unit = js.native
  def startXr(`type`: String, spaceType: String, options: Callback): Unit = js.native
  
  /**
    * Queries the camera's view matrix.
    *
    * @type {Mat4}
    */
  def viewMatrix: Mat4 = js.native
  
  /**
    * Convert a point from 3D world space to 2D screen space.
    *
    * @param {Vec3} worldCoord - The world space coordinate.
    * @param {Vec3} [screenCoord] - 3D vector to receive screen coordinate result.
    * @returns {Vec3} The screen space coordinate.
    */
  def worldToScreen(worldCoord: Vec3): Vec3 = js.native
  def worldToScreen(worldCoord: Vec3, screenCoord: Vec3): Vec3 = js.native
}
