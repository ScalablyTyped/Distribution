package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ k in keyof std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowStyles, 'isMultiline' | 'isRowHeader' | 'cell' | 'cellAnimation' | 'cellPadded' | 'cellUnpadded' | 'fields'> ]: string} */
@js.native
trait kinkeyofPickIDetailsRowSt extends js.Object {
  var cell: String = js.native
  var cellAnimation: String = js.native
  var cellPadded: String = js.native
  var cellUnpadded: String = js.native
  var fields: String = js.native
  var isMultiline: String = js.native
  var isRowHeader: String = js.native
}

object kinkeyofPickIDetailsRowSt {
  @scala.inline
  def apply(
    cell: String,
    cellAnimation: String,
    cellPadded: String,
    cellUnpadded: String,
    fields: String,
    isMultiline: String,
    isRowHeader: String
  ): kinkeyofPickIDetailsRowSt = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellAnimation = cellAnimation.asInstanceOf[js.Any], cellPadded = cellPadded.asInstanceOf[js.Any], cellUnpadded = cellUnpadded.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any], isRowHeader = isRowHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[kinkeyofPickIDetailsRowSt]
  }
  @scala.inline
  implicit class kinkeyofPickIDetailsRowStOps[Self <: kinkeyofPickIDetailsRowSt] (val x: Self) extends AnyVal {
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
    def setCell(value: String): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellAnimation(value: String): Self = this.set("cellAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellPadded(value: String): Self = this.set("cellPadded", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellUnpadded(value: String): Self = this.set("cellUnpadded", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMultiline(value: String): Self = this.set("isMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRowHeader(value: String): Self = this.set("isRowHeader", value.asInstanceOf[js.Any])
  }
  
}

