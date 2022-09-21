package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  /** ! The URI where to send the form when it's submitted. */
  var actionUri: js.UndefOr[String] = js.undefined
  
  /** ! The names of form fields related to the vulnerability. */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
}
object Form {
  
  inline def apply(): Form = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Form]
  }
  
  extension [Self <: Form](x: Self) {
    
    inline def setActionUri(value: String): Self = StObject.set(x, "actionUri", value.asInstanceOf[js.Any])
    
    inline def setActionUriUndefined: Self = StObject.set(x, "actionUri", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
