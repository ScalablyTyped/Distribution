package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `803` extends StObject {
  
  var query: js.UndefOr[AffiliationBefore] = js.undefined
}
object `803` {
  
  inline def apply(): `803` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`803`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `803`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: AffiliationBefore): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
