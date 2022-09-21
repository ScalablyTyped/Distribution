package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgProjectid extends StObject {
  
  var path: OrgProjectid
}
object PathOrgProjectid {
  
  inline def apply(path: OrgProjectid): PathOrgProjectid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgProjectid]
  }
  
  extension [Self <: PathOrgProjectid](x: Self) {
    
    inline def setPath(value: OrgProjectid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
