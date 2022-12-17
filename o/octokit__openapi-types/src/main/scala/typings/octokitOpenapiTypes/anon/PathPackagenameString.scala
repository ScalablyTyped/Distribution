package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenameString extends StObject {
  
  var path: PackagenameString
}
object PathPackagenameString {
  
  inline def apply(path: PackagenameString): PathPackagenameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenameString]
  }
  
  extension [Self <: PathPackagenameString](x: Self) {
    
    inline def setPath(value: PackagenameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
