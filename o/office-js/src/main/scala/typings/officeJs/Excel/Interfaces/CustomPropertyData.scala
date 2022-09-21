package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.DocumentPropertyType
import typings.officeJs.officeJsStrings.Boolean
import typings.officeJs.officeJsStrings.Date
import typings.officeJs.officeJsStrings.Float
import typings.officeJs.officeJsStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customProperty.toJSON()`. */
trait CustomPropertyData extends StObject {
  
  /**
    * The key of the custom property. The key is limited to 255 characters outside of Excel on the web (larger keys are automatically trimmed to 255 characters on other platforms).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the value used for the custom property.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    DocumentPropertyType | Number | Boolean | Date | typings.officeJs.officeJsStrings.String | Float
  ] = js.undefined
  
  /**
    * The value of the custom property. The value is limited to 255 characters outside of Excel on the web (larger values are automatically trimmed to 255 characters on other platforms).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[Any] = js.undefined
}
object CustomPropertyData {
  
  inline def apply(): CustomPropertyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyData]
  }
  
  extension [Self <: CustomPropertyData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(
      value: DocumentPropertyType | Number | Boolean | Date | typings.officeJs.officeJsStrings.String | Float
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
