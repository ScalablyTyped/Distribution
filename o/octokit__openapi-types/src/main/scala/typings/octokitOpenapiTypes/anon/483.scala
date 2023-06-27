package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `483` extends StObject {
  
  var query: js.UndefOr[`482`] = js.undefined
}
object `483` {
  
  inline def apply(): `483` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`483`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `483`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: `482`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
