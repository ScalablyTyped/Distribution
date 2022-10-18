package typings.next.anon

import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distServerBaseServerMod.MiddlewareRoutingItem
import typings.next.distSharedLibRouterUtilsParseUrlMod.ParsedUrl
import typings.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiddlewareList extends StObject {
  
  var middlewareList: js.Array[MiddlewareRoutingItem]
  
  var parsed: UrlWithParsedQuery
  
  var parsedUrl: ParsedUrl
  
  var request: BaseNextRequest[Any]
  
  var response: BaseNextResponse[Any]
}
object MiddlewareList {
  
  inline def apply(
    middlewareList: js.Array[MiddlewareRoutingItem],
    parsed: UrlWithParsedQuery,
    parsedUrl: ParsedUrl,
    request: BaseNextRequest[Any],
    response: BaseNextResponse[Any]
  ): MiddlewareList = {
    val __obj = js.Dynamic.literal(middlewareList = middlewareList.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareList]
  }
  
  extension [Self <: MiddlewareList](x: Self) {
    
    inline def setMiddlewareList(value: js.Array[MiddlewareRoutingItem]): Self = StObject.set(x, "middlewareList", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareListVarargs(value: MiddlewareRoutingItem*): Self = StObject.set(x, "middlewareList", js.Array(value*))
    
    inline def setParsed(value: UrlWithParsedQuery): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setParsedUrl(value: ParsedUrl): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: BaseNextRequest[Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: BaseNextResponse[Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
