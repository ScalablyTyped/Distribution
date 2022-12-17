package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathThreadidNumber extends StObject {
  
  var path: ThreadidNumber
}
object PathThreadidNumber {
  
  inline def apply(path: ThreadidNumber): PathThreadidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathThreadidNumber]
  }
  
  extension [Self <: PathThreadidNumber](x: Self) {
    
    inline def setPath(value: ThreadidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
