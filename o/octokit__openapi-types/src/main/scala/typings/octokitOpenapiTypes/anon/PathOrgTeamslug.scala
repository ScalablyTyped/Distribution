package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgTeamslug extends StObject {
  
  var path: OrgTeamslug
}
object PathOrgTeamslug {
  
  inline def apply(path: OrgTeamslug): PathOrgTeamslug = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgTeamslug]
  }
  
  extension [Self <: PathOrgTeamslug](x: Self) {
    
    inline def setPath(value: OrgTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
