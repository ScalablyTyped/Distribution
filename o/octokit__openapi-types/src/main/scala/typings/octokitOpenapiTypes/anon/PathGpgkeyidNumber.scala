package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGpgkeyidNumber extends StObject {
  
  var path: GpgkeyidNumber
}
object PathGpgkeyidNumber {
  
  inline def apply(path: GpgkeyidNumber): PathGpgkeyidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGpgkeyidNumber]
  }
  
  extension [Self <: PathGpgkeyidNumber](x: Self) {
    
    inline def setPath(value: GpgkeyidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
