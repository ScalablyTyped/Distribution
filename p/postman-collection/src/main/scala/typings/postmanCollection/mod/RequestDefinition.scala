package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDefinition extends PropertyDefinition {
  
  var auth: js.UndefOr[RequestAuthDefinition] = js.native
  
  var body: js.UndefOr[RequestBodyDefinition] = js.native
  
  var certificate: js.UndefOr[CertificateDefinition] = js.native
  
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[ProxyConfigDefinition] = js.native
  
  var url: String | Url = js.native
}
object RequestDefinition {
  
  @scala.inline
  def apply(url: String | Url): RequestDefinition = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDefinition]
  }
  
  @scala.inline
  implicit class RequestDefinitionOps[Self <: RequestDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String | Url): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth(value: RequestAuthDefinition): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setBody(value: RequestBodyDefinition): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCertificate(value: CertificateDefinition): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: HeaderDefinition*): Self = this.set("header", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: js.Array[HeaderDefinition]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setProxy(value: ProxyConfigDefinition): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
}
