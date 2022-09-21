package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidUsername extends StObject {
  
  var path: TeamidUsername
}
object PathTeamidUsername {
  
  inline def apply(path: TeamidUsername): PathTeamidUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidUsername]
  }
  
  extension [Self <: PathTeamidUsername](x: Self) {
    
    inline def setPath(value: TeamidUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
