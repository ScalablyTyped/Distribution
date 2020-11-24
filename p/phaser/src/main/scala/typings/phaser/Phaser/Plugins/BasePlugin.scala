package typings.phaser.Phaser.Plugins

import typings.phaser.Phaser.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Global Plugin is installed just once into the Game owned Plugin Manager.
  * It can listen for Game events and respond to them.
  */
@js.native
trait BasePlugin extends js.Object {
  
  /**
    * Game instance has been destroyed.
    * You must release everything in here, all references, all objects, free it all up.
    */
  def destroy(): Unit = js.native
  
  /**
    * A reference to the Game instance this plugin is running under.
    */
  var game: Game = js.native
  
  /**
    * The PluginManager calls this method on a Global Plugin when the plugin is first instantiated.
    * It will never be called again on this instance.
    * In here you can set-up whatever you need for this plugin to run.
    * If a plugin is set to automatically start then `BasePlugin.start` will be called immediately after this.
    * On a Scene Plugin, this method is never called. Use {@link Phaser.Plugins.ScenePlugin#boot} instead.
    * @param data A value specified by the user, if any, from the `data` property of the plugin's configuration object (if started at game boot) or passed in the PluginManager's `install` method (if started manually).
    */
  def init(): Unit = js.native
  def init(data: js.Any): Unit = js.native
  
  /**
    * A handy reference to the Plugin Manager that is responsible for this plugin.
    * Can be used as a route to gain access to game systems and  events.
    */
  var pluginManager: PluginManager = js.native
  
  /**
    * The PluginManager calls this method on a Global Plugin when the plugin is started.
    * If a plugin is stopped, and then started again, this will get called again.
    * Typically called immediately after `BasePlugin.init`.
    * On a Scene Plugin, this method is never called.
    */
  def start(): Unit = js.native
  
  /**
    * The PluginManager calls this method on a Global Plugin when the plugin is stopped.
    * The game code has requested that your plugin stop doing whatever it does.
    * It is now considered as 'inactive' by the PluginManager.
    * Handle that process here (i.e. stop listening for events, etc)
    * If the plugin is started again then `BasePlugin.start` will be called again.
    * On a Scene Plugin, this method is never called.
    */
  def stop(): Unit = js.native
}
