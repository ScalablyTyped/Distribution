package typings.playcanvas.global.pc

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Name of event fired when a touch point is interrupted in some way.
  * The exact reasons for cancelling a touch can vary from device to device.
  * For example, a modal alert pops up during the interaction; the touch point leaves the document area,
  * or there are more touch points than the device supports, in which case the earliest touch point is canceled.
  */
@JSGlobal("pc.EVENT_TOUCHCANCEL")
@js.native
object EVENT_TOUCHCANCEL extends TopLevel[String]

