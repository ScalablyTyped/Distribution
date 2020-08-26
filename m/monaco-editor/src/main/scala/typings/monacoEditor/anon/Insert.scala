package typings.monacoEditor.anon

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert extends js.Object {
  var insert: IRange = js.native
  var replace: IRange = js.native
}

object Insert {
  @scala.inline
  def apply(insert: IRange, replace: IRange): Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
  @scala.inline
  implicit class InsertOps[Self <: Insert] (val x: Self) extends AnyVal {
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
    def setInsert(value: IRange): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace(value: IRange): Self = this.set("replace", value.asInstanceOf[js.Any])
  }
  
}

