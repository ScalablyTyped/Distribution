package typings.playcanvas.mod

import typings.playcanvas.anon.OffsetRay
import typings.std.Gamepad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents XR input source, which is any input mechanism which allows the user to perform
  * targeted actions in the same virtual space as the viewer. Example XR input sources include, but
  * are not limited to, handheld controllers, optically tracked hands, and gaze-based input methods
  * that operate on the viewer's pose.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrInputSource")
@js.native
open class XrInputSource protected () extends EventHandler {
  /**
    * Create a new XrInputSource instance.
    *
    * @param {import('./xr-manager.js').XrManager} manager - WebXR Manager.
    * @param {*} xrInputSource - [XRInputSource](https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource)
    * object that is created by WebXR API.
    * @hideconstructor
    */
  def this(manager: XrManager, xrInputSource: Any) = this()
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _dirtyLocal: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _dirtyRay: Any = js.native
  
  /**
    * @type {import('../entity.js').Entity|null}
    * @private
    */
  /* private */ var _elementEntity: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _elementInput: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _grip: Any = js.native
  
  /**
    * @type {XrHand}
    * @private
    */
  /* private */ var _hand: Any = js.native
  
  /**
    * @type {import('./xr-hit-test-source.js').XrHitTestSource[]}
    * @private
    */
  /* private */ var _hitTestSources: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _id: Any = js.native
  
  /**
    * @type {Mat4|null}
    * @private
    */
  /* private */ var _localPosition: Any = js.native
  
  /**
    * @type {Mat4|null}
    * @private
    */
  /* private */ var _localRotation: Any = js.native
  
  /**
    * @type {Mat4|null}
    * @private
    */
  /* private */ var _localTransform: Any = js.native
  
  /**
    * @type {import('./xr-manager.js').XrManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _position: Any = js.native
  
  /**
    * @type {Ray}
    * @private
    */
  /* private */ var _ray: Any = js.native
  
  /**
    * @type {Ray}
    * @private
    */
  /* private */ var _rayLocal: Any = js.native
  
  /**
    * @type {Quat}
    * @private
    */
  /* private */ var _rotation: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _selecting: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _squeezing: Any = js.native
  
  /** @private */
  /* private */ var _updateRayTransforms: Any = js.native
  
  /** @private */
  /* private */ var _updateTransforms: Any = js.native
  
  /**
    * @type {Mat4|null}
    * @private
    */
  /* private */ var _worldTransform: Any = js.native
  
  /**
    * @type {XRInputSource}
    * @private
    */
  /* private */ var _xrInputSource: Any = js.native
  
  /**
    * If {@link XrInputSource#elementInput} is true, this property will hold entity with Element
    * component at which this input source is hovering, or null if not hovering over any element.
    *
    * @type {import('../entity.js').Entity|null}
    */
  def elementEntity: Entity = js.native
  
  def elementInput: Boolean = js.native
  /**
    * Set to true to allow input source to interact with Element components. Defaults to true.
    *
    * @type {boolean}
    */
  def elementInput_=(arg: Boolean): Unit = js.native
  
  /**
    * If input source has buttons, triggers, thumbstick or touchpad, then this object provides
    * access to its states.
    *
    * @type {Gamepad|null}
    */
  def gamepad: Gamepad = js.native
  
  /**
    * Get the world space direction of input source ray.
    *
    * @returns {Vec3} The world space direction of input source ray.
    */
  def getDirection(): Vec3 = js.native
  
  /**
    * Get the local space position of input source if it is handheld ({@link XrInputSource#grip}
    * is true). Local space is relative to parent of the XR camera. Otherwise it will return null.
    *
    * @returns {Vec3|null} The world space position of handheld input source.
    */
  def getLocalPosition(): Vec3 | Null = js.native
  
  /**
    * Get the local space rotation of input source if it is handheld ({@link XrInputSource#grip}
    * is true). Local space is relative to parent of the XR camera. Otherwise it will return null.
    *
    * @returns {Vec3|null} The world space rotation of handheld input source.
    */
  def getLocalRotation(): Vec3 | Null = js.native
  
  /**
    * Get the world space origin of input source ray.
    *
    * @returns {Vec3} The world space origin of input source ray.
    */
  def getOrigin(): Vec3 = js.native
  
  /**
    * Get the world space position of input source if it is handheld ({@link XrInputSource#grip}
    * is true). Otherwise it will return null.
    *
    * @returns {Vec3|null} The world space position of handheld input source.
    */
  def getPosition(): Vec3 | Null = js.native
  
  /**
    * Get the world space rotation of input source if it is handheld ({@link XrInputSource#grip}
    * is true). Otherwise it will return null.
    *
    * @returns {Quat|null} The world space rotation of handheld input source.
    */
  def getRotation(): Quat | Null = js.native
  
  /**
    * If input source can be held, then it will have node with its world transformation, that can
    * be used to position and rotate virtual joysticks based on it.
    *
    * @type {boolean}
    */
  def grip: Boolean = js.native
  
  /**
    * If input source is a tracked hand, then it will point to {@link XrHand} otherwise it is
    * null.
    *
    * @type {XrHand|null}
    */
  def hand: XrHand = js.native
  
  /**
    * Describes which hand input source is associated with. Can be one of the following:
    *
    * - {@link XRHAND_NONE}: None - input source is not meant to be held in hands.
    * - {@link XRHAND_LEFT}: Left - indicates that input source is meant to be held in left hand.
    * - {@link XRHAND_RIGHT}: Right - indicates that input source is meant to be held in right
    * hand.
    *
    * @type {string}
    */
  def handedness: String = js.native
  
  /**
    * List of active {@link XrHitTestSource} instances created by this input source.
    *
    * @type {import('./xr-hit-test-source.js').XrHitTestSource[]}
    */
  def hitTestSources: js.Array[XrHitTestSource] = js.native
  
  /**
    * Attempts to start hit test source based on this input source.
    *
    * @param {object} [options] - Object for passing optional arguments.
    * @param {string[]} [options.entityTypes] - Optional list of underlying entity types against
    * which hit tests will be performed. Defaults to [ {@link XRTRACKABLE_PLANE} ]. Can be any
    * combination of the following:
    *
    * - {@link XRTRACKABLE_POINT}: Point - indicates that the hit test results will be computed
    * based on the feature points detected by the underlying Augmented Reality system.
    * - {@link XRTRACKABLE_PLANE}: Plane - indicates that the hit test results will be computed
    * based on the planes detected by the underlying Augmented Reality system.
    * - {@link XRTRACKABLE_MESH}: Mesh - indicates that the hit test results will be computed
    * based on the meshes detected by the underlying Augmented Reality system.
    *
    * @param {Ray} [options.offsetRay] - Optional ray by which hit test ray can be offset.
    * @param {import('./xr-hit-test.js').XrHitTestStartCallback} [options.callback] - Optional
    * callback function called once hit test source is created or failed.
    * @example
    * app.xr.input.on('add', function (inputSource) {
    *     inputSource.hitTestStart({
    *         callback: function (err, hitTestSource) {
    *             if (err) return;
    *             hitTestSource.on('result', function (position, rotation) {
    *                 // position and rotation of hit test result
    *                 // that will be created from touch on mobile devices
    *             });
    *         }
    *     });
    * });
    */
  def hitTestStart(): Unit = js.native
  def hitTestStart(options: OffsetRay): Unit = js.native
  
  /**
    * Fired when {@link XrInputSource} is removed.
    *
    * @event XrInputSource#remove
    * @example
    * inputSource.once('remove', function () {
    *     // input source is not available anymore
    * });
    */
  /**
    * Fired when input source has triggered primary action. This could be pressing a trigger
    * button, or touching a screen.
    *
    * @event XrInputSource#select
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    * @example
    * const ray = new pc.Ray();
    * inputSource.on('select', function (evt) {
    *     ray.set(inputSource.getOrigin(), inputSource.getDirection());
    *     if (obj.intersectsRay(ray)) {
    *         // selected an object with input source
    *     }
    * });
    */
  /**
    * Fired when input source has started to trigger primary action.
    *
    * @event XrInputSource#selectstart
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    */
  /**
    * Fired when input source has ended triggering primary action.
    *
    * @event XrInputSource#selectend
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    */
  /**
    * Fired when input source has triggered squeeze action. This is associated with "grabbing"
    * action on the controllers.
    *
    * @event XrInputSource#squeeze
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    */
  /**
    * Fired when input source has started to trigger squeeze action.
    *
    * @event XrInputSource#squeezestart
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    * @example
    * inputSource.on('squeezestart', function (evt) {
    *     if (obj.containsPoint(inputSource.getPosition())) {
    *         // grabbed an object
    *     }
    * });
    */
  /**
    * Fired when input source has ended triggering squeeze action.
    *
    * @event XrInputSource#squeezeend
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    */
  /**
    * Fired when new {@link XrHitTestSource} is added to the input source.
    *
    * @event XrInputSource#hittest:add
    * @param {import('./xr-hit-test-source.js').XrHitTestSource} hitTestSource - Hit test source
    * that has been added.
    * @example
    * inputSource.on('hittest:add', function (hitTestSource) {
    *     // new hit test source is added
    * });
    */
  /**
    * Fired when {@link XrHitTestSource} is removed to the the input source.
    *
    * @event XrInputSource#hittest:remove
    * @param {import('./xr-hit-test-source.js').XrHitTestSource} hitTestSource - Hit test source
    * that has been removed.
    * @example
    * inputSource.on('remove', function (hitTestSource) {
    *     // hit test source is removed
    * });
    */
  /**
    * Fired when hit test source receives new results. It provides transform information that
    * tries to match real world picked geometry.
    *
    * @event XrInputSource#hittest:result
    * @param {import('./xr-hit-test-source.js').XrHitTestSource} hitTestSource - Hit test source
    * that produced the hit result.
    * @param {Vec3} position - Position of hit test.
    * @param {Quat} rotation - Rotation of hit test.
    * @example
    * inputSource.on('hittest:result', function (hitTestSource, position, rotation) {
    *     target.setPosition(position);
    *     target.setRotation(rotation);
    * });
    */
  /**
    * Unique number associated with instance of input source. Same physical devices when
    * reconnected will not share this ID.
    *
    * @type {number}
    */
  def id: Double = js.native
  
  /**
    * XRInputSource object that is associated with this input source.
    *
    * @type {object}
    */
  def inputSource: Any = js.native
  
  /**
    * @param {import('./xr-hit-test-source.js').XrHitTestSource} hitTestSource - Hit test source
    * to be added.
    * @private
    */
  /* private */ var onHitTestSourceAdd: Any = js.native
  
  /**
    * @param {import('./xr-hit-test-source.js').XrHitTestSource} hitTestSource - Hit test source
    * to be removed.
    * @private
    */
  /* private */ var onHitTestSourceRemove: Any = js.native
  
  /**
    * List of input profile names indicating both the preferred visual representation and behavior
    * of the input source.
    *
    * @type {string[]}
    */
  def profiles: js.Array[String] = js.native
  
  /**
    * True if input source is in active primary action between selectstart and selectend events.
    *
    * @type {boolean}
    */
  def selecting: Boolean = js.native
  
  /**
    * True if input source is in active squeeze action between squeezestart and squeezeend events.
    *
    * @type {boolean}
    */
  def squeezing: Boolean = js.native
  
  /**
    * Type of ray Input Device is based on. Can be one of the following:
    *
    * - {@link XRTARGETRAY_GAZE}: Gaze - indicates the target ray will originate at the viewer and
    * follow the direction it is facing. This is commonly referred to as a "gaze input" device in
    * the context of head-mounted displays.
    * - {@link XRTARGETRAY_SCREEN}: Screen - indicates that the input source was an interaction
    * with the canvas element associated with an inline session's output context, such as a mouse
    * click or touch event.
    * - {@link XRTARGETRAY_POINTER}: Tracked Pointer - indicates that the target ray originates
    * from either a handheld device or other hand-tracking mechanism and represents that the user
    * is using their hands or the held device for pointing.
    *
    * @type {string}
    */
  def targetRayMode: String = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @ignore
    */
  def update(frame: Any): Unit = js.native
}
