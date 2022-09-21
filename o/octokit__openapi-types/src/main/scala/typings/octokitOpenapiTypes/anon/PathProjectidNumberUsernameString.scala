package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidNumberUsernameString extends StObject {
  
  var path: ProjectidNumberUsernameString
}
object PathProjectidNumberUsernameString {
  
  inline def apply(path: ProjectidNumberUsernameString): PathProjectidNumberUsernameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidNumberUsernameString]
  }
  
  extension [Self <: PathProjectidNumberUsernameString](x: Self) {
    
    inline def setPath(value: ProjectidNumberUsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
