package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumber extends StObject {
  
  var path: TeamidNumber
}
object PathTeamidNumber {
  
  inline def apply(path: TeamidNumber): PathTeamidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
