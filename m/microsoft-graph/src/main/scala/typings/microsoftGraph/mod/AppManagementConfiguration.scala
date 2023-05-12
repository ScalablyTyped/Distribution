package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppManagementConfiguration extends StObject {
  
  // Collection of keyCredential restrictions settings to be applied to an application or service principal.
  var keyCredentials: js.UndefOr[NullableOption[js.Array[KeyCredentialConfiguration]]] = js.undefined
  
  // Collection of password restrictions settings to be applied to an application or service principal.
  var passwordCredentials: js.UndefOr[NullableOption[js.Array[PasswordCredentialConfiguration]]] = js.undefined
}
object AppManagementConfiguration {
  
  inline def apply(): AppManagementConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppManagementConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppManagementConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKeyCredentials(value: NullableOption[js.Array[KeyCredentialConfiguration]]): Self = StObject.set(x, "keyCredentials", value.asInstanceOf[js.Any])
    
    inline def setKeyCredentialsNull: Self = StObject.set(x, "keyCredentials", null)
    
    inline def setKeyCredentialsUndefined: Self = StObject.set(x, "keyCredentials", js.undefined)
    
    inline def setKeyCredentialsVarargs(value: KeyCredentialConfiguration*): Self = StObject.set(x, "keyCredentials", js.Array(value*))
    
    inline def setPasswordCredentials(value: NullableOption[js.Array[PasswordCredentialConfiguration]]): Self = StObject.set(x, "passwordCredentials", value.asInstanceOf[js.Any])
    
    inline def setPasswordCredentialsNull: Self = StObject.set(x, "passwordCredentials", null)
    
    inline def setPasswordCredentialsUndefined: Self = StObject.set(x, "passwordCredentials", js.undefined)
    
    inline def setPasswordCredentialsVarargs(value: PasswordCredentialConfiguration*): Self = StObject.set(x, "passwordCredentials", js.Array(value*))
  }
}
