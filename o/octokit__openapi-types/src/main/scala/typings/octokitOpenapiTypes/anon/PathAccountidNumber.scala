package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAccountidNumber extends StObject {
  
  var path: AccountidNumber
}
object PathAccountidNumber {
  
  inline def apply(path: AccountidNumber): PathAccountidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAccountidNumber]
  }
  
  extension [Self <: PathAccountidNumber](x: Self) {
    
    inline def setPath(value: AccountidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
