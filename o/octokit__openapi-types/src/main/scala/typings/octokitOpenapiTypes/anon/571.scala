package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `571` extends StObject {
  
  var query: js.UndefOr[FeaturedPage] = js.undefined
}
object `571` {
  
  inline def apply(): `571` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`571`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `571`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: FeaturedPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
