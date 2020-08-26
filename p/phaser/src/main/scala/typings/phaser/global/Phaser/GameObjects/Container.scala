package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Container Game Object.
  * 
  * A Container, as the name implies, can 'contain' other types of Game Object.
  * When a Game Object is added to a Container, the Container becomes responsible for the rendering of it.
  * By default it will be removed from the Display List and instead added to the Containers own internal list.
  * 
  * The position of the Game Object automatically becomes relative to the position of the Container.
  * 
  * The origin of a Container is 0x0 (in local space) and that cannot be changed. The children you add to the
  * Container should be positioned with this value in mind. I.e. you should treat 0x0 as being the center of
  * the Container, and position children positively and negative around it as required.
  * 
  * When the Container is rendered, all of its children are rendered as well, in the order in which they exist
  * within the Container. Container children can be repositioned using methods such as `MoveUp`, `MoveDown` and `SendToBack`.
  * 
  * If you modify a transform property of the Container, such as `Container.x` or `Container.rotation` then it will
  * automatically influence all children as well.
  * 
  * Containers can include other Containers for deeply nested transforms.
  * 
  * Containers can have masks set on them and can be used as a mask too. However, Container children cannot be masked.
  * The masks do not 'stack up'. Only a Container on the root of the display list will use its mask.
  * 
  * Containers can be enabled for input. Because they do not have a texture you need to provide a shape for them
  * to use as their hit area. Container children can also be enabled for input, independent of the Container.
  * 
  * Containers can be given a physics body for either Arcade Physics, Impact Physics or Matter Physics. However,
  * if Container _children_ are enabled for physics you may get unexpected results, such as offset bodies,
  * if the Container itself, or any of its ancestors, is positioned anywhere other than at 0 x 0. Container children
  * with physics do not factor in the Container due to the excessive extra calculations needed. Please structure
  * your game to work around this.
  * 
  * It's important to understand the impact of using Containers. They add additional processing overhead into
  * every one of their children. The deeper you nest them, the more the cost escalates. This is especially true
  * for input events. You also loose the ability to set the display depth of Container children in the same
  * flexible manner as those not within them. In short, don't use them for the sake of it. You pay a small cost
  * every time you create one, try to structure your game around avoiding that where possible.
  */
@JSGlobal("Phaser.GameObjects.Container")
@js.native
class Container protected ()
  extends typings.phaser.Phaser.GameObjects.Container {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param children An optional array of Game Objects to add to this Container.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, x: Double) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    children: js.Array[typings.phaser.Phaser.GameObjects.GameObject]
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    children: js.Array[typings.phaser.Phaser.GameObjects.GameObject]
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    children: js.Array[typings.phaser.Phaser.GameObjects.GameObject]
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    children: js.Array[typings.phaser.Phaser.GameObjects.GameObject]
  ) = this()
}

