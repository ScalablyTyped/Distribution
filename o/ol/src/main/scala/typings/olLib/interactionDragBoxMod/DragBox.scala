package typings
package olLib.interactionDragBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragBox
  extends olLib.interactionPointerMod.default {
  def defaultBoxEndCondition(
    mapBrowserEvent: olLib.mapBrowserEventMod.default,
    startPixel: olLib.pixelMod.Pixel,
    endPixel: olLib.pixelMod.Pixel
  ): scala.Boolean = js.native
  def getGeometry(): olLib.geomPolygonMod.default = js.native
  @JSName("on")
  def on_boxdrag(`type`: olLib.olLibStrings.boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_boxend(`type`: olLib.olLibStrings.boxend, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_boxstart(`type`: olLib.olLibStrings.boxstart, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_boxdrag(`type`: olLib.olLibStrings.boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_boxend(`type`: olLib.olLibStrings.boxend, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_boxstart(`type`: olLib.olLibStrings.boxstart, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("un")
  def un_boxdrag(`type`: olLib.olLibStrings.boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): scala.Unit = js.native
  @JSName("un")
  def un_boxend(`type`: olLib.olLibStrings.boxend, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): scala.Unit = js.native
  @JSName("un")
  def un_boxstart(`type`: olLib.olLibStrings.boxstart, listener: js.Function1[/* evt */ DragBoxEvent, scala.Unit]): scala.Unit = js.native
}

