package typings.phaser.Phaser.Plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultPlugins extends js.Object {
  /**
    * These are the core plugins that are installed into every Scene.Systems instance, no matter what.
    */
  var CoreScene: js.Array[_]
  /**
    * These plugins are created in Scene.Systems in addition to the CoreScenePlugins.
    */
  var DefaultScene: js.Array[_]
  /**
    * These are the Global Managers that are created by the Phaser.Game instance.
    */
  var Global: js.Array[_]
}

object DefaultPlugins {
  @scala.inline
  def apply(CoreScene: js.Array[_], DefaultScene: js.Array[_], Global: js.Array[_]): DefaultPlugins = {
    val __obj = js.Dynamic.literal(CoreScene = CoreScene, DefaultScene = DefaultScene, Global = Global)
  
    __obj.asInstanceOf[DefaultPlugins]
  }
}

