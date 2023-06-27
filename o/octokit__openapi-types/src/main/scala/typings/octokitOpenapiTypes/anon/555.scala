package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `555` extends StObject {
  
  var query: js.UndefOr[OutdatedPage] = js.undefined
}
object `555` {
  
  inline def apply(): `555` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`555`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `555`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: OutdatedPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
