package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenePluginFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: String
  /**
    * If this plugin is to be added to the Scene, this is the property key for it.
    */
  var sceneKey: js.UndefOr[String] = js.undefined
  /**
    * If this plugin is to be added to Scene.Systems, this is the property key for it.
    */
  var systemKey: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the file from. Or, a Scene Plugin.
    */
  var url: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object ScenePluginFileConfig {
  @scala.inline
  def apply(
    key: String,
    extension: String = null,
    sceneKey: String = null,
    systemKey: String = null,
    url: String | js.Function = null,
    xhrSettings: XHRSettingsObject = null
  ): ScenePluginFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (sceneKey != null) __obj.updateDynamic("sceneKey")(sceneKey.asInstanceOf[js.Any])
    if (systemKey != null) __obj.updateDynamic("systemKey")(systemKey.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenePluginFileConfig]
  }
}

