package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Render Texture is a combination of Dynamic Texture and an Image Game Object, that uses the
  * Dynamic Texture to display itself with.
  * 
  * A Dynamic Texture is a special texture that allows you to draw textures, frames and most kind of
  * Game Objects directly to it.
  * 
  * You can take many complex objects and draw them to this one texture, which can then be used as the
  * base texture for other Game Objects, such as Sprites. Should you then update this texture, all
  * Game Objects using it will instantly be updated as well, reflecting the changes immediately.
  * 
  * It's a powerful way to generate dynamic textures at run-time that are WebGL friendly and don't invoke
  * expensive GPU uploads on each change.
  * 
  * In versions of Phaser before 3.60 a Render Texture was the only way you could create a texture
  * like this, that had the ability to be drawn on. But in 3.60 we split the core functions out to
  * the Dynamic Texture class as it made a lot more sense for them to reside in there. As a result,
  * the Render Texture is now a light-weight shim that sits on-top of an Image Game Object and offers
  * proxy methods to the features available from a Dynamic Texture.
  * 
  * **When should you use a Render Texture vs. a Dynamic Texture?**
  * 
  * You should use a Dynamic Texture if the texture is going to be used by multiple Game Objects,
  * or you want to use it across multiple Scenes, because textures are globally stored.
  * 
  * You should use a Dynamic Texture if the texture isn't going to be displayed in-game, but is
  * instead going to be used for something like a mask or shader.
  * 
  * You should use a Render Texture if you need to display the texture in-game on a single Game Object,
  * as it provides the convenience of wrapping an Image and Dynamic Texture together for you.
  * 
  * Under WebGL1, a FrameBuffer, which is what this Dynamic Texture uses internally, cannot be anti-aliased.
  * This means that when drawing objects such as Shapes or Graphics instances to this texture, they may appear
  * to be drawn with no aliasing around the edges. This is a technical limitation of WebGL1. To get around it,
  * create your shape as a texture in an art package, then draw that to this texture.
  */
@JSGlobal("Phaser.GameObjects.RenderTexture")
@js.native
open class RenderTexture protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.RenderTexture {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the Render Texture. Default 32.
    * @param height The height of the Render Texture. Default 32.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, x: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Unit, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Double) = this()
  def this(scene: Scene, x: Double, y: Unit, width: Double) = this()
  def this(scene: Scene, x: Unit, y: Double, width: Double) = this()
  def this(scene: Scene, x: Unit, y: Unit, width: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Double, height: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Unit, height: Double) = this()
  def this(scene: Scene, x: Double, y: Unit, width: Double, height: Double) = this()
  def this(scene: Scene, x: Double, y: Unit, width: Unit, height: Double) = this()
  def this(scene: Scene, x: Unit, y: Double, width: Double, height: Double) = this()
  def this(scene: Scene, x: Unit, y: Double, width: Unit, height: Double) = this()
  def this(scene: Scene, x: Unit, y: Unit, width: Double, height: Double) = this()
  def this(scene: Scene, x: Unit, y: Unit, width: Unit, height: Double) = this()
  
  /**
    * The depth of this Game Object within the Scene. Ensure this value is only ever set to a number data-type.
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
    * The horizontally flipped state of the Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  var flipX: Boolean = js.native
  
  /**
    * The vertically flipped state of the Game Object.
    * 
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  var flipY: Boolean = js.native
  
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  /* CompleteClass */
  override def resetFlip(): this.type = js.native
  
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
    * @param value The depth of this Game Object. Ensure this value is only ever a number data-type.
    */
  /* CompleteClass */
  override def setDepth(value: Double): this.type = js.native
  
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * 
    * A Game Object that is flipped will render inversed on the flipped axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlip(x: Boolean, y: Boolean): this.type = js.native
  
  /**
    * Sets the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipX(value: Boolean): this.type = js.native
  
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipY(value: Boolean): this.type = js.native
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * Toggles the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override def toggleFlipX(): this.type = js.native
  
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipY(): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
