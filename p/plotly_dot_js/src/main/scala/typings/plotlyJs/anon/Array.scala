package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
import typings.plotlyJs.plotlyJsStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  var array: js.Array[Datum] = js.native
  var arrayminus: js.UndefOr[js.Array[Datum]] = js.native
  var `type`: data = js.native
}

object Array {
  @scala.inline
  def apply(array: js.Array[Datum], `type`: data): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
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
    def setArrayVarargs(value: Datum*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[Datum]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: data): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrayminusVarargs(value: Datum*): Self = this.set("arrayminus", js.Array(value :_*))
    @scala.inline
    def setArrayminus(value: js.Array[Datum]): Self = this.set("arrayminus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayminus: Self = this.set("arrayminus", js.undefined)
  }
  
}

