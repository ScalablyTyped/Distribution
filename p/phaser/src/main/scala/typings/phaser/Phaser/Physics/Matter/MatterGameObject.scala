package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.Body
import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Matter.MatterGameObject")
@js.native
object MatterGameObject extends js.Object {
  /**
    * [description]
    * @param world The Matter world to add the body to.
    * @param gameObject The Game Object that will have the Matter body applied to it.
    * @param options A Matter Body configuration object, or an instance of a Matter Body.
    */
  def apply(world: World, gameObject: GameObject, options: js.Object): GameObject = js.native
  def apply(world: World, gameObject: GameObject, options: Body): GameObject = js.native
}

