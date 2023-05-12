package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgPatrequestid extends StObject {
  
  var path: OrgPatrequestid
}
object PathOrgPatrequestid {
  
  inline def apply(path: OrgPatrequestid): PathOrgPatrequestid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgPatrequestid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgPatrequestid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPatrequestid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
