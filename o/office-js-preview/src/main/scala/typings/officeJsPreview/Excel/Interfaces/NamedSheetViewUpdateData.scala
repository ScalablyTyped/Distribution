package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NamedSheetView object, for use in `namedSheetView.set({ ... })`. */
trait NamedSheetViewUpdateData extends StObject {
  
  /**
    * Gets or sets the name of the sheet view.
    The temporary sheet view name is the empty string ("").  Naming the view by using the name property causes the sheet view to be saved.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
}
object NamedSheetViewUpdateData {
  
  inline def apply(): NamedSheetViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedSheetViewUpdateData]
  }
  
  extension [Self <: NamedSheetViewUpdateData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
