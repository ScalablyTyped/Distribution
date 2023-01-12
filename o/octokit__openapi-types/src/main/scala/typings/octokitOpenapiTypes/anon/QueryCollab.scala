package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCollab extends StObject {
  
  var query: Collab
}
object QueryCollab {
  
  inline def apply(query: Collab): QueryCollab = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCollab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryCollab] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Collab): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
