package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
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
    * The default WebGL batch size.
    */
  var batchSize: js.UndefOr[integer] = js.undefined
  
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
  var maxLights: js.UndefOr[integer] = js.undefined
  
  /**
    * The mipmap magFilter to be used when creating WebGL textures.
    */
  var mipmapFilter: js.UndefOr[String] = js.undefined
  
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
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  var roundPixels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the game canvas will be transparent. Boolean that indicates if the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
}
object RenderConfig {
  
  @scala.inline
  def apply(): RenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderConfig]
  }
  
  @scala.inline
  implicit class RenderConfigMutableBuilder[Self <: RenderConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasGL(value: Boolean): Self = StObject.set(x, "antialiasGL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasGLUndefined: Self = StObject.set(x, "antialiasGL", js.undefined)
    
    @scala.inline
    def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    @scala.inline
    def setBatchSize(value: integer): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearBeforeRenderUndefined: Self = StObject.set(x, "clearBeforeRender", js.undefined)
    
    @scala.inline
    def setDesynchronized(value: Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
    
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    @scala.inline
    def setMaxLights(value: integer): Self = StObject.set(x, "maxLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLightsUndefined: Self = StObject.set(x, "maxLights", js.undefined)
    
    @scala.inline
    def setMipmapFilter(value: String): Self = StObject.set(x, "mipmapFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMipmapFilterUndefined: Self = StObject.set(x, "mipmapFilter", js.undefined)
    
    @scala.inline
    def setPixelArt(value: Boolean): Self = StObject.set(x, "pixelArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelArtUndefined: Self = StObject.set(x, "pixelArt", js.undefined)
    
    @scala.inline
    def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    @scala.inline
    def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    @scala.inline
    def setRoundPixels(value: Boolean): Self = StObject.set(x, "roundPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundPixelsUndefined: Self = StObject.set(x, "roundPixels", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
