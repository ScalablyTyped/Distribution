package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasJSONFileConfig extends js.Object {
  /**
    * The default file extension to use for the atlas json if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the atlas json file from. Or a well formed JSON object to use instead.
    */
  var atlasURL: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for the atlas json file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the texture image.
    */
  var normalMap: js.UndefOr[String] = js.undefined
  /**
    * The default file extension to use for the image texture if no url is provided.
    */
  var textureExtension: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the texture image file from.
    */
  var textureURL: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for the texture image file.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object AtlasJSONFileConfig {
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
  ): AtlasJSONFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (atlasExtension != null) __obj.updateDynamic("atlasExtension")(atlasExtension)
    if (atlasURL != null) __obj.updateDynamic("atlasURL")(atlasURL)
    if (atlasXhrSettings != null) __obj.updateDynamic("atlasXhrSettings")(atlasXhrSettings)
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap)
    if (textureExtension != null) __obj.updateDynamic("textureExtension")(textureExtension)
    if (textureURL != null) __obj.updateDynamic("textureURL")(textureURL)
    if (textureXhrSettings != null) __obj.updateDynamic("textureXhrSettings")(textureXhrSettings)
    __obj.asInstanceOf[AtlasJSONFileConfig]
  }
}

