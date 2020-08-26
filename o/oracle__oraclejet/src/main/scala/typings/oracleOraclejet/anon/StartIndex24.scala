package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartIndex24[K] extends RowSelectionStart[K] {
  var startIndex: `24` = js.native
  var startKey: js.UndefOr[`25`[K]] = js.native
}

object StartIndex24 {
  @scala.inline
  def apply[K](startIndex: `24`): StartIndex24[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndex24[K]]
  }
  @scala.inline
  implicit class StartIndex24Ops[Self <: StartIndex24[_], K] (val x: Self with StartIndex24[K]) extends AnyVal {
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
    def setStartIndex(value: `24`): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartKey(value: `25`[K]): Self = this.set("startKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartKey: Self = this.set("startKey", js.undefined)
  }
  
}

