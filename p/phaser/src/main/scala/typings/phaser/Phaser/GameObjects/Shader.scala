package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Display.BaseShader
import typings.phaser.Phaser.GameObjects.Components.ComputedSize
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Input.Pointer
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.integer
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint8Array
import typings.std.WebGLBuffer
import typings.std.WebGLFramebuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
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
@js.native
trait Shader
  extends GameObject
     with ComputedSize
     with Depth
     with GetBounds
     with Mask
     with Origin
     with ScrollFactor
     with Transform
     with Visible {
  /**
    * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources to the GPU.
    */
  var bytes: Uint8Array = js.native
  /**
    * A reference to the GL Frame Buffer this Shader is drawing to.
    * This property is only set if you have called `Shader.setRenderToTexture`.
    */
  var framebuffer: WebGLFramebuffer = js.native
  /**
    * The WebGL context belonging to the renderer.
    */
  var gl: WebGLRenderingContext = js.native
  /**
    * A reference to the WebGLTexture this Shader is rendering to.
    * This property is only set if you have called `Shader.setRenderToTexture`.
    */
  var glTexture: WebGLTexture = js.native
  /**
    * The pointer bound to this shader, if any.
    * Set via the chainable `setPointer` method, or by modifying this property directly.
    */
  var pointer: Pointer = js.native
  /**
    * The WebGL shader program this shader uses.
    */
  var program: WebGLProgram = js.native
  /**
    * The projection matrix the shader uses during rendering.
    */
  val projectionMatrix: Float32Array = js.native
  /**
    * A flag that indicates if this Shader has been set to render to a texture instead of the display list.
    * 
    * This property is `true` if you have called `Shader.setRenderToTexture`, otherwise it's `false`.
    * 
    * A Shader that is rendering to a texture _does not_ appear on the display list.
    */
  val renderToTexture: Boolean = js.native
  /**
    * A reference to the current renderer.
    * Shaders only work with the WebGL Renderer.
    */
  var renderer: CanvasRenderer | WebGLRenderer = js.native
  /**
    * The underlying shader object being used.
    * Empty by default and set during a call to the `setShader` method.
    */
  var shader: BaseShader = js.native
  /**
    * A reference to the Phaser.Textures.Texture that has been stored in the Texture Manager for this Shader.
    * 
    * This property is only set if you have called `Shader.setRenderToTexture`, otherwise it is `null`.
    */
  var texture: Texture = js.native
  /**
    * The default uniform mappings. These can be added to (or replaced) by specifying your own uniforms when
    * creating this shader game object. The uniforms are updated automatically during the render step.
    * 
    * The defaults are:
    * 
    * `resolution` (2f) - Set to the size of this shader.
    * `time` (1f) - The elapsed game time, in seconds.
    * `mouse` (2f) - If a pointer has been bound (with `setPointer`), this uniform contains its position each frame.
    * `date` (4fv) - A vec4 containing the year, month, day and time in seconds.
    * `sampleRate` (1f) - Sound sample rate. 44100 by default.
    * `iChannel0...3` (sampler2D) - Input channels 0 to 3. `null` by default.
    */
  var uniforms: js.Any = js.native
  /**
    * The WebGL vertex buffer object this shader uses.
    */
  var vertexBuffer: WebGLBuffer = js.native
  /**
    * Raw byte buffer of vertices this Shader uses.
    */
  var vertexData: ArrayBuffer = js.native
  /**
    * Float32 view of the array buffer containing the shaders vertices.
    */
  var vertexViewF32: Float32Array = js.native
  /**
    * The view matrix the shader uses during rendering.
    */
  val viewMatrix: Float32Array = js.native
  /**
    * Called automatically during render.
    * 
    * Sets the active shader, loads the vertex buffer and then draws.
    */
  def flush(): Unit = js.native
  /**
    * Returns the uniform object for the given key, or `null` if the uniform couldn't be found.
    * @param key The key of the uniform to return the value for.
    */
  def getUniform(key: String): js.Any = js.native
  /**
    * Called automatically during render.
    * 
    * This method performs matrix ITRS and then stores the resulting value in the `uViewMatrix` uniform.
    * It then sets up the vertex buffer and shader, updates and syncs the uniforms ready
    * for flush to be called.
    * @param matrix2D The transform matrix to use during rendering.
    */
  def load(): Unit = js.native
  def load(matrix2D: TransformMatrix): Unit = js.native
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
  /**
    * Sets this shader to use an orthographic projection matrix.
    * This matrix is stored locally in the `projectionMatrix` property,
    * as well as being bound to the `uProjectionMatrix` uniform.
    * @param left The left value.
    * @param right The right value.
    * @param bottom The bottom value.
    * @param top The top value.
    */
  def projOrtho(left: Double, right: Double, bottom: Double, top: Double): Unit = js.native
  /**
    * A short-cut method that will directly set the texture being used by the `iChannel0` sampler2D uniform.
    * 
    * The textureKey given is the key from the Texture Manager cache. You cannot use a single frame
    * from a texture, only the full image. Also, lots of shaders expect textures to be power-of-two sized.
    * @param textureKey The key of the texture, as stored in the Texture Manager. Must already be loaded.
    * @param textureData Additional texture data.
    */
  def setChannel0(textureKey: String): this.type = js.native
  def setChannel0(textureKey: String, textureData: js.Any): this.type = js.native
  /**
    * A short-cut method that will directly set the texture being used by the `iChannel1` sampler2D uniform.
    * 
    * The textureKey given is the key from the Texture Manager cache. You cannot use a single frame
    * from a texture, only the full image. Also, lots of shaders expect textures to be power-of-two sized.
    * @param textureKey The key of the texture, as stored in the Texture Manager. Must already be loaded.
    * @param textureData Additional texture data.
    */
  def setChannel1(textureKey: String): this.type = js.native
  def setChannel1(textureKey: String, textureData: js.Any): this.type = js.native
  /**
    * A short-cut method that will directly set the texture being used by the `iChannel2` sampler2D uniform.
    * 
    * The textureKey given is the key from the Texture Manager cache. You cannot use a single frame
    * from a texture, only the full image. Also, lots of shaders expect textures to be power-of-two sized.
    * @param textureKey The key of the texture, as stored in the Texture Manager. Must already be loaded.
    * @param textureData Additional texture data.
    */
  def setChannel2(textureKey: String): this.type = js.native
  def setChannel2(textureKey: String, textureData: js.Any): this.type = js.native
  /**
    * A short-cut method that will directly set the texture being used by the `iChannel3` sampler2D uniform.
    * 
    * The textureKey given is the key from the Texture Manager cache. You cannot use a single frame
    * from a texture, only the full image. Also, lots of shaders expect textures to be power-of-two sized.
    * @param textureKey The key of the texture, as stored in the Texture Manager. Must already be loaded.
    * @param textureData Additional texture data.
    */
  def setChannel3(textureKey: String): this.type = js.native
  def setChannel3(textureKey: String, textureData: js.Any): this.type = js.native
  /**
    * Binds a Phaser Pointer object to this Shader.
    * 
    * The screen position of the pointer will be set in to the shaders `mouse` uniform
    * automatically every frame. Call this method with no arguments to unbind the pointer.
    * @param pointer The Pointer to bind to this shader.
    */
  def setPointer(): this.type = js.native
  def setPointer(pointer: Pointer): this.type = js.native
  /**
    * Changes this Shader so instead of rendering to the display list it renders to a
    * WebGL Framebuffer and WebGL Texture instead. This allows you to use the output
    * of this shader as an input for another shader, by mapping a sampler2D uniform
    * to it.
    * 
    * After calling this method the `Shader.framebuffer` and `Shader.glTexture` properties
    * are populated.
    * 
    * Additionally, you can provide a key to this method. Doing so will create a Phaser Texture
    * from this Shader and save it into the Texture Manager, allowing you to then use it for
    * any texture-based Game Object, such as a Sprite or Image:
    * 
    * ```javascript
    * var shader = this.add.shader('myShader', x, y, width, height);
    * 
    * shader.setRenderToTexture('doodle');
    * 
    * this.add.image(400, 300, 'doodle');
    * ```
    * 
    * Note that it stores an active reference to this Shader. That means as this shader updates,
    * so does the texture and any object using it to render with. Also, if you destroy this
    * shader, be sure to clear any objects that may have been using it as a texture too.
    * 
    * You can access the Phaser Texture that is created via the `Shader.texture` property.
    * 
    * By default it will create a single base texture. You can add frames to the texture
    * by using the `Texture.add` method. After doing this, you can then allow Game Objects
    * to use a specific frame from a Render Texture.
    * @param key The unique key to store the texture as within the global Texture Manager.
    * @param flipY Does this texture need vertically flipping before rendering? This should usually be set to `true` if being fed from a buffer. Default false.
    */
  def setRenderToTexture(): this.type = js.native
  def setRenderToTexture(key: String): this.type = js.native
  def setRenderToTexture(key: String, flipY: Boolean): this.type = js.native
  /**
    * Sets a sampler2D uniform on this shader.
    * 
    * The textureKey given is the key from the Texture Manager cache. You cannot use a single frame
    * from a texture, only the full image. Also, lots of shaders expect textures to be power-of-two sized.
    * 
    * If you wish to use another Shader as a sampler2D input for this shader, see the `Shader.setSampler2DBuffer` method.
    * @param uniformKey The key of the sampler2D uniform to be updated, i.e. `iChannel0`.
    * @param textureKey The key of the texture, as stored in the Texture Manager. Must already be loaded.
    * @param textureIndex The texture index. Default 0.
    * @param textureData Additional texture data.
    */
  def setSampler2D(uniformKey: String, textureKey: String): this.type = js.native
  def setSampler2D(uniformKey: String, textureKey: String, textureIndex: integer): this.type = js.native
  def setSampler2D(uniformKey: String, textureKey: String, textureIndex: integer, textureData: js.Any): this.type = js.native
  /**
    * Sets a sampler2D uniform on this shader where the source texture is a WebGLTexture.
    * 
    * This allows you to feed the output from one Shader into another:
    * 
    * ```javascript
    * let shader1 = this.add.shader(baseShader1, 0, 0, 512, 512).setRenderToTexture();
    * let shader2 = this.add.shader(baseShader2, 0, 0, 512, 512).setRenderToTexture('output');
    * 
    * shader1.setSampler2DBuffer('iChannel0', shader2.glTexture, 512, 512);
    * shader2.setSampler2DBuffer('iChannel0', shader1.glTexture, 512, 512);
    * ```
    * 
    * In the above code, the result of baseShader1 is fed into Shader2 as the `iChannel0` sampler2D uniform.
    * The result of baseShader2 is then fed back into shader1 again, creating a feedback loop.
    * 
    * If you wish to use an image from the Texture Manager as a sampler2D input for this shader,
    * see the `Shader.setSampler2D` method.
    * @param uniformKey The key of the sampler2D uniform to be updated, i.e. `iChannel0`.
    * @param texture A WebGLTexture reference.
    * @param width The width of the texture.
    * @param height The height of the texture.
    * @param textureIndex The texture index. Default 0.
    * @param textureData Additional texture data.
    */
  def setSampler2DBuffer(uniformKey: String, texture: WebGLTexture, width: integer, height: integer): this.type = js.native
  def setSampler2DBuffer(uniformKey: String, texture: WebGLTexture, width: integer, height: integer, textureIndex: integer): this.type = js.native
  def setSampler2DBuffer(
    uniformKey: String,
    texture: WebGLTexture,
    width: integer,
    height: integer,
    textureIndex: integer,
    textureData: js.Any
  ): this.type = js.native
  /**
    * Sets the fragment and, optionally, the vertex shader source code that this Shader will use.
    * This will immediately delete the active shader program, if set, and then create a new one
    * with the given source. Finally, the shader uniforms are initialized.
    * @param key The key of the shader to use from the shader cache, or a BaseShader instance.
    * @param textures Optional array of texture keys to bind to the iChannel0...3 uniforms. The textures must already exist in the Texture Manager.
    * @param textureData Additional texture data.
    */
  def setShader(key: String): this.type = js.native
  def setShader(key: String, textures: js.Array[String]): this.type = js.native
  def setShader(key: String, textures: js.Array[String], textureData: js.Any): this.type = js.native
  def setShader(key: BaseShader): this.type = js.native
  def setShader(key: BaseShader, textures: js.Array[String]): this.type = js.native
  def setShader(key: BaseShader, textures: js.Array[String], textureData: js.Any): this.type = js.native
  /**
    * Sets a property of a uniform already present on this shader.
    * 
    * To modify the value of a uniform such as a 1f or 1i use the `value` property directly:
    * 
    * ```javascript
    * shader.setUniform('size.value', 16);
    * ```
    * 
    * You can use dot notation to access deeper values, for example:
    * 
    * ```javascript
    * shader.setUniform('resolution.value.x', 512);
    * ```
    * 
    * The change to the uniform will take effect the next time the shader is rendered.
    * @param key The key of the uniform to modify. Use dots for deep properties, i.e. `resolution.value.x`.
    * @param value The value to set into the uniform.
    */
  def setUniform(key: String, value: js.Any): this.type = js.native
}

