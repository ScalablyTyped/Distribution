package typings.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginObjectItem extends js.Object {
  /**
    * Arbitrary data passed to the plugin's init() method.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * A key to identify the plugin in the Plugin Manager.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.native
  /**
    * The plugin itself. Usually a class/constructor.
    */
  var plugin: js.UndefOr[js.Any] = js.native
  /**
    * For a scene plugin, add the plugin to the scene object under this key (`this.KEY`, from the scene).
    */
  var sceneKey: js.UndefOr[String] = js.native
  /**
    * Whether the plugin should be started automatically.
    */
  var start: js.UndefOr[Boolean] = js.native
  /**
    * For a scene plugin, add the plugin to the scene's systems object under this key (`this.sys.KEY`, from the scene).
    */
  var systemKey: js.UndefOr[String] = js.native
}

object PluginObjectItem {
  @scala.inline
  def apply(): PluginObjectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginObjectItem]
  }
  @scala.inline
  implicit class PluginObjectItemOps[Self <: PluginObjectItem] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMapping(value: String): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    @scala.inline
    def setPlugin(value: js.Any): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setSceneKey(value: String): Self = this.set("sceneKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSceneKey: Self = this.set("sceneKey", js.undefined)
    @scala.inline
    def setStart(value: Boolean): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemKey: Self = this.set("systemKey", js.undefined)
  }
  
}

