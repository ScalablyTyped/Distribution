package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSecurityproduct extends StObject {
  
  var path: Securityproduct
}
object PathSecurityproduct {
  
  inline def apply(path: Securityproduct): PathSecurityproduct = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSecurityproduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathSecurityproduct] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Securityproduct): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
