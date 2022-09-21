package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidTeamid extends StObject {
  
  var path: ProjectidTeamid
}
object PathProjectidTeamid {
  
  inline def apply(path: ProjectidTeamid): PathProjectidTeamid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidTeamid]
  }
  
  extension [Self <: PathProjectidTeamid](x: Self) {
    
    inline def setPath(value: ProjectidTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
