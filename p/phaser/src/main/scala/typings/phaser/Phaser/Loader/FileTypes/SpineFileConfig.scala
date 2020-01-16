package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpineFileConfig extends js.Object {
  var atlasExtension: js.UndefOr[String] = js.undefined
  var atlasURL: js.UndefOr[String] = js.undefined
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  var key: String
  var normalMap: js.UndefOr[String] = js.undefined
  var textureExtension: js.UndefOr[String] = js.undefined
  var textureURL: js.UndefOr[String] = js.undefined
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object SpineFileConfig {
  @scala.inline
  def apply(
    key: String,
    atlasExtension: String = null,
    atlasURL: String = null,
    atlasXhrSettings: XHRSettingsObject = null,
    normalMap: String = null,
    textureExtension: String = null,
    textureURL: String = null,
    textureXhrSettings: XHRSettingsObject = null
  ): SpineFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (atlasExtension != null) __obj.updateDynamic("atlasExtension")(atlasExtension.asInstanceOf[js.Any])
    if (atlasURL != null) __obj.updateDynamic("atlasURL")(atlasURL.asInstanceOf[js.Any])
    if (atlasXhrSettings != null) __obj.updateDynamic("atlasXhrSettings")(atlasXhrSettings.asInstanceOf[js.Any])
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap.asInstanceOf[js.Any])
    if (textureExtension != null) __obj.updateDynamic("textureExtension")(textureExtension.asInstanceOf[js.Any])
    if (textureURL != null) __obj.updateDynamic("textureURL")(textureURL.asInstanceOf[js.Any])
    if (textureXhrSettings != null) __obj.updateDynamic("textureXhrSettings")(textureXhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineFileConfig]
  }
}

