package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `553` extends StObject {
  
  var query: js.UndefOr[`552`] = js.undefined
}
object `553` {
  
  inline def apply(): `553` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`553`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `553`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
