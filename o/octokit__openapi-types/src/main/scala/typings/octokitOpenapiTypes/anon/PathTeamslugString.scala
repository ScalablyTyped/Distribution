package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamslugString extends StObject {
  
  var path: TeamslugString
}
object PathTeamslugString {
  
  inline def apply(path: TeamslugString): PathTeamslugString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamslugString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamslugString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamslugString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
