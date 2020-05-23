package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Display.BaseShader
import typings.phaser.Phaser.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shader Game Object.
  * 
  * This Game Object allows you to easily add a quad with its own shader into the display list, and manipulate it
  * as you would any other Game Object, including scaling, rotating, positioning and adding to Containers. Shaders
  * can be masked with either Bitmap or Geometry masks and can also be used as a Bitmap Mask for a Camera or other
  * Game Object. They can also be made interactive and used for input events.
  * 
  * It works by taking a reference to a `Phaser.Display.BaseShader` instance, as found in the Shader Cache. These can
  * be created dynamically at runtime, or loaded in via the GLSL File Loader:
  * 
  * ```javascript
  * function preload ()
  * {
  *     this.load.glsl('fire', 'shaders/fire.glsl.js');
  * }
  *  
  * function create ()
  * {
  *     this.add.shader('fire', 400, 300, 512, 512);
  * }
  * ```
  * 
  * Please see the Phaser 3 Examples GitHub repo for examples of loading and creating shaders dynamically.
  * 
  * Due to the way in which they work, you cannot directly change the alpha or blend mode of a Shader. This should
  * be handled via exposed uniforms in the shader code itself.
  * 
  * By default a Shader will be created with a standard set of uniforms. These were added to match those
  * found on sites such as ShaderToy or GLSLSandbox, and provide common functionality a shader may need,
  * such as the timestamp, resolution or pointer position. You can replace them by specifying your own uniforms
  * in the Base Shader.
  * 
  * These Shaders work by halting the current pipeline during rendering, creating a viewport matched to the
  * size of this Game Object and then renders a quad using the bound shader. At the end, the pipeline is restored.
  * 
  * Because it blocks the pipeline it means it will interrupt any batching that is currently going on, so you should
  * use these Game Objects sparingly. If you need to have a fully batched custom shader, then please look at using
  * a custom pipeline instead. However, for background or special masking effects, they are extremely effective.
  */
@JSGlobal("Phaser.GameObjects.Shader")
@js.native
class Shader protected ()
  extends typings.phaser.Phaser.GameObjects.Shader {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param key The key of the shader to use from the shader cache, or a BaseShader instance.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the Game Object. Default 128.
    * @param height The height of the Game Object. Default 128.
    * @param textures Optional array of texture keys to bind to the iChannel0...3 uniforms. The textures must already exist in the Texture Manager.
    * @param textureData Additional texture data if you want to create shader with none NPOT textures.
    */
  def this(
    scene: Scene,
    key: String,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    textures: js.UndefOr[js.Array[String]],
    textureData: js.UndefOr[js.Any]
  ) = this()
  def this(
    scene: Scene,
    key: BaseShader,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    textures: js.UndefOr[js.Array[String]],
    textureData: js.UndefOr[js.Any]
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

