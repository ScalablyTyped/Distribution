package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOrg extends StObject {
  
  var path: HookidOrg
}
object PathHookidOrg {
  
  inline def apply(path: HookidOrg): PathHookidOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookidOrg] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HookidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
