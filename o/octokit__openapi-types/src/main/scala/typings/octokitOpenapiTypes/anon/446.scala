package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `446` extends StObject {
  
  var query: js.UndefOr[PerpageRepositoryid] = js.undefined
}
object `446` {
  
  inline def apply(): `446` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`446`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `446`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PerpageRepositoryid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
