package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamslug extends StObject {
  
  var path: Teamslug
}
object PathTeamslug {
  
  inline def apply(path: Teamslug): PathTeamslug = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamslug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamslug] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Teamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
