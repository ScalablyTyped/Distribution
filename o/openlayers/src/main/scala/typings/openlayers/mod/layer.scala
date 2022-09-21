package typings.openlayers.mod

import typings.openlayers.mod.olx.layer.BaseOptions
import typings.openlayers.mod.olx.layer.GroupOptions
import typings.openlayers.mod.olx.layer.HeatmapOptions
import typings.openlayers.mod.olx.layer.ImageOptions
import typings.openlayers.mod.olx.layer.LayerOptions
import typings.openlayers.mod.olx.layer.TileOptions
import typings.openlayers.mod.olx.layer.VectorOptions
import typings.openlayers.mod.olx.layer.VectorTileOptions
import typings.openlayers.mod.source.Source
import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layer {
  
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
  @JSImport("openlayers", "layer.Base")
  @js.native
  open class Base protected () extends Object {
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
    def this(options: BaseOptions) = this()
    
    /**
      * Return the {@link ol.Extent extent} of the layer or `undefined` if it
      * will be visible regardless of extent.
      * @return The layer extent.
      * @observable
      * @api stable
      */
    def getExtent(): Extent_ = js.native
    
    /**
      * Return the maximum resolution of the layer.
      * @return The maximum resolution of the layer.
      * @observable
      * @api stable
      */
    def getMaxResolution(): Double = js.native
    
    /**
      * Return the minimum resolution of the layer.
      * @return The minimum resolution of the layer.
      * @observable
      * @api stable
      */
    def getMinResolution(): Double = js.native
    
    /**
      * Return the opacity of the layer (between 0 and 1).
      * @return The opacity of the layer.
      * @observable
      * @api stable
      */
    def getOpacity(): Double = js.native
    
    /**
      * Return the visibility of the layer (`true` or `false`).
      * @return The visibility of the layer.
      * @observable
      * @api stable
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Return the Z-index of the layer, which is used to order layers before
      * rendering. The default Z-index is 0.
      * @return The Z-index of the layer.
      * @observable
      * @api
      */
    def getZIndex(): Double = js.native
    
    /**
      * Set the extent at which the layer is visible.  If `undefined`, the layer
      * will be visible at all extents.
      * @param extent The extent of the layer.
      * @observable
      * @api stable
      */
    def setExtent(extent: Extent_): Unit = js.native
    
    /**
      * Set the maximum resolution at which the layer is visible.
      * @param maxResolution The maximum resolution of the layer.
      * @observable
      * @api stable
      */
    def setMaxResolution(maxResolution: Double): Unit = js.native
    
    /**
      * Set the minimum resolution at which the layer is visible.
      * @param minResolution The minimum resolution of the layer.
      * @observable
      * @api stable
      */
    def setMinResolution(minResolution: Double): Unit = js.native
    
    /**
      * Set the opacity of the layer, allowed values range from 0 to 1.
      * @param opacity The opacity of the layer.
      * @observable
      * @api stable
      */
    def setOpacity(opacity: Double): Unit = js.native
    
    /**
      * Set the visibility of the layer (`true` or `false`).
      * @param visible The visibility of the layer.
      * @observable
      * @api stable
      */
    def setVisible(visible: Boolean): Unit = js.native
    
    /**
      * Set Z-index of the layer, which is used to order layers before rendering.
      * The default Z-index is 0.
      * @param zindex The z-index of the layer.
      * @observable
      * @api
      */
    def setZIndex(zindex: Double): Unit = js.native
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
  @JSImport("openlayers", "layer.Group")
  @js.native
  /**
    * @classdesc
    * A {@link ol.Collection} of layers that are handled together.
    *
    * A generic `change` event is triggered when the group/Collection changes.
    *
    * @param opt_options Layer options.
    * @api stable
    */
  open class Group () extends Base {
    def this(opt_options: GroupOptions) = this()
    
    /**
      * Returns the {@link ol.Collection collection} of {@link ol.layer.Layer layers}
      * in this group.
      * @return Collection of
      *   {@link ol.layer.Base layers} that are part of this group.
      * @observable
      * @api stable
      */
    def getLayers(): Collection[Base] = js.native
    
    /**
      * Set the {@link ol.Collection collection} of {@link ol.layer.Layer layers}
      * in this group.
      * @param layers Collection of
      *   {@link ol.layer.Base layers} that are part of this group.
      * @observable
      * @api stable
      */
    def setLayers(layers: Collection[Base]): Unit = js.native
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
  @JSImport("openlayers", "layer.Heatmap")
  @js.native
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
  open class Heatmap () extends Vector {
    def this(opt_options: HeatmapOptions) = this()
    
    /**
      * Return the blur size in pixels.
      * @return Blur size in pixels.
      * @api
      * @observable
      */
    def getBlur(): Double = js.native
    
    /**
      * Return the gradient colors as array of strings.
      * @return Colors.
      * @api
      * @observable
      */
    def getGradient(): js.Array[String] = js.native
    
    /**
      * Return the size of the radius in pixels.
      * @return Radius size in pixel.
      * @api
      * @observable
      */
    def getRadius(): Double = js.native
    
    /**
      * Set the blur size in pixels.
      * @param blur Blur size in pixels.
      * @api
      * @observable
      */
    def setBlur(blur: Double): Unit = js.native
    
    /**
      * Set the gradient colors as array of strings.
      * @param colors Gradient.
      * @api
      * @observable
      */
    def setGradient(colors: js.Array[String]): Unit = js.native
    
    /**
      * Set the size of the radius in pixels.
      * @param radius Radius size in pixel.
      * @api
      * @observable
      */
    def setRadius(radius: Double): Unit = js.native
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
  @JSImport("openlayers", "layer.Image")
  @js.native
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
  open class Image () extends Layer {
    def this(opt_options: ImageOptions) = this()
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
  @JSImport("openlayers", "layer.Layer")
  @js.native
  open class Layer protected () extends Base {
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
    def this(options: LayerOptions) = this()
    
    /**
      * Get the layer source.
      * @return The layer source (or `null` if not yet set).
      * @observable
      * @api stable
      */
    def getSource(): Source = js.native
    
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
    def setMap(map: Map): Unit = js.native
    
    /**
      * Set the layer source.
      * @param source The layer source.
      * @observable
      * @api stable
      */
    def setSource(source: Source): Unit = js.native
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
  @JSImport("openlayers", "layer.Tile")
  @js.native
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
  open class Tile () extends Layer {
    def this(opt_options: TileOptions) = this()
    
    /**
      * Return the level as number to which we will preload tiles up to.
      * @return The level to preload tiles up to.
      * @observable
      * @api
      */
    def getPreload(): Double = js.native
    
    /**
      * Whether we use interim tiles on error.
      * @return Use interim tiles on error.
      * @observable
      * @api
      */
    def getUseInterimTilesOnError(): Boolean = js.native
    
    /**
      * Set the level as number to which we will preload tiles up to.
      * @param preload The level to preload tiles up to.
      * @observable
      * @api
      */
    def setPreload(preload: Double): Unit = js.native
    
    /**
      * Set whether we use interim tiles on error.
      * @param useInterimTilesOnError Use interim tiles on error.
      * @observable
      * @api
      */
    def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
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
  @JSImport("openlayers", "layer.Vector")
  @js.native
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
  open class Vector () extends Layer {
    def this(opt_options: VectorOptions) = this()
    
    /**
      * Get the style for features.  This returns whatever was passed to the `style`
      * option at construction or to the `setStyle` method.
      * @return Layer style.
      * @api stable
      */
    def getStyle(): Style | js.Array[Style] | StyleFunction = js.native
    
    /**
      * Get the style function.
      * @return Layer style function.
      * @api stable
      */
    def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
    
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
    def setStyle(): Unit = js.native
    def setStyle(style: js.Array[Style]): Unit = js.native
    def setStyle(style: StyleFunction): Unit = js.native
    def setStyle(style: Style): Unit = js.native
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
  @JSImport("openlayers", "layer.VectorTile")
  @js.native
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
  open class VectorTile () extends Vector {
    def this(opt_options: VectorTileOptions) = this()
    
    /**
      * Return the level as number to which we will preload tiles up to.
      * @return The level to preload tiles up to.
      * @observable
      * @api
      */
    def getPreload(): Double = js.native
    
    /**
      * Whether we use interim tiles on error.
      * @return Use interim tiles on error.
      * @observable
      * @api
      */
    def getUseInterimTilesOnError(): Boolean = js.native
    
    /**
      * Set the level as number to which we will preload tiles up to.
      * @param preload The level to preload tiles up to.
      * @observable
      * @api
      */
    def setPreload(preload: Double): Unit = js.native
    
    /**
      * Set whether we use interim tiles on error.
      * @param useInterimTilesOnError Use interim tiles on error.
      * @observable
      * @api
      */
    def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
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
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.image
    - typings.openlayers.openlayersStrings.hybrid
    - typings.openlayers.openlayersStrings.vector
  */
  trait VectorTileRenderType extends StObject
  object VectorTileRenderType {
    
    inline def hybrid: typings.openlayers.openlayersStrings.hybrid = "hybrid".asInstanceOf[typings.openlayers.openlayersStrings.hybrid]
    
    inline def image: typings.openlayers.openlayersStrings.image = "image".asInstanceOf[typings.openlayers.openlayersStrings.image]
    
    inline def vector: typings.openlayers.openlayersStrings.vector = "vector".asInstanceOf[typings.openlayers.openlayersStrings.vector]
  }
}
