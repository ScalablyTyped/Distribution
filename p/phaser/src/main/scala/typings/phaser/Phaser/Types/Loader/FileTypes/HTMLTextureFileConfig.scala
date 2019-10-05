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
    height: Int | Double = null,
    url: String = null,
    width: Int | Double = null,
    xhrSettings: XHRSettingsObject = null
  ): HTMLTextureFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[HTMLTextureFileConfig]
  }
}

