package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedSheetView.toJSON()`. */
trait NamedSheetViewData extends StObject {
  
  /**
    * Gets or sets the name of the sheet view.
    The temporary sheet view name is the empty string ("").  Naming the view by using the name property causes the sheet view to be saved.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
}
object NamedSheetViewData {
  
  inline def apply(): NamedSheetViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedSheetViewData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedSheetViewData] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
