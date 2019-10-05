package typings.phaser.Phaser.GameObjects

import typings.phaser.CreateCallback
import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Structs.List
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Blitter Game Object.
  * 
  * The Blitter Game Object is a special kind of container that creates, updates and manages Bob objects.
  * Bobs are designed for rendering speed rather than flexibility. They consist of a texture, or frame from a texture,
  * a position and an alpha value. You cannot scale or rotate them. They use a batched drawing method for speed
  * during rendering.
  * 
  * A Blitter Game Object has one texture bound to it. Bobs created by the Blitter can use any Frame from this
  * Texture to render with, but they cannot use any other Texture. It is this single texture-bind that allows
  * them their speed.
  * 
  * If you have a need to blast a large volume of frames around the screen then Blitter objects are well worth
  * investigating. They are especially useful for using as a base for your own special effects systems.
  */
@JSGlobal("Phaser.GameObjects.Blitter")
@js.native
class Blitter protected ()
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Mask
     with Pipeline
     with ScrollFactor
     with Size
     with Texture
     with Transform
     with Visible {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. It can only belong to one Scene at any given time.
    * @param x The x coordinate of this Game Object in world space. Default 0.
    * @param y The y coordinate of this Game Object in world space. Default 0.
    * @param texture The key of the texture this Game Object will use for rendering. The Texture must already exist in the Texture Manager. Default '__DEFAULT'.
    * @param frame The Frame of the Texture that this Game Object will use. Only set if the Texture has multiple frames, such as a Texture Atlas or Sprite Sheet. Default 0.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, x: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  /**
    * The children of this Blitter.
    * This List contains all of the Bob objects created by the Blitter.
    */
  var children: List[Bob] = js.native
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
    * Is the Blitter considered dirty?
    * A 'dirty' Blitter has had its child count changed since the last frame.
    */
  var dirty: Boolean = js.native
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
    * Checks if the given child can render or not, by checking its `visible` and `alpha` values.
    * @param child The Bob to check for rendering.
    */
  def childCanRender(child: Bob): Boolean = js.native
  /**
    * Removes all Bobs from the children List and clears the dirty flag.
    */
  def clear(): Unit = js.native
  /**
    * Creates a new Bob in this Blitter.
    * 
    * The Bob is created at the given coordinates, relative to the Blitter and uses the given frame.
    * A Bob can use any frame belonging to the texture bound to the Blitter.
    * @param x The x position of the Bob. Bob coordinate are relative to the position of the Blitter object.
    * @param y The y position of the Bob. Bob coordinate are relative to the position of the Blitter object.
    * @param frame The Frame the Bob will use. It _must_ be part of the Texture the parent Blitter object is using.
    * @param visible Should the created Bob render or not? Default true.
    * @param index The position in the Blitters Display List to add the new Bob at. Defaults to the top of the list.
    */
  def create(x: Double, y: Double): Bob = js.native
  def create(x: Double, y: Double, frame: String): Bob = js.native
  def create(x: Double, y: Double, frame: String, visible: Boolean): Bob = js.native
  def create(x: Double, y: Double, frame: String, visible: Boolean, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: Frame): Bob = js.native
  def create(x: Double, y: Double, frame: Frame, visible: Boolean): Bob = js.native
  def create(x: Double, y: Double, frame: Frame, visible: Boolean, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: integer): Bob = js.native
  def create(x: Double, y: Double, frame: integer, visible: Boolean): Bob = js.native
  def create(x: Double, y: Double, frame: integer, visible: Boolean, index: integer): Bob = js.native
  /**
    * Creates multiple Bob objects within this Blitter and then passes each of them to the specified callback.
    * @param callback The callback to invoke after creating a bob. It will be sent two arguments: The Bob and the index of the Bob.
    * @param quantity The quantity of Bob objects to create.
    * @param frame The Frame the Bobs will use. It must be part of the Blitter Texture.
    * @param visible Should the created Bob render or not? Default true.
    */
  def createFromCallback(callback: CreateCallback, quantity: integer): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: String): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: String, visible: Boolean): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: js.Array[Frame | String | integer]): js.Array[Bob] = js.native
  def createFromCallback(
    callback: CreateCallback,
    quantity: integer,
    frame: js.Array[Frame | String | integer],
    visible: Boolean
  ): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: Frame): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: Frame, visible: Boolean): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: integer): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: integer, visible: Boolean): js.Array[Bob] = js.native
  /**
    * Creates multiple Bobs in one call.
    * 
    * The amount created is controlled by a combination of the `quantity` argument and the number of frames provided.
    * 
    * If the quantity is set to 10 and you provide 2 frames, then 20 Bobs will be created. 10 with the first
    * frame and 10 with the second.
    * @param quantity The quantity of Bob objects to create.
    * @param frame The Frame the Bobs will use. It must be part of the Blitter Texture.
    * @param visible Should the created Bob render or not? Default true.
    */
  def createMultiple(quantity: integer): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: String): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: String, visible: Boolean): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: js.Array[Frame | String | integer]): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: js.Array[Frame | String | integer], visible: Boolean): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: Frame): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: Frame, visible: Boolean): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: integer): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: integer, visible: Boolean): js.Array[Bob] = js.native
  /**
    * Returns an array of Bobs to be rendered.
    * If the Blitter is dirty then a new list is generated and stored in `renderList`.
    */
  def getRenderList(): js.Array[Bob] = js.native
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
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
    * Sets the size of this Game Object to be that of the given Frame.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param frame The frame to base the size of this Game Object on.
    */
  /* CompleteClass */
  override def setSizeToFrame(frame: Frame): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
}

