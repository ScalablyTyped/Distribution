package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `787` extends StObject {
  
  var query: js.UndefOr[PagePerpageRepositoryid] = js.undefined
}
object `787` {
  
  inline def apply(): `787` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`787`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `787`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PagePerpageRepositoryid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
