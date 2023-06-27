package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var query: js.UndefOr[S] = js.undefined
}
object `51` {
  
  inline def apply(): `51` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`51`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `51`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: S): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
