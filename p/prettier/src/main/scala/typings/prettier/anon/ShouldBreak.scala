package typings.prettier.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldBreak extends js.Object {
  var shouldBreak: Boolean = js.native
}

object ShouldBreak {
  @scala.inline
  def apply(shouldBreak: Boolean): ShouldBreak = {
    val __obj = js.Dynamic.literal(shouldBreak = shouldBreak.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldBreak]
  }
  @scala.inline
  implicit class ShouldBreakOps[Self <: ShouldBreak] (val x: Self) extends AnyVal {
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
    def setShouldBreak(value: Boolean): Self = this.set("shouldBreak", value.asInstanceOf[js.Any])
  }
  
}

