package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetCustomProperty.toJSON()`. */
trait WorksheetCustomPropertyData extends StObject {
  
  /**
    * Gets the key of the custom property. Custom property keys are case-insensitive. The key is limited to 255 characters (larger values will cause an `InvalidArgument` error to be thrown.)
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the value of the custom property.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var value: js.UndefOr[String] = js.undefined
}
object WorksheetCustomPropertyData {
  
  inline def apply(): WorksheetCustomPropertyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyData]
  }
  
  extension [Self <: WorksheetCustomPropertyData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
