package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackageversionidNumber extends StObject {
  
  var path: PackageversionidNumber
}
object PathPackageversionidNumber {
  
  inline def apply(path: PackageversionidNumber): PathPackageversionidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackageversionidNumber]
  }
  
  extension [Self <: PathPackageversionidNumber](x: Self) {
    
    inline def setPath(value: PackageversionidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
