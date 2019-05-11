package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiAtlasFileConfig extends js.Object {
  /**
    * The default file extension to use for the atlas json if no url is provided.
    */
  var atlasExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute or relative URL to load the multi atlas json file from. Or, a well formed JSON object.
    */
  var atlasURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for the atlas json file.
    */
  var atlasXhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
  /**
    * Optional Base URL to use when loading the textures defined in the atlas data.
    */
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: java.lang.String
  /**
    * Optional path to use when loading the textures defined in the atlas data.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for the texture files.
    */
  var textureXhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object MultiAtlasFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    atlasExtension: java.lang.String = null,
    atlasURL: java.lang.String = null,
    atlasXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null,
    baseURL: java.lang.String = null,
    path: java.lang.String = null,
    textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): MultiAtlasFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (atlasExtension != null) __obj.updateDynamic("atlasExtension")(atlasExtension)
    if (atlasURL != null) __obj.updateDynamic("atlasURL")(atlasURL)
    if (atlasXhrSettings != null) __obj.updateDynamic("atlasXhrSettings")(atlasXhrSettings)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (path != null) __obj.updateDynamic("path")(path)
    if (textureXhrSettings != null) __obj.updateDynamic("textureXhrSettings")(textureXhrSettings)
    __obj.asInstanceOf[MultiAtlasFileConfig]
  }
}

