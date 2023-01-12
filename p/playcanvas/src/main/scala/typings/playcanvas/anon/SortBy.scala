package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortBy extends StObject {
  
  var sortBy: String
}
object SortBy {
  
  inline def apply(sortBy: String): SortBy = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortBy] (val x: Self) extends AnyVal {
    
    inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
  }
}
