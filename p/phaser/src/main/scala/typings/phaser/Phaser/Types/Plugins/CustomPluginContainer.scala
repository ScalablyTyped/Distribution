package typings.phaser.Phaser.Types.Plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPluginContainer extends js.Object {
  /**
    * The unique name of this plugin in the custom plugin cache.
    */
  var key: String = js.native
  /**
    * The plugin to be stored. Should be the source object, not instantiated.
    */
  var plugin: js.Function = js.native
}

object CustomPluginContainer {
  @scala.inline
  def apply(key: String, plugin: js.Function): CustomPluginContainer = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPluginContainer]
  }
  @scala.inline
  implicit class CustomPluginContainerOps[Self <: CustomPluginContainer] (val x: Self) extends AnyVal {
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
  }
  
}

