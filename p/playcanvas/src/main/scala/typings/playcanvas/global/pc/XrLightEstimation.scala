package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new XrLightEstimation. Note that this is created internally by the {@link pc.XrManager}.
  * @property supported - True if Light Estimation is supported. This information is available only during an active AR session.
  * @property intensity - Intensity of what is estimated to be the most prominent directional light. Or null if data is not available.
  * @property color - Color of what is estimated to be the most prominent directional light. Or null if data is not available.
  * @property rotation - Rotation of what is estimated to be the most prominent directional light. Or null if data is not available.
  * @param manager - WebXR Manager.
  */
@JSGlobal("pc.XrLightEstimation")
@js.native
class XrLightEstimation protected ()
  extends typings.playcanvas.pc.XrLightEstimation {
  def this(manager: typings.playcanvas.pc.XrManager) = this()
}

