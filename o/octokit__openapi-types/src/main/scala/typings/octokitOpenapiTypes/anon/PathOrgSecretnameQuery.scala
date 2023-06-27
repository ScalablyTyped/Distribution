package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgSecretnameQuery extends StObject {
  
  var path: OrgSecretname
  
  var query: js.UndefOr[`591`] = js.undefined
}
object PathOrgSecretnameQuery {
  
  inline def apply(path: OrgSecretname): PathOrgSecretnameQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgSecretnameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgSecretnameQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `591`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
