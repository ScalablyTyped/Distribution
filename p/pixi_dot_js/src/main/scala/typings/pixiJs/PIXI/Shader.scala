package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper class for shaders
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Shader")
@js.native
class Shader () extends js.Object {
  def this(program: Program) = this()
  def this(program: Program, uniforms: js.Any) = this()
  /**
    * Program that the shader uses
    *
    * @member {PIXI.Program} PIXI.Shader#program
    */
  var program: Program = js.native
  /**
    * Shader uniform values, shortcut for `uniformGroup.uniforms`
    * @readonly
    * @member {object}
    */
  val uniforms: js.Any = js.native
}

/* static members */
@JSGlobal("PIXI.Shader")
@js.native
object Shader extends js.Object {
  /**
    * A short hand function to create a shader based of a vertex and fragment shader
    *
    * @param {string} [vertexSrc] - The source of the vertex shader.
    * @param {string} [fragmentSrc] - The source of the fragment shader.
    * @param {object} [uniforms] - Custom uniforms to use to augment the built-in ones.
    *
    * @returns {PIXI.Shader} an shiny new Pixi shader!
    */
  def from(): Shader = js.native
  def from(vertexSrc: String): Shader = js.native
  def from(vertexSrc: String, fragmentSrc: String): Shader = js.native
  def from(vertexSrc: String, fragmentSrc: String, uniforms: js.Any): Shader = js.native
}

