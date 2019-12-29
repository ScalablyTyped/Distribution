package typings.ol.pluggableMapMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.featureMod.FeatureLike
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonlayerGroup
import typings.ol.olStrings.changeColonsize
import typings.ol.olStrings.changeColontarget
import typings.ol.olStrings.changeColonview
import typings.ol.olStrings.click
import typings.ol.olStrings.dblclick
import typings.ol.olStrings.moveend
import typings.ol.olStrings.movestart
import typings.ol.olStrings.pointerdrag
import typings.ol.olStrings.pointermove
import typings.ol.olStrings.postcompose
import typings.ol.olStrings.postrender
import typings.ol.olStrings.precompose
import typings.ol.olStrings.rendercomplete
import typings.ol.olStrings.singleclick
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.std.HTMLElement
import typings.std.TouchEvent
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluggableMap
  extends typings.ol.objectMod.default {
  var controls: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
  var interactions: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
  def addControl(control: typings.ol.controlControlMod.default): Unit = js.native
  def addInteraction(interaction: typings.ol.interactionInteractionMod.default): Unit = js.native
  def addLayer(layer: typings.ol.layerBaseMod.default): Unit = js.native
  def addOverlay(overlay: typings.ol.overlayMod.default): Unit = js.native
  def createRenderer(): typings.ol.rendererMapMod.default = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[/* this */ S, /* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default, T]
  ): js.UndefOr[T] = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[/* this */ S, /* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default, T],
    opt_options: AtPixelOptions
  ): js.UndefOr[T] = js.native
  def forEachLayerAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typings.ol.layerLayerMod.default, 
      /* p1 */ Uint8ClampedArray | Uint8Array, 
      T
    ]
  ): js.UndefOr[T] = js.native
  def forEachLayerAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typings.ol.layerLayerMod.default, 
      /* p1 */ Uint8ClampedArray | Uint8Array, 
      T
    ],
    opt_options: AtPixelOptions
  ): js.UndefOr[T] = js.native
  def getControls(): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
  def getCoordinateFromPixel(pixel: Pixel): Coordinate = js.native
  def getEventCoordinate(event: typings.ol.eventsEventMod.default): Coordinate = js.native
  def getEventPixel(event: typings.ol.eventsEventMod.default): Pixel = js.native
  def getEventPixel(event: TouchEvent): Pixel = js.native
  def getFeaturesAtPixel(pixel: Pixel): js.Array[FeatureLike] = js.native
  def getFeaturesAtPixel(pixel: Pixel, opt_options: AtPixelOptions): js.Array[FeatureLike] = js.native
  def getInteractions(): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
  def getLayerGroup(): typings.ol.layerGroupMod.default = js.native
  def getLayers(): typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] = js.native
  def getOverlayById(id: String): typings.ol.overlayMod.default = js.native
  def getOverlayById(id: Double): typings.ol.overlayMod.default = js.native
  def getOverlayContainer(): HTMLElement = js.native
  def getOverlayContainerStopEvent(): HTMLElement = js.native
  def getOverlays(): typings.ol.collectionMod.default[typings.ol.overlayMod.default] = js.native
  def getPixelFromCoordinate(coordinate: Coordinate): Pixel = js.native
  def getRenderer(): typings.ol.rendererMapMod.default = js.native
  def getSize(): js.UndefOr[Size] = js.native
  def getTarget(): js.UndefOr[HTMLElement | String] = js.native
  def getTargetElement(): HTMLElement = js.native
  def getTilePriority(
    tile: typings.ol.tileMod.default,
    tileSourceKey: String,
    tileCenter: Coordinate,
    tileResolution: Double
  ): Double = js.native
  def getView(): typings.ol.viewMod.default = js.native
  def getViewport(): HTMLElement = js.native
  def handleBrowserEvent(browserEvent: typings.ol.eventsEventMod.default): Unit = js.native
  def handleBrowserEvent(browserEvent: typings.ol.eventsEventMod.default, opt_type: String): Unit = js.native
  def handleMapBrowserEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default): Unit = js.native
  /* protected */ def handlePostRender(): Unit = js.native
  def hasFeatureAtPixel[U](pixel: Pixel): Boolean = js.native
  def hasFeatureAtPixel[U](pixel: Pixel, opt_options: AtPixelOptions): Boolean = js.native
  def isRendered(): Boolean = js.native
  @JSName("on")
  def on_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_click(`type`: click, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_pointerdrag(`type`: pointerdrag, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_pointermove(`type`: pointermove, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_singleclick(`type`: singleclick, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_click(`type`: click, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_pointerdrag(`type`: pointerdrag, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_pointermove(`type`: pointermove, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_singleclick(`type`: singleclick, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  def removeControl(control: typings.ol.controlControlMod.default): js.UndefOr[typings.ol.controlControlMod.default] = js.native
  def removeInteraction(interaction: typings.ol.interactionInteractionMod.default): js.UndefOr[typings.ol.interactionInteractionMod.default] = js.native
  def removeLayer(layer: typings.ol.layerBaseMod.default): js.UndefOr[typings.ol.layerBaseMod.default] = js.native
  def removeOverlay(overlay: typings.ol.overlayMod.default): js.UndefOr[typings.ol.overlayMod.default] = js.native
  def render(): Unit = js.native
  def renderSync(): Unit = js.native
  def setLayerGroup(layerGroup: typings.ol.layerGroupMod.default): Unit = js.native
  def setSize(): Unit = js.native
  def setSize(size: Size): Unit = js.native
  def setTarget(): Unit = js.native
  def setTarget(target: String): Unit = js.native
  def setTarget(target: HTMLElement): Unit = js.native
  def setView(view: typings.ol.viewMod.default): Unit = js.native
  def skipFeature(feature: typings.ol.featureMod.default): Unit = js.native
  @JSName("un")
  def un_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_click(`type`: click, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_dblclick(`type`: dblclick, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_pointerdrag(`type`: pointerdrag, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_pointermove(`type`: pointermove, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_singleclick(`type`: singleclick, listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default, Unit]): Unit = js.native
  def unskipFeature(feature: typings.ol.featureMod.default): Unit = js.native
  def updateSize(): Unit = js.native
}

