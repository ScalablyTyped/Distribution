package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the document that raised the SelectionChanged event.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait SelectionChangedEventArgs extends js.Object {
  /**
    *
    * Gets the workbook object that raised the SelectionChanged event.
    *
    * [Api set: ExcelApi 1.2]
    */
  var workbook: Workbook = js.native
}

object SelectionChangedEventArgs {
  @scala.inline
  def apply(workbook: Workbook): SelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(workbook = workbook.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangedEventArgs]
  }
  @scala.inline
  implicit class SelectionChangedEventArgsOps[Self <: SelectionChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setWorkbook(value: Workbook): Self = this.set("workbook", value.asInstanceOf[js.Any])
  }
  
}

