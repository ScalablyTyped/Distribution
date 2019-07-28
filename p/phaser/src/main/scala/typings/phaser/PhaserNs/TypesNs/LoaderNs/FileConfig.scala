package typings.phaser.PhaserNs.TypesNs.LoaderNs

import typings.phaser.phaserNumbers.`false`
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConfig extends js.Object {
  /**
    * A config object that can be used by file types to store transitional data.
    */
  var config: js.UndefOr[js.Any] = js.undefined
  /**
    * The default extension this file uses.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String
  /**
    * The path of the file, not including the baseURL.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The responseType to be used by the XHR request.
    */
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
  /**
    * The file type string (image, json, etc) for sorting within the Loader.
    */
  var `type`: String
  /**
    * The URL of the file, not including baseURL.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Custom XHR Settings specific to this file and merged with the Loader defaults.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject | `false`] = js.undefined
}

object FileConfig {
  @scala.inline
  def apply(
    key: String,
    `type`: String,
    config: js.Any = null,
    extension: String = null,
    path: String = null,
    responseType: XMLHttpRequestResponseType = null,
    url: String = null,
    xhrSettings: XHRSettingsObject | `false` = null
  ): FileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (path != null) __obj.updateDynamic("path")(path)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
}

