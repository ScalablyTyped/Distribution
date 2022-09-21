package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseString extends StObject {
  
  var path: EnterpriseString
}
object PathEnterpriseString {
  
  inline def apply(path: EnterpriseString): PathEnterpriseString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseString]
  }
  
  extension [Self <: PathEnterpriseString](x: Self) {
    
    inline def setPath(value: EnterpriseString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
