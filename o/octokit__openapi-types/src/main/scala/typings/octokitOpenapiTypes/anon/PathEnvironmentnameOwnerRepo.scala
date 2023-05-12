package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameOwnerRepo extends StObject {
  
  var path: EnvironmentnameOwnerRepo
}
object PathEnvironmentnameOwnerRepo {
  
  inline def apply(path: EnvironmentnameOwnerRepo): PathEnvironmentnameOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
