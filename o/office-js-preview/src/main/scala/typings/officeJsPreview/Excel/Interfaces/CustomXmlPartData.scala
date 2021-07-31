package typings.officeJsPreview.Excel.Interfaces

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
  
  @scala.inline
  def apply(): CustomXmlPartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartData]
  }
  
  @scala.inline
  implicit class CustomXmlPartDataMutableBuilder[Self <: CustomXmlPartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUriUndefined: Self = StObject.set(x, "namespaceUri", js.undefined)
  }
}
