package typings.nivoCore.anon

import typings.nivoCore.mod.SvgFillMatcher
import typings.nivoCore.nivoCoreStrings.Asterisk
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id[T] extends StObject {
  
  var id: String
  
  var `match`: (Record[String, Any]) | SvgFillMatcher[T] | Asterisk
}
object Id {
  
  inline def apply[T](id: String, `match`: (Record[String, Any]) | SvgFillMatcher[T] | Asterisk): Id[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[T]]
  }
  
  extension [Self <: Id[?], T](x: Self & Id[T]) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: (Record[String, Any]) | SvgFillMatcher[T] | Asterisk): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchFunction1(value: T => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
  }
}
