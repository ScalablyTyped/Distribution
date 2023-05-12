package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateAuthenticationMethodConfiguration
  extends StObject
     with AuthenticationMethodConfiguration {
  
  /**
    * Defines strong authentication configurations. This configuration includes the default authentication mode and the
    * different rules for strong authentication bindings.
    */
  var authenticationModeConfiguration: js.UndefOr[NullableOption[X509CertificateAuthenticationModeConfiguration]] = js.undefined
  
  /**
    * Defines fields in the X.509 certificate that map to attributes of the Azure AD user object in order to bind the
    * certificate to the user. The priority of the object determines the order in which the binding is carried out. The first
    * binding that matches will be used and the rest ignored.
    */
  var certificateUserBindings: js.UndefOr[NullableOption[js.Array[X509CertificateUserBinding]]] = js.undefined
  
  // A collection of groups that are enabled to use the authentication method.
  var includeTargets: js.UndefOr[NullableOption[js.Array[AuthenticationMethodTarget]]] = js.undefined
}
object X509CertificateAuthenticationMethodConfiguration {
  
  inline def apply(): X509CertificateAuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509CertificateAuthenticationMethodConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509CertificateAuthenticationMethodConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationModeConfiguration(value: NullableOption[X509CertificateAuthenticationModeConfiguration]): Self = StObject.set(x, "authenticationModeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationModeConfigurationNull: Self = StObject.set(x, "authenticationModeConfiguration", null)
    
    inline def setAuthenticationModeConfigurationUndefined: Self = StObject.set(x, "authenticationModeConfiguration", js.undefined)
    
    inline def setCertificateUserBindings(value: NullableOption[js.Array[X509CertificateUserBinding]]): Self = StObject.set(x, "certificateUserBindings", value.asInstanceOf[js.Any])
    
    inline def setCertificateUserBindingsNull: Self = StObject.set(x, "certificateUserBindings", null)
    
    inline def setCertificateUserBindingsUndefined: Self = StObject.set(x, "certificateUserBindings", js.undefined)
    
    inline def setCertificateUserBindingsVarargs(value: X509CertificateUserBinding*): Self = StObject.set(x, "certificateUserBindings", js.Array(value*))
    
    inline def setIncludeTargets(value: NullableOption[js.Array[AuthenticationMethodTarget]]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsNull: Self = StObject.set(x, "includeTargets", null)
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: AuthenticationMethodTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
  }
}
