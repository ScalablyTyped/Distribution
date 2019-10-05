package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiScriptFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: String
  /**
    * An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
    */
  var url: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Extra XHR Settings specifically for these files.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object MultiScriptFileConfig {
  @scala.inline
  def apply(
    key: String,
    extension: String = null,
    url: js.Array[String] = null,
    xhrSettings: XHRSettingsObject = null
  ): MultiScriptFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[MultiScriptFileConfig]
  }
}

