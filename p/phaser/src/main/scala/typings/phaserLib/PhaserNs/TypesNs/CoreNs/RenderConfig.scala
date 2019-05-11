package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderConfig extends js.Object {
  /**
    * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
    */
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default WebGL batch size.
    */
  var batchSize: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Whether the game canvas will be cleared between each rendering frame.
    */
  var clearBeforeRender: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
    */
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
    */
  var maxLights: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Sets `antialias` and `roundPixels` to true. This is the best setting for pixel-art games.
    */
  var pixelArt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
    */
  var powerPreference: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In WebGL mode, the drawing buffer contains colors with pre-multiplied alpha.
    */
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  var roundPixels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the game canvas will be transparent.
    */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
}

object RenderConfig {
  @scala.inline
  def apply(
    antialias: js.UndefOr[scala.Boolean] = js.undefined,
    batchSize: js.UndefOr[phaserLib.integer] = js.undefined,
    clearBeforeRender: js.UndefOr[scala.Boolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined,
    maxLights: js.UndefOr[phaserLib.integer] = js.undefined,
    pixelArt: js.UndefOr[scala.Boolean] = js.undefined,
    powerPreference: java.lang.String = null,
    premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    roundPixels: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined
  ): RenderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize)
    if (!js.isUndefined(clearBeforeRender)) __obj.updateDynamic("clearBeforeRender")(clearBeforeRender)
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat)
    if (!js.isUndefined(maxLights)) __obj.updateDynamic("maxLights")(maxLights)
    if (!js.isUndefined(pixelArt)) __obj.updateDynamic("pixelArt")(pixelArt)
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference)
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (!js.isUndefined(roundPixels)) __obj.updateDynamic("roundPixels")(roundPixels)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    __obj.asInstanceOf[RenderConfig]
  }
}

