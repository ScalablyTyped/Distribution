package typings.pgFormat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern extends js.Object {
  var pattern: Ident = js.native
}

object Pattern {
  @scala.inline
  def apply(pattern: Ident): Pattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  implicit class PatternOps[Self <: Pattern] (val x: Self) extends AnyVal {
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
    def setPattern(value: Ident): Self = this.set("pattern", value.asInstanceOf[js.Any])
  }
  
}

