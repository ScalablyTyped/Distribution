package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannerConfig extends js.Object {
  /**
    * The background colors of the banner.
    */
  var background: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Omit Phaser's name and version from the banner.
    */
  var hidePhaser: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color of the banner text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object BannerConfig {
  @scala.inline
  def apply(
    background: js.Array[java.lang.String] = null,
    hidePhaser: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null
  ): BannerConfig = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(hidePhaser)) __obj.updateDynamic("hidePhaser")(hidePhaser)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BannerConfig]
  }
}

