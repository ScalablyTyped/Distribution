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
trait Shader extends js.Object {
  /**
    * Program that the shader uses
    *
    * @member {PIXI.Program} PIXI.Shader#program
    */
  var program: Program
  /**
    * Shader uniform values, shortcut for `uniformGroup.uniforms`
    * @readonly
    * @member {object}
    */
  val uniforms: js.Any
}

object Shader {
  @scala.inline
  def apply(program: Program, uniforms: js.Any): Shader = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shader]
  }
}

