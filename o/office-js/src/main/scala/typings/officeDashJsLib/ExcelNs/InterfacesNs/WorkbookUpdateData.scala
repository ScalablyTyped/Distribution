package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Workbook object, for use in "workbook.set({ ... })". */
trait WorkbookUpdateData extends js.Object {
  /**
    *
    * Gets the workbook properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.undefined
}

object WorkbookUpdateData {
  @scala.inline
  def apply(properties: DocumentPropertiesUpdateData = null): WorkbookUpdateData = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[WorkbookUpdateData]
  }
}

