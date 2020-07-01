package typings.pixiJs.PIXI

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
    * Destroys this program
    */
  def destroy(): Unit
}

object GLProgram {
  @scala.inline
  def apply(destroy: () => Unit): GLProgram = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[GLProgram]
  }
}

