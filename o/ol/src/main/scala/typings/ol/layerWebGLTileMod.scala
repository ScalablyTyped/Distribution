package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.mapMod.FrameState
import typings.ol.styleExpressionsMod.ExpressionValue
import typings.ol.webglHelperMod.UniformValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerWebGLTileMod {
  
  /**
    * @classdesc
    * For layer sources that provide pre-rendered, tiled images in grids that are
    * organized by zoom levels for specific resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @extends BaseTileLayer<SourceType, WebGLTileLayerRenderer>
    * @fires import("../render/Event.js").RenderEvent
    * @api
    */
  @JSImport("ol/layer/WebGLTile", JSImport.Default)
  @js.native
  open class default protected () extends WebGLTileLayer {
    /**
      * @param {Options} options Tile layer options.
      */
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * The internal texture cache size.  This needs to be large enough to render
      * two zoom levels worth of tiles.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * A CSS class name to set to the layer element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The bounding extent for layer rendering.  The layer will not be
      * rendered outside of this extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Sets the layer as overlay on a map. The map will not manage
      * this layer in its layers collection, and the layer will be rendered on top. This is useful for
      * temporary layers. The standard way to add a layer to a map and have it managed by the map is to
      * use {@link module :ol/Map~Map#addLayer}.
      */
    var map: js.UndefOr[typings.ol.rendererMapMod.default] = js.undefined
    
    /**
      * The maximum resolution (exclusive) below which this layer will
      * be visible.
      */
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum view zoom level (inclusive) at which this layer will
      * be visible.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum resolution (inclusive) at which this layer will be
      * visible.
      */
    var minResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum view zoom level (exclusive) above which this layer will be
      * visible.
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Opacity (0, 1).
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Preload. Load low-resolution tiles up to `preload` levels. `0`
      * means no preloading.
      */
    var preload: js.UndefOr[Double] = js.undefined
    
    /**
      * Source for this layer.
      */
    var source: js.UndefOr[SourceType] = js.undefined
    
    /**
      * Array
      * of sources for this layer. Takes precedence over `source`. Can either be an array of sources, or a function that
      * expects an extent and a resolution (in view projection units per pixel) and returns an array of sources. See
      * {@link module :ol/source.sourcesFromTileGrid} for a helper function to generate sources that are organized in a
      * pyramid following the same pattern as a tile grid. **Note:** All sources must have the same band count and content.
      */
    var sources: js.UndefOr[
        js.Array[SourceType] | (js.Function2[/* arg0 */ Extent, /* arg1 */ Double, js.Array[SourceType]])
      ] = js.undefined
    
    /**
      * Style to apply to the layer.
      */
    var style: js.UndefOr[Style] = js.undefined
    
    /**
      * Use interim tiles on error.
      */
    var useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Visibility.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The z-index for layer rendering.  At rendering time, the layers
      * will be ordered, first by Z-index and then by position. When `undefined`, a `zIndex` of 0 is assumed
      * for layers that are added to the map's `layers` collection, or `Infinity` when the layer's `setMap()`
      * method was used.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setMap(value: typings.ol.rendererMapMod.default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setSource(value: SourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSources(
        value: js.Array[SourceType] | (js.Function2[/* arg0 */ Extent, /* arg1 */ Double, js.Array[SourceType]])
      ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesFunction2(value: (/* arg0 */ Extent, /* arg1 */ Double) => js.Array[SourceType]): Self = StObject.set(x, "sources", js.Any.fromFunction2(value))
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: SourceType*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUseInterimTilesOnError(value: Boolean): Self = StObject.set(x, "useInterimTilesOnError", value.asInstanceOf[js.Any])
      
      inline def setUseInterimTilesOnErrorUndefined: Self = StObject.set(x, "useInterimTilesOnError", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait ParsedStyle extends StObject {
    
    /**
      * The fragment shader.
      */
    var fragmentShader: String
    
    /**
      * Palette textures.
      */
    var paletteTextures: js.Array[typings.ol.webglPaletteTextureMod.default]
    
    /**
      * Uniform definitions.
      */
    var uniforms: StringDictionary[UniformValue]
    
    /**
      * The vertex shader.
      */
    var vertexShader: String
  }
  object ParsedStyle {
    
    inline def apply(
      fragmentShader: String,
      paletteTextures: js.Array[typings.ol.webglPaletteTextureMod.default],
      uniforms: StringDictionary[UniformValue],
      vertexShader: String
    ): ParsedStyle = {
      val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], paletteTextures = paletteTextures.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedStyle] (val x: Self) extends AnyVal {
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setPaletteTextures(value: js.Array[typings.ol.webglPaletteTextureMod.default]): Self = StObject.set(x, "paletteTextures", value.asInstanceOf[js.Any])
      
      inline def setPaletteTexturesVarargs(value: typings.ol.webglPaletteTextureMod.default*): Self = StObject.set(x, "paletteTextures", js.Array(value*))
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.sourceDataTileMod.default
    - typings.ol.sourceTileImageMod.default
  */
  trait SourceType extends StObject
  
  trait Style extends StObject {
    
    /**
      * Value used to decrease or increase
      * the layer brightness.  Values range from -1 to 1.
      */
    var brightness: js.UndefOr[ExpressionValue] = js.undefined
    
    /**
      * An expression applied to color values.
      */
    var color: js.UndefOr[ExpressionValue] = js.undefined
    
    /**
      * Value used to decrease or increase
      * the layer contrast.  Values range from -1 to 1.
      */
    var contrast: js.UndefOr[ExpressionValue] = js.undefined
    
    /**
      * Value used to decrease or increase
      * the layer exposure.  Values range from -1 to 1.
      */
    var exposure: js.UndefOr[ExpressionValue] = js.undefined
    
    /**
      * Apply a gamma correction to the layer.
      * Values range from 0 to infinity.
      */
    var gamma: js.UndefOr[ExpressionValue] = js.undefined
    
    /**
      * Value used to decrease or increase
      * the layer saturation.  Values range from -1 to 1.
      */
    var saturation: js.UndefOr[ExpressionValue] = js.undefined
    
    /**
      * Style variables.  Each variable must hold a number or string.  These
      * variables can be used in the `color`, `brightness`, `contrast`, `exposure`, `saturation` and `gamma`
      * {@link import ("../style/expressions.js").ExpressionValue expressions}, using the `['var', 'varName']` operator.
      * To update style variables, use the {@link import ("./WebGLTile.js").default#updateStyleVariables} method.
      */
    var variables: js.UndefOr[StringDictionary[String | Double]] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setBrightness(value: ExpressionValue): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      inline def setBrightnessVarargs(value: (Any | Double)*): Self = StObject.set(x, "brightness", js.Array(value*))
      
      inline def setColor(value: ExpressionValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: (Any | Double)*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setContrast(value: ExpressionValue): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
      
      inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
      
      inline def setContrastVarargs(value: (Any | Double)*): Self = StObject.set(x, "contrast", js.Array(value*))
      
      inline def setExposure(value: ExpressionValue): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
      
      inline def setExposureUndefined: Self = StObject.set(x, "exposure", js.undefined)
      
      inline def setExposureVarargs(value: (Any | Double)*): Self = StObject.set(x, "exposure", js.Array(value*))
      
      inline def setGamma(value: ExpressionValue): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
      
      inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
      
      inline def setGammaVarargs(value: (Any | Double)*): Self = StObject.set(x, "gamma", js.Array(value*))
      
      inline def setSaturation(value: ExpressionValue): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
      
      inline def setSaturationVarargs(value: (Any | Double)*): Self = StObject.set(x, "saturation", js.Array(value*))
      
      inline def setVariables(value: StringDictionary[String | Double]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  /**
    * @classdesc
    * For layer sources that provide pre-rendered, tiled images in grids that are
    * organized by zoom levels for specific resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @extends BaseTileLayer<SourceType, WebGLTileLayerRenderer>
    * @fires import("../render/Event.js").RenderEvent
    * @api
    */
  @js.native
  trait WebGLTileLayer
    extends typings.ol.layerBaseTileMod.default[SourceType, typings.ol.rendererWebglTileLayerMod.default] {
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var cacheSize_ : Any = js.native
    
    /**
      * @private
      * @return {number} The number of source bands.
      */
    /* private */ var getSourceBandCount_ : Any = js.native
    
    /**
      * Gets the sources for this layer, for a given extent and resolution.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} resolution Resolution.
      * @return {Array<SourceType>} Sources.
      */
    def getSources(extent: Extent, resolution: Double): js.Array[SourceType] = js.native
    
    /**
      * @private
      */
    /* private */ var handleSourceUpdate_ : Any = js.native
    
    /**
      * @param {import("../Map").FrameState} frameState Frame state.
      * @param {Array<SourceType>} sources Sources.
      * @return {HTMLElement} Canvas.
      */
    def renderSources(frameState: FrameState, sources: js.Array[SourceType]): HTMLElement = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var renderedResolution_ : Any = js.native
    
    /**
      * @type {SourceType|null}
      * @private
      */
    /* private */ var renderedSource_ : Any = js.native
    
    /**
      * Update the layer style.  The `updateStyleVariables` function is a more efficient
      * way to update layer rendering.  In cases where the whole style needs to be updated,
      * this method may be called instead.  Note that calling this method will also replace
      * any previously set variables, so the new style also needs to include new variables,
      * if needed.
      * @param {Style} style The new style.
      */
    def setStyle(style: Style): Unit = js.native
    
    /**
      * @type {Array<SourceType>|function(import("../extent.js").Extent, number):Array<SourceType>}
      * @private
      */
    /* private */ var sources_ : Any = js.native
    
    /**
      * @type {Object<string, (string|number)>}
      * @private
      */
    /* private */ var styleVariables_ : Any = js.native
    
    /**
      * @type {Style}
      * @private
      */
    /* private */ var style_ : Any = js.native
    
    /**
      * Update any variables used by the layer style and trigger a re-render.
      * @param {Object<string, number>} variables Variables to update.
      * @api
      */
    def updateStyleVariables(variables: StringDictionary[Double]): Unit = js.native
  }
}
