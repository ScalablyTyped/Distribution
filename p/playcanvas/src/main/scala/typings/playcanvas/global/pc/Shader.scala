package typings.playcanvas.global.pc

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
@JSGlobal("pc.Shader")
@js.native
open class Shader protected ()
  extends typings.playcanvas.mod.Shader {
  /**
    * Creates a new Shader instance.
    *
    * Consider {@link createShaderFromCode} as a simpler and more powerful way to create
    * a shader.
    *
    * @param {import('./graphics-device.js').GraphicsDevice} graphicsDevice - The graphics device
    * used to manage this shader.
    * @param {object} definition - The shader definition from which to build the shader.
    * @param {string} [definition.name] - The name of the shader.
    * @param {Object<string, string>} [definition.attributes] - Object detailing the mapping of
    * vertex shader attribute names to semantics SEMANTIC_*. This enables the engine to match
    * vertex buffer data as inputs to the shader. When not specified, rendering without
    * verex buffer is assumed.
    * @param {string} definition.vshader - Vertex shader source (GLSL code).
    * @param {string} [definition.fshader] - Fragment shader source (GLSL code). Optional when
    * useTransformFeedback is specified.
    * @param {boolean} [definition.useTransformFeedback] - Specifies that this shader outputs
    * post-VS data to a buffer.
    * @param {string} [definition.shaderLanguage] - Specifies the shader language of vertex and
    * fragment shaders. Defaults to {@link SHADERLANGUAGE_GLSL}.
    * @example
    * // Create a shader that renders primitives with a solid red color
    * const shaderDefinition = {
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
    * const shader = new pc.Shader(graphicsDevice, shaderDefinition);
    */
  def this(graphicsDevice: typings.playcanvas.mod.GraphicsDevice, definition: Attributes) = this()
}
