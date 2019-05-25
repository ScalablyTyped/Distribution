package typings
package olLib.interactionExtentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtentInteraction
  extends olLib.interactionPointerMod.default {
  def getExtent(): olLib.extentMod.Extent = js.native
  def setExtent(extent: olLib.extentMod.Extent): scala.Unit = js.native
}

