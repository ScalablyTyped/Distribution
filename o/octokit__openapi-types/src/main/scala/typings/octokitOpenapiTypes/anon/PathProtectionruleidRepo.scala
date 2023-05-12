package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProtectionruleidRepo extends StObject {
  
  var path: ProtectionruleidRepo
}
object PathProtectionruleidRepo {
  
  inline def apply(path: ProtectionruleidRepo): PathProtectionruleidRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProtectionruleidRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathProtectionruleidRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ProtectionruleidRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
