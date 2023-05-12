package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `386` extends StObject {
  
  var query: Filter
}
object `386` {
  
  inline def apply(query: Filter): `386` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`386`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `386`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Filter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
