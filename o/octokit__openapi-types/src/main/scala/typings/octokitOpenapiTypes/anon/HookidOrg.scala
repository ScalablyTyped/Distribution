package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookidOrg extends StObject {
  
  var hook_id: Double
  
  @JSName("org")
  var org_ : String
}
object HookidOrg {
  
  inline def apply(hook_id: Double, org_ : String): HookidOrg = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookidOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HookidOrg] (val x: Self) extends AnyVal {
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
