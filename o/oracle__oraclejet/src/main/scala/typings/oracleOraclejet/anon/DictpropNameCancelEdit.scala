package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameCancelEdit
  extends /* key */ StringDictionary[js.Any] {
  var cancelEdit: js.Object = js.native
  var rowContext: js.Object = js.native
}

object DictpropNameCancelEdit {
  @scala.inline
  def apply(cancelEdit: js.Object, rowContext: js.Object): DictpropNameCancelEdit = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameCancelEdit]
  }
  @scala.inline
  implicit class DictpropNameCancelEditOps[Self <: DictpropNameCancelEdit] (val x: Self) extends AnyVal {
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
    def setCancelEdit(value: js.Object): Self = this.set("cancelEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowContext(value: js.Object): Self = this.set("rowContext", value.asInstanceOf[js.Any])
  }
  
}

