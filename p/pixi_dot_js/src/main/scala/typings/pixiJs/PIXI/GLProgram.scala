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
@JSGlobal("PIXI.GLProgram")
@js.native
class GLProgram protected () extends js.Object {
  def this(program: WebGLProgram, uniformData: js.Any) = this()
  /**
    * The shader program
    *
    * @member {WebGLProgram} PIXI.GLProgram#program
    */
  var program: WebGLProgram = js.native
  /**
    * holds the uniform data which contains uniform locations
    * and current uniform values used for caching and preventing unneeded GPU commands
    * @member {Object} PIXI.GLProgram#uniformData
    */
  var uniformData: js.Any = js.native
  /**
    * uniformGroups holds the various upload functions for the shader. Each uniform group
    * and program have a unique upload function generated.
    * @member {Object} PIXI.GLProgram#uniformGroups
    */
  var uniformGroups: js.Any = js.native
  /**
    * Destroys this program
    */
  def destroy(): Unit = js.native
}

