package typings.mparticleWebSdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityResultBody extends StObject {
  
  var context: String | Null
  
  var is_ephemeral: Boolean
  
  var is_logged_in: Boolean
  
  // matched_identities should be UserIdentities + mpid, for not keep as object
  var matched_identities: Record[String, Any]
}
object IdentityResultBody {
  
  inline def apply(is_ephemeral: Boolean, is_logged_in: Boolean, matched_identities: Record[String, Any]): IdentityResultBody = {
    val __obj = js.Dynamic.literal(is_ephemeral = is_ephemeral.asInstanceOf[js.Any], is_logged_in = is_logged_in.asInstanceOf[js.Any], matched_identities = matched_identities.asInstanceOf[js.Any], context = null)
    __obj.asInstanceOf[IdentityResultBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityResultBody] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setIs_ephemeral(value: Boolean): Self = StObject.set(x, "is_ephemeral", value.asInstanceOf[js.Any])
    
    inline def setIs_logged_in(value: Boolean): Self = StObject.set(x, "is_logged_in", value.asInstanceOf[js.Any])
    
    inline def setMatched_identities(value: Record[String, Any]): Self = StObject.set(x, "matched_identities", value.asInstanceOf[js.Any])
  }
}
