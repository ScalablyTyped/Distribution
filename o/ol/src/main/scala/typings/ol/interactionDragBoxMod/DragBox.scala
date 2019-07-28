package typings.ol.interactionDragBoxMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.boxdrag
import typings.ol.olStrings.boxend
import typings.ol.olStrings.boxstart
import typings.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragBox
  extends typings.ol.interactionPointerMod.default {
  def defaultBoxEndCondition(mapBrowserEvent: typings.ol.mapBrowserEventMod.default, startPixel: Pixel, endPixel: Pixel): Boolean = js.native
  def getGeometry(): typings.ol.geomPolygonMod.default = js.native
  @JSName("on")
  def on_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("un")
  def un_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
}

