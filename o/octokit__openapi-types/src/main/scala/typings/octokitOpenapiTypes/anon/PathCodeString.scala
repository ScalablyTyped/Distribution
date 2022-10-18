package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCodeString extends StObject {
  
  var path: CodeString
}
object PathCodeString {
  
  inline def apply(path: CodeString): PathCodeString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCodeString]
  }
  
  extension [Self <: PathCodeString](x: Self) {
    
    inline def setPath(value: CodeString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
