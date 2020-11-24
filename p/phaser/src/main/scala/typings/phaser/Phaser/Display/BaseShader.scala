package typings.phaser.Phaser.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait BaseShader extends js.Object {
  
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
object BaseShader {
  
  @scala.inline
  def apply(fragmentSrc: String, key: String, uniforms: js.Any, vertexSrc: String): BaseShader = {
    val __obj = js.Dynamic.literal(fragmentSrc = fragmentSrc.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexSrc = vertexSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseShader]
  }
  
  @scala.inline
  implicit class BaseShaderOps[Self <: BaseShader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFragmentSrc(value: String): Self = this.set("fragmentSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniforms(value: js.Any): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexSrc(value: String): Self = this.set("vertexSrc", value.asInstanceOf[js.Any])
  }
}
