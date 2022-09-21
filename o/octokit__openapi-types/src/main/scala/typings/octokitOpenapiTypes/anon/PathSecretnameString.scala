package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSecretnameString extends StObject {
  
  var path: SecretnameString
}
object PathSecretnameString {
  
  inline def apply(path: SecretnameString): PathSecretnameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSecretnameString]
  }
  
  extension [Self <: PathSecretnameString](x: Self) {
    
    inline def setPath(value: SecretnameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
