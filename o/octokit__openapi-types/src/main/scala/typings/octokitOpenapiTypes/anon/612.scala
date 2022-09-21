package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `612` extends StObject {
  
  var query: PackagetypeVisibility
}
object `612` {
  
  inline def apply(query: PackagetypeVisibility): `612` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`612`]
  }
  
  extension [Self <: `612`](x: Self) {
    
    inline def setQuery(value: PackagetypeVisibility): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
