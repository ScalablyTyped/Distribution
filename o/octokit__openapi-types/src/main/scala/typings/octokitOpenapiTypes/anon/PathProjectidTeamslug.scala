package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidTeamslug extends StObject {
  
  var path: ProjectidTeamslug
}
object PathProjectidTeamslug {
  
  inline def apply(path: ProjectidTeamslug): PathProjectidTeamslug = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidTeamslug]
  }
  
  extension [Self <: PathProjectidTeamslug](x: Self) {
    
    inline def setPath(value: ProjectidTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
