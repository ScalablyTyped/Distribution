package typings.ol.interactionExtentMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtentInteraction
  extends typings.ol.interactionPointerMod.default {
  def getExtent(): Extent = js.native
  def setExtent(extent: Extent): Unit = js.native
}

