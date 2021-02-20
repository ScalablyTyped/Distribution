package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderEmailOptions extends StObject {
  
  var from: js.UndefOr[String] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var sendVerificationRequest: js.UndefOr[js.Function1[/* options */ VerificationRequestParams, js.Promise[Unit]]] = js.native
  
  var server: js.UndefOr[String | ProviderEmailServer] = js.native
}
object ProviderEmailOptions {
  
  @scala.inline
  def apply(): ProviderEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderEmailOptions]
  }
  
  @scala.inline
  implicit class ProviderEmailOptionsMutableBuilder[Self <: ProviderEmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    @scala.inline
    def setSendVerificationRequest(value: /* options */ VerificationRequestParams => js.Promise[Unit]): Self = StObject.set(x, "sendVerificationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendVerificationRequestUndefined: Self = StObject.set(x, "sendVerificationRequest", js.undefined)
    
    @scala.inline
    def setServer(value: String | ProviderEmailServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
