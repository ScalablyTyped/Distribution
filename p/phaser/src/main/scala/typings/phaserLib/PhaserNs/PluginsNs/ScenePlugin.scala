package typings
package phaserLib.PhaserNs.PluginsNs

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
  def this(scene: phaserLib.PhaserNs.Scene, pluginManager: PluginManager) = this()
}

