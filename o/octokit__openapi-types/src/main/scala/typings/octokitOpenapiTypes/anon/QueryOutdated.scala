package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOutdated extends StObject {
  
  var query: Outdated
}
object QueryOutdated {
  
  inline def apply(query: Outdated): QueryOutdated = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOutdated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOutdated] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Outdated): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
