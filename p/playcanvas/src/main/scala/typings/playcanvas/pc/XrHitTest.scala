package typings.playcanvas.pc

import typings.playcanvas.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.XrHitTest
  * @augments pc.EventHandler
  * @classdesc Hit Test provides ability to get position and rotation of ray intersecting point with representation of real world geometry by underlying AR system.
  * @description Hit Test provides ability to get position and rotation of ray intersecting point with representation of real world geometry by underlying AR system.
  * @param {pc.XrManager} manager - WebXR Manager.
  * @property {boolean} supported True if AR Hit Test is supported.
  * @property {pc.XrHitTestSource[]} sources list of active {@link pc.XrHitTestSource}.
  */
@JSGlobal("pc.XrHitTest")
@js.native
class XrHitTest protected () extends EventHandler {
  def this(manager: XrManager) = this()
  /**
    * list of active {@link pc.XrHitTestSource}.
    */
  var sources: js.Array[XrHitTestSource] = js.native
  /**
    * True if AR Hit Test is supported.
    */
  var supported: Boolean = js.native
  /**
    * @function
    * @name pc.XrHitTest#start
    * @description Attempts to start hit test with provided reference space.
    * @param {object} [options] - Optional object for passing arguments.
    * @param {string} [options.spaceType] - Reference space type. Defaults to {@link pc.XRSPACE_VIEWER}. Can be one of the following:
    *
    * * {@link pc.XRSPACE_VIEWER}: Viewer - hit test will be facing relative to viewers space.
    * * {@link pc.XRSPACE_LOCAL}: Local - represents a tracking space with a native origin near the viewer at the time of creation.
    * * {@link pc.XRSPACE_LOCALFLOOR}: Local Floor - represents a tracking space with a native origin at the floor in a safe position for the user to stand. The y axis equals 0 at floor level. Floor level value might be estimated by the underlying platform.
    * * {@link pc.XRSPACE_BOUNDEDFLOOR}: Bounded Floor - represents a tracking space with its native origin at the floor, where the user is expected to move within a pre-established boundary.
    * * {@link pc.XRSPACE_UNBOUNDED}: Unbounded - represents a tracking space where the user is expected to move freely around their environment, potentially long distances from their starting point.
    *
    * @param {string} [options.profile] - if hit test source meant to match input source instead of reference space, then name of profile of the {@link pc.XrInputSource} should be provided.
    * @param {string[]} [options.entityTypes] - Optional list of underlying entity types against which hit tests will be performed. Defaults to [ {pc.XRTRACKABLE_PLANE} ]. Can be any combination of the following:
    *
    * * {@link pc.XRTRACKABLE_POINT}: Point - indicates that the hit test results will be computed based on the feature points detected by the underlying Augmented Reality system.
    * * {@link pc.XRTRACKABLE_PLANE}: Plane - indicates that the hit test results will be computed based on the planes detected by the underlying Augmented Reality system.
    * * {@link pc.XRTRACKABLE_MESH}: Mesh - indicates that the hit test results will be computed based on the meshes detected by the underlying Augmented Reality system.
    *
    * @param {pc.Ray} [options.offsetRay] - Optional ray by which hit test ray can be offset.
    * @param {pc.callbacks.XrHitTestStart} [options.callback] - Optional callback function called once hit test source is created or failed.
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
  def start(options: AnonCallback): Unit = js.native
}

