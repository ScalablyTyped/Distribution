package typings.phaser.Phaser.Plugins

import typings.phaser.Phaser.Game
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Types.Plugins.GlobalPlugin
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait PluginManager extends js.Object {
  
  /**
    * Called by the Scene Systems class. Tells the plugin manager to install all Scene plugins into it.
    * 
    * First it will install global references, i.e. references from the Game systems into the Scene Systems (and Scene if mapped.)
    * Then it will install Core Scene Plugins followed by Scene Plugins registered with the PluginManager.
    * Finally it will install any references to Global Plugins that have a Scene mapping property into the Scene itself.
    * @param sys The Scene Systems class to install all the plugins in to.
    * @param globalPlugins An array of global plugins to install.
    * @param scenePlugins An array of scene plugins to install.
    */
  /* protected */ def addToScene(sys: Systems, globalPlugins: js.Array[_], scenePlugins: js.Array[_]): Unit = js.native
  
  /**
    * Run once the game has booted and installs all of the plugins configured in the Game Config.
    */
  /* protected */ def boot(): Unit = js.native
  
  /**
    * Destroys this Plugin Manager and all associated plugins.
    * It will iterate all plugins found and call their `destroy` methods.
    * 
    * The PluginCache will remove all custom plugins.
    */
  def destroy(): Unit = js.native
  
  /**
    * The game instance that owns this Plugin Manager.
    */
  var game: Game = js.native
  
  /**
    * Gets a global plugin from the Plugin Manager based on the given key and returns it.
    * 
    * If it cannot find an active plugin based on the key, but there is one in the Plugin Cache with the same key,
    * then it will create a new instance of the cached plugin and return that.
    * @param key The key of the plugin to get.
    * @param autoStart Automatically start a new instance of the plugin if found in the cache, but not actively running. Default true.
    */
  def get(key: String): BasePlugin | js.Function = js.native
  def get(key: String, autoStart: Boolean): BasePlugin | js.Function = js.native
  
  /**
    * Returns the plugin class from the cache.
    * Used internally by the Plugin Manager.
    * @param key The key of the plugin to get.
    */
  def getClass(key: String): BasePlugin = js.native
  
  /**
    * Called by the Scene Systems class. Returns a list of plugins to be installed.
    */
  /* protected */ def getDefaultScenePlugins(): js.Array[String] = js.native
  
  /**
    * Gets a global plugin based on the given key.
    * @param key The unique plugin key.
    */
  /* protected */ def getEntry(key: String): GlobalPlugin = js.native
  
  /**
    * Gets an index of a global plugin based on the given key.
    * @param key The unique plugin key.
    */
  /* protected */ def getIndex(key: String): integer = js.native
  
  /**
    * Installs a new Global Plugin into the Plugin Manager and optionally starts it running.
    * A global plugin belongs to the Plugin Manager, rather than a specific Scene, and can be accessed
    * and used by all Scenes in your game.
    * 
    * The `key` property is what you use to access this plugin from the Plugin Manager.
    * 
    * ```javascript
    * this.plugins.install('powerupsPlugin', pluginCode);
    * 
    * // and from within the scene:
    * this.plugins.get('powerupsPlugin');
    * ```
    * 
    * This method is called automatically by Phaser if you install your plugins using either the
    * Game Configuration object, or by preloading them via the Loader.
    * 
    * The same plugin can be installed multiple times into the Plugin Manager by simply giving each
    * instance its own unique key.
    * @param key The unique handle given to this plugin within the Plugin Manager.
    * @param plugin The plugin code. This should be the non-instantiated version.
    * @param start Automatically start the plugin running? This is always `true` if you provide a mapping value. Default false.
    * @param mapping If this plugin is injected into the Phaser.Scene class, this is the property key to use.
    * @param data A value passed to the plugin's `init` method.
    */
  def install(key: String, plugin: js.Function): BasePlugin = js.native
  def install(
    key: String,
    plugin: js.Function,
    start: js.UndefOr[scala.Nothing],
    mapping: js.UndefOr[scala.Nothing],
    data: js.Any
  ): BasePlugin = js.native
  def install(key: String, plugin: js.Function, start: js.UndefOr[scala.Nothing], mapping: String): BasePlugin = js.native
  def install(key: String, plugin: js.Function, start: js.UndefOr[scala.Nothing], mapping: String, data: js.Any): BasePlugin = js.native
  def install(key: String, plugin: js.Function, start: Boolean): BasePlugin = js.native
  def install(key: String, plugin: js.Function, start: Boolean, mapping: js.UndefOr[scala.Nothing], data: js.Any): BasePlugin = js.native
  def install(key: String, plugin: js.Function, start: Boolean, mapping: String): BasePlugin = js.native
  def install(key: String, plugin: js.Function, start: Boolean, mapping: String, data: js.Any): BasePlugin = js.native
  
  /**
    * Installs a new Scene Plugin into the Plugin Manager and optionally adds it
    * to the given Scene as well. A Scene Plugin added to the manager in this way
    * will be automatically installed into all new Scenes using the key and mapping given.
    * 
    * The `key` property is what the plugin is injected into Scene.Systems as.
    * The `mapping` property is optional, and if specified is what the plugin is installed into
    * the Scene as. For example:
    * 
    * ```javascript
    * this.plugins.installScenePlugin('powerupsPlugin', pluginCode, 'powerups');
    * 
    * // and from within the scene:
    * this.sys.powerupsPlugin; // key value
    * this.powerups; // mapping value
    * ```
    * 
    * This method is called automatically by Phaser if you install your plugins using either the
    * Game Configuration object, or by preloading them via the Loader.
    * @param key The property key that will be used to add this plugin to Scene.Systems.
    * @param plugin The plugin code. This should be the non-instantiated version.
    * @param mapping If this plugin is injected into the Phaser.Scene class, this is the property key to use.
    * @param addToScene Optionally automatically add this plugin to the given Scene.
    * @param fromLoader Is this being called by the Loader? Default false.
    */
  def installScenePlugin(key: String, plugin: js.Function): Unit = js.native
  def installScenePlugin(
    key: String,
    plugin: js.Function,
    mapping: js.UndefOr[scala.Nothing],
    addToScene: js.UndefOr[scala.Nothing],
    fromLoader: Boolean
  ): Unit = js.native
  def installScenePlugin(key: String, plugin: js.Function, mapping: js.UndefOr[scala.Nothing], addToScene: Scene): Unit = js.native
  def installScenePlugin(
    key: String,
    plugin: js.Function,
    mapping: js.UndefOr[scala.Nothing],
    addToScene: Scene,
    fromLoader: Boolean
  ): Unit = js.native
  def installScenePlugin(key: String, plugin: js.Function, mapping: String): Unit = js.native
  def installScenePlugin(
    key: String,
    plugin: js.Function,
    mapping: String,
    addToScene: js.UndefOr[scala.Nothing],
    fromLoader: Boolean
  ): Unit = js.native
  def installScenePlugin(key: String, plugin: js.Function, mapping: String, addToScene: Scene): Unit = js.native
  def installScenePlugin(key: String, plugin: js.Function, mapping: String, addToScene: Scene, fromLoader: Boolean): Unit = js.native
  
  /**
    * Checks if the given global plugin, based on its key, is active or not.
    * @param key The unique plugin key.
    */
  def isActive(key: String): Boolean = js.native
  
  /**
    * The global plugins currently running and managed by this Plugin Manager.
    * A plugin must have been started at least once in order to appear in this list.
    */
  var plugins: js.Array[GlobalPlugin] = js.native
  
  /**
    * Registers a new file type with the global File Types Manager, making it available to all Loader
    * Plugins created after this.
    * 
    * This is usually called from within your Plugin code and is a helpful short-cut for creating
    * new loader file types.
    * 
    * The key is the property that will be injected into the Loader Plugin and used to load the
    * files. For example:
    * 
    * ```javascript
    * this.plugins.registerFileType('wad', doomWadLoaderCallback);
    * // later in your preload code:
    * this.load.wad();
    * ```
    * 
    * The callback is what is called when the loader tries to load a file  matching the given key.
    * It's important to understand that the callback is invoked within
    * the context of the LoaderPlugin. In this context there are several properties / methods available
    * to use:
    * 
    * this.addFile - A method to add the new file to the load queue.
    * this.scene - The Scene that owns the Loader Plugin instance.
    * 
    * See the LoaderPlugin class for more details. Any public property or method listed is available from
    * your callback under `this`.
    * @param key The key of the Game Object that the given callbacks will create, i.e. `image`, `sprite`.
    * @param callback The callback to invoke when the Game Object Factory is called.
    * @param addToScene Optionally add this file type into the Loader Plugin owned by the given Scene.
    */
  def registerFileType(key: String, callback: js.Function): Unit = js.native
  def registerFileType(key: String, callback: js.Function, addToScene: Scene): Unit = js.native
  
  /**
    * Registers a new type of Game Object with the global Game Object Factory and / or Creator.
    * This is usually called from within your Plugin code and is a helpful short-cut for creating
    * new Game Objects.
    * 
    * The key is the property that will be injected into the factories and used to create the
    * Game Object. For example:
    * 
    * ```javascript
    * this.plugins.registerGameObject('clown', clownFactoryCallback, clownCreatorCallback);
    * // later in your game code:
    * this.add.clown();
    * this.make.clown();
    * ```
    * 
    * The callbacks are what are called when the factories try to create a Game Object
    * matching the given key. It's important to understand that the callbacks are invoked within
    * the context of the GameObjectFactory. In this context there are several properties available
    * to use:
    * 
    * this.scene - A reference to the Scene that owns the GameObjectFactory.
    * this.displayList - A reference to the Display List the Scene owns.
    * this.updateList - A reference to the Update List the Scene owns.
    * 
    * See the GameObjectFactory and GameObjectCreator classes for more details.
    * Any public property or method listed is available from your callbacks under `this`.
    * @param key The key of the Game Object that the given callbacks will create, i.e. `image`, `sprite`.
    * @param factoryCallback The callback to invoke when the Game Object Factory is called.
    * @param creatorCallback The callback to invoke when the Game Object Creator is called.
    */
  def registerGameObject(key: String): Unit = js.native
  def registerGameObject(key: String, factoryCallback: js.UndefOr[scala.Nothing], creatorCallback: js.Function): Unit = js.native
  def registerGameObject(key: String, factoryCallback: js.Function): Unit = js.native
  def registerGameObject(key: String, factoryCallback: js.Function, creatorCallback: js.Function): Unit = js.native
  
  /**
    * Removes a previously registered Game Object from the global Game Object Factory and / or Creator.
    * This is usually called from within your Plugin destruction code to help clean-up after your plugin has been removed.
    * @param key The key of the Game Object to be removed from the factories.
    * @param removeFromFactory Should the Game Object be removed from the Game Object Factory? Default true.
    * @param removeFromCreator Should the Game Object be removed from the Game Object Creator? Default true.
    */
  def removeGameObject(key: String): Unit = js.native
  def removeGameObject(key: String, removeFromFactory: js.UndefOr[scala.Nothing], removeFromCreator: Boolean): Unit = js.native
  def removeGameObject(key: String, removeFromFactory: Boolean): Unit = js.native
  def removeGameObject(key: String, removeFromFactory: Boolean, removeFromCreator: Boolean): Unit = js.native
  
  /**
    * Removes a global plugin from the Plugin Manager and Plugin Cache.
    * 
    * It is up to you to remove all references to this plugin that you may hold within your game code.
    * @param key The key of the plugin to remove.
    */
  def removeGlobalPlugin(key: String): Unit = js.native
  
  /**
    * Removes a scene plugin from the Plugin Manager and Plugin Cache.
    * 
    * This will not remove the plugin from any active Scenes that are already using it.
    * 
    * It is up to you to remove all references to this plugin that you may hold within your game code.
    * @param key The key of the plugin to remove.
    */
  def removeScenePlugin(key: String): Unit = js.native
  
  /**
    * A list of plugin keys that should be installed into Scenes as well as the Core Plugins.
    */
  var scenePlugins: js.Array[String] = js.native
  
  /**
    * Starts a global plugin running.
    * 
    * If the plugin was previously active then calling `start` will reset it to an active state and then
    * call its `start` method.
    * 
    * If the plugin has never been run before a new instance of it will be created within the Plugin Manager,
    * its active state set and then both of its `init` and `start` methods called, in that order.
    * 
    * If the plugin is already running under the given key then nothing happens.
    * @param key The key of the plugin to start.
    * @param runAs Run the plugin under a new key. This allows you to run one plugin multiple times.
    */
  def start(key: String): BasePlugin = js.native
  def start(key: String, runAs: String): BasePlugin = js.native
  
  /**
    * Stops a global plugin from running.
    * 
    * If the plugin is active then its active state will be set to false and the plugins `stop` method
    * will be called.
    * 
    * If the plugin is not already running, nothing will happen.
    * @param key The key of the plugin to stop.
    */
  def stop(key: String): this.type = js.native
}
