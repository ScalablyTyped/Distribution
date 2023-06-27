package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `466` extends StObject {
  
  var query: js.UndefOr[PagePerpageState] = js.undefined
}
object `466` {
  
  inline def apply(): `466` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`466`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `466`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PagePerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
