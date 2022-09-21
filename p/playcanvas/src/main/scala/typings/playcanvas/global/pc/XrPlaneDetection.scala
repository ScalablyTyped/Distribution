package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/**
  * Plane Detection provides the ability to detect real world surfaces based on estimations of the
  * underlying AR system.
  *
  * ```javascript
  * // start session with plane detection enabled
  * app.xr.start(camera, pc.XRTYPE_VR, pc.XRSPACE_LOCALFLOOR, {
  *     planeDetection: true
  * });
  * ```
  *
  * ```javascript
  * app.xr.planeDetection.on('add', function (plane) {
  *     // new plane been added
  * });
  * ```
  */
@JSGlobal("pc.XrPlaneDetection")
@js.native
open class XrPlaneDetection protected ()
  extends typings.playcanvas.mod.XrPlaneDetection {
  /**
    * Create a new XrPlaneDetection instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: typings.playcanvas.mod.XrManager) = this()
}
