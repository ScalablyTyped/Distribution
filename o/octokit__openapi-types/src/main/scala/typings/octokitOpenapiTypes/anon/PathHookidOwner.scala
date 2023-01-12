package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOwner extends StObject {
  
  var path: HookidOwner
}
object PathHookidOwner {
  
  inline def apply(path: HookidOwner): PathHookidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HookidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
