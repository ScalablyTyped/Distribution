package typings.onfidoSdkUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phonenumberconsentgranted extends StObject {
  
  var phone_number_consent_granted: js.UndefOr[Boolean] = js.undefined
  
  var ssn_consent_granted: js.UndefOr[Boolean] = js.undefined
}
object Phonenumberconsentgranted {
  
  inline def apply(): Phonenumberconsentgranted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phonenumberconsentgranted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phonenumberconsentgranted] (val x: Self) extends AnyVal {
    
    inline def setPhone_number_consent_granted(value: Boolean): Self = StObject.set(x, "phone_number_consent_granted", value.asInstanceOf[js.Any])
    
    inline def setPhone_number_consent_grantedUndefined: Self = StObject.set(x, "phone_number_consent_granted", js.undefined)
    
    inline def setSsn_consent_granted(value: Boolean): Self = StObject.set(x, "ssn_consent_granted", value.asInstanceOf[js.Any])
    
    inline def setSsn_consent_grantedUndefined: Self = StObject.set(x, "ssn_consent_granted", js.undefined)
  }
}
