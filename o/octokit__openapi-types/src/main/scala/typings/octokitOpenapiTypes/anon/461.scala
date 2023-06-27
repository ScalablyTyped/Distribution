package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `461` extends StObject {
  
  var query: js.UndefOr[Filter] = js.undefined
}
object `461` {
  
  inline def apply(): `461` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`461`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `461`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Filter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
