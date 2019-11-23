package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderConfig extends js.Object {
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
    * Sets `antialias` and `roundPixels` to true. This is the best setting for pixel-art games.
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
  def apply(
    antialias: js.UndefOr[Boolean] = js.undefined,
    antialiasGL: js.UndefOr[Boolean] = js.undefined,
    batchSize: Int | Double = null,
    clearBeforeRender: js.UndefOr[Boolean] = js.undefined,
    desynchronized: js.UndefOr[Boolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined,
    maxLights: Int | Double = null,
    mipmapFilter: String = null,
    pixelArt: js.UndefOr[Boolean] = js.undefined,
    powerPreference: String = null,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    roundPixels: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): RenderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (!js.isUndefined(antialiasGL)) __obj.updateDynamic("antialiasGL")(antialiasGL)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(clearBeforeRender)) __obj.updateDynamic("clearBeforeRender")(clearBeforeRender)
    if (!js.isUndefined(desynchronized)) __obj.updateDynamic("desynchronized")(desynchronized)
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat)
    if (maxLights != null) __obj.updateDynamic("maxLights")(maxLights.asInstanceOf[js.Any])
    if (mipmapFilter != null) __obj.updateDynamic("mipmapFilter")(mipmapFilter)
    if (!js.isUndefined(pixelArt)) __obj.updateDynamic("pixelArt")(pixelArt)
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference)
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (!js.isUndefined(roundPixels)) __obj.updateDynamic("roundPixels")(roundPixels)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    __obj.asInstanceOf[RenderConfig]
  }
}

