package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `550` extends StObject {
  
  var query: js.UndefOr[Redelivery] = js.undefined
}
object `550` {
  
  inline def apply(): `550` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`550`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `550`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Redelivery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
