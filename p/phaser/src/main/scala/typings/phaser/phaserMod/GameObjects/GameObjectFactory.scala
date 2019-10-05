package typings.phaser.phaserMod.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Game Object Factory is a Scene plugin that allows you to quickly create many common
  * types of Game Objects and have them automatically registered with the Scene.
  * 
  * Game Objects directly register themselves with the Factory and inject their own creation
  * methods into the class.
  */
@JSImport("phaser", "GameObjects.GameObjectFactory")
@js.native
class GameObjectFactory protected ()
  extends typings.phaser.Phaser.GameObjects.GameObjectFactory {
  /**
    * 
    * @param scene The Scene to which this Game Object Factory belongs.
    */
  def this(scene: typings.phaser.Phaser.Scene) = this()
}

