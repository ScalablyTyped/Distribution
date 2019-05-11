package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: java.lang.String
  /**
    * If this plugin is to be injected into the Scene, this is the property key used.
    */
  var mapping: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Automatically start the plugin after loading?
    */
  var start: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object PluginFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    extension: java.lang.String = null,
    mapping: java.lang.String = null,
    start: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
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

