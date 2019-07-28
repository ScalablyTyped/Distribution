package typings.phaser.PhaserNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A BaseShader is a small resource class that contains the data required for a WebGL Shader to be created.
  * 
  * It contains the raw source code to the fragment and vertex shader, as well as an object that defines
  * the uniforms the shader requires, if any.
  * 
  * BaseShaders are stored in the Shader Cache, available in a Scene via `this.cache.shaders` and are referenced
  * by a unique key-based string. Retrieve them via `this.cache.shaders.get(key)`.
  * 
  * BaseShaders are created automatically by the GLSL File Loader when loading an external shader resource.
  * They can also be created at runtime, allowing you to use dynamically generated shader source code.
  * 
  * Default fragment and vertex source is used if not provided in the constructor, setting-up a basic shader,
  * suitable for debug rendering.
  */
@JSGlobal("Phaser.Display.BaseShader")
@js.native
class BaseShader protected () extends js.Object {
  /**
    * 
    * @param key The key of this shader. Must be unique within the shader cache.
    * @param fragmentSrc The fragment source for the shader.
    * @param vertexSrc The vertex source for the shader.
    * @param uniforms Optional object defining the uniforms the shader uses.
    */
  def this(key: String) = this()
  def this(key: String, fragmentSrc: String) = this()
  def this(key: String, fragmentSrc: String, vertexSrc: String) = this()
  def this(key: String, fragmentSrc: String, vertexSrc: String, uniforms: js.Any) = this()
  /**
    * The source code, as a string, of the fragment shader being used.
    */
  var fragmentSrc: String = js.native
  /**
    * The key of this shader, unique within the shader cache of this Phaser game instance.
    */
  var key: String = js.native
  /**
    * The default uniforms for this shader.
    */
  var uniforms: js.Any = js.native
  /**
    * The source code, as a string, of the vertex shader being used.
    */
  var vertexSrc: String = js.native
}

