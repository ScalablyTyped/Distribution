package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var query: js.UndefOr[All] = js.undefined
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: All): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
