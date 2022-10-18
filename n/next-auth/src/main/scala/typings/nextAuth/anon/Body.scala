package typings.nextAuth.anon

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: js.UndefOr[Record[String, Any]] = js.undefined
  
  var cookies: js.UndefOr[Partial[Record[String, String]]] = js.undefined
  
  var method: String
  
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  
  var query: js.UndefOr[Record[String, Any]] = js.undefined
}
object Body {
  
  inline def apply(
    method: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): Body = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: Record[String, Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCookies(value: Partial[Record[String, String]]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
