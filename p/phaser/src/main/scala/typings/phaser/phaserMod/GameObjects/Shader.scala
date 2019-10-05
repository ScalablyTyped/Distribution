package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Display.BaseShader
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
@JSImport("phaser", "GameObjects.Shader")
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
    */
  def this(scene: typings.phaser.Phaser.Scene, key: String) = this()
  def this(scene: typings.phaser.Phaser.Scene, key: BaseShader) = this()
  def this(scene: typings.phaser.Phaser.Scene, key: String, x: Double) = this()
  def this(scene: typings.phaser.Phaser.Scene, key: BaseShader, x: Double) = this()
  def this(scene: typings.phaser.Phaser.Scene, key: String, x: Double, y: Double) = this()
  def this(scene: typings.phaser.Phaser.Scene, key: BaseShader, x: Double, y: Double) = this()
  def this(scene: typings.phaser.Phaser.Scene, key: String, x: Double, y: Double, width: Double) = this()
  def this(scene: typings.phaser.Phaser.Scene, key: BaseShader, x: Double, y: Double, width: Double) = this()
  def this(
    scene: typings.phaser.Phaser.Scene,
    key: String,
    x: Double,
    y: Double,
    width: Double,
    height: Double
  ) = this()
  def this(
    scene: typings.phaser.Phaser.Scene,
    key: BaseShader,
    x: Double,
    y: Double,
    width: Double,
    height: Double
  ) = this()
  def this(
    scene: typings.phaser.Phaser.Scene,
    key: String,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    textures: js.Array[String]
  ) = this()
  def this(
    scene: typings.phaser.Phaser.Scene,
    key: BaseShader,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    textures: js.Array[String]
  ) = this()
}

