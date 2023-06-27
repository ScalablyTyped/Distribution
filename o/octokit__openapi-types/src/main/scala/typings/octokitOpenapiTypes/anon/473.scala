package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `473` extends StObject {
  
  var query: js.UndefOr[Type] = js.undefined
}
object `473` {
  
  inline def apply(): `473` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`473`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `473`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Type): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
