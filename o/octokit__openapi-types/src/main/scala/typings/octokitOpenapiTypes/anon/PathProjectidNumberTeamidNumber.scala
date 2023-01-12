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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathProjectidNumberTeamidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ProjectidNumberTeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
