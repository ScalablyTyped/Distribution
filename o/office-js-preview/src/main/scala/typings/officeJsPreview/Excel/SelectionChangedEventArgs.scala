package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the document that raised the SelectionChanged event.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait SelectionChangedEventArgs extends StObject {
  
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
  implicit class SelectionChangedEventArgsMutableBuilder[Self <: SelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkbook(value: Workbook): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
  }
}
