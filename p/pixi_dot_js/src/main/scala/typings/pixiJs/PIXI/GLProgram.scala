package typings.pixiJs.PIXI

import typings.std.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to create a WebGL Program
  *
  * @class
  * @memberof PIXI
  */
trait GLProgram extends js.Object {
  /**
    * The shader program
    *
    * @member {WebGLProgram} PIXI.GLProgram#program
    */
  var program: WebGLProgram
  /**
    * holds the uniform data which contains uniform locations
    * and current uniform values used for caching and preventing unneeded GPU commands
    * @member {Object} PIXI.GLProgram#uniformData
    */
  var uniformData: js.Any
  /**
    * uniformGroups holds the various upload functions for the shader. Each uniform group
    * and program have a unique upload function generated.
    * @member {Object} PIXI.GLProgram#uniformGroups
    */
  var uniformGroups: js.Any
  /**
    * Destroys this program
    */
  def destroy(): Unit
}

object GLProgram {
  @scala.inline
  def apply(destroy: () => Unit, program: WebGLProgram, uniformData: js.Any, uniformGroups: js.Any): GLProgram = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), program = program.asInstanceOf[js.Any], uniformData = uniformData.asInstanceOf[js.Any], uniformGroups = uniformGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLProgram]
  }
}

