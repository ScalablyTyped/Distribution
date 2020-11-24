package typings.phaser.phaserMod.Input

import typings.phaser.Phaser.Types.Input.InputPluginContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Input.InputPluginCache")
@js.native
object InputPluginCache extends js.Object {
  
  /**
    * Returns the input plugin object from the cache based on the given key.
    * @param key The key of the input plugin to get.
    */
  def getCore(key: String): InputPluginContainer = js.native
  
  /**
    * Installs all of the registered Input Plugins into the given target.
    * @param target The target InputPlugin to install the plugins into.
    */
  def install(target: typings.phaser.Phaser.Input.InputPlugin): Unit = js.native
  
  /**
    * Static method called directly by the Core internal Plugins.
    * Key is a reference used to get the plugin from the plugins object (i.e. InputPlugin)
    * Plugin is the object to instantiate to create the plugin
    * Mapping is what the plugin is injected into the Scene.Systems as (i.e. input)
    * @param key A reference used to get this plugin from the plugin cache.
    * @param plugin The plugin to be stored. Should be the core object, not instantiated.
    * @param mapping If this plugin is to be injected into the Input Plugin, this is the property key used.
    * @param settingsKey The key in the Scene Settings to check to see if this plugin should install or not.
    * @param configKey The key in the Game Config to check to see if this plugin should install or not.
    */
  def register(key: String, plugin: js.Function, mapping: String, settingsKey: String, configKey: String): Unit = js.native
  
  /**
    * Removes an input plugin based on the given key.
    * @param key The key of the input plugin to remove.
    */
  def remove(key: String): Unit = js.native
}
