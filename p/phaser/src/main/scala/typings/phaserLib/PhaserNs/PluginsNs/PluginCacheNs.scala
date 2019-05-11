package typings
package phaserLib.PhaserNs.PluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Plugins.PluginCache")
@js.native
object PluginCacheNs extends js.Object {
  /**
    * Removes all Core Plugins.
    * 
    * This includes all of the internal system plugins that Phaser needs, like the Input Plugin and Loader Plugin.
    * So be sure you only call this if you do not wish to run Phaser again.
    */
  def destroyCorePlugins(): scala.Unit = js.native
  /**
    * Removes all Custom Plugins.
    */
  def destroyCustomPlugins(): scala.Unit = js.native
  /**
    * Returns the core plugin object from the cache based on the given key.
    * @param key The key of the core plugin to get.
    */
  def getCore(key: java.lang.String): phaserLib.PhaserNs.TypesNs.PluginsNs.CorePluginContainer = js.native
  /**
    * Returns the custom plugin object from the cache based on the given key.
    * @param key The key of the custom plugin to get.
    */
  def getCustom(key: java.lang.String): phaserLib.PhaserNs.TypesNs.PluginsNs.CustomPluginContainer = js.native
  /**
    * Returns an object from the custom cache based on the given key that can be instantiated.
    * @param key The key of the custom plugin to get.
    */
  def getCustomClass(key: java.lang.String): js.Function = js.native
  /**
    * Checks if the given key is already being used in the core plugin cache.
    * @param key The key to check for.
    */
  def hasCore(key: java.lang.String): scala.Boolean = js.native
  /**
    * Checks if the given key is already being used in the custom plugin cache.
    * @param key The key to check for.
    */
  def hasCustom(key: java.lang.String): scala.Boolean = js.native
  /**
    * Static method called directly by the Core internal Plugins.
    * Key is a reference used to get the plugin from the plugins object (i.e. InputPlugin)
    * Plugin is the object to instantiate to create the plugin
    * Mapping is what the plugin is injected into the Scene.Systems as (i.e. input)
    * @param key A reference used to get this plugin from the plugin cache.
    * @param plugin The plugin to be stored. Should be the core object, not instantiated.
    * @param mapping If this plugin is to be injected into the Scene Systems, this is the property key map used.
    * @param custom Core Scene plugin or a Custom Scene plugin? Default false.
    */
  def register(key: java.lang.String, plugin: js.Function, mapping: java.lang.String): scala.Unit = js.native
  def register(key: java.lang.String, plugin: js.Function, mapping: java.lang.String, custom: scala.Boolean): scala.Unit = js.native
  /**
    * Stores a custom plugin in the global plugin cache.
    * The key must be unique, within the scope of the cache.
    * @param key A reference used to get this plugin from the plugin cache.
    * @param plugin The plugin to be stored. Should be the core object, not instantiated.
    * @param mapping If this plugin is to be injected into the Scene Systems, this is the property key map used.
    * @param data A value to be passed to the plugin's `init` method.
    */
  def registerCustom(key: java.lang.String, plugin: js.Function, mapping: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
    * Removes a core plugin based on the given key.
    * @param key The key of the core plugin to remove.
    */
  def remove(key: java.lang.String): scala.Unit = js.native
  /**
    * Removes a custom plugin based on the given key.
    * @param key The key of the custom plugin to remove.
    */
  def removeCustom(key: java.lang.String): scala.Unit = js.native
}

