package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.integer
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
@JSImport("phaser", "GameObjects.Container")
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
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    children: js.Array[typings.phaser.Phaser.GameObjects.GameObject]
  ) = this()
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: Double = js.native
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayHeight: Double = js.native
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayWidth: Double = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: integer): this.type = js.native
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: Double, height: Double): this.type = js.native
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setSize(width: Double, height: Double): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
}

