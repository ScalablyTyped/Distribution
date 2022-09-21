package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamslugUsername extends StObject {
  
  var path: TeamslugUsername
}
object PathTeamslugUsername {
  
  inline def apply(path: TeamslugUsername): PathTeamslugUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamslugUsername]
  }
  
  extension [Self <: PathTeamslugUsername](x: Self) {
    
    inline def setPath(value: TeamslugUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
