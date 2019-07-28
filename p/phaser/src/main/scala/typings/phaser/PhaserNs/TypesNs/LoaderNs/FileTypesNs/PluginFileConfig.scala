package typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: String
  /**
    * If this plugin is to be injected into the Scene, this is the property key used.
    */
  var mapping: js.UndefOr[String] = js.undefined
  /**
    * Automatically start the plugin after loading?
    */
  var start: js.UndefOr[Boolean] = js.undefined
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object PluginFileConfig {
  @scala.inline
  def apply(
    key: String,
    extension: String = null,
    mapping: String = null,
    start: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    xhrSettings: XHRSettingsObject = null
  ): PluginFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[PluginFileConfig]
  }
}

