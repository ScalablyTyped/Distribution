package typings.playcanvas.mod

import typings.playcanvas.anon.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new shader object.
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
  * @param graphicsDevice - The graphics device used to manage this shader.
  * @param definition - The shader definition from which to build the shader.
  * @param definition.attributes - Object detailing the mapping of vertex shader attribute names
  * to semantics (pc.SEMANTIC_*). This enables the engine to match vertex buffer data as inputs to the
  * shader.
  * @param definition.vshader - Vertex shader source (GLSL code).
  * @param definition.fshader - Fragment shader source (GLSL code).
  * @param [definition.useTransformFeedback] - Specifies that this shader outputs post-VS data to a buffer.
  */
@JSImport("playcanvas", "Shader")
@js.native
class Shader protected ()
  extends typings.playcanvas.pc.Shader {
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice, definition: Attributes) = this()
}

