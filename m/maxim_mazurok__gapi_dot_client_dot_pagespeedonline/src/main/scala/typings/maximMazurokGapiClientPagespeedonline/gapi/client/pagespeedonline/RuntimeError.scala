package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeError extends StObject {
  
  /** The enumerated Lighthouse Error code. */
  var code: js.UndefOr[String] = js.undefined
  
  /** A human readable message explaining the error code. */
  var message: js.UndefOr[String] = js.undefined
}
object RuntimeError {
  
  @scala.inline
  def apply(): RuntimeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeError]
  }
  
  @scala.inline
  implicit class RuntimeErrorMutableBuilder[Self <: RuntimeError] (val x: Self) extends AnyVal {
    
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
