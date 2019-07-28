package typings.phaser.PhaserNs.PhysicsNs.MatterNs

import typings.phaser.MatterJSNs.Body
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Matter")
@js.native
object ^ extends js.Object {
  /**
    * [description]
    * @param world The Matter world to add the body to.
    * @param gameObject The Game Object that will have the Matter body applied to it.
    * @param options A Matter Body configuration object, or an instance of a Matter Body.
    */
  def MatterGameObject(world: World, gameObject: GameObject, options: js.Object): GameObject = js.native
  def MatterGameObject(world: World, gameObject: GameObject, options: Body): GameObject = js.native
}

