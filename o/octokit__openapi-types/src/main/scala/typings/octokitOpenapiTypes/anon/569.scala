package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `569` extends StObject {
  
  var query: js.UndefOr[Orgs] = js.undefined
}
object `569` {
  
  inline def apply(): `569` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`569`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `569`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Orgs): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
