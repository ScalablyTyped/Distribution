package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `775` extends StObject {
  
  var query: js.UndefOr[`706`] = js.undefined
}
object `775` {
  
  inline def apply(): `775` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`775`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `775`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: `706`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
