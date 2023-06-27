package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `795` extends StObject {
  
  var query: js.UndefOr[DirectionFilter] = js.undefined
}
object `795` {
  
  inline def apply(): `795` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`795`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `795`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: DirectionFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
