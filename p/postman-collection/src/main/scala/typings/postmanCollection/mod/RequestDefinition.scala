package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDefinition
  extends StObject
     with PropertyDefinition {
  
  var auth: js.UndefOr[RequestAuthDefinition] = js.undefined
  
  var body: js.UndefOr[RequestBodyDefinition] = js.undefined
  
  var certificate: js.UndefOr[CertificateDefinition] = js.undefined
  
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[ProxyConfigDefinition] = js.undefined
  
  var url: String | Url
}
object RequestDefinition {
  
  @scala.inline
  def apply(url: String | Url): RequestDefinition = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDefinition]
  }
  
  @scala.inline
  implicit class RequestDefinitionMutableBuilder[Self <: RequestDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: RequestAuthDefinition): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBody(value: RequestBodyDefinition): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCertificate(value: CertificateDefinition): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Array[HeaderDefinition]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: HeaderDefinition*): Self = StObject.set(x, "header", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setProxy(value: ProxyConfigDefinition): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setUrl(value: String | Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
