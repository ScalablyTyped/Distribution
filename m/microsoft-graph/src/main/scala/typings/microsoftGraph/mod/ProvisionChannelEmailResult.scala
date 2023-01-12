package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionChannelEmailResult extends StObject {
  
  // Represents the provisioned email address.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
}
object ProvisionChannelEmailResult {
  
  inline def apply(): ProvisionChannelEmailResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionChannelEmailResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionChannelEmailResult] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
