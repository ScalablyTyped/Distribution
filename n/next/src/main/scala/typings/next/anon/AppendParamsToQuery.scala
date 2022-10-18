package typings.next.anon

import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendParamsToQuery extends StObject {
  
  var appendParamsToQuery: Boolean
  
  var destination: String
  
  var params: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params
  
  var query: NextParsedUrlQuery
}
object AppendParamsToQuery {
  
  inline def apply(
    appendParamsToQuery: Boolean,
    destination: String,
    params: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params,
    query: NextParsedUrlQuery
  ): AppendParamsToQuery = {
    val __obj = js.Dynamic.literal(appendParamsToQuery = appendParamsToQuery.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendParamsToQuery]
  }
  
  extension [Self <: AppendParamsToQuery](x: Self) {
    
    inline def setAppendParamsToQuery(value: Boolean): Self = StObject.set(x, "appendParamsToQuery", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setParams(value: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: NextParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
