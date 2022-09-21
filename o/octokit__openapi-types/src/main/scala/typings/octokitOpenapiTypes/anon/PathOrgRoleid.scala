package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRoleid extends StObject {
  
  var path: OrgRoleid
}
object PathOrgRoleid {
  
  inline def apply(path: OrgRoleid): PathOrgRoleid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRoleid]
  }
  
  extension [Self <: PathOrgRoleid](x: Self) {
    
    inline def setPath(value: OrgRoleid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
