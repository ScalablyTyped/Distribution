package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationRequestParams extends StObject {
  
  var baseUrl: String
  
  var identifier: String
  
  var provider: ProviderEmailOptions
  
  var url: String
}
object VerificationRequestParams {
  
  @scala.inline
  def apply(baseUrl: String, identifier: String, provider: ProviderEmailOptions, url: String): VerificationRequestParams = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationRequestParams]
  }
  
  @scala.inline
  implicit class VerificationRequestParamsMutableBuilder[Self <: VerificationRequestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: ProviderEmailOptions): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
