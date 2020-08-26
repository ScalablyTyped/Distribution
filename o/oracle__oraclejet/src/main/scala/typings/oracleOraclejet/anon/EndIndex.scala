package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndIndex[K] extends ColumnSelectionEnd[K] {
  var endIndex: ColumnNumber = js.native
  var endKey: js.UndefOr[`22`[K]] = js.native
}

object EndIndex {
  @scala.inline
  def apply[K](endIndex: ColumnNumber): EndIndex[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndex[K]]
  }
  @scala.inline
  implicit class EndIndexOps[Self <: EndIndex[_], K] (val x: Self with EndIndex[K]) extends AnyVal {
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
    def setEndIndex(value: ColumnNumber): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndKey(value: `22`[K]): Self = this.set("endKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndKey: Self = this.set("endKey", js.undefined)
  }
  
}

