package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customXmlPart.toJSON()`. */
trait CustomXmlPartData extends StObject {
  
  /**
    *
    * The custom XML part's ID.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The custom XML part's namespace URI.
    *
    * [Api set: ExcelApi 1.5]
    */
  var namespaceUri: js.UndefOr[String] = js.undefined
}
object CustomXmlPartData {
  
  inline def apply(): CustomXmlPartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartData]
  }
  
  extension [Self <: CustomXmlPartData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUriUndefined: Self = StObject.set(x, "namespaceUri", js.undefined)
  }
}
