package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form extends StObject {
  
  /** ! The URI where to send the form when it's submitted. */
  var actionUri: js.UndefOr[String] = js.native
  
  /** ! The names of form fields related to the vulnerability. */
  var fields: js.UndefOr[js.Array[String]] = js.native
}
object Form {
  
  @scala.inline
  def apply(): Form = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Form]
  }
  
  @scala.inline
  implicit class FormMutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionUri(value: String): Self = StObject.set(x, "actionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUriUndefined: Self = StObject.set(x, "actionUri", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
