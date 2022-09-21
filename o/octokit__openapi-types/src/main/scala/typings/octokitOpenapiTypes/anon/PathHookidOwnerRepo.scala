package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOwnerRepo extends StObject {
  
  var path: HookidOwnerRepo
}
object PathHookidOwnerRepo {
  
  inline def apply(path: HookidOwnerRepo): PathHookidOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOwnerRepo]
  }
  
  extension [Self <: PathHookidOwnerRepo](x: Self) {
    
    inline def setPath(value: HookidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
