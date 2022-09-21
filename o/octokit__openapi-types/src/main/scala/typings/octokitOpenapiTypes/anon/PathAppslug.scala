package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAppslug extends StObject {
  
  var path: Appslug
}
object PathAppslug {
  
  inline def apply(path: Appslug): PathAppslug = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAppslug]
  }
  
  extension [Self <: PathAppslug](x: Self) {
    
    inline def setPath(value: Appslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
