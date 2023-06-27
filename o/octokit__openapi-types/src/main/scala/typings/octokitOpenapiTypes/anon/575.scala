package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `575` extends StObject {
  
  var query: js.UndefOr[AllBefore] = js.undefined
}
object `575` {
  
  inline def apply(): `575` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`575`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `575`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: AllBefore): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
