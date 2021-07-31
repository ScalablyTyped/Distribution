package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.phaser.Phaser.GameObjects.Blitter {
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
  def this(scene: Scene, x: Unit, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String) = this()
  def this(scene: Scene, x: Double, y: Unit, texture: String) = this()
  def this(scene: Scene, x: Unit, y: Double, texture: String) = this()
  def this(scene: Scene, x: Unit, y: Unit, texture: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  def this(scene: Scene, x: Double, y: Double, texture: Unit, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: Unit, frame: integer) = this()
  def this(scene: Scene, x: Double, y: Unit, texture: String, frame: String) = this()
  def this(scene: Scene, x: Double, y: Unit, texture: String, frame: integer) = this()
  def this(scene: Scene, x: Double, y: Unit, texture: Unit, frame: String) = this()
  def this(scene: Scene, x: Double, y: Unit, texture: Unit, frame: integer) = this()
  def this(scene: Scene, x: Unit, y: Double, texture: String, frame: String) = this()
  def this(scene: Scene, x: Unit, y: Double, texture: String, frame: integer) = this()
  def this(scene: Scene, x: Unit, y: Double, texture: Unit, frame: String) = this()
  def this(scene: Scene, x: Unit, y: Double, texture: Unit, frame: integer) = this()
  def this(scene: Scene, x: Unit, y: Unit, texture: String, frame: String) = this()
  def this(scene: Scene, x: Unit, y: Unit, texture: String, frame: integer) = this()
  def this(scene: Scene, x: Unit, y: Unit, texture: Unit, frame: String) = this()
  def this(scene: Scene, x: Unit, y: Unit, texture: Unit, frame: integer) = this()
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  var depth: Double = js.native
  
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  var displayHeight: Double = js.native
  
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  var displayWidth: Double = js.native
  
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
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
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
  
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  var width: Double = js.native
}
