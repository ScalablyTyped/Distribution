package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLTextureFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the texture the HTML will be rendered to.
    */
  var height: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: java.lang.String
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the texture the HTML will be rendered to.
    */
  var width: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object HTMLTextureFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    extension: java.lang.String = null,
    height: js.UndefOr[phaserLib.integer] = js.undefined,
    url: java.lang.String = null,
    width: js.UndefOr[phaserLib.integer] = js.undefined,
    xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): HTMLTextureFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[HTMLTextureFileConfig]
  }
}

