package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `630` extends StObject {
  
  var query: DirectionFilter
}
object `630` {
  
  inline def apply(query: DirectionFilter): `630` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`630`]
  }
  
  extension [Self <: `630`](x: Self) {
    
    inline def setQuery(value: DirectionFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
