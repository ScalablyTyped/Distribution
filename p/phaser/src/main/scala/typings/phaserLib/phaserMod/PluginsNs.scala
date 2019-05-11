package typings
package phaserLib.phaserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Plugins")
@js.native
object PluginsNs extends js.Object {
  /**
    * A Global Plugin is installed just once into the Game owned Plugin Manager.
    * It can listen for Game events and respond to them.
    */
  @js.native
  class BasePlugin protected ()
    extends phaserLib.PhaserNs.PluginsNs.BasePlugin {
    /**
      * 
      * @param pluginManager A reference to the Plugin Manager.
      */
    def this(pluginManager: phaserLib.PhaserNs.PluginsNs.PluginManager) = this()
  }
  
  /**
    * The PluginManager is responsible for installing and adding plugins to Phaser.
    * 
    * It is a global system and therefore belongs to the Game instance, not a specific Scene.
    * 
    * It works in conjunction with the PluginCache. Core internal plugins automatically register themselves 
    * with the Cache, but it's the Plugin Manager that is responsible for injecting them into the Scenes.
    * 
    * There are two types of plugin:
    * 
    * 1. A Global Plugin
    * 2. A Scene Plugin
    * 
    * A Global Plugin is a plugin that lives within the Plugin Manager rather than a Scene. You can get
    * access to it by calling `PluginManager.get` and providing a key. Any Scene that requests a plugin in
    * this way will all get access to the same plugin instance, allowing you to use a single plugin across
    * multiple Scenes.
    * 
    * A Scene Plugin is a plugin dedicated to running within a Scene. These are different to Global Plugins
    * in that their instances do not live within the Plugin Manager, but within the Scene Systems class instead.
    * And that every Scene created is given its own unique instance of a Scene Plugin. Examples of core Scene
    * Plugins include the Input Plugin, the Tween Plugin and the physics Plugins.
    * 
    * You can add a plugin to Phaser in three different ways:
    * 
    * 1. Preload it
    * 2. Include it in your source code and install it via the Game Config
    * 3. Include it in your source code and install it within a Scene
    * 
    * For examples of all of these approaches please see the Phaser 3 Examples Repo `plugins` folder.
    * 
    * For information on creating your own plugin please see the Phaser 3 Plugin Template.
    */
  @js.native
  class PluginManager protected ()
    extends phaserLib.PhaserNs.PluginsNs.PluginManager {
    /**
      * 
      * @param game The game instance that owns this Plugin Manager.
      */
    def this(game: phaserLib.PhaserNs.Game) = this()
  }
  
  /**
    * A Scene Level Plugin is installed into every Scene and belongs to that Scene.
    * It can listen for Scene events and respond to them.
    * It can map itself to a Scene property, or into the Scene Systems, or both.
    */
  @js.native
  class ScenePlugin protected ()
    extends phaserLib.PhaserNs.PluginsNs.ScenePlugin {
    /**
      * 
      * @param scene A reference to the Scene that has installed this plugin.
      * @param pluginManager A reference to the Plugin Manager.
      */
    def this(scene: phaserLib.PhaserNs.Scene, pluginManager: phaserLib.PhaserNs.PluginsNs.PluginManager) = this()
  }
  
  /**
    * These are the core plugins that are installed into every Scene.Systems instance, no matter what.
    * They are optionally exposed in the Scene as well (see the InjectionMap for details)
    * 
    * They are created in the order in which they appear in this array and EventEmitter is always first.
    */
  var CoreScene: js.Array[js.Any] = js.native
  /**
    * These plugins are created in Scene.Systems in addition to the CoreScenePlugins.
    * 
    * You can elect not to have these plugins by either creating a DefaultPlugins object as part
    * of the Game Config, by creating a Plugins object as part of a Scene Config, or by modifying this array
    * and building your own bundle.
    * 
    * They are optionally exposed in the Scene as well (see the InjectionMap for details)
    * 
    * They are always created in the order in which they appear in the array.
    */
  var DefaultScene: js.Array[js.Any] = js.native
  /**
    * These are the Global Managers that are created by the Phaser.Game instance.
    * They are referenced from Scene.Systems so that plugins can use them.
    */
  var Global: js.Array[js.Any] = js.native
  @JSName("PluginCache")
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
  
}

