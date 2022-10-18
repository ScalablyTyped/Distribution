package typings.next.anon

import typings.next.distSharedLibRouterUtilsParseUrlMod.ParsedUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestQuery extends StObject {
  
  var destQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_querystring.ParsedUrlQuery */ Any
  
  var newUrl: String
  
  var parsedDestination: ParsedUrl
}
object DestQuery {
  
  inline def apply(
    destQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_querystring.ParsedUrlQuery */ Any,
    newUrl: String,
    parsedDestination: ParsedUrl
  ): DestQuery = {
    val __obj = js.Dynamic.literal(destQuery = destQuery.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any], parsedDestination = parsedDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestQuery]
  }
  
  extension [Self <: DestQuery](x: Self) {
    
    inline def setDestQuery(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_querystring.ParsedUrlQuery */ Any
    ): Self = StObject.set(x, "destQuery", value.asInstanceOf[js.Any])
    
    inline def setNewUrl(value: String): Self = StObject.set(x, "newUrl", value.asInstanceOf[js.Any])
    
    inline def setParsedDestination(value: ParsedUrl): Self = StObject.set(x, "parsedDestination", value.asInstanceOf[js.Any])
  }
}
