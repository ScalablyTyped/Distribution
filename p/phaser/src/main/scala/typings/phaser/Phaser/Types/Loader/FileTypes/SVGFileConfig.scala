package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  /**
    * The svg size configuration object.
    */
  var svgConfig: js.UndefOr[SVGSizeConfig] = js.undefined
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object SVGFileConfig {
  @scala.inline
  def apply(
    key: String,
    extension: String = null,
    svgConfig: SVGSizeConfig = null,
    url: String = null,
    xhrSettings: XHRSettingsObject = null
  ): SVGFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (svgConfig != null) __obj.updateDynamic("svgConfig")(svgConfig)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[SVGFileConfig]
  }
}

