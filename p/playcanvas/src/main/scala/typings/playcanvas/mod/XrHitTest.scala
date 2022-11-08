package typings.playcanvas.mod

import typings.playcanvas.anon.EntityTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/** @typedef {import('../../core/shape/ray.js').Ray} Ray */
/**
  * Callback used by {@link XrHitTest#start} and {@link XrHitTest#startForInputSource}.
  *
  * @callback XrHitTestStartCallback
  * @param {Error|null} err - The Error object if failed to create hit test source or null.
  * @param {XrHitTestSource|null} hitTestSource - Object that provides access to hit results against
  * real world geometry.
  */
/**
  * Hit Test provides ability to get position and rotation of ray intersecting point with
  * representation of real world geometry by underlying AR system.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrHitTest")
@js.native
open class XrHitTest protected () extends EventHandler {
  /**
    * Create a new XrHitTest instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: XrManager) = this()
  
  /**
    * @param {XRHitTestSource} xrHitTestSource - Hit test source.
    * @param {boolean} transient - True if hit test source is created from transient input source.
    * @param {Function} callback - Callback called once hit test source is created.
    * @private
    */
  /* private */ var _onHitTestSource: Any = js.native
  
  /** @private */
  /* private */ var _onSessionEnd: Any = js.native
  
  /**
    * Fired when new {@link XrHitTestSource} is added to the list.
    *
    * @event XrHitTest#add
    * @param {XrHitTestSource} hitTestSource - Hit test source that has been added.
    * @example
    * app.xr.hitTest.on('add', function (hitTestSource) {
    *     // new hit test source is added
    * });
    */
  /**
    * Fired when {@link XrHitTestSource} is removed to the list.
    *
    * @event XrHitTest#remove
    * @param {XrHitTestSource} hitTestSource - Hit test source that has been removed.
    * @example
    * app.xr.hitTest.on('remove', function (hitTestSource) {
    *     // hit test source is removed
    * });
    */
  /**
    * Fired when hit test source receives new results. It provides transform information that
    * tries to match real world picked geometry.
    *
    * @event XrHitTest#result
    * @param {XrHitTestSource} hitTestSource - Hit test source that produced the hit result.
    * @param {Vec3} position - Position of hit test.
    * @param {Quat} rotation - Rotation of hit test.
    * @param {XrInputSource|null} inputSource - If is transient hit test source, then it will provide related input source.
    * @example
    * app.xr.hitTest.on('result', function (hitTestSource, position, rotation, inputSource) {
    *     target.setPosition(position);
    *     target.setRotation(rotation);
    * });
    */
  /**
    * Fired when failed create hit test source.
    *
    * @event XrHitTest#error
    * @param {Error} error - Error object related to failure of creating hit test source.
    */
  /** @private */
  /* private */ var _onSessionStart: Any = js.native
  
  /**
    * @type {XRSession}
    * @private
    */
  /* private */ var _session: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _supported: Any = js.native
  
  /**
    * Checks if hit testing is available.
    *
    * @param {Function} callback - Error callback.
    * @param {*} fireError - Event handler on while to fire error event.
    * @returns {boolean} True if hit test is available.
    * @private
    */
  /* private */ var isAvailable: Any = js.native
  
  /**
    * @type {XrManager}
    * @private
    */
  /* private */ var manager: Any = js.native
  
  /**
    * List of active {@link XrHitTestSource}.
    *
    * @type {XrHitTestSource[]}
    */
  var sources: js.Array[XrHitTestSource] = js.native
  
  /**
    * Attempts to start hit test with provided reference space.
    *
    * @param {object} [options] - Optional object for passing arguments.
    * @param {string} [options.spaceType] - Reference space type. Defaults to
    * {@link XRSPACE_VIEWER}. Can be one of the following:
    *
    * - {@link XRSPACE_VIEWER}: Viewer - hit test will be facing relative to viewers space.
    * - {@link XRSPACE_LOCAL}: Local - represents a tracking space with a native origin near the
    * viewer at the time of creation.
    * - {@link XRSPACE_LOCALFLOOR}: Local Floor - represents a tracking space with a native origin
    * at the floor in a safe position for the user to stand. The y axis equals 0 at floor level.
    * Floor level value might be estimated by the underlying platform.
    * - {@link XRSPACE_BOUNDEDFLOOR}: Bounded Floor - represents a tracking space with its native
    * origin at the floor, where the user is expected to move within a pre-established boundary.
    * - {@link XRSPACE_UNBOUNDED}: Unbounded - represents a tracking space where the user is
    * expected to move freely around their environment, potentially long distances from their
    * starting point.
    *
    * @param {string} [options.profile] - if hit test source meant to match input source instead
    * of reference space, then name of profile of the {@link XrInputSource} should be provided.
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
    * @param {XrHitTestStartCallback} [options.callback] - Optional callback function called once
    * hit test source is created or failed.
    * @example
    * app.xr.hitTest.start({
    *     spaceType: pc.XRSPACE_VIEWER,
    *     callback: function (err, hitTestSource) {
    *         if (err) return;
    *         hitTestSource.on('result', function (position, rotation) {
    *             // position and rotation of hit test result
    *             // based on Ray facing forward from the Viewer reference space
    *         });
    *     }
    * });
    * @example
    * var ray = new pc.Ray(new pc.Vec3(0, 0, 0), new pc.Vec3(0, -1, 0));
    * app.xr.hitTest.start({
    *     spaceType: pc.XRSPACE_LOCAL,
    *     offsetRay: ray,
    *     callback: function (err, hitTestSource) {
    *         // hit test source that will sample real world geometry straight down
    *         // from the position where AR session started
    *     }
    * });
    * @example
    * app.xr.hitTest.start({
    *     profile: 'generic-touchscreen',
    *     callback: function (err, hitTestSource) {
    *         if (err) return;
    *         hitTestSource.on('result', function (position, rotation, inputSource) {
    *             // position and rotation of hit test result
    *             // that will be created from touch on mobile devices
    *         });
    *     }
    * });
    */
  def start(): Unit = js.native
  def start(options: EntityTypes): Unit = js.native
  
  /**
    * True if AR Hit Test is supported.
    *
    * @type {boolean}
    */
  def supported: Boolean = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @ignore
    */
  def update(frame: Any): Unit = js.native
}
