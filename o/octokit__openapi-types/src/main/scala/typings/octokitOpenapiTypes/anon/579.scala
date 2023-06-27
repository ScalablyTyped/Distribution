package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `579` extends StObject {
  
  var query: js.UndefOr[`578`] = js.undefined
}
object `579` {
  
  inline def apply(): `579` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`579`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `579`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: `578`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
