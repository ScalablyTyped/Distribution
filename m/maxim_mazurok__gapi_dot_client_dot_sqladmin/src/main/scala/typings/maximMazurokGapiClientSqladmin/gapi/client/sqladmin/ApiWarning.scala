package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiWarning extends StObject {
  
  /** Code to uniquely identify the warning type. */
  var code: js.UndefOr[String] = js.native
  
  /** The warning message. */
  var message: js.UndefOr[String] = js.native
}
object ApiWarning {
  
  @scala.inline
  def apply(): ApiWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiWarning]
  }
  
  @scala.inline
  implicit class ApiWarningMutableBuilder[Self <: ApiWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
