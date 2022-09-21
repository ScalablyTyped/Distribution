package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableStyle object, for use in `tableStyle.set({ ... })`. */
trait TableStyleUpdateData extends StObject {
  
  /**
    * Specifies the name of the table style.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}
object TableStyleUpdateData {
  
  inline def apply(): TableStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyleUpdateData]
  }
  
  extension [Self <: TableStyleUpdateData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
