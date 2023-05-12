package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Light Estimation provides illumination data from the real world, which is estimated by the
  * underlying AR system. It provides a reflection Cube Map, that represents the reflection
  * estimation from the viewer position. A more simplified approximation of light is provided by L2
  * Spherical Harmonics data. And the most simple level of light estimation is the most prominent
  * directional light, its rotation, intensity and color.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrLightEstimation")
@js.native
open class XrLightEstimation protected ()
  extends typings.playcanvas.mod.XrLightEstimation {
  /**
    * Create a new XrLightEstimation instance.
    *
    * @param {import('./xr-manager.js').XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: typings.playcanvas.mod.XrManager) = this()
}
