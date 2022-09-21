package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the WorksheetCustomProperty object, for use in `worksheetCustomProperty.set({ ... })`. */
trait WorksheetCustomPropertyUpdateData extends StObject {
  
  /**
    * Gets or sets the value of the custom property.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var value: js.UndefOr[String] = js.undefined
}
object WorksheetCustomPropertyUpdateData {
  
  inline def apply(): WorksheetCustomPropertyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyUpdateData]
  }
  
  extension [Self <: WorksheetCustomPropertyUpdateData](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
