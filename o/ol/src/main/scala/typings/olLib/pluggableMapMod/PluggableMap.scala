package typings
package olLib.pluggableMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluggableMap
  extends olLib.objectMod.default {
  var controls: olLib.collectionMod.default[olLib.controlControlMod.default] = js.native
  var interactions: olLib.collectionMod.default[olLib.interactionInteractionMod.default] = js.native
  def addControl(control: olLib.controlControlMod.default): scala.Unit = js.native
  def addInteraction(interaction: olLib.interactionInteractionMod.default): scala.Unit = js.native
  def addLayer(layer: olLib.layerBaseMod.default): scala.Unit = js.native
  def addOverlay(overlay: olLib.overlayMod.default): scala.Unit = js.native
  def createRenderer(): olLib.rendererMapMod.default = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: olLib.pixelMod.Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* param1 */ olLib.featureMod.FeatureLike, 
      /* param2 */ olLib.layerLayerMod.default, 
      T
    ]
  ): T = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: olLib.pixelMod.Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* param1 */ olLib.featureMod.FeatureLike, 
      /* param2 */ olLib.layerLayerMod.default, 
      T
    ],
    opt_options: AtPixelOptions
  ): T = js.native
  def forEachLayerAtPixel[S, T](
    pixel: olLib.pixelMod.Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* param1 */ olLib.layerLayerMod.default, 
      /* param2 */ stdLib.Uint8ClampedArray | stdLib.Uint8Array, 
      T
    ]
  ): T = js.native
  def forEachLayerAtPixel[S, T](
    pixel: olLib.pixelMod.Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* param1 */ olLib.layerLayerMod.default, 
      /* param2 */ stdLib.Uint8ClampedArray | stdLib.Uint8Array, 
      T
    ],
    opt_options: AtPixelOptions
  ): T = js.native
  def getControls(): olLib.collectionMod.default[olLib.controlControlMod.default] = js.native
  def getCoordinateFromPixel(pixel: olLib.pixelMod.Pixel): olLib.coordinateMod.Coordinate = js.native
  def getEventCoordinate(event: olLib.eventsEventMod.default): olLib.coordinateMod.Coordinate = js.native
  def getEventPixel(event: olLib.eventsEventMod.default): olLib.pixelMod.Pixel = js.native
  def getEventPixel(event: stdLib.TouchEvent): olLib.pixelMod.Pixel = js.native
  def getFeaturesAtPixel(pixel: olLib.pixelMod.Pixel): js.Array[olLib.featureMod.FeatureLike] = js.native
  def getFeaturesAtPixel(pixel: olLib.pixelMod.Pixel, opt_options: AtPixelOptions): js.Array[olLib.featureMod.FeatureLike] = js.native
  def getInteractions(): olLib.collectionMod.default[olLib.interactionInteractionMod.default] = js.native
  def getLayerGroup(): olLib.layerGroupMod.default = js.native
  def getLayers(): olLib.collectionMod.default[olLib.layerBaseMod.default] = js.native
  def getOverlayById(id: java.lang.String): olLib.overlayMod.default = js.native
  def getOverlayById(id: scala.Double): olLib.overlayMod.default = js.native
  def getOverlayContainer(): stdLib.HTMLElement = js.native
  def getOverlayContainerStopEvent(): stdLib.HTMLElement = js.native
  def getOverlays(): olLib.collectionMod.default[olLib.overlayMod.default] = js.native
  def getPixelFromCoordinate(coordinate: olLib.coordinateMod.Coordinate): olLib.pixelMod.Pixel = js.native
  def getRenderer(): olLib.rendererMapMod.default = js.native
  def getSize(): olLib.sizeMod.Size = js.native
  def getTarget(): stdLib.HTMLElement | java.lang.String = js.native
  def getTargetElement(): stdLib.HTMLElement = js.native
  def getTilePriority(
    tile: olLib.tileMod.default,
    tileSourceKey: java.lang.String,
    tileCenter: olLib.coordinateMod.Coordinate,
    tileResolution: scala.Double
  ): scala.Double = js.native
  def getView(): olLib.viewMod.default = js.native
  def getViewport(): stdLib.HTMLElement = js.native
  def handleBrowserEvent(browserEvent: olLib.eventsEventMod.default): scala.Unit = js.native
  def handleBrowserEvent(browserEvent: olLib.eventsEventMod.default, opt_type: java.lang.String): scala.Unit = js.native
  def handleMapBrowserEvent(mapBrowserEvent: olLib.mapBrowserEventMod.default): scala.Unit = js.native
  /* protected */ def handlePostRender(): scala.Unit = js.native
  def hasFeatureAtPixel[U](pixel: olLib.pixelMod.Pixel): scala.Boolean = js.native
  def hasFeatureAtPixel[U](pixel: olLib.pixelMod.Pixel, opt_options: AtPixelOptions): scala.Boolean = js.native
  def isRendered(): scala.Boolean = js.native
  @JSName("on")
  def `on_change:layerGroup`(
    `type`: olLib.olLibStrings.`change:layerGroup`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:size`(
    `type`: olLib.olLibStrings.`change:size`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:target`(
    `type`: olLib.olLibStrings.`change:target`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:view`(
    `type`: olLib.olLibStrings.`change:view`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_click(
    `type`: olLib.olLibStrings.click,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_dblclick(
    `type`: olLib.olLibStrings.dblclick,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_moveend(
    `type`: olLib.olLibStrings.moveend,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_movestart(
    `type`: olLib.olLibStrings.movestart,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_pointerdrag(
    `type`: olLib.olLibStrings.pointerdrag,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_pointermove(
    `type`: olLib.olLibStrings.pointermove,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_postcompose(
    `type`: olLib.olLibStrings.postcompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_postrender(
    `type`: olLib.olLibStrings.postrender,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_precompose(
    `type`: olLib.olLibStrings.precompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_rendercomplete(
    `type`: olLib.olLibStrings.rendercomplete,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_singleclick(
    `type`: olLib.olLibStrings.singleclick,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:layerGroup`(
    `type`: olLib.olLibStrings.`change:layerGroup`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:size`(
    `type`: olLib.olLibStrings.`change:size`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:target`(
    `type`: olLib.olLibStrings.`change:target`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:view`(
    `type`: olLib.olLibStrings.`change:view`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_click(
    `type`: olLib.olLibStrings.click,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_dblclick(
    `type`: olLib.olLibStrings.dblclick,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_moveend(
    `type`: olLib.olLibStrings.moveend,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_movestart(
    `type`: olLib.olLibStrings.movestart,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_pointerdrag(
    `type`: olLib.olLibStrings.pointerdrag,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_pointermove(
    `type`: olLib.olLibStrings.pointermove,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_postcompose(
    `type`: olLib.olLibStrings.postcompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_postrender(
    `type`: olLib.olLibStrings.postrender,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_precompose(
    `type`: olLib.olLibStrings.precompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_rendercomplete(
    `type`: olLib.olLibStrings.rendercomplete,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_singleclick(
    `type`: olLib.olLibStrings.singleclick,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def removeControl(control: olLib.controlControlMod.default): olLib.controlControlMod.default = js.native
  def removeInteraction(interaction: olLib.interactionInteractionMod.default): olLib.interactionInteractionMod.default = js.native
  def removeLayer(layer: olLib.layerBaseMod.default): olLib.layerBaseMod.default = js.native
  def removeOverlay(overlay: olLib.overlayMod.default): olLib.overlayMod.default = js.native
  def render(): scala.Unit = js.native
  def renderSync(): scala.Unit = js.native
  def setLayerGroup(layerGroup: olLib.layerGroupMod.default): scala.Unit = js.native
  def setSize(size: olLib.sizeMod.Size): scala.Unit = js.native
  def setTarget(target: java.lang.String): scala.Unit = js.native
  def setTarget(target: stdLib.HTMLElement): scala.Unit = js.native
  def setView(view: olLib.viewMod.default): scala.Unit = js.native
  def skipFeature(feature: olLib.featureMod.default): scala.Unit = js.native
  @JSName("un")
  def `un_change:layerGroup`(
    `type`: olLib.olLibStrings.`change:layerGroup`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:size`(
    `type`: olLib.olLibStrings.`change:size`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:target`(
    `type`: olLib.olLibStrings.`change:target`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:view`(
    `type`: olLib.olLibStrings.`change:view`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_click(
    `type`: olLib.olLibStrings.click,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_dblclick(
    `type`: olLib.olLibStrings.dblclick,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_moveend(
    `type`: olLib.olLibStrings.moveend,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_movestart(
    `type`: olLib.olLibStrings.movestart,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_pointerdrag(
    `type`: olLib.olLibStrings.pointerdrag,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_pointermove(
    `type`: olLib.olLibStrings.pointermove,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_postcompose(
    `type`: olLib.olLibStrings.postcompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_postrender(
    `type`: olLib.olLibStrings.postrender,
    listener: js.Function1[/* evt */ olLib.mapEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_precompose(
    `type`: olLib.olLibStrings.precompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_rendercomplete(
    `type`: olLib.olLibStrings.rendercomplete,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_singleclick(
    `type`: olLib.olLibStrings.singleclick,
    listener: js.Function1[/* evt */ olLib.mapBrowserEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  def unskipFeature(feature: olLib.featureMod.default): scala.Unit = js.native
  def updateSize(): scala.Unit = js.native
}

