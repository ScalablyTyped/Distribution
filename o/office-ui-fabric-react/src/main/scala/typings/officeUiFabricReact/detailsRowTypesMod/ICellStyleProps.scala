package typings.officeUiFabricReact.detailsRowTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellStyleProps extends js.Object {
  var cellExtraRightPadding: Double = js.native
  var cellLeftPadding: Double = js.native
  var cellRightPadding: Double = js.native
}

object ICellStyleProps {
  @scala.inline
  def apply(cellExtraRightPadding: Double, cellLeftPadding: Double, cellRightPadding: Double): ICellStyleProps = {
    val __obj = js.Dynamic.literal(cellExtraRightPadding = cellExtraRightPadding.asInstanceOf[js.Any], cellLeftPadding = cellLeftPadding.asInstanceOf[js.Any], cellRightPadding = cellRightPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellStyleProps]
  }
  @scala.inline
  implicit class ICellStylePropsOps[Self <: ICellStyleProps] (val x: Self) extends AnyVal {
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
    def setCellExtraRightPadding(value: Double): Self = this.set("cellExtraRightPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellLeftPadding(value: Double): Self = this.set("cellLeftPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellRightPadding(value: Double): Self = this.set("cellRightPadding", value.asInstanceOf[js.Any])
  }
  
}

