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
@js.native
trait GLProgram extends js.Object {
  /**
    * Destroys this program
    */
  def destroy(): Unit = js.native
}

object GLProgram {
  @scala.inline
  def apply(destroy: () => Unit): GLProgram = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[GLProgram]
  }
  @scala.inline
  implicit class GLProgramOps[Self <: GLProgram] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
  }
  
}

