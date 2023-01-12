package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `583` extends StObject {
  
  var query: DirectionFilter
}
object `583` {
  
  inline def apply(query: DirectionFilter): `583` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`583`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `583`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: DirectionFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
