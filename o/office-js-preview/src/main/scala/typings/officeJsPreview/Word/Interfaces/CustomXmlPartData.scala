package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customXmlPart.toJSON()`. */
trait CustomXmlPartData extends StObject {
  
  /**
    * Gets the ID of the custom XML part.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the namespace URI of the custom XML part.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var namespaceUri: js.UndefOr[String] = js.undefined
}
object CustomXmlPartData {
  
  inline def apply(): CustomXmlPartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomXmlPartData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUriUndefined: Self = StObject.set(x, "namespaceUri", js.undefined)
  }
}
