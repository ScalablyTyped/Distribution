package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenePluginFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: java.lang.String
  /**
    * If this plugin is to be added to the Scene, this is the property key for it.
    */
  var sceneKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this plugin is to be added to Scene.Systems, this is the property key for it.
    */
  var systemKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute or relative URL to load the file from. Or, a Scene Plugin.
    */
  var url: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object ScenePluginFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    extension: java.lang.String = null,
    sceneKey: java.lang.String = null,
    systemKey: java.lang.String = null,
    url: java.lang.String | js.Function = null,
    xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): ScenePluginFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (sceneKey != null) __obj.updateDynamic("sceneKey")(sceneKey)
    if (systemKey != null) __obj.updateDynamic("systemKey")(systemKey)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[ScenePluginFileConfig]
  }
}

