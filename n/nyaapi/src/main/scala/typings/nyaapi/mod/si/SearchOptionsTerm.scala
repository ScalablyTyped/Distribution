package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchOptionsTerm extends SearchOptions {
  
  @JSName("term")
  var term_SearchOptionsTerm: String = js.native
}
object SearchOptionsTerm {
  
  @scala.inline
  def apply(term: String): SearchOptionsTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsTerm]
  }
  
  @scala.inline
  implicit class SearchOptionsTermMutableBuilder[Self <: SearchOptionsTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
