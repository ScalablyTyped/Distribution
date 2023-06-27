package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `607` extends StObject {
  
  var path: OrgString
  
  var query: js.UndefOr[ExcludePage] = js.undefined
}
object `607` {
  
  inline def apply(path: OrgString): `607` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`607`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `607`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ExcludePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
