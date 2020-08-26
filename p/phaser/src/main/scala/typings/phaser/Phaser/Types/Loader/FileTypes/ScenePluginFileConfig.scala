package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScenePluginFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: String = js.native
  /**
    * If this plugin is to be added to the Scene, this is the property key for it.
    */
  var sceneKey: js.UndefOr[String] = js.native
  /**
    * If this plugin is to be added to Scene.Systems, this is the property key for it.
    */
  var systemKey: js.UndefOr[String] = js.native
  /**
    * The absolute or relative URL to load the file from. Or, a Scene Plugin.
    */
  var url: js.UndefOr[String | js.Function] = js.native
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}

object ScenePluginFileConfig {
  @scala.inline
  def apply(key: String): ScenePluginFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenePluginFileConfig]
  }
  @scala.inline
  implicit class ScenePluginFileConfigOps[Self <: ScenePluginFileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setSceneKey(value: String): Self = this.set("sceneKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSceneKey: Self = this.set("sceneKey", js.undefined)
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemKey: Self = this.set("systemKey", js.undefined)
    @scala.inline
    def setUrl(value: String | js.Function): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = this.set("xhrSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrSettings: Self = this.set("xhrSettings", js.undefined)
  }
  
}

