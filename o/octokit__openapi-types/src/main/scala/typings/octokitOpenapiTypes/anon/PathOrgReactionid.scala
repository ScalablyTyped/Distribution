package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgReactionid extends StObject {
  
  var path: OrgReactionid
}
object PathOrgReactionid {
  
  inline def apply(path: OrgReactionid): PathOrgReactionid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgReactionid]
  }
  
  extension [Self <: PathOrgReactionid](x: Self) {
    
    inline def setPath(value: OrgReactionid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
