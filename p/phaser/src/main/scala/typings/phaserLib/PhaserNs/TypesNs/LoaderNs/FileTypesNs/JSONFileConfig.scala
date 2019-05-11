package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFileConfig extends js.Object {
  /**
    * If specified instead of the whole JSON file being parsed and added to the Cache, only the section corresponding to this property key will be added. If the property you want to extract is nested, use periods to divide it.
    */
  var dataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the JSON Cache.
    */
  var key: java.lang.String
  /**
    * The absolute or relative URL to load the file from. Or can be a ready formed JSON object, in which case it will be directly added to the Cache.
    */
  var url: js.UndefOr[java.lang.String | js.Any] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object JSONFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    dataKey: java.lang.String = null,
    extension: java.lang.String = null,
    url: java.lang.String | js.Any = null,
    xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): JSONFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[JSONFileConfig]
  }
}

