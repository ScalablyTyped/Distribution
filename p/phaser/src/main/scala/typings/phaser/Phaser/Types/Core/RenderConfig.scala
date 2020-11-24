package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderConfig extends js.Object {
  
  /**
    * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
    */
  var antialias: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
    */
  var antialiasGL: js.UndefOr[Boolean] = js.native
  
  /**
    * The default WebGL batch size.
    */
  var batchSize: js.UndefOr[integer] = js.native
  
  /**
    * Whether the game canvas will be cleared between each rendering frame.
    */
  var clearBeforeRender: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
    */
  var desynchronized: js.UndefOr[Boolean] = js.native
  
  /**
    * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
    */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
    */
  var maxLights: js.UndefOr[integer] = js.native
  
  /**
    * The mipmap magFilter to be used when creating WebGL textures.
    */
  var mipmapFilter: js.UndefOr[String] = js.native
  
  /**
    * Sets `antialias` to false and `roundPixels` to true. This is the best setting for pixel-art games.
    */
  var pixelArt: js.UndefOr[Boolean] = js.native
  
  /**
    * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
    */
  var powerPreference: js.UndefOr[String] = js.native
  
  /**
    * In WebGL mode, the drawing buffer contains colors with pre-multiplied alpha.
    */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.native
  
  /**
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  var roundPixels: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the game canvas will be transparent. Boolean that indicates if the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
    */
  var transparent: js.UndefOr[Boolean] = js.native
}
object RenderConfig {
  
  @scala.inline
  def apply(): RenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderConfig]
  }
  
  @scala.inline
  implicit class RenderConfigOps[Self <: RenderConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    
    @scala.inline
    def setAntialiasGL(value: Boolean): Self = this.set("antialiasGL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialiasGL: Self = this.set("antialiasGL", js.undefined)
    
    @scala.inline
    def setBatchSize(value: integer): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setClearBeforeRender(value: Boolean): Self = this.set("clearBeforeRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearBeforeRender: Self = this.set("clearBeforeRender", js.undefined)
    
    @scala.inline
    def setDesynchronized(value: Boolean): Self = this.set("desynchronized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesynchronized: Self = this.set("desynchronized", js.undefined)
    
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: Boolean): Self = this.set("failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailIfMajorPerformanceCaveat: Self = this.set("failIfMajorPerformanceCaveat", js.undefined)
    
    @scala.inline
    def setMaxLights(value: integer): Self = this.set("maxLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLights: Self = this.set("maxLights", js.undefined)
    
    @scala.inline
    def setMipmapFilter(value: String): Self = this.set("mipmapFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMipmapFilter: Self = this.set("mipmapFilter", js.undefined)
    
    @scala.inline
    def setPixelArt(value: Boolean): Self = this.set("pixelArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelArt: Self = this.set("pixelArt", js.undefined)
    
    @scala.inline
    def setPowerPreference(value: String): Self = this.set("powerPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerPreference: Self = this.set("powerPreference", js.undefined)
    
    @scala.inline
    def setPremultipliedAlpha(value: Boolean): Self = this.set("premultipliedAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremultipliedAlpha: Self = this.set("premultipliedAlpha", js.undefined)
    
    @scala.inline
    def setRoundPixels(value: Boolean): Self = this.set("roundPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundPixels: Self = this.set("roundPixels", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
  }
}
