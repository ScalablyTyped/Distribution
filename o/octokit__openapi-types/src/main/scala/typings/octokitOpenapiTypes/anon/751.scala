package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `751` extends StObject {
  
  var path: OwnerReleaseid
  
  var query: js.UndefOr[`750`] = js.undefined
}
object `751` {
  
  inline def apply(path: OwnerReleaseid): `751` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`751`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `751`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `750`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
