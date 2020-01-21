package typings.ol.interactionExtentMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.extentchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extent
  extends typings.ol.pointerMod.default {
  def getExtent(): typings.ol.extentMod.Extent = js.native
  def getExtentInternal(): typings.ol.extentMod.Extent = js.native
  @JSName("on")
  def on_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): EventsKey = js.native
  def setExtent(extent: typings.ol.extentMod.Extent): Unit = js.native
  @JSName("un")
  def un_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): Unit = js.native
}

