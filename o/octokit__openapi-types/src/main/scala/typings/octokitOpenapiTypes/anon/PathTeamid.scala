package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamid extends StObject {
  
  var path: Teamid
}
object PathTeamid {
  
  inline def apply(path: Teamid): PathTeamid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamid]
  }
  
  extension [Self <: PathTeamid](x: Self) {
    
    inline def setPath(value: Teamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
