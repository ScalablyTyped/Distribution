package typings.phaser.PhaserNs.PluginsNs

import typings.phaser.PhaserNs.Game
import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.ScenesNs.Systems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Global Plugin is installed just once into the Game owned Plugin Manager.
  * It can listen for Game events and respond to them.
  */
@JSGlobal("Phaser.Plugins.BasePlugin")
@js.native
class BasePlugin protected () extends js.Object {
  /**
    * 
    * @param pluginManager A reference to the Plugin Manager.
    */
  def this(pluginManager: PluginManager) = this()
  /**
    * A reference to the Game instance this plugin is running under.
    */
  var game: Game = js.native
  /**
    * A handy reference to the Plugin Manager that is responsible for this plugin.
    * Can be used as a route to gain access to game systems and  events.
    */
  var pluginManager: PluginManager = js.native
  /**
    * A reference to the Scene that has installed this plugin.
    * Only set if it's a Scene Plugin, otherwise `null`.
    * This property is only set when the plugin is instantiated and added to the Scene, not before.
    * You cannot use it during the `init` method, but you can during the `boot` method.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Scene Systems of the Scene that has installed this plugin.
    * Only set if it's a Scene Plugin, otherwise `null`.
    * This property is only set when the plugin is instantiated and added to the Scene, not before.
    * You cannot use it during the `init` method, but you can during the `boot` method.
    */
  var systems: Systems = js.native
  /**
    * If this is a Scene Plugin (i.e. installed into a Scene) then this method is called when the Scene boots.
    * By this point the plugin properties `scene` and `systems` will have already been set.
    * In here you can listen for Scene events and set-up whatever you need for this plugin to run.
    */
  def boot(): Unit = js.native
  /**
    * Game instance has been destroyed.
    * You must release everything in here, all references, all objects, free it all up.
    */
  def destroy(): Unit = js.native
  /**
    * Called by the PluginManager when this plugin is first instantiated.
    * It will never be called again on this instance.
    * In here you can set-up whatever you need for this plugin to run.
    * If a plugin is set to automatically start then `BasePlugin.start` will be called immediately after this.
    * @param data A value specified by the user, if any, from the `data` property of the plugin's configuration object (if started at game boot) or passed in the PluginManager's `install` method (if started manually).
    */
  def init(): Unit = js.native
  def init(data: js.Any): Unit = js.native
  /**
    * Called by the PluginManager when this plugin is started.
    * If a plugin is stopped, and then started again, this will get called again.
    * Typically called immediately after `BasePlugin.init`.
    */
  def start(): Unit = js.native
  /**
    * Called by the PluginManager when this plugin is stopped.
    * The game code has requested that your plugin stop doing whatever it does.
    * It is now considered as 'inactive' by the PluginManager.
    * Handle that process here (i.e. stop listening for events, etc)
    * If the plugin is started again then `BasePlugin.start` will be called again.
    */
  def stop(): Unit = js.native
}

