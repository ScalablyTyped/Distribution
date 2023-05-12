package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRedelivery extends StObject {
  
  var query: Redelivery
}
object QueryRedelivery {
  
  inline def apply(query: Redelivery): QueryRedelivery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRedelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRedelivery] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Redelivery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
