package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProtectionruleid extends StObject {
  
  var path: Protectionruleid
}
object PathProtectionruleid {
  
  inline def apply(path: Protectionruleid): PathProtectionruleid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProtectionruleid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathProtectionruleid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Protectionruleid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
