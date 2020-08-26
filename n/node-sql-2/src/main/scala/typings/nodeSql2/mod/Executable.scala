package typings.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executable extends js.Object {
  def toQuery(): QueryLike = js.native
}

object Executable {
  @scala.inline
  def apply(toQuery: () => QueryLike): Executable = {
    val __obj = js.Dynamic.literal(toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[Executable]
  }
  @scala.inline
  implicit class ExecutableOps[Self <: Executable] (val x: Self) extends AnyVal {
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
    def setToQuery(value: () => QueryLike): Self = this.set("toQuery", js.Any.fromFunction0(value))
  }
  
}

