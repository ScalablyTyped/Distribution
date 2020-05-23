package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLTextureFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The height of the texture the HTML will be rendered to.
    */
  var height: js.UndefOr[integer] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * The width of the texture the HTML will be rendered to.
    */
  var width: js.UndefOr[integer] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object HTMLTextureFileConfig {
  @scala.inline
  def apply(
    key: String,
    extension: String = null,
    height: js.UndefOr[integer] = js.undefined,
    url: String = null,
    width: js.UndefOr[integer] = js.undefined,
    xhrSettings: XHRSettingsObject = null
  ): HTMLTextureFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTextureFileConfig]
  }
}

