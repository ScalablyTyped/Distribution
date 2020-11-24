package typings.ol.dragBoxMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.boxdrag
import typings.ol.olStrings.boxend
import typings.ol.olStrings.boxstart
import typings.ol.pixelMod.Pixel
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragBox
  extends typings.ol.pointerMod.default {
  
  /**
    * The default condition for determining whether the boxend event
    * should fire.
    */
  def defaultBoxEndCondition(
    mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent],
    startPixel: Pixel,
    endPixel: Pixel
  ): Boolean = js.native
  
  /**
    * Returns geometry of last drawn box.
    */
  def getGeometry(): typings.ol.polygonMod.default = js.native
  
  /**
    * Function to execute just before onboxend is fired
    */
  def onBoxEnd(event: typings.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
  
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
