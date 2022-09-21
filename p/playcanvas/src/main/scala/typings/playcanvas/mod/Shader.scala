package typings.playcanvas.mod

import typings.playcanvas.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A shader is a program that is responsible for rendering graphical primitives on a device's
  * graphics processor. The shader is generated from a shader definition. This shader definition
  * specifies the code for processing vertices and fragments processed by the GPU. The language of
  * the code is GLSL (or more specifically ESSL, the OpenGL ES Shading Language). The shader
  * definition also describes how the PlayCanvas engine should map vertex buffer elements onto the
  * attributes specified in the vertex shader code.
  */
@JSImport("playcanvas", "Shader")
@js.native
open class Shader protected () extends StObject {
  /**
    * Creates a new Shader instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this shader.
    * @param {object} definition - The shader definition from which to build the shader.
    * @param {string} [definition.name] - The name of the shader.
    * @param {Object<string, string>} definition.attributes - Object detailing the mapping of
    * vertex shader attribute names to semantics SEMANTIC_*. This enables the engine to match
    * vertex buffer data as inputs to the shader.
    * @param {string} definition.vshader - Vertex shader source (GLSL code).
    * @param {string} definition.fshader - Fragment shader source (GLSL code).
    * @param {boolean} [definition.useTransformFeedback] - Specifies that this shader outputs
    * post-VS data to a buffer.
    * @example
    * // Create a shader that renders primitives with a solid red color
    * var shaderDefinition = {
    *     attributes: {
    *         aPosition: pc.SEMANTIC_POSITION
    *     },
    *     vshader: [
    *         "attribute vec3 aPosition;",
    *         "",
    *         "void main(void)",
    *         "{",
    *         "    gl_Position = vec4(aPosition, 1.0);",
    *         "}"
    *     ].join("\n"),
    *     fshader: [
    *         "precision " + graphicsDevice.precision + " float;",
    *         "",
    *         "void main(void)",
    *         "{",
    *         "    gl_FragColor = vec4(1.0, 0.0, 0.0, 1.0);",
    *         "}"
    *     ].join("\n")
    * };
    *
    * var shader = new pc.Shader(graphicsDevice, shaderDefinition);
    */
  def this(graphicsDevice: GraphicsDevice, definition: Attributes) = this()
  
  var definition: Attributes = js.native
  
  /**
    * Frees resources associated with this shader.
    */
  def destroy(): Unit = js.native
  
  var device: GraphicsDevice = js.native
  
  var failed: Boolean = js.native
  
  var id: Double = js.native
  
  var impl: Any = js.native
  
  /**
    * Initialize a shader back to its default state.
    *
    * @private
    */
  /* private */ var init: Any = js.native
  
  /**
    * Called when the WebGL context was lost. It releases all context related resources.
    *
    * @ignore
    */
  def loseContext(): Unit = js.native
  
  /**
    * Format of the bind group for the mesh bind group.
    *
    * @type {BindGroupFormat}
    */
  var meshBindGroupFormat: Any = js.native
  
  /**
    * Format of the uniform buffer for mesh bind grounp.
    *
    * @type {UniformBufferFormat}
    */
  var meshUniformBufferFormat: Any = js.native
  
  var name: String = js.native
  
  var ready: Boolean = js.native
  
  def restoreContext(): Unit = js.native
}
