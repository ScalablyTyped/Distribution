package typings.openpgp.mod

import typings.openpgp.mod.enums.reasonForRevocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait revokeKeyReasonForRevocation extends StObject {
  
  /**
    * (optional) flag indicating the reason for revocation
    */
  var flag: reasonForRevocation
  
  /**
    * (optional) string explaining the reason for revocation
    */
  var string: String
}
object revokeKeyReasonForRevocation {
  
  @scala.inline
  def apply(flag: reasonForRevocation, string: String): revokeKeyReasonForRevocation = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[revokeKeyReasonForRevocation]
  }
  
  @scala.inline
  implicit class revokeKeyReasonForRevocationMutableBuilder[Self <: revokeKeyReasonForRevocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlag(value: reasonForRevocation): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
