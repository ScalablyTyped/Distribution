package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotTableStyle object, for use in `pivotTableStyle.set({ ... })`. */
trait PivotTableStyleUpdateData extends StObject {
  
  /**
    * Specifies the name of the PivotTable style.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}
object PivotTableStyleUpdateData {
  
  inline def apply(): PivotTableStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableStyleUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableStyleUpdateData] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
