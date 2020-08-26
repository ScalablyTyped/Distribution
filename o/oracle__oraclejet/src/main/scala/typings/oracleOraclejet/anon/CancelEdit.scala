package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelEdit[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var cancelEdit: Boolean = js.native
  var cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] = js.native
}

object CancelEdit {
  @scala.inline
  def apply[K, D](
    cancelEdit: Boolean,
    cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]
  ): CancelEdit[K, D] = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], cellContext = cellContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEdit[K, D]]
  }
  @scala.inline
  implicit class CancelEditOps[Self <: CancelEdit[_, _], K, D] (val x: Self with (CancelEdit[K, D])) extends AnyVal {
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
    def setCancelEdit(value: Boolean): Self = this.set("cancelEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellContext(value: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]): Self = this.set("cellContext", value.asInstanceOf[js.Any])
  }
  
}

