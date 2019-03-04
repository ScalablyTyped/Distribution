package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the document that raised the SelectionChanged event.
  *
  * [Api set: ExcelApi 1.2]
  */
trait SelectionChangedEventArgs extends js.Object {
  /**
    *
    * Gets the workbook object that raised the SelectionChanged event.
    *
    * [Api set: ExcelApi 1.2]
    */
  var workbook: Workbook
}

object SelectionChangedEventArgs {
  @scala.inline
  def apply(workbook: Workbook): SelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(workbook = workbook)
  
    __obj.asInstanceOf[SelectionChangedEventArgs]
  }
}

