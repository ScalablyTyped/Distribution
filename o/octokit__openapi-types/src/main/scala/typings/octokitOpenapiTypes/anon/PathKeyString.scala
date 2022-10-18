package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathKeyString extends StObject {
  
  var path: KeyString
}
object PathKeyString {
  
  inline def apply(path: KeyString): PathKeyString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathKeyString]
  }
  
  extension [Self <: PathKeyString](x: Self) {
    
    inline def setPath(value: KeyString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
