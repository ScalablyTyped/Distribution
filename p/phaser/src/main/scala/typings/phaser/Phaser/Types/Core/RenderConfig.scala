package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderConfig extends StObject {
  
  /**
    * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
    */
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
    */
  var antialiasGL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default WebGL batch size. Represents the number of _quads_ that can be added to a single batch.
    */
  var batchSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the game canvas will be cleared between each rendering frame.
    */
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
    */
  var desynchronized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
    */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
    */
  var maxLights: js.UndefOr[Double] = js.undefined
  
  /**
    * When in WebGL mode, this sets the maximum number of GPU Textures to use. The default, -1, will use all available units. The WebGL1 spec says all browsers should provide a minimum of 8.
    */
  var maxTextures: js.UndefOr[Double] = js.undefined
  
  /**
    * The mipmap magFilter to be used when creating WebGL textures.
    */
  var mipmapFilter: js.UndefOr[String] = js.undefined
  
  /**
    * The WebGL Pipeline configuration object.
    */
  var pipeline: js.UndefOr[PipelineConfig] = js.undefined
  
  /**
    * Sets `antialias` to false and `roundPixels` to true. This is the best setting for pixel-art games.
    */
  var pixelArt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
    */
  var powerPreference: js.UndefOr[String] = js.undefined
  
  /**
    * In WebGL mode, the drawing buffer contains colors with pre-multiplied alpha.
    */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the value is true the WebGL buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
    */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  var roundPixels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the game canvas will be transparent. Boolean that indicates if the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
}
object RenderConfig {
  
  inline def apply(): RenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderConfig]
  }
  
  extension [Self <: RenderConfig](x: Self) {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasGL(value: Boolean): Self = StObject.set(x, "antialiasGL", value.asInstanceOf[js.Any])
    
    inline def setAntialiasGLUndefined: Self = StObject.set(x, "antialiasGL", js.undefined)
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
    
    inline def setClearBeforeRenderUndefined: Self = StObject.set(x, "clearBeforeRender", js.undefined)
    
    inline def setDesynchronized(value: Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    
    inline def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
    
    inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    inline def setMaxLights(value: Double): Self = StObject.set(x, "maxLights", value.asInstanceOf[js.Any])
    
    inline def setMaxLightsUndefined: Self = StObject.set(x, "maxLights", js.undefined)
    
    inline def setMaxTextures(value: Double): Self = StObject.set(x, "maxTextures", value.asInstanceOf[js.Any])
    
    inline def setMaxTexturesUndefined: Self = StObject.set(x, "maxTextures", js.undefined)
    
    inline def setMipmapFilter(value: String): Self = StObject.set(x, "mipmapFilter", value.asInstanceOf[js.Any])
    
    inline def setMipmapFilterUndefined: Self = StObject.set(x, "mipmapFilter", js.undefined)
    
    inline def setPipeline(value: PipelineConfig): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPixelArt(value: Boolean): Self = StObject.set(x, "pixelArt", value.asInstanceOf[js.Any])
    
    inline def setPixelArtUndefined: Self = StObject.set(x, "pixelArt", js.undefined)
    
    inline def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setRoundPixels(value: Boolean): Self = StObject.set(x, "roundPixels", value.asInstanceOf[js.Any])
    
    inline def setRoundPixelsUndefined: Self = StObject.set(x, "roundPixels", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
