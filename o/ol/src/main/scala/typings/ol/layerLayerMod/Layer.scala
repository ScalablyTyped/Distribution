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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer[SourceType /* <: typings.ol.sourceSourceMod.default */]
  extends typings.ol.baseMod.default {
  
  /**
    * Create a renderer for this layer.
    */
  /* protected */ def createRenderer(): typings.ol.rendererLayerMod.default[Layer[typings.ol.sourceSourceMod.default]] = js.native
  
  def getFeatures(pixel: Pixel): js.Promise[js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]] = js.native
  
  /**
    * Get the renderer for this layer.
    */
  def getRenderer(): typings.ol.rendererLayerMod.default[Layer[typings.ol.sourceSourceMod.default]] = js.native
  
  /**
    * Get the layer source.
    */
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
  
  /**
    * In charge to manage the rendering of the layer. One layer type is
    * bounded with one layer renderer.
    */
  def render(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
  
  /**
    * Sets the layer to be rendered on top of other layers on a map. The map will
    * not manage this layer in its layers collection, and the callback in
    * {@link module:ol/Map#forEachLayerAtPixel} will receive null as layer. This
    * is useful for temporary layers. To remove an unmanaged layer from the map,
    * use #setMap(null).
    * To add the layer to a map and have it managed by the map, use
    * {@link module:ol/Map#addLayer} instead.
    */
  def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
  
  /**
    * Set the layer source.
    */
  def setSource(source: SourceType): Unit = js.native
  
  @JSName("un")
  def un_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_prerender(`type`: prerender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
}
