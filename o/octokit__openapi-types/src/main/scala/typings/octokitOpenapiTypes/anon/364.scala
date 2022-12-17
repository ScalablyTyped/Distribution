package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `364` extends StObject {
  
  var query: Filter
}
object `364` {
  
  inline def apply(query: Filter): `364` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`364`]
  }
  
  extension [Self <: `364`](x: Self) {
    
    inline def setQuery(value: Filter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
