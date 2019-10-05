package typings.phaser.Phaser.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.InputPluginCache")
@js.native
object InputPluginCache extends js.Object {
  /**
    * Returns the input plugin object from the cache based on the given key.
    */
  var getCore: js.Function = js.native
  /**
    * Installs all of the registered Input Plugins into the given target.
    */
  var install: js.Function = js.native
  /**
    * Static method called directly by the Core internal Plugins.
    * Key is a reference used to get the plugin from the plugins object (i.e. InputPlugin)
    * Plugin is the object to instantiate to create the plugin
    * Mapping is what the plugin is injected into the Scene.Systems as (i.e. input)
    */
  var register: js.Function = js.native
  /**
    * Removes an input plugin based on the given key.
    */
  var remove: js.Function = js.native
}

