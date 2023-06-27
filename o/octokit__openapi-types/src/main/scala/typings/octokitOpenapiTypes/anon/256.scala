package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `256` extends StObject {
  
  var path: OwnerRef
  
  var query: js.UndefOr[ChecknamePage] = js.undefined
}
object `256` {
  
  inline def apply(path: OwnerRef): `256` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`256`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `256`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRef): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ChecknamePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
