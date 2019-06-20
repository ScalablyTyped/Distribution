package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs

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
  def MatterGameObject(world: World, gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject, options: js.Object): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def MatterGameObject(
    world: World,
    gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    options: phaserLib.MatterJSNs.Body
  ): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}

