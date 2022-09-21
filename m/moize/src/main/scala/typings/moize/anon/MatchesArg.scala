package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchesArg[Matcher /* <: typings.moize.mod.IsEqual */] extends StObject {
  
  var matchesArg: Matcher
}
object MatchesArg {
  
  inline def apply[Matcher /* <: typings.moize.mod.IsEqual */](matchesArg: Matcher): MatchesArg[Matcher] = {
    val __obj = js.Dynamic.literal(matchesArg = matchesArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchesArg[Matcher]]
  }
  
  extension [Self <: MatchesArg[?], Matcher /* <: typings.moize.mod.IsEqual */](x: Self & MatchesArg[Matcher]) {
    
    inline def setMatchesArg(value: Matcher): Self = StObject.set(x, "matchesArg", value.asInstanceOf[js.Any])
  }
}
