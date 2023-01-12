package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberUsernameString extends StObject {
  
  var path: TeamidNumberUsernameString
}
object PathTeamidNumberUsernameString {
  
  inline def apply(path: TeamidNumberUsernameString): PathTeamidNumberUsernameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberUsernameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamidNumberUsernameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamidNumberUsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
