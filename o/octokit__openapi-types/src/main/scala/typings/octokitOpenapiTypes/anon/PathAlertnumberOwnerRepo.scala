package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberOwnerRepo extends StObject {
  
  var path: AlertnumberOwnerRepo
}
object PathAlertnumberOwnerRepo {
  
  inline def apply(path: AlertnumberOwnerRepo): PathAlertnumberOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAlertnumberOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AlertnumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
