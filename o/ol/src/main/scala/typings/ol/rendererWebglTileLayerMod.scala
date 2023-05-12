package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.mapMod.FrameState
import typings.ol.webglHelperMod.UniformValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererWebglTileLayerMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} vertexShader Vertex shader source.
    * @property {string} fragmentShader Fragment shader source.
    * @property {Object<string, import("../../webgl/Helper").UniformValue>} [uniforms] Additional uniforms
    * made available to shaders.
    * @property {Array<import("../../webgl/PaletteTexture.js").default>} [paletteTextures] Palette textures.
    * @property {number} [cacheSize=512] The texture cache size.
    */
  /**
    * @typedef {import("../../layer/WebGLTile.js").default} LayerType
    */
  /**
    * @classdesc
    * WebGL renderer for tile layers.
    * @extends {WebGLLayerRenderer<LayerType>}
    * @api
    */
  @JSImport("ol/renderer/webgl/TileLayer", JSImport.Default)
  @js.native
  open class default protected () extends WebGLTileLayerRenderer {
    /**
      * @param {LayerType} tileLayer Tile layer.
      * @param {Options} options Options.
      */
    def this(tileLayer: LayerType, options: Options) = this()
  }
  
  object Attributes {
    
    @JSImport("ol/renderer/webgl/TileLayer", "Attributes.TEXTURE_COORD")
    @js.native
    val TEXTURE_COORD: String = js.native
  }
  
  object Uniforms {
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.DEPTH")
    @js.native
    val DEPTH: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.RENDER_EXTENT")
    @js.native
    val RENDER_EXTENT: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.RESOLUTION")
    @js.native
    val RESOLUTION: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.TEXTURE_ORIGIN_X")
    @js.native
    val TEXTURE_ORIGIN_X: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.TEXTURE_ORIGIN_Y")
    @js.native
    val TEXTURE_ORIGIN_Y: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.TEXTURE_PIXEL_HEIGHT")
    @js.native
    val TEXTURE_PIXEL_HEIGHT: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.TEXTURE_PIXEL_WIDTH")
    @js.native
    val TEXTURE_PIXEL_WIDTH: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.TEXTURE_RESOLUTION")
    @js.native
    val TEXTURE_RESOLUTION: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.TILE_TEXTURE_ARRAY")
    @js.native
    val TILE_TEXTURE_ARRAY: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.TILE_TRANSFORM")
    @js.native
    val TILE_TRANSFORM: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.TRANSITION_ALPHA")
    @js.native
    val TRANSITION_ALPHA: String = js.native
    
    @JSImport("ol/renderer/webgl/TileLayer", "Uniforms.ZOOM")
    @js.native
    val ZOOM: String = js.native
  }
  
  type LayerType = typings.ol.layerWebGLTileMod.default
  
  trait Options extends StObject {
    
    /**
      * The texture cache size.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Fragment shader source.
      */
    var fragmentShader: String
    
    /**
      * Palette textures.
      */
    var paletteTextures: js.UndefOr[js.Array[typings.ol.webglPaletteTextureMod.default]] = js.undefined
    
    /**
      * Additional uniforms
      * made available to shaders.
      */
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
    /**
      * Vertex shader source.
      */
    var vertexShader: String
  }
  object Options {
    
    inline def apply(fragmentShader: String, vertexShader: String): Options = {
      val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setPaletteTextures(value: js.Array[typings.ol.webglPaletteTextureMod.default]): Self = StObject.set(x, "paletteTextures", value.asInstanceOf[js.Any])
      
      inline def setPaletteTexturesUndefined: Self = StObject.set(x, "paletteTextures", js.undefined)
      
      inline def setPaletteTexturesVarargs(value: typings.ol.webglPaletteTextureMod.default*): Self = StObject.set(x, "paletteTextures", js.Array(value*))
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} vertexShader Vertex shader source.
    * @property {string} fragmentShader Fragment shader source.
    * @property {Object<string, import("../../webgl/Helper").UniformValue>} [uniforms] Additional uniforms
    * made available to shaders.
    * @property {Array<import("../../webgl/PaletteTexture.js").default>} [paletteTextures] Palette textures.
    * @property {number} [cacheSize=512] The texture cache size.
    */
  /**
    * @typedef {import("../../layer/WebGLTile.js").default} LayerType
    */
  /**
    * @classdesc
    * WebGL renderer for tile layers.
    * @extends {WebGLLayerRenderer<LayerType>}
    * @api
    */
  @js.native
  trait WebGLTileLayerRenderer
    extends typings.ol.rendererWebglLayerMod.default[typings.ol.layerWebGLTileMod.default] {
    
    def clearCache(): Unit = js.native
    
    /**
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @param {import("../../extent.js").Extent} extent The extent to be rendered.
      * @param {number} initialZ The zoom level.
      * @param {Object<number, Array<TileTexture>>} tileTexturesByZ The zoom level.
      * @param {number} preload Number of additional levels to load.
      */
    def enqueueTiles(
      frameState: FrameState,
      extent: Extent,
      initialZ: Double,
      tileTexturesByZ: NumberDictionary[js.Array[typings.ol.webglTileTextureMod.default]],
      preload: Double
    ): Unit = js.native
    
    /**
      * Look for tiles covering the provided tile coordinate at an alternate
      * zoom level.  Loaded tiles will be added to the provided tile texture lookup.
      * @param {import("../../tilegrid/TileGrid.js").default} tileGrid The tile grid.
      * @param {import("../../tilecoord.js").TileCoord} tileCoord The target tile coordinate.
      * @param {number} altZ The alternate zoom level.
      * @param {Object<number, Array<import("../../webgl/TileTexture.js").default>>} tileTexturesByZ Lookup of
      * tile textures by zoom level.
      * @return {boolean} The tile coordinate is covered by loaded tiles at the alternate zoom level.
      * @private
      */
    /* private */ var findAltTiles_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var fragmentShader_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../Map.js").FrameState|null}
      */
    /* private */ var frameState_ : Any = js.native
    
    /**
      * Tiles are rendered as a quad with the following structure:
      *
      *  [P3]---------[P2]
      *   |`           |
      *   |  `     B   |
      *   |    `       |
      *   |      `     |
      *   |   A    `   |
      *   |          ` |
      *  [P0]---------[P1]
      *
      * Triangle A: P0, P1, P3
      * Triangle B: P1, P2, P3
      *
      * @private
      */
    /* private */ var indices_ : Any = js.native
    
    /**
      * @param {import("../../webgl/TileTexture").TileType} tile Tile.
      * @return {boolean} Tile is drawable.
      * @private
      */
    /* private */ var isDrawableTile_ : Any = js.native
    
    /**
      * @type {Array<import("../../webgl/PaletteTexture.js").default>}
      * @private
      */
    /* private */ var paletteTextures_ : Any = js.native
    
    /**
      * @type {WebGLProgram}
      * @private
      */
    /* private */ var program_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../proj/Projection.js").default}
      */
    /* private */ var projection_ : Any = js.native
    
    /**
      * The last call to `renderFrame` was completed with all tiles loaded
      * @type {boolean}
      */
    var renderComplete: Boolean = js.native
    
    /**
      * Render the layer.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @return {HTMLElement} The rendered element.
      */
    def renderFrame(frameState: FrameState): HTMLElement = js.native
    
    /**
      * @param {Options} options Options.
      */
    def reset(options: Options): Unit = js.native
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ var tempMat4_ : Any = js.native
    
    /**
      * @type {import("../../size.js").Size}
      * @private
      */
    /* private */ var tempSize_ : Any = js.native
    
    /**
      * @type {import("../../tilecoord.js").TileCoord}
      * @private
      */
    /* private */ var tempTileCoord_ : Any = js.native
    
    /**
      * @type {import("../../TileRange.js").default}
      * @private
      */
    /* private */ var tempTileRange_ : Any = js.native
    
    /**
      * @type {import("../../structs/LRUCache.js").default<import("../../webgl/TileTexture.js").default>}
      * @private
      */
    /* private */ var tileTextureCache_ : Any = js.native
    
    /**
      * This transform converts texture coordinates to screen coordinates.
      * @type {import("../../transform.js").Transform}
      * @private
      */
    /* private */ var tileTransform_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var vertexShader_ : Any = js.native
  }
}
