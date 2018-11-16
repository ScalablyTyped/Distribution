package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "layer")
@js.native
object layerNs extends js.Object {
  /**
       * @classdesc
       * Abstract base class; normally only used for creating subclasses and not
       * instantiated in apps.
       * Note that with `ol.layer.Base` and all its subclasses, any property set in
       * the options is set as a {@link ol.Object} property on the layer object, so
       * is observable, and has get/set accessors.
       *
       * @param options Layer options.
       * @api stable
       */
  /* RemoveDifficultInheritance: 
  - Dropped Object */ @js.native
  class Base protected () extends js.Object {
    /**
             * @classdesc
             * Abstract base class; normally only used for creating subclasses and not
             * instantiated in apps.
             * Note that with `ol.layer.Base` and all its subclasses, any property set in
             * the options is set as a {@link ol.Object} property on the layer object, so
             * is observable, and has get/set accessors.
             *
             * @param options Layer options.
             * @api stable
             */
    def this(options: openlayersLib.openlayersMod.olxNs.layerNs.BaseOptions) = this()
    /**
             * Return the {@link ol.Extent extent} of the layer or `undefined` if it
             * will be visible regardless of extent.
             * @return The layer extent.
             * @observable
             * @api stable
             */
    def getExtent(): openlayersLib.openlayersMod.Extent = js.native
    /**
             * Return the maximum resolution of the layer.
             * @return The maximum resolution of the layer.
             * @observable
             * @api stable
             */
    def getMaxResolution(): scala.Double = js.native
    /**
             * Return the minimum resolution of the layer.
             * @return The minimum resolution of the layer.
             * @observable
             * @api stable
             */
    def getMinResolution(): scala.Double = js.native
    /**
             * Return the opacity of the layer (between 0 and 1).
             * @return The opacity of the layer.
             * @observable
             * @api stable
             */
    def getOpacity(): scala.Double = js.native
    /**
             * Return the visibility of the layer (`true` or `false`).
             * @return The visibility of the layer.
             * @observable
             * @api stable
             */
    def getVisible(): scala.Boolean = js.native
    /**
             * Return the Z-index of the layer, which is used to order layers before
             * rendering. The default Z-index is 0.
             * @return The Z-index of the layer.
             * @observable
             * @api
             */
    def getZIndex(): scala.Double = js.native
    /**
             * Set the extent at which the layer is visible.  If `undefined`, the layer
             * will be visible at all extents.
             * @param extent The extent of the layer.
             * @observable
             * @api stable
             */
    def setExtent(extent: openlayersLib.openlayersMod.Extent): scala.Unit = js.native
    /**
             * Set the maximum resolution at which the layer is visible.
             * @param maxResolution The maximum resolution of the layer.
             * @observable
             * @api stable
             */
    def setMaxResolution(maxResolution: scala.Double): scala.Unit = js.native
    /**
             * Set the minimum resolution at which the layer is visible.
             * @param minResolution The minimum resolution of the layer.
             * @observable
             * @api stable
             */
    def setMinResolution(minResolution: scala.Double): scala.Unit = js.native
    /**
             * Set the opacity of the layer, allowed values range from 0 to 1.
             * @param opacity The opacity of the layer.
             * @observable
             * @api stable
             */
    def setOpacity(opacity: scala.Double): scala.Unit = js.native
    /**
             * Set the visibility of the layer (`true` or `false`).
             * @param visible The visibility of the layer.
             * @observable
             * @api stable
             */
    def setVisible(visible: scala.Boolean): scala.Unit = js.native
    /**
             * Set Z-index of the layer, which is used to order layers before rendering.
             * The default Z-index is 0.
             * @param zindex The z-index of the layer.
             * @observable
             * @api
             */
    def setZIndex(zindex: scala.Double): scala.Unit = js.native
  }
  
  /**
       * @classdesc
       * A {@link ol.Collection} of layers that are handled together.
       *
       * A generic `change` event is triggered when the group/Collection changes.
       *
       * @param opt_options Layer options.
       * @api stable
       */
  @js.native
  class Group () extends Base {
    /**
             * @classdesc
             * A {@link ol.Collection} of layers that are handled together.
             *
             * A generic `change` event is triggered when the group/Collection changes.
             *
             * @param opt_options Layer options.
             * @api stable
             */
    def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.GroupOptions) = this()
    /**
             * Returns the {@link ol.Collection collection} of {@link ol.layer.Layer layers}
             * in this group.
             * @return Collection of
             *   {@link ol.layer.Base layers} that are part of this group.
             * @observable
             * @api stable
             */
    def getLayers(): openlayersLib.openlayersMod.Collection[Base] = js.native
    /**
             * Set the {@link ol.Collection collection} of {@link ol.layer.Layer layers}
             * in this group.
             * @param layers Collection of
             *   {@link ol.layer.Base layers} that are part of this group.
             * @observable
             * @api stable
             */
    def setLayers(layers: openlayersLib.openlayersMod.Collection[Base]): scala.Unit = js.native
  }
  
  /**
       * @classdesc
       * Layer for rendering vector data as a heatmap.
       * Note that any property set in the options is set as a {@link ol.Object}
       * property on the layer object; for example, setting `title: 'My Title'` in the
       * options means that `title` is observable, and has get/set accessors.
       *
       * @fires ol.render.Event
       * @param opt_options Options.
       * @api
       */
  @js.native
  class Heatmap () extends Vector {
    /**
             * @classdesc
             * Layer for rendering vector data as a heatmap.
             * Note that any property set in the options is set as a {@link ol.Object}
             * property on the layer object; for example, setting `title: 'My Title'` in the
             * options means that `title` is observable, and has get/set accessors.
             *
             * @fires ol.render.Event
             * @param opt_options Options.
             * @api
             */
    def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.HeatmapOptions) = this()
    /**
             * Return the blur size in pixels.
             * @return Blur size in pixels.
             * @api
             * @observable
             */
    def getBlur(): scala.Double = js.native
    /**
             * Return the gradient colors as array of strings.
             * @return Colors.
             * @api
             * @observable
             */
    def getGradient(): js.Array[java.lang.String] = js.native
    /**
             * Return the size of the radius in pixels.
             * @return Radius size in pixel.
             * @api
             * @observable
             */
    def getRadius(): scala.Double = js.native
    /**
             * Set the blur size in pixels.
             * @param blur Blur size in pixels.
             * @api
             * @observable
             */
    def setBlur(blur: scala.Double): scala.Unit = js.native
    /**
             * Set the gradient colors as array of strings.
             * @param colors Gradient.
             * @api
             * @observable
             */
    def setGradient(colors: js.Array[java.lang.String]): scala.Unit = js.native
    /**
             * Set the size of the radius in pixels.
             * @param radius Radius size in pixel.
             * @api
             * @observable
             */
    def setRadius(radius: scala.Double): scala.Unit = js.native
  }
  
  /**
       * @classdesc
       * Server-rendered images that are available for arbitrary extents and
       * resolutions.
       * Note that any property set in the options is set as a {@link ol.Object}
       * property on the layer object; for example, setting `title: 'My Title'` in the
       * options means that `title` is observable, and has get/set accessors.
       *
       * @fires ol.render.Event
       * @param opt_options Layer options.
       * @api stable
       */
  @js.native
  class Image () extends Layer {
    /**
             * @classdesc
             * Server-rendered images that are available for arbitrary extents and
             * resolutions.
             * Note that any property set in the options is set as a {@link ol.Object}
             * property on the layer object; for example, setting `title: 'My Title'` in the
             * options means that `title` is observable, and has get/set accessors.
             *
             * @fires ol.render.Event
             * @param opt_options Layer options.
             * @api stable
             */
    def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.ImageOptions) = this()
  }
  
  /**
       * @classdesc
       * Abstract base class; normally only used for creating subclasses and not
       * instantiated in apps.
       * A visual representation of raster or vector map data.
       * Layers group together those properties that pertain to how the data is to be
       * displayed, irrespective of the source of that data.
       *
       * Layers are usually added to a map with {@link ol.Map#addLayer}. Components
       * like {@link ol.interaction.Select} use unmanaged layers internally. These
       * unmanaged layers are associated with the map using
       * {@link ol.layer.Layer#setMap} instead.
       *
       * A generic `change` event is fired when the state of the source changes.
       *
       * @fires ol.render.Event
       * @param options Layer options.
       * @api stable
       */
  @js.native
  class Layer protected () extends Base {
    /**
             * @classdesc
             * Abstract base class; normally only used for creating subclasses and not
             * instantiated in apps.
             * A visual representation of raster or vector map data.
             * Layers group together those properties that pertain to how the data is to be
             * displayed, irrespective of the source of that data.
             *
             * Layers are usually added to a map with {@link ol.Map#addLayer}. Components
             * like {@link ol.interaction.Select} use unmanaged layers internally. These
             * unmanaged layers are associated with the map using
             * {@link ol.layer.Layer#setMap} instead.
             *
             * A generic `change` event is fired when the state of the source changes.
             *
             * @fires ol.render.Event
             * @param options Layer options.
             * @api stable
             */
    def this(options: openlayersLib.openlayersMod.olxNs.layerNs.LayerOptions) = this()
    /**
             * Get the layer source.
             * @return The layer source (or `null` if not yet set).
             * @observable
             * @api stable
             */
    def getSource(): openlayersLib.openlayersMod.sourceNs.Source = js.native
    /**
             * Sets the layer to be rendered on top of other layers on a map. The map will
             * not manage this layer in its layers collection, and the callback in
             * {@link ol.Map#forEachLayerAtPixel} will receive `null` as layer. This
             * is useful for temporary layers. To remove an unmanaged layer from the map,
             * use `#setMap(null)`.
             *
             * To add the layer to a map and have it managed by the map, use
             * {@link ol.Map#addLayer} instead.
             * @param map Map.
             * @api
             */
    def setMap(map: openlayersLib.openlayersMod.Map): scala.Unit = js.native
    /**
             * Set the layer source.
             * @param source The layer source.
             * @observable
             * @api stable
             */
    def setSource(source: openlayersLib.openlayersMod.sourceNs.Source): scala.Unit = js.native
  }
  
  /**
       * @classdesc
       * For layer sources that provide pre-rendered, tiled images in grids that are
       * organized by zoom levels for specific resolutions.
       * Note that any property set in the options is set as a {@link ol.Object}
       * property on the layer object; for example, setting `title: 'My Title'` in the
       * options means that `title` is observable, and has get/set accessors.
       *
       * @fires ol.render.Event
       * @param opt_options Tile layer options.
       * @api stable
       */
  @js.native
  class Tile () extends Layer {
    /**
             * @classdesc
             * For layer sources that provide pre-rendered, tiled images in grids that are
             * organized by zoom levels for specific resolutions.
             * Note that any property set in the options is set as a {@link ol.Object}
             * property on the layer object; for example, setting `title: 'My Title'` in the
             * options means that `title` is observable, and has get/set accessors.
             *
             * @fires ol.render.Event
             * @param opt_options Tile layer options.
             * @api stable
             */
    def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.TileOptions) = this()
    /**
             * Return the level as number to which we will preload tiles up to.
             * @return The level to preload tiles up to.
             * @observable
             * @api
             */
    def getPreload(): scala.Double = js.native
    /**
             * Whether we use interim tiles on error.
             * @return Use interim tiles on error.
             * @observable
             * @api
             */
    def getUseInterimTilesOnError(): scala.Boolean = js.native
    /**
             * Set the level as number to which we will preload tiles up to.
             * @param preload The level to preload tiles up to.
             * @observable
             * @api
             */
    def setPreload(preload: scala.Double): scala.Unit = js.native
    /**
             * Set whether we use interim tiles on error.
             * @param useInterimTilesOnError Use interim tiles on error.
             * @observable
             * @api
             */
    def setUseInterimTilesOnError(useInterimTilesOnError: scala.Boolean): scala.Unit = js.native
  }
  
  /**
       * @classdesc
       * Vector data that is rendered client-side.
       * Note that any property set in the options is set as a {@link ol.Object}
       * property on the layer object; for example, setting `title: 'My Title'` in the
       * options means that `title` is observable, and has get/set accessors.
       *
       * @fires ol.render.Event
       * @param opt_options Options.
       * @api stable
       */
  @js.native
  class Vector () extends Layer {
    /**
             * @classdesc
             * Vector data that is rendered client-side.
             * Note that any property set in the options is set as a {@link ol.Object}
             * property on the layer object; for example, setting `title: 'My Title'` in the
             * options means that `title` is observable, and has get/set accessors.
             *
             * @fires ol.render.Event
             * @param opt_options Options.
             * @api stable
             */
    def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.VectorOptions) = this()
    /**
             * Get the style for features.  This returns whatever was passed to the `style`
             * option at construction or to the `setStyle` method.
             * @return Layer style.
             * @api stable
             */
    def getStyle(): openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction = js.native
    /**
             * Get the style function.
             * @return Layer style function.
             * @api stable
             */
    def getStyleFunction(): js.UndefOr[openlayersLib.openlayersMod.StyleFunction] = js.native
    /**
             * Set the style for features.  This can be a single style object, an array
             * of styles, or a function that takes a feature and resolution and returns
             * an array of styles. If it is `undefined` the default style is used. If
             * it is `null` the layer has no style (a `null` style), so only features
             * that have their own styles will be rendered in the layer. See
             * {@link ol.style} for information on the default style.
             * @param style Layer style.
             * @api stable
             */
    def setStyle(): scala.Unit = js.native
    /**
             * Set the style for features.  This can be a single style object, an array
             * of styles, or a function that takes a feature and resolution and returns
             * an array of styles. If it is `undefined` the default style is used. If
             * it is `null` the layer has no style (a `null` style), so only features
             * that have their own styles will be rendered in the layer. See
             * {@link ol.style} for information on the default style.
             * @param style Layer style.
             * @api stable
             */
    def setStyle(style: js.Array[openlayersLib.openlayersMod.styleNs.Style]): scala.Unit = js.native
    /**
             * Set the style for features.  This can be a single style object, an array
             * of styles, or a function that takes a feature and resolution and returns
             * an array of styles. If it is `undefined` the default style is used. If
             * it is `null` the layer has no style (a `null` style), so only features
             * that have their own styles will be rendered in the layer. See
             * {@link ol.style} for information on the default style.
             * @param style Layer style.
             * @api stable
             */
    def setStyle(style: openlayersLib.openlayersMod.StyleFunction): scala.Unit = js.native
    /**
             * Set the style for features.  This can be a single style object, an array
             * of styles, or a function that takes a feature and resolution and returns
             * an array of styles. If it is `undefined` the default style is used. If
             * it is `null` the layer has no style (a `null` style), so only features
             * that have their own styles will be rendered in the layer. See
             * {@link ol.style} for information on the default style.
             * @param style Layer style.
             * @api stable
             */
    def setStyle(style: openlayersLib.openlayersMod.styleNs.Style): scala.Unit = js.native
  }
  
  /**
       * @classdesc
       * Layer for vector tile data that is rendered client-side.
       * Note that any property set in the options is set as a {@link ol.Object}
       * property on the layer object; for example, setting `title: 'My Title'` in the
       * options means that `title` is observable, and has get/set accessors.
       *
       * @param opt_options Options.
       * @api
       */
  @js.native
  class VectorTile () extends Vector {
    /**
             * @classdesc
             * Layer for vector tile data that is rendered client-side.
             * Note that any property set in the options is set as a {@link ol.Object}
             * property on the layer object; for example, setting `title: 'My Title'` in the
             * options means that `title` is observable, and has get/set accessors.
             *
             * @param opt_options Options.
             * @api
             */
    def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.VectorTileOptions) = this()
    /**
             * Return the level as number to which we will preload tiles up to.
             * @return The level to preload tiles up to.
             * @observable
             * @api
             */
    def getPreload(): scala.Double = js.native
    /**
             * Whether we use interim tiles on error.
             * @return Use interim tiles on error.
             * @observable
             * @api
             */
    def getUseInterimTilesOnError(): scala.Boolean = js.native
    /**
             * Set the level as number to which we will preload tiles up to.
             * @param preload The level to preload tiles up to.
             * @observable
             * @api
             */
    def setPreload(preload: scala.Double): scala.Unit = js.native
    /**
             * Set whether we use interim tiles on error.
             * @param useInterimTilesOnError Use interim tiles on error.
             * @observable
             * @api
             */
    def setUseInterimTilesOnError(useInterimTilesOnError: scala.Boolean): scala.Unit = js.native
  }
  
  /**
       * Render mode for vector tiles:
       *  * `'image'`: Vector tiles are rendered as images. Great performance, but
       *    point symbols and texts are always rotated with the view and pixels are
       *    scaled during zoom animations.
       *  * `'hybrid'`: Polygon and line elements are rendered as images, so pixels
       *    are scaled during zoom animations. Point symbols and texts are accurately
       *    rendered as vectors and can stay upright on rotated views.
       *  * `'vector'`: Vector tiles are rendered as vectors. Most accurate rendering
       *    even during animations, but slower performance than the other options.
       * @api
       */
  type VectorTileRenderType = openlayersLib.openlayersLibStrings.image | openlayersLib.openlayersLibStrings.hybrid | openlayersLib.openlayersLibStrings.vector
}

