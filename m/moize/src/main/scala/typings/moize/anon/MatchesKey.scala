package typings.moize.anon

import typings.moize.mod.IsMatchingKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchesKey[Matcher /* <: IsMatchingKey */] extends StObject {
  
  var matchesKey: Matcher
}
object MatchesKey {
  
  inline def apply[Matcher /* <: IsMatchingKey */](matchesKey: Matcher): MatchesKey[Matcher] = {
    val __obj = js.Dynamic.literal(matchesKey = matchesKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchesKey[Matcher]]
  }
  
  extension [Self <: MatchesKey[?], Matcher /* <: IsMatchingKey */](x: Self & MatchesKey[Matcher]) {
    
    inline def setMatchesKey(value: Matcher): Self = StObject.set(x, "matchesKey", value.asInstanceOf[js.Any])
  }
}
