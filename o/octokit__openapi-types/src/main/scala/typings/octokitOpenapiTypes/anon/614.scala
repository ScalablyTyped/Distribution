package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `614` extends StObject {
  
  var path: OrgPackagename
  
  var query: js.UndefOr[`613`] = js.undefined
}
object `614` {
  
  inline def apply(path: OrgPackagename): `614` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`614`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `614`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPackagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `613`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
