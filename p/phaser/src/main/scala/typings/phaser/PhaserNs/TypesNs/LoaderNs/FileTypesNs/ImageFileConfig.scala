package typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The frame configuration object. Only provided for, and used by, Sprite Sheets.
    */
  var frameConfig: js.UndefOr[ImageFrameConfig] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the image.
    */
  var normalMap: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object ImageFileConfig {
  @scala.inline
  def apply(
    key: String,
    extension: String = null,
    frameConfig: ImageFrameConfig = null,
    normalMap: String = null,
    url: String = null,
    xhrSettings: XHRSettingsObject = null
  ): ImageFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (frameConfig != null) __obj.updateDynamic("frameConfig")(frameConfig)
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[ImageFileConfig]
  }
}

