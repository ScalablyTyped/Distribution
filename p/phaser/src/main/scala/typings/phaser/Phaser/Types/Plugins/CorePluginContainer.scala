package typings.phaser.Phaser.Types.Plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorePluginContainer extends js.Object {
  /**
    * Core Scene plugin or a Custom Scene plugin?
    */
  var custom: js.UndefOr[Boolean] = js.native
  /**
    * The unique name of this plugin in the core plugin cache.
    */
  var key: String = js.native
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.native
  /**
    * The plugin to be stored. Should be the source object, not instantiated.
    */
  var plugin: js.Function = js.native
}

object CorePluginContainer {
  @scala.inline
  def apply(key: String, plugin: js.Function): CorePluginContainer = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorePluginContainer]
  }
  @scala.inline
  implicit class CorePluginContainerOps[Self <: CorePluginContainer] (val x: Self) extends AnyVal {
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
    def setPlugin(value: js.Function): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setMapping(value: String): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
  }
  
}

