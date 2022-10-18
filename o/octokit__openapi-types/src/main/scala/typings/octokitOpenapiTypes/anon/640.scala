package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `640` extends StObject {
  
  var query: PackagetypeVisibility
}
object `640` {
  
  inline def apply(query: PackagetypeVisibility): `640` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`640`]
  }
  
  extension [Self <: `640`](x: Self) {
    
    inline def setQuery(value: PackagetypeVisibility): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
