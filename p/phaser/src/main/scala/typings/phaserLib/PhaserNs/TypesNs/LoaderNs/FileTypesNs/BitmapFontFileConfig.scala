package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapFontFileConfig extends js.Object {
  /**
    * The default file extension to use for the font data xml if no url is provided.
    */
  var fontDataExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute or relative URL to load the font data xml file from.
    */
  var fontDataURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for the font data xml file.
    */
  var fontDataXhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
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

object BitmapFontFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    fontDataExtension: java.lang.String = null,
    fontDataURL: java.lang.String = null,
    fontDataXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null,
    normalMap: java.lang.String = null,
    textureExtension: java.lang.String = null,
    textureURL: java.lang.String = null,
    textureXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): BitmapFontFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (fontDataExtension != null) __obj.updateDynamic("fontDataExtension")(fontDataExtension)
    if (fontDataURL != null) __obj.updateDynamic("fontDataURL")(fontDataURL)
    if (fontDataXhrSettings != null) __obj.updateDynamic("fontDataXhrSettings")(fontDataXhrSettings)
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap)
    if (textureExtension != null) __obj.updateDynamic("textureExtension")(textureExtension)
    if (textureURL != null) __obj.updateDynamic("textureURL")(textureURL)
    if (textureXhrSettings != null) __obj.updateDynamic("textureXhrSettings")(textureXhrSettings)
    __obj.asInstanceOf[BitmapFontFileConfig]
  }
}

