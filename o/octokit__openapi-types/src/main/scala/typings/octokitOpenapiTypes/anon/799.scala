package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `799` extends StObject {
  
  var query: js.UndefOr[`798`] = js.undefined
}
object `799` {
  
  inline def apply(): `799` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`799`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `799`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: `798`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
