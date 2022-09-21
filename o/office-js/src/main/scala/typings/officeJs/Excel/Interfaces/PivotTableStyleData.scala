package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotTableStyle.toJSON()`. */
trait PivotTableStyleData extends StObject {
  
  /**
    * Specifies the name of the PivotTable style.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if this `PivotTableStyle` object is read-only.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object PivotTableStyleData {
  
  inline def apply(): PivotTableStyleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableStyleData]
  }
  
  extension [Self <: PivotTableStyleData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
