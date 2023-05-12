package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerProtectionruleid extends StObject {
  
  var path: OwnerProtectionruleid
}
object PathOwnerProtectionruleid {
  
  inline def apply(path: OwnerProtectionruleid): PathOwnerProtectionruleid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerProtectionruleid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerProtectionruleid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerProtectionruleid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
