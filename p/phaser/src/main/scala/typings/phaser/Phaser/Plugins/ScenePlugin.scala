package typings.phaser.Phaser.Plugins

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Scene Level Plugin is installed into every Scene and belongs to that Scene.
  * It can listen for Scene events and respond to them.
  * It can map itself to a Scene property, or into the Scene Systems, or both.
  */
@JSGlobal("Phaser.Plugins.ScenePlugin")
@js.native
class ScenePlugin protected () extends BasePlugin {
  /**
    * 
    * @param scene A reference to the Scene that has installed this plugin.
    * @param pluginManager A reference to the Plugin Manager.
    */
  def this(scene: Scene, pluginManager: PluginManager) = this()
  /**
    * A reference to the Scene that has installed this plugin.
    * Only set if it's a Scene Plugin, otherwise `null`.
    * This property is only set when the plugin is instantiated and added to the Scene, not before.
    * You can use it during the `boot` method.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Scene Systems of the Scene that has installed this plugin.
    * Only set if it's a Scene Plugin, otherwise `null`.
    * This property is only set when the plugin is instantiated and added to the Scene, not before.
    * You can use it during the `boot` method.
    */
  var systems: Systems = js.native
  /**
    * This method is called when the Scene boots. It is only ever called once.
    * 
    * By this point the plugin properties `scene` and `systems` will have already been set.
    * 
    * In here you can listen for {@link Phaser.Scenes.Events Scene events} and set-up whatever you need for this plugin to run.
    * Here are the Scene events you can listen to:
    * 
    * - start
    * - ready
    * - preupdate
    * - update
    * - postupdate
    * - resize
    * - pause
    * - resume
    * - sleep
    * - wake
    * - transitioninit
    * - transitionstart
    * - transitioncomplete
    * - transitionout
    * - shutdown
    * - destroy
    * 
    * At the very least you should offer a destroy handler for when the Scene closes down, i.e:
    * 
    * ```javascript
    * var eventEmitter = this.systems.events;
    * eventEmitter.once('destroy', this.sceneDestroy, this);
    * ```
    */
  def boot(): Unit = js.native
}

