package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.Body
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Matter.MatterGameObject")
@js.native
object MatterGameObject extends js.Object {
  /**
    * A Matter Game Object is a generic object that allows you to combine any Phaser Game Object,
    * including those you have extended or created yourself, with all of the Matter Components.
    * 
    * This enables you to use component methods such as `setVelocity` or `isSensor` directly from
    * this Game Object.
    * @param world The Matter world to add the body to.
    * @param gameObject The Game Object that will have the Matter body applied to it.
    * @param options A Matter Body configuration object, or an instance of a Matter Body.
    * @param addToWorld Should the newly created body be immediately added to the World? Default true.
    */
  def apply(world: World, gameObject: GameObject): GameObject = js.native
  def apply(world: World, gameObject: GameObject, options: Body): GameObject = js.native
  def apply(world: World, gameObject: GameObject, options: Body, addToWorld: Boolean): GameObject = js.native
  def apply(world: World, gameObject: GameObject, options: MatterBodyConfig): GameObject = js.native
  def apply(world: World, gameObject: GameObject, options: MatterBodyConfig, addToWorld: Boolean): GameObject = js.native
}

