package typings
package phaserLib.PhaserNs.GameObjectsNs

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
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Depth
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Mask
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Pipeline
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ScrollFactor
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Size
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Texture
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Transform
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Visible {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. It can only belong to one Scene at any given time.
    * @param x The x coordinate of this Game Object in world space. Default 0.
    * @param y The y coordinate of this Game Object in world space. Default 0.
    * @param texture The key of the texture this Game Object will use for rendering. The Texture must already exist in the Texture Manager. Default '__DEFAULT'.
    * @param frame The Frame of the Texture that this Game Object will use. Only set if the Texture has multiple frames, such as a Texture Atlas or Sprite Sheet. Default 0.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
  /**
    * The children of this Blitter.
    * This List contains all of the Bob objects created by the Blitter.
    */
  var children: phaserLib.PhaserNs.StructsNs.List[Bob] = js.native
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
  override var depth: scala.Double = js.native
  /**
    * Is the Blitter considered dirty?
    * A 'dirty' Blitter has had its child count changed since the last frame.
    */
  var dirty: scala.Boolean = js.native
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayHeight: scala.Double = js.native
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayWidth: scala.Double = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  override var width: scala.Double = js.native
  /**
    * Checks if the given child can render or not, by checking its `visible` and `alpha` values.
    * @param child The Bob to check for rendering.
    */
  def childCanRender(child: Bob): scala.Boolean = js.native
  /**
    * Removes all Bobs from the children List and clears the dirty flag.
    */
  def clear(): scala.Unit = js.native
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
  def create(x: scala.Double, y: scala.Double): Bob = js.native
  def create(x: scala.Double, y: scala.Double, frame: java.lang.String): Bob = js.native
  def create(x: scala.Double, y: scala.Double, frame: java.lang.String, visible: scala.Boolean): Bob = js.native
  def create(
    x: scala.Double,
    y: scala.Double,
    frame: java.lang.String,
    visible: scala.Boolean,
    index: phaserLib.integer
  ): Bob = js.native
  def create(x: scala.Double, y: scala.Double, frame: phaserLib.PhaserNs.TexturesNs.Frame): Bob = js.native
  def create(
    x: scala.Double,
    y: scala.Double,
    frame: phaserLib.PhaserNs.TexturesNs.Frame,
    visible: scala.Boolean
  ): Bob = js.native
  def create(
    x: scala.Double,
    y: scala.Double,
    frame: phaserLib.PhaserNs.TexturesNs.Frame,
    visible: scala.Boolean,
    index: phaserLib.integer
  ): Bob = js.native
  def create(x: scala.Double, y: scala.Double, frame: phaserLib.integer): Bob = js.native
  def create(x: scala.Double, y: scala.Double, frame: phaserLib.integer, visible: scala.Boolean): Bob = js.native
  def create(
    x: scala.Double,
    y: scala.Double,
    frame: phaserLib.integer,
    visible: scala.Boolean,
    index: phaserLib.integer
  ): Bob = js.native
  /**
    * Creates multiple Bob objects within this Blitter and then passes each of them to the specified callback.
    * @param callback The callback to invoke after creating a bob. It will be sent two arguments: The Bob and the index of the Bob.
    * @param quantity The quantity of Bob objects to create.
    * @param frame The Frame the Bobs will use. It must be part of the Blitter Texture.
    * @param visible Should the created Bob render or not? Default true.
    */
  def createFromCallback(callback: phaserLib.CreateCallback, quantity: phaserLib.integer): js.Array[Bob] = js.native
  def createFromCallback(callback: phaserLib.CreateCallback, quantity: phaserLib.integer, frame: java.lang.String): js.Array[Bob] = js.native
  def createFromCallback(
    callback: phaserLib.CreateCallback,
    quantity: phaserLib.integer,
    frame: java.lang.String,
    visible: scala.Boolean
  ): js.Array[Bob] = js.native
  def createFromCallback(
    callback: phaserLib.CreateCallback,
    quantity: phaserLib.integer,
    frame: js.Array[phaserLib.PhaserNs.TexturesNs.Frame | java.lang.String | phaserLib.integer]
  ): js.Array[Bob] = js.native
  def createFromCallback(
    callback: phaserLib.CreateCallback,
    quantity: phaserLib.integer,
    frame: js.Array[phaserLib.PhaserNs.TexturesNs.Frame | java.lang.String | phaserLib.integer],
    visible: scala.Boolean
  ): js.Array[Bob] = js.native
  def createFromCallback(
    callback: phaserLib.CreateCallback,
    quantity: phaserLib.integer,
    frame: phaserLib.PhaserNs.TexturesNs.Frame
  ): js.Array[Bob] = js.native
  def createFromCallback(
    callback: phaserLib.CreateCallback,
    quantity: phaserLib.integer,
    frame: phaserLib.PhaserNs.TexturesNs.Frame,
    visible: scala.Boolean
  ): js.Array[Bob] = js.native
  def createFromCallback(callback: phaserLib.CreateCallback, quantity: phaserLib.integer, frame: phaserLib.integer): js.Array[Bob] = js.native
  def createFromCallback(
    callback: phaserLib.CreateCallback,
    quantity: phaserLib.integer,
    frame: phaserLib.integer,
    visible: scala.Boolean
  ): js.Array[Bob] = js.native
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
  def createMultiple(quantity: phaserLib.integer): js.Array[Bob] = js.native
  def createMultiple(quantity: phaserLib.integer, frame: java.lang.String): js.Array[Bob] = js.native
  def createMultiple(quantity: phaserLib.integer, frame: java.lang.String, visible: scala.Boolean): js.Array[Bob] = js.native
  def createMultiple(
    quantity: phaserLib.integer,
    frame: js.Array[phaserLib.PhaserNs.TexturesNs.Frame | java.lang.String | phaserLib.integer]
  ): js.Array[Bob] = js.native
  def createMultiple(
    quantity: phaserLib.integer,
    frame: js.Array[phaserLib.PhaserNs.TexturesNs.Frame | java.lang.String | phaserLib.integer],
    visible: scala.Boolean
  ): js.Array[Bob] = js.native
  def createMultiple(quantity: phaserLib.integer, frame: phaserLib.PhaserNs.TexturesNs.Frame): js.Array[Bob] = js.native
  def createMultiple(quantity: phaserLib.integer, frame: phaserLib.PhaserNs.TexturesNs.Frame, visible: scala.Boolean): js.Array[Bob] = js.native
  def createMultiple(quantity: phaserLib.integer, frame: phaserLib.integer): js.Array[Bob] = js.native
  def createMultiple(quantity: phaserLib.integer, frame: phaserLib.integer, visible: scala.Boolean): js.Array[Bob] = js.native
  /**
    * Returns an array of Bobs to be rendered.
    * If the Blitter is dirty then a new list is generated and stored in `renderList`.
    */
  def getRenderList(): js.Array[Bob] = js.native
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): scala.Unit = js.native
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
  override def setDepth(value: phaserLib.integer): this.type = js.native
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: scala.Double, height: scala.Double): this.type = js.native
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
  override def setSize(width: scala.Double, height: scala.Double): this.type = js.native
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
  override def setSizeToFrame(frame: phaserLib.PhaserNs.TexturesNs.Frame): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: scala.Boolean): this.type = js.native
}

