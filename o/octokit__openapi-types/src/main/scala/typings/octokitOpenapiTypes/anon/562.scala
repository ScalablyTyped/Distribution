package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `562` extends StObject {
  
  var query: js.UndefOr[PagePerpageSince] = js.undefined
}
object `562` {
  
  inline def apply(): `562` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`562`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `562`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PagePerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
