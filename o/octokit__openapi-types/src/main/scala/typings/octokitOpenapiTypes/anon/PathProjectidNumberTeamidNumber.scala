package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidNumberTeamidNumber extends StObject {
  
  var path: ProjectidNumberTeamidNumber
}
object PathProjectidNumberTeamidNumber {
  
  inline def apply(path: ProjectidNumberTeamidNumber): PathProjectidNumberTeamidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidNumberTeamidNumber]
  }
  
  extension [Self <: PathProjectidNumberTeamidNumber](x: Self) {
    
    inline def setPath(value: ProjectidNumberTeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
