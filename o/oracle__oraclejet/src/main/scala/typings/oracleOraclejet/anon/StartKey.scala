package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartKey[K] extends ColumnSelectionStart[K] {
  var startIndex: ColumnNumber = js.native
  var startKey: js.UndefOr[`22`[K]] = js.native
}

object StartKey {
  @scala.inline
  def apply[K](startIndex: ColumnNumber): StartKey[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKey[K]]
  }
  @scala.inline
  implicit class StartKeyOps[Self <: StartKey[_], K] (val x: Self with StartKey[K]) extends AnyVal {
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
    def setStartIndex(value: ColumnNumber): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartKey(value: `22`[K]): Self = this.set("startKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartKey: Self = this.set("startKey", js.undefined)
  }
  
}

