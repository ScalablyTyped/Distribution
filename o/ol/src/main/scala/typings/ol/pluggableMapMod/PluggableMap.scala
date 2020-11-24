package typings.ol.pluggableMapMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olFeatureMod.FeatureLike
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
import typings.std.MouseEvent
import typings.std.UIEvent
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluggableMap
  extends typings.ol.objectMod.default {
  
  /**
    * Add the given control to the map.
    */
  def addControl(control: typings.ol.controlControlMod.default): Unit = js.native
  
  /**
    * Add the given interaction to the map. If you want to add an interaction
    * at another point of the collection use getInteraction() and the methods
    * available on {@link module:ol/Collection~Collection}. This can be used to
    * stop the event propagation from the handleEvent function. The interactions
    * get to handle the events in the reverse order of this collection.
    */
  def addInteraction(interaction: typings.ol.interactionInteractionMod.default): Unit = js.native
  
  /**
    * Adds the given layer to the top of this map. If you want to add a layer
    * elsewhere in the stack, use getLayers() and the methods available on
    * {@link module:ol/Collection~Collection}.
    */
  def addLayer(layer: typings.ol.baseMod.default): Unit = js.native
  
  /**
    * Add the given overlay to the map.
    */
  def addOverlay(overlay: typings.ol.overlayMod.default): Unit = js.native
  
  var controls: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
  
  def createRenderer(): typings.ol.mapMod.default = js.native
  
  /**
    * Detect features that intersect a pixel on the viewport, and execute a
    * callback with each intersecting feature. Layers included in the detection can
    * be configured through the layerFilter option in opt_options.
    */
  def forEachFeatureAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ FeatureLike, 
      /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
      T
    ]
  ): js.UndefOr[T] = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ FeatureLike, 
      /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
      T
    ],
    opt_options: AtPixelOptions
  ): js.UndefOr[T] = js.native
  
  /**
    * Detect layers that have a color value at a pixel on the viewport, and
    * execute a callback with each matching layer. Layers included in the
    * detection can be configured through opt_layerFilter.
    * Note: this may give false positives unless the map layers have had different className
    * properties assigned to them.
    */
  def forEachLayerAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
      /* p1 */ Uint8ClampedArray | Uint8Array, 
      T
    ]
  ): js.UndefOr[T] = js.native
  def forEachLayerAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
      /* p1 */ Uint8ClampedArray | Uint8Array, 
      T
    ],
    opt_options: AtPixelOptions
  ): js.UndefOr[T] = js.native
  
  /**
    * Get the map controls. Modifying this collection changes the controls
    * associated with the map.
    */
  def getControls(): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
  
  /**
    * Get the coordinate for a given pixel.  This returns a coordinate in the
    * user projection.
    */
  def getCoordinateFromPixel(pixel: Pixel): Coordinate = js.native
  
  /**
    * Get the coordinate for a given pixel.  This returns a coordinate in the
    * map view projection.
    */
  def getCoordinateFromPixelInternal(pixel: Pixel): Coordinate = js.native
  
  /**
    * Returns the coordinate in user projection for a browser event.
    */
  def getEventCoordinate(event: MouseEvent): Coordinate = js.native
  
  /**
    * Returns the coordinate in view projection for a browser event.
    */
  def getEventCoordinateInternal(event: MouseEvent): Coordinate = js.native
  
  /**
    * Returns the map pixel position for a browser event relative to the viewport.
    */
  def getEventPixel(event: UIEvent): Pixel = js.native
  
  /**
    * Get all features that intersect a pixel on the viewport.
    */
  def getFeaturesAtPixel(pixel: Pixel): js.Array[FeatureLike] = js.native
  def getFeaturesAtPixel(pixel: Pixel, opt_options: AtPixelOptions): js.Array[FeatureLike] = js.native
  
  /**
    * Get the map interactions. Modifying this collection changes the interactions
    * associated with the map.
    * Interactions are used for e.g. pan, zoom and rotate.
    */
  def getInteractions(): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
  
  /**
    * Get the layergroup associated with this map.
    */
  def getLayerGroup(): typings.ol.groupMod.default = js.native
  
  /**
    * Get the collection of layers associated with this map.
    */
  def getLayers(): typings.ol.collectionMod.default[typings.ol.baseMod.default] = js.native
  
  def getLoading(): Boolean = js.native
  
  /**
    * Get an overlay by its identifier (the value returned by overlay.getId()).
    * Note that the index treats string and numeric identifiers as the same. So
    * map.getOverlayById(2) will return an overlay with id '2' or 2.
    */
  def getOverlayById(id: String): typings.ol.overlayMod.default = js.native
  def getOverlayById(id: Double): typings.ol.overlayMod.default = js.native
  
  /**
    * Get the element that serves as the container for overlays.  Elements added to
    * this container will let mousedown and touchstart events through to the map,
    * so clicks and gestures on an overlay will trigger {@link module:ol/MapBrowserEvent~MapBrowserEvent}
    * events.
    */
  def getOverlayContainer(): HTMLElement = js.native
  
  /**
    * Get the element that serves as a container for overlays that don't allow
    * event propagation. Elements added to this container won't let mousedown and
    * touchstart events through to the map, so clicks and gestures on an overlay
    * don't trigger any {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
    */
  def getOverlayContainerStopEvent(): HTMLElement = js.native
  
  /**
    * Get the map overlays. Modifying this collection changes the overlays
    * associated with the map.
    */
  def getOverlays(): typings.ol.collectionMod.default[typings.ol.overlayMod.default] = js.native
  
  /**
    * Get the pixel for a coordinate.  This takes a coordinate in the user
    * projection and returns the corresponding pixel.
    */
  def getPixelFromCoordinate(coordinate: Coordinate): Pixel = js.native
  
  /**
    * Get the pixel for a coordinate.  This takes a coordinate in the map view
    * projection and returns the corresponding pixel.
    */
  def getPixelFromCoordinateInternal(coordinate: Coordinate): Pixel = js.native
  
  /**
    * Get the map renderer.
    */
  def getRenderer(): typings.ol.mapMod.default = js.native
  
  /**
    * Get the size of this map.
    */
  def getSize(): js.UndefOr[Size] = js.native
  
  /**
    * Get the target in which this map is rendered.
    * Note that this returns what is entered as an option or in setTarget:
    * if that was an element, it returns an element; if a string, it returns that.
    */
  def getTarget(): js.UndefOr[HTMLElement | String] = js.native
  
  /**
    * Get the DOM element into which this map is rendered. In contrast to
    * getTarget this method always return an Element, or null if the
    * map has no target.
    */
  def getTargetElement(): HTMLElement = js.native
  
  def getTilePriority(
    tile: typings.ol.olTileMod.default,
    tileSourceKey: String,
    tileCenter: Coordinate,
    tileResolution: Double
  ): Double = js.native
  
  /**
    * Get the view associated with this map. A view manages properties such as
    * center and resolution.
    */
  def getView(): typings.ol.viewMod.default = js.native
  
  /**
    * Get the element that serves as the map viewport.
    */
  def getViewport(): HTMLElement = js.native
  
  def handleBrowserEvent(browserEvent: UIEvent): Unit = js.native
  def handleBrowserEvent(browserEvent: UIEvent, opt_type: String): Unit = js.native
  
  def handleMapBrowserEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
  
  /* protected */ def handlePostRender(): Unit = js.native
  
  /**
    * Detect if features intersect a pixel on the viewport. Layers included in the
    * detection can be configured through opt_layerFilter.
    */
  def hasFeatureAtPixel(pixel: Pixel): Boolean = js.native
  def hasFeatureAtPixel(pixel: Pixel, opt_options: AtPixelOptions): Boolean = js.native
  
  var interactions: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
  
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
  def on_click(
    `type`: click,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  
  @JSName("once")
  def once_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_click(
    `type`: click,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): EventsKey = js.native
  
  /**
    * Redraws all text after new fonts have loaded
    */
  def redrawText(): Unit = js.native
  
  /**
    * Remove the given control from the map.
    */
  def removeControl(control: typings.ol.controlControlMod.default): js.UndefOr[typings.ol.controlControlMod.default] = js.native
  
  /**
    * Remove the given interaction from the map.
    */
  def removeInteraction(interaction: typings.ol.interactionInteractionMod.default): js.UndefOr[typings.ol.interactionInteractionMod.default] = js.native
  
  /**
    * Removes the given layer from the map.
    */
  def removeLayer(layer: typings.ol.baseMod.default): js.UndefOr[typings.ol.baseMod.default] = js.native
  
  /**
    * Remove the given overlay from the map.
    */
  def removeOverlay(overlay: typings.ol.overlayMod.default): js.UndefOr[typings.ol.overlayMod.default] = js.native
  
  /**
    * Request a map rendering (at the next animation frame).
    */
  def render(): Unit = js.native
  
  /**
    * Requests an immediate render in a synchronous manner.
    */
  def renderSync(): Unit = js.native
  
  /**
    * Sets the layergroup of this map.
    */
  def setLayerGroup(layerGroup: typings.ol.groupMod.default): Unit = js.native
  
  /**
    * Set the size of this map.
    */
  def setSize(): Unit = js.native
  def setSize(size: Size): Unit = js.native
  
  /**
    * Set the target element to render this map into.
    */
  def setTarget(): Unit = js.native
  def setTarget(target: String): Unit = js.native
  def setTarget(target: HTMLElement): Unit = js.native
  
  /**
    * Set the view for this map.
    */
  def setView(view: typings.ol.viewMod.default): Unit = js.native
  
  @JSName("un")
  def un_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_click(
    `type`: click,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): Unit = js.native
  @JSName("un")
  def un_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): Unit = js.native
  @JSName("un")
  def un_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): Unit = js.native
  @JSName("un")
  def un_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): Unit = js.native
  @JSName("un")
  def un_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ): Unit = js.native
  
  /**
    * Force a recalculation of the map viewport size.  This should be called when
    * third-party code changes the size of the map viewport.
    */
  def updateSize(): Unit = js.native
}
