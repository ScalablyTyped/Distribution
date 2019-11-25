package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiAtlasFileConfig extends js.Object {
  /**
    * The default file extension to use for the atlas json if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the multi atlas json file from. Or, a well formed JSON object.
    */
  var atlasURL: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for the atlas json file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  /**
    * Optional Base URL to use when loading the textures defined in the atlas data.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  /**
    * Optional path to use when loading the textures defined in the atlas data.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for the texture files.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object MultiAtlasFileConfig {
  @scala.inline
  def apply(
    key: String,
    atlasExtension: String = null,
    atlasURL: String = null,
    atlasXhrSettings: XHRSettingsObject = null,
    baseURL: String = null,
    path: String = null,
    textureXhrSettings: XHRSettingsObject = null
  ): MultiAtlasFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (atlasExtension != null) __obj.updateDynamic("atlasExtension")(atlasExtension.asInstanceOf[js.Any])
    if (atlasURL != null) __obj.updateDynamic("atlasURL")(atlasURL.asInstanceOf[js.Any])
    if (atlasXhrSettings != null) __obj.updateDynamic("atlasXhrSettings")(atlasXhrSettings.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (textureXhrSettings != null) __obj.updateDynamic("textureXhrSettings")(textureXhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiAtlasFileConfig]
  }
}

