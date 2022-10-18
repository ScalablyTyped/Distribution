package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hookid extends StObject {
  
  /** The unique identifier of the hook. */
  var hook_id: Double
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
}
object Hookid {
  
  inline def apply(hook_id: Double, org_ : String): Hookid = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hookid]
  }
  
  extension [Self <: Hookid](x: Self) {
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
