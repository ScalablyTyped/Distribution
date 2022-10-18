package typings.next.anon

import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distSharedLibRouterUtilsParseUrlMod.ParsedUrl
import typings.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnWarning extends StObject {
  
  var onWarning: js.UndefOr[js.Function1[/* warning */ js.Error, Unit]] = js.undefined
  
  var parsed: UrlWithParsedQuery
  
  var parsedUrl: ParsedUrl
  
  var request: BaseNextRequest[Any]
  
  var response: BaseNextResponse[Any]
}
object OnWarning {
  
  inline def apply(
    parsed: UrlWithParsedQuery,
    parsedUrl: ParsedUrl,
    request: BaseNextRequest[Any],
    response: BaseNextResponse[Any]
  ): OnWarning = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnWarning]
  }
  
  extension [Self <: OnWarning](x: Self) {
    
    inline def setOnWarning(value: /* warning */ js.Error => Unit): Self = StObject.set(x, "onWarning", js.Any.fromFunction1(value))
    
    inline def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
    
    inline def setParsed(value: UrlWithParsedQuery): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setParsedUrl(value: ParsedUrl): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: BaseNextRequest[Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: BaseNextResponse[Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
