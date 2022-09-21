package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathScimgroupid extends StObject {
  
  var path: Scimgroupid
  
  var query: ExcludedAttributes
}
object PathScimgroupid {
  
  inline def apply(path: Scimgroupid, query: ExcludedAttributes): PathScimgroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathScimgroupid]
  }
  
  extension [Self <: PathScimgroupid](x: Self) {
    
    inline def setPath(value: Scimgroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ExcludedAttributes): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
