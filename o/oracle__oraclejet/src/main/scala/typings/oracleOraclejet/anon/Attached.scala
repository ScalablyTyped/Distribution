package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attached extends js.Object {
  def attached(param0: js.Object): Unit = js.native
}

object Attached {
  @scala.inline
  def apply(attached: js.Object => Unit): Attached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[Attached]
  }
  @scala.inline
  implicit class AttachedOps[Self <: Attached] (val x: Self) extends AnyVal {
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
    def setAttached(value: js.Object => Unit): Self = this.set("attached", js.Any.fromFunction1(value))
  }
  
}

