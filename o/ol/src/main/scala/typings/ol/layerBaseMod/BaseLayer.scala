package typings.ol.layerBaseMod

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.layerLayerMod.State
import typings.ol.layerTypeMod.LayerType
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:extent`
import typings.ol.olStrings.`change:maxResolution`
import typings.ol.olStrings.`change:minResolution`
import typings.ol.olStrings.`change:opacity`
import typings.ol.olStrings.`change:visible`
import typings.ol.olStrings.`change:zIndex`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLayer
  extends typings.ol.objectMod.default {
  def getExtent(): js.UndefOr[Extent] = js.native
  def getLayerState(): State = js.native
  def getLayerStatesArray(): js.Array[State] = js.native
  def getLayerStatesArray(opt_states: js.Array[State]): js.Array[State] = js.native
  def getLayersArray(): js.Array[typings.ol.layerLayerMod.default] = js.native
  def getLayersArray(opt_array: js.Array[typings.ol.layerLayerMod.default]): js.Array[typings.ol.layerLayerMod.default] = js.native
  def getMaxResolution(): Double = js.native
  def getMinResolution(): Double = js.native
  def getOpacity(): Double = js.native
  def getSourceState(): typings.ol.sourceStateMod.State = js.native
  def getType(): LayerType = js.native
  def getVisible(): Boolean = js.native
  def getZIndex(): Double = js.native
  @JSName("on")
  def on_changeextent(`type`: `change:extent`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changemaxResolution(`type`: `change:maxResolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeminResolution(`type`: `change:minResolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeopacity(`type`: `change:opacity`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changevisible(`type`: `change:visible`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changezIndex(`type`: `change:zIndex`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeextent(`type`: `change:extent`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changemaxResolution(`type`: `change:maxResolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeminResolution(`type`: `change:minResolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeopacity(`type`: `change:opacity`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changevisible(`type`: `change:visible`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changezIndex(`type`: `change:zIndex`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setExtent(): Unit = js.native
  def setExtent(extent: Extent): Unit = js.native
  def setMaxResolution(maxResolution: Double): Unit = js.native
  def setMinResolution(minResolution: Double): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setZIndex(zindex: Double): Unit = js.native
  @JSName("un")
  def un_changeextent(`type`: `change:extent`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changemaxResolution(`type`: `change:maxResolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeminResolution(`type`: `change:minResolution`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeopacity(`type`: `change:opacity`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changevisible(`type`: `change:visible`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changezIndex(`type`: `change:zIndex`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

