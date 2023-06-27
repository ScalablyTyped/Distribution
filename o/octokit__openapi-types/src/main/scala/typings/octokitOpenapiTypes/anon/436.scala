package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `436` extends StObject {
  
  var query: js.UndefOr[`435`] = js.undefined
}
object `436` {
  
  inline def apply(): `436` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`436`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `436`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: `435`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
