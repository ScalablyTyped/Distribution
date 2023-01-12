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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchesKey[?], Matcher /* <: IsMatchingKey */] (val x: Self & MatchesKey[Matcher]) extends AnyVal {
    
    inline def setMatchesKey(value: Matcher): Self = StObject.set(x, "matchesKey", value.asInstanceOf[js.Any])
  }
}
