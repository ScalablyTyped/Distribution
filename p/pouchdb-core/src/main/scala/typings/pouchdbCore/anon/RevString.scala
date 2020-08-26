package typings.pouchdbCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevString extends js.Object {
  var rev: String = js.native
}

object RevString {
  @scala.inline
  def apply(rev: String): RevString = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevString]
  }
  @scala.inline
  implicit class RevStringOps[Self <: RevString] (val x: Self) extends AnyVal {
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
    def setRev(value: String): Self = this.set("rev", value.asInstanceOf[js.Any])
  }
  
}

