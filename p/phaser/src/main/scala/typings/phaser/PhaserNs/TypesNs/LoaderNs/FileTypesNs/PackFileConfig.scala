package typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackFileConfig extends js.Object {
  /**
    * If specified instead of the whole JSON file being parsed, only the section corresponding to this property key will be added. If the property you want to extract is nested, use periods to divide it.
    */
  var dataKey: js.UndefOr[String] = js.undefined
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the JSON Cache.
    */
  var key: String
  /**
    * The absolute or relative URL to load the file from. Or can be a ready formed JSON object, in which case it will be directly processed.
    */
  var url: js.UndefOr[String | js.Any] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object PackFileConfig {
  @scala.inline
  def apply(
    key: String,
    dataKey: String = null,
    extension: String = null,
    url: String | js.Any = null,
    xhrSettings: XHRSettingsObject = null
  ): PackFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[PackFileConfig]
  }
}

