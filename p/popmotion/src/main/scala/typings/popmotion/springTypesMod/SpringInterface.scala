package typings.popmotion.springTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringInterface extends js.Object {
  def stop(): Unit = js.native
}

object SpringInterface {
  @scala.inline
  def apply(stop: () => Unit): SpringInterface = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[SpringInterface]
  }
  @scala.inline
  implicit class SpringInterfaceOps[Self <: SpringInterface] (val x: Self) extends AnyVal {
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
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

