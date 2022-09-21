package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgSecretnameQuery451 extends StObject {
  
  var path: OrgSecretname
  
  var query: `451`
}
object PathOrgSecretnameQuery451 {
  
  inline def apply(path: OrgSecretname, query: `451`): PathOrgSecretnameQuery451 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgSecretnameQuery451]
  }
  
  extension [Self <: PathOrgSecretnameQuery451](x: Self) {
    
    inline def setPath(value: OrgSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `451`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
