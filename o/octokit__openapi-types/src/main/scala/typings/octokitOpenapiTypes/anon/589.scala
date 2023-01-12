package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `589` extends StObject {
  
  var query: PackagetypeVisibility
}
object `589` {
  
  inline def apply(query: PackagetypeVisibility): `589` = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[`589`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `589`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PackagetypeVisibility): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
