package typings.phaser.Phaser.Display

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
trait BaseShader extends js.Object {
  /**
    * The source code, as a string, of the fragment shader being used.
    */
  var fragmentSrc: String
  /**
    * The key of this shader, unique within the shader cache of this Phaser game instance.
    */
  var key: String
  /**
    * The default uniforms for this shader.
    */
  var uniforms: js.Any
  /**
    * The source code, as a string, of the vertex shader being used.
    */
  var vertexSrc: String
}

object BaseShader {
  @scala.inline
  def apply(fragmentSrc: String, key: String, uniforms: js.Any, vertexSrc: String): BaseShader = {
    val __obj = js.Dynamic.literal(fragmentSrc = fragmentSrc.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexSrc = vertexSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseShader]
  }
}

