package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `657` extends StObject {
  
  var query: DirectionFilter
}
object `657` {
  
  inline def apply(query: DirectionFilter): `657` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`657`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `657`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: DirectionFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
