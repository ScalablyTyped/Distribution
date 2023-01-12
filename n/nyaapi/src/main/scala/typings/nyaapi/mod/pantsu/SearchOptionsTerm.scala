package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptionsTerm
  extends StObject
     with SearchOptions {
  
  @JSName("term")
  var term_SearchOptionsTerm: String
}
object SearchOptionsTerm {
  
  inline def apply(term: String): SearchOptionsTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchOptionsTerm] (val x: Self) extends AnyVal {
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
