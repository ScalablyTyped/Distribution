package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.BindingType
import typings.officeJs.officeJsStrings.Range
import typings.officeJs.officeJsStrings.Table
import typings.officeJs.officeJsStrings.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `binding.toJSON()`. */
trait BindingData extends StObject {
  
  /**
    * Represents the binding identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the type of the binding. See `Excel.BindingType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[BindingType | Range | Table | Text] = js.undefined
}
object BindingData {
  
  inline def apply(): BindingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingData]
  }
  
  extension [Self <: BindingData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: BindingType | Range | Table | Text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
