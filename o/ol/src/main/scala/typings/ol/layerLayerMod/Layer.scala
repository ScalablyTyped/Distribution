package typings.ol.layerLayerMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonsource
import typings.ol.olStrings.postrender
import typings.ol.olStrings.prerender
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer[SourceType /* <: typings.ol.sourceSourceMod.default */]
  extends typings.ol.layerBaseMod.default {
  /* protected */ def createRenderer(): typings.ol.rendererLayerMod.default[Layer[typings.ol.sourceSourceMod.default]] = js.native
  def getFeatures(pixel: Pixel): js.Promise[js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]] = js.native
  def getRenderer(): typings.ol.rendererLayerMod.default[Layer[typings.ol.sourceSourceMod.default]] = js.native
  def getSource(): SourceType = js.native
  def hasRenderer(): Boolean = js.native
  @JSName("on")
  def on_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_prerender(`type`: prerender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_prerender(`type`: prerender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  def render(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
  def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
  def setSource(source: SourceType): Unit = js.native
  @JSName("un")
  def un_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_prerender(`type`: prerender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
}

