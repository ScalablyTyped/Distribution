package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseScimgroupid extends StObject {
  
  var path: EnterpriseScimgroupid
  
  var query: ExcludedAttributes
}
object PathEnterpriseScimgroupid {
  
  inline def apply(path: EnterpriseScimgroupid, query: ExcludedAttributes): PathEnterpriseScimgroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseScimgroupid]
  }
  
  extension [Self <: PathEnterpriseScimgroupid](x: Self) {
    
    inline def setPath(value: EnterpriseScimgroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ExcludedAttributes): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
