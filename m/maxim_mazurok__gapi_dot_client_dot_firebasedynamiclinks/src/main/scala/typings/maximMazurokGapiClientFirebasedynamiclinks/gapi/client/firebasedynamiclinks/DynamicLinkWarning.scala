package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicLinkWarning extends StObject {
  
  /** The warning code. */
  var warningCode: js.UndefOr[String] = js.native
  
  /** The document describing the warning, and helps resolve. */
  var warningDocumentLink: js.UndefOr[String] = js.native
  
  /** The warning message to help developers improve their requests. */
  var warningMessage: js.UndefOr[String] = js.native
}
object DynamicLinkWarning {
  
  @scala.inline
  def apply(): DynamicLinkWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkWarning]
  }
  
  @scala.inline
  implicit class DynamicLinkWarningMutableBuilder[Self <: DynamicLinkWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWarningCode(value: String): Self = StObject.set(x, "warningCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningCodeUndefined: Self = StObject.set(x, "warningCode", js.undefined)
    
    @scala.inline
    def setWarningDocumentLink(value: String): Self = StObject.set(x, "warningDocumentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningDocumentLinkUndefined: Self = StObject.set(x, "warningDocumentLink", js.undefined)
    
    @scala.inline
    def setWarningMessage(value: String): Self = StObject.set(x, "warningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningMessageUndefined: Self = StObject.set(x, "warningMessage", js.undefined)
  }
}
