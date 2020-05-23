package typings.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannerConfig extends js.Object {
  /**
    * The background colors of the banner.
    */
  var background: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Omit Phaser's name and version from the banner.
    */
  var hidePhaser: js.UndefOr[Boolean] = js.undefined
  /**
    * The color of the banner text.
    */
  var text: js.UndefOr[String] = js.undefined
}

object BannerConfig {
  @scala.inline
  def apply(
    background: js.Array[String] = null,
    hidePhaser: js.UndefOr[Boolean] = js.undefined,
    text: String = null
  ): BannerConfig = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePhaser)) __obj.updateDynamic("hidePhaser")(hidePhaser.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerConfig]
  }
}

