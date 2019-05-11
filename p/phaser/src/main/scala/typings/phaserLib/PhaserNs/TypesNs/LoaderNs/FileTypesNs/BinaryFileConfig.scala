package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryFileConfig extends js.Object {
  /**
    * Optional type to cast the binary file to once loaded. For example, `Uint8Array`.
    */
  var dataType: js.UndefOr[js.Any] = js.undefined
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Binary Cache.
    */
  var key: java.lang.String
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object BinaryFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    dataType: js.Any = null,
    extension: java.lang.String = null,
    url: java.lang.String = null,
    xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): BinaryFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[BinaryFileConfig]
  }
}

