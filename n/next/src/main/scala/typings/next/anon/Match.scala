package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.serverRouterMod.RouteMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Match extends StObject {
  
  var `match`: RouteMatch
  
  var page: String
}
object Match {
  
  inline def apply(
    `match`: /* pathname */ js.UndefOr[String | Null] => `false` | typings.next.serverRouterMod.Params,
    page: String
  ): Match = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Match]
  }
  
  extension [Self <: Match](x: Self) {
    
    inline def setMatch(value: /* pathname */ js.UndefOr[String | Null] => `false` | typings.next.serverRouterMod.Params): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
