package typings.pkgcloud.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientError extends Error {
  
  var failCode: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var provider: js.UndefOr[Providers] = js.native
  
  var result: js.UndefOr[js.Any] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
}
object ClientError {
  
  @scala.inline
  def apply(message: String, name: String): ClientError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientError]
  }
  
  @scala.inline
  implicit class ClientErrorMutableBuilder[Self <: ClientError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailCode(value: String): Self = StObject.set(x, "failCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailCodeUndefined: Self = StObject.set(x, "failCode", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setProvider(value: Providers): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
