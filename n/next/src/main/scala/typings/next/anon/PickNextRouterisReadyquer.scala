package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/shared/lib/router/router.NextRouter, 'isReady' | 'query'> */
trait PickNextRouterisReadyquer extends StObject {
  
  var isReady: Boolean
  
  var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
}
object PickNextRouterisReadyquer {
  
  inline def apply(
    isReady: Boolean,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): PickNextRouterisReadyquer = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNextRouterisReadyquer]
  }
  
  extension [Self <: PickNextRouterisReadyquer](x: Self) {
    
    inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    inline def setQuery(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
