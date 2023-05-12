package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRequiredworkflowid extends StObject {
  
  var path: OrgRequiredworkflowid
}
object PathOrgRequiredworkflowid {
  
  inline def apply(path: OrgRequiredworkflowid): PathOrgRequiredworkflowid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRequiredworkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgRequiredworkflowid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgRequiredworkflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
