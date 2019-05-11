package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiScriptFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: java.lang.String
  /**
    * An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
    */
  var url: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Extra XHR Settings specifically for these files.
    */
  var xhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object MultiScriptFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    extension: java.lang.String = null,
    url: js.Array[java.lang.String] = null,
    xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): MultiScriptFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[MultiScriptFileConfig]
  }
}

