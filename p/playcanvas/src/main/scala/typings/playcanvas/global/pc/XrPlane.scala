package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected Plane instance that provides position, rotation and polygon points. Plane is a subject
  * to change during its lifetime.
  */
@JSGlobal("pc.XrPlane")
@js.native
open class XrPlane protected ()
  extends typings.playcanvas.mod.XrPlane {
  /**
    * Create a new XrPlane instance.
    *
    * @param {import('./xr-plane-detection.js').XrPlaneDetection} planeDetection - Plane detection
    * system.
    * @param {*} xrPlane - XRPlane that is instantiated by WebXR system.
    * @hideconstructor
    */
  def this(planeDetection: typings.playcanvas.mod.XrPlaneDetection, xrPlane: Any) = this()
}
