package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Map")
@js.native
class Map protected () extends Object {
  /**
       * @classdesc
       * The map is the core component of OpenLayers. For a map to render, a view,
       * one or more layers, and a target container are needed:
       *
       *     var map = new ol.Map({
       *       view: new ol.View({
       *         center: [0, 0],
       *         zoom: 1
       *       }),
       *       layers: [
       *         new ol.layer.Tile({
       *           source: new ol.source.OSM()
       *         })
       *       ],
       *       target: 'map'
       *     });
       *
       * The above snippet creates a map using a {@link ol.layer.Tile} to display
       * {@link ol.source.OSM} OSM data and render it to a DOM element with the
       * id `map`.
       *
       * The constructor places a viewport container (with CSS class name
       * `ol-viewport`) in the target element (see `getViewport()`), and then two
       * further elements within the viewport: one with CSS class name
       * `ol-overlaycontainer-stopevent` for controls and some overlays, and one with
       * CSS class name `ol-overlaycontainer` for other overlays (see the `stopEvent`
       * option of {@link ol.Overlay} for the difference). The map itself is placed in
       * a further element within the viewport, either DOM or Canvas, depending on the
       * renderer.
       *
       * Layers are stored as a `ol.Collection` in layerGroups. A top-level group is
       * provided by the library. This is what is accessed by `getLayerGroup` and
       * `setLayerGroup`. Layers entered in the options are added to this group, and
       * `addLayer` and `removeLayer` change the layer collection in the group.
       * `getLayers` is a convenience function for `getLayerGroup().getLayers()`.
       * Note that `ol.layer.Group` is a subclass of `ol.layer.Base`, so layers
       * entered in the options or added with `addLayer` can be groups, which can
       * contain further groups, and so on.
       *
       * @param options Map options.
       * @fires ol.MapBrowserEvent
       * @fires ol.MapEvent
       * @fires ol.render.Event#postcompose
       * @fires ol.render.Event#precompose
       * @api stable
       */
  def this(options: openlayersLib.openlayersMod.olxNs.MapOptions) = this()
  /**
       * Add the given control to the map.
       * @param control Control.
       * @api stable
       */
  def addControl(control: openlayersLib.openlayersMod.controlNs.Control): scala.Unit = js.native
  /**
       * Add the given interaction to the map.
       * @param interaction Interaction to add.
       * @api stable
       */
  def addInteraction(interaction: openlayersLib.openlayersMod.interactionNs.Interaction): scala.Unit = js.native
  /**
       * Adds the given layer to the top of this map. If you want to add a layer
       * elsewhere in the stack, use `getLayers()` and the methods available on
       * {@link ol.Collection}.
       * @param layer Layer.
       * @api stable
       */
  def addLayer(layer: openlayersLib.openlayersMod.layerNs.Base): scala.Unit = js.native
  /**
       * Add the given overlay to the map.
       * @param overlay Overlay.
       * @api stable
       */
  def addOverlay(overlay: Overlay): scala.Unit = js.native
  /**
       * Detect features that intersect a pixel on the viewport, and execute a
       * callback with each intersecting feature. Layers included in the detection can
       * be configured through `opt_layerFilter`.
       * @param pixel Pixel.
       * @param callback Feature callback. The callback will be
       *     called with two arguments. The first argument is one
       *     {@link ol.Feature feature} or
       *     {@link ol.render.Feature render feature} at the pixel, the second is
       *     the {@link ol.layer.Layer layer} of the feature and will be null for
       *     unmanaged layers. To stop detection, callback functions can return a
       *     truthy value.
       * @param opt_options Optional options.
       * @return Callback result, i.e. the return value of last
       * callback execution, or the first truthy callback return value.
       * @template T
       * @api stable
       */
  def forEachFeatureAtPixel[T](
    pixel: Pixel,
    callback: js.Function2[
      /* feature */ Feature | openlayersLib.openlayersMod.renderNs.Feature, 
      /* layer */ openlayersLib.openlayersMod.layerNs.Layer, 
      T
    ]
  ): T = js.native
  /**
       * Detect features that intersect a pixel on the viewport, and execute a
       * callback with each intersecting feature. Layers included in the detection can
       * be configured through `opt_layerFilter`.
       * @param pixel Pixel.
       * @param callback Feature callback. The callback will be
       *     called with two arguments. The first argument is one
       *     {@link ol.Feature feature} or
       *     {@link ol.render.Feature render feature} at the pixel, the second is
       *     the {@link ol.layer.Layer layer} of the feature and will be null for
       *     unmanaged layers. To stop detection, callback functions can return a
       *     truthy value.
       * @param opt_options Optional options.
       * @return Callback result, i.e. the return value of last
       * callback execution, or the first truthy callback return value.
       * @template T
       * @api stable
       */
  def forEachFeatureAtPixel[T](
    pixel: Pixel,
    callback: js.Function2[
      /* feature */ Feature | openlayersLib.openlayersMod.renderNs.Feature, 
      /* layer */ openlayersLib.openlayersMod.layerNs.Layer, 
      T
    ],
    opt_options: openlayersLib.openlayersMod.olxNs.AtPixelOptions
  ): T = js.native
  /**
       * Detect layers that have a color value at a pixel on the viewport, and
       * execute a callback with each matching layer. Layers included in the
       * detection can be configured through `opt_layerFilter`.
       * @param pixel Pixel.
       * @param callback Layer
       *     callback. This callback will recieve two arguments: first is the
       *     {@link ol.layer.Layer layer}, second argument is {@link ol.Color}
       *     and will be null for layer types that do not currently support this
       *     argument. To stop detection callback functions can return a truthy value.
       * @param opt_this Value to use as `this` when executing `callback`.
       * @param opt_layerFilter Layer
       *     filter function. The filter function will receive one argument, the
       *     {@link ol.layer.Layer layer-candidate} and it should return a boolean
       *     value. Only layers which are visible and for which this function returns
       *     `true` will be tested for features. By default, all visible layers will
       *     be tested.
       * @param opt_this2 Value to use as `this` when executing `layerFilter`.
       * @return Callback result, i.e. the return value of last
       * callback execution, or the first truthy callback return value.
       * @template S,T,U
       * @api stable
       */
  def forEachLayerAtPixel[T](
    pixel: Pixel,
    callback: js.Function2[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, /* color */ Color, T]
  ): T = js.native
  /**
       * Detect layers that have a color value at a pixel on the viewport, and
       * execute a callback with each matching layer. Layers included in the
       * detection can be configured through `opt_layerFilter`.
       * @param pixel Pixel.
       * @param callback Layer
       *     callback. This callback will recieve two arguments: first is the
       *     {@link ol.layer.Layer layer}, second argument is {@link ol.Color}
       *     and will be null for layer types that do not currently support this
       *     argument. To stop detection callback functions can return a truthy value.
       * @param opt_this Value to use as `this` when executing `callback`.
       * @param opt_layerFilter Layer
       *     filter function. The filter function will receive one argument, the
       *     {@link ol.layer.Layer layer-candidate} and it should return a boolean
       *     value. Only layers which are visible and for which this function returns
       *     `true` will be tested for features. By default, all visible layers will
       *     be tested.
       * @param opt_this2 Value to use as `this` when executing `layerFilter`.
       * @return Callback result, i.e. the return value of last
       * callback execution, or the first truthy callback return value.
       * @template S,T,U
       * @api stable
       */
  def forEachLayerAtPixel[T](
    pixel: Pixel,
    callback: js.Function2[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, /* color */ Color, T],
    opt_this: js.Any
  ): T = js.native
  /**
       * Detect layers that have a color value at a pixel on the viewport, and
       * execute a callback with each matching layer. Layers included in the
       * detection can be configured through `opt_layerFilter`.
       * @param pixel Pixel.
       * @param callback Layer
       *     callback. This callback will recieve two arguments: first is the
       *     {@link ol.layer.Layer layer}, second argument is {@link ol.Color}
       *     and will be null for layer types that do not currently support this
       *     argument. To stop detection callback functions can return a truthy value.
       * @param opt_this Value to use as `this` when executing `callback`.
       * @param opt_layerFilter Layer
       *     filter function. The filter function will receive one argument, the
       *     {@link ol.layer.Layer layer-candidate} and it should return a boolean
       *     value. Only layers which are visible and for which this function returns
       *     `true` will be tested for features. By default, all visible layers will
       *     be tested.
       * @param opt_this2 Value to use as `this` when executing `layerFilter`.
       * @return Callback result, i.e. the return value of last
       * callback execution, or the first truthy callback return value.
       * @template S,T,U
       * @api stable
       */
  def forEachLayerAtPixel[T](
    pixel: Pixel,
    callback: js.Function2[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, /* color */ Color, T],
    opt_this: js.Any,
    opt_layerFilter: js.Function1[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, scala.Boolean]
  ): T = js.native
  /**
       * Detect layers that have a color value at a pixel on the viewport, and
       * execute a callback with each matching layer. Layers included in the
       * detection can be configured through `opt_layerFilter`.
       * @param pixel Pixel.
       * @param callback Layer
       *     callback. This callback will recieve two arguments: first is the
       *     {@link ol.layer.Layer layer}, second argument is {@link ol.Color}
       *     and will be null for layer types that do not currently support this
       *     argument. To stop detection callback functions can return a truthy value.
       * @param opt_this Value to use as `this` when executing `callback`.
       * @param opt_layerFilter Layer
       *     filter function. The filter function will receive one argument, the
       *     {@link ol.layer.Layer layer-candidate} and it should return a boolean
       *     value. Only layers which are visible and for which this function returns
       *     `true` will be tested for features. By default, all visible layers will
       *     be tested.
       * @param opt_this2 Value to use as `this` when executing `layerFilter`.
       * @return Callback result, i.e. the return value of last
       * callback execution, or the first truthy callback return value.
       * @template S,T,U
       * @api stable
       */
  def forEachLayerAtPixel[T](
    pixel: Pixel,
    callback: js.Function2[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, /* color */ Color, T],
    opt_this: js.Any,
    opt_layerFilter: js.Function1[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, scala.Boolean],
    opt_this2: js.Any
  ): T = js.native
  /**
       * Get the map controls. Modifying this collection changes the controls
       * associated with the map.
       * @return Controls.
       * @api stable
       */
  def getControls(): Collection[openlayersLib.openlayersMod.controlNs.Control] = js.native
  /**
       * Get the coordinate for a given pixel.  This returns a coordinate in the
       * map view projection.
       * @param pixel Pixel position in the map viewport.
       * @return The coordinate for the pixel position.
       * @api stable
       */
  def getCoordinateFromPixel(pixel: Pixel): Coordinate = js.native
  /**
       * Returns the geographical coordinate for a browser event.
       * @param event Event.
       * @return Coordinate.
       * @api stable
       */
  def getEventCoordinate(event: stdLib.Event): Coordinate = js.native
  /**
       * Returns the map pixel position for a browser event relative to the viewport.
       * @param event Event.
       * @return Pixel.
       * @api stable
       */
  def getEventPixel(event: stdLib.Event): Pixel = js.native
  /**
       * Get all features that intersect a pixel on the viewport.
       * @param pixel Pixel.
       * @param opt_options Optional options.
       * @return The detected features or null if none were found.
       * @api stable
       */
  def getFeaturesAtPixel(pixel: Pixel): (js.Array[Feature | openlayersLib.openlayersMod.renderNs.Feature]) | scala.Null = js.native
  /**
       * Get all features that intersect a pixel on the viewport.
       * @param pixel Pixel.
       * @param opt_options Optional options.
       * @return The detected features or null if none were found.
       * @api stable
       */
  def getFeaturesAtPixel(pixel: Pixel, opt_options: openlayersLib.openlayersMod.olxNs.AtPixelOptions): (js.Array[Feature | openlayersLib.openlayersMod.renderNs.Feature]) | scala.Null = js.native
  /**
       * Get the map interactions. Modifying this collection changes the interactions
       * associated with the map.
       *
       * Interactions are used for e.g. pan, zoom and rotate.
       * @return Interactions.
       * @api stable
       */
  def getInteractions(): Collection[openlayersLib.openlayersMod.interactionNs.Interaction] = js.native
  /**
       * Get the layergroup associated with this map.
       * @return A layer group containing the layers in this map.
       * @observable
       * @api stable
       */
  def getLayerGroup(): openlayersLib.openlayersMod.layerNs.Group = js.native
  /**
       * Get the collection of layers associated with this map.
       * @return Layers.
       * @api stable
       */
  def getLayers(): Collection[openlayersLib.openlayersMod.layerNs.Base] = js.native
  /**
       * Get an overlay by its identifier (the value returned by overlay.getId()).
       * Note that the index treats string and numeric identifiers as the same. So
       * `map.getOverlayById(2)` will return an overlay with id `'2'` or `2`.
       * @param id Overlay identifier.
       * @return Overlay.
       * @api
       */
  def getOverlayById(id: java.lang.String): Overlay = js.native
  /**
       * Get an overlay by its identifier (the value returned by overlay.getId()).
       * Note that the index treats string and numeric identifiers as the same. So
       * `map.getOverlayById(2)` will return an overlay with id `'2'` or `2`.
       * @param id Overlay identifier.
       * @return Overlay.
       * @api
       */
  def getOverlayById(id: scala.Double): Overlay = js.native
  /**
       * Get the map overlays. Modifying this collection changes the overlays
       * associated with the map.
       * @return Overlays.
       * @api stable
       */
  def getOverlays(): Collection[Overlay] = js.native
  /**
       * Get the pixel for a coordinate.  This takes a coordinate in the map view
       * projection and returns the corresponding pixel.
       * @param coordinate A map coordinate.
       * @return A pixel position in the map viewport.
       * @api stable
       */
  def getPixelFromCoordinate(coordinate: Coordinate): Pixel = js.native
  /**
       * Get the size of this map.
       * @return The size in pixels of the map in the DOM.
       * @observable
       * @api stable
       */
  def getSize(): Size = js.native
  /**
       * Get the target in which this map is rendered.
       * Note that this returns what is entered as an option or in setTarget:
       * if that was an element, it returns an element; if a string, it returns that.
       * @return The Element or id of the Element that the
       *     map is rendered in.
       * @observable
       * @api stable
       */
  def getTarget(): stdLib.Element | java.lang.String = js.native
  /**
       * Get the DOM element into which this map is rendered. In contrast to
       * `getTarget` this method always return an `Element`, or `null` if the
       * map has no target.
       * @return The element that the map is rendered in.
       * @api
       */
  def getTargetElement(): stdLib.Element = js.native
  /**
       * Get the view associated with this map. A view manages properties such as
       * center and resolution.
       * @return The view that controls this map.
       * @observable
       * @api stable
       */
  def getView(): View = js.native
  /**
       * Get the element that serves as the map viewport.
       * @return Viewport.
       * @api stable
       */
  def getViewport(): stdLib.Element = js.native
  /**
       * Detect if features intersect a pixel on the viewport. Layers included in the
       * detection can be configured through `opt_layerFilter`.
       * @param pixel Pixel.
       * @param opt_options Optional options.
       * @return Is there a feature at the given pixel?
       * @api
       */
  def hasFeatureAtPixel(pixel: Pixel): scala.Boolean = js.native
  /**
       * Detect if features intersect a pixel on the viewport. Layers included in the
       * detection can be configured through `opt_layerFilter`.
       * @param pixel Pixel.
       * @param opt_options Optional options.
       * @return Is there a feature at the given pixel?
       * @api
       */
  def hasFeatureAtPixel(pixel: Pixel, opt_options: openlayersLib.openlayersMod.olxNs.AtPixelOptions): scala.Boolean = js.native
  /**
       * Remove the given control from the map.
       * @param control Control.
       * @return The removed control (or undefined
       *     if the control was not found).
       * @api stable
       */
  def removeControl(control: openlayersLib.openlayersMod.controlNs.Control): openlayersLib.openlayersMod.controlNs.Control = js.native
  /**
       * Remove the given interaction from the map.
       * @param interaction Interaction to remove.
       * @return The removed interaction (or
       *     undefined if the interaction was not found).
       * @api stable
       */
  def removeInteraction(interaction: openlayersLib.openlayersMod.interactionNs.Interaction): openlayersLib.openlayersMod.interactionNs.Interaction = js.native
  /**
       * Removes the given layer from the map.
       * @param layer Layer.
       * @return The removed layer (or undefined if the
       *     layer was not found).
       * @api stable
       */
  def removeLayer(layer: openlayersLib.openlayersMod.layerNs.Base): openlayersLib.openlayersMod.layerNs.Base = js.native
  /**
       * Remove the given overlay from the map.
       * @param overlay Overlay.
       * @return The removed overlay (or undefined
       *     if the overlay was not found).
       * @api stable
       */
  def removeOverlay(overlay: Overlay): Overlay = js.native
  /**
       * Request a map rendering (at the next animation frame).
       * @api stable
       */
  def render(): scala.Unit = js.native
  /**
       * Requests an immediate render in a synchronous manner.
       * @api stable
       */
  def renderSync(): scala.Unit = js.native
  /**
       * Sets the layergroup of this map.
       * @param layerGroup A layer group containing the layers in
       *     this map.
       * @observable
       * @api stable
       */
  def setLayerGroup(layerGroup: openlayersLib.openlayersMod.layerNs.Group): scala.Unit = js.native
  /**
       * Set the size of this map.
       * @param size The size in pixels of the map in the DOM.
       * @observable
       * @api
       */
  def setSize(size: Size): scala.Unit = js.native
  /**
       * Set the target element to render this map into.
       * @param target The Element or id of the Element
       *     that the map is rendered in.
       * @observable
       * @api stable
       */
  def setTarget(target: java.lang.String): scala.Unit = js.native
  /**
       * Set the target element to render this map into.
       * @param target The Element or id of the Element
       *     that the map is rendered in.
       * @observable
       * @api stable
       */
  def setTarget(target: stdLib.Element): scala.Unit = js.native
  /**
       * Set the view for this map.
       * @param view The view that controls this map.
       * @observable
       * @api stable
       */
  def setView(view: View): scala.Unit = js.native
  /**
       * Force a recalculation of the map viewport size.  This should be called when
       * third-party code changes the size of the map viewport.
       * @api stable
       */
  def updateSize(): scala.Unit = js.native
}

