package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAll extends StObject {
  
  var query: All
}
object QueryAll {
  
  inline def apply(query: All): QueryAll = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryAll] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: All): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
