package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgidRunnergroupid extends StObject {
  
  var path: OrgidRunnergroupid
}
object PathOrgidRunnergroupid {
  
  inline def apply(path: OrgidRunnergroupid): PathOrgidRunnergroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgidRunnergroupid]
  }
  
  extension [Self <: PathOrgidRunnergroupid](x: Self) {
    
    inline def setPath(value: OrgidRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
