package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgStringUsernameString extends StObject {
  
  var path: OrgStringUsernameString
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathOrgStringUsernameString {
  
  inline def apply(path: OrgStringUsernameString): PathOrgStringUsernameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgStringUsernameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgStringUsernameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgStringUsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
