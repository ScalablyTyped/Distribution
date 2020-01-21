package typings.ol.drawMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.drawend
import typings.ol.olStrings.drawstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draw
  extends typings.ol.pointerMod.default {
  def extend(feature: typings.ol.olFeatureMod.default[typings.ol.lineStringMod.default]): Unit = js.native
  def finishDrawing(): Unit = js.native
  def getOverlay(): typings.ol.vectorMod.default = js.native
  @JSName("on")
  def on_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  def removeLastPoint(): Unit = js.native
  @JSName("un")
  def un_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
}

