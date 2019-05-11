package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasXMLFileConfig extends js.Object {
  /**
    * The default file extension to use for the atlas xml if no url is provided.
    */
  var atlasExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute or relative URL to load the atlas xml file from.
    */
  var atlasURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for the atlas xml file.
    */
  var atlasXhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: java.lang.String
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the texture image.
    */
  var normalMap: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default file extension to use for the image texture if no url is provided.
    */
  var textureExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute or relative URL to load the texture image file from.
    */
  var textureURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for the texture image file.
    */
  var textureXhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object AtlasXMLFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    atlasExtension: java.lang.String = null,
    atlasURL: java.lang.String = null,
    atlasXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null,
    normalMap: java.lang.String = null,
    textureExtension: java.lang.String = null,
    textureURL: java.lang.String = null,
    textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): AtlasXMLFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (atlasExtension != null) __obj.updateDynamic("atlasExtension")(atlasExtension)
    if (atlasURL != null) __obj.updateDynamic("atlasURL")(atlasURL)
    if (atlasXhrSettings != null) __obj.updateDynamic("atlasXhrSettings")(atlasXhrSettings)
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap)
    if (textureExtension != null) __obj.updateDynamic("textureExtension")(textureExtension)
    if (textureURL != null) __obj.updateDynamic("textureURL")(textureURL)
    if (textureXhrSettings != null) __obj.updateDynamic("textureXhrSettings")(textureXhrSettings)
    __obj.asInstanceOf[AtlasXMLFileConfig]
  }
}

