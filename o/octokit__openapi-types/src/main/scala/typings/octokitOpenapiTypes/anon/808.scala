package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `808` extends StObject {
  
  var query: js.UndefOr[DirectionPagePerpageSort] = js.undefined
}
object `808` {
  
  inline def apply(): `808` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`808`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `808`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: DirectionPagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
