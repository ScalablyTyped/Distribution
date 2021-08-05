package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyGetProjectConfigResponse extends StObject {
  
  /** Whether to allow password user sign in or sign up. */
  var allowPasswordUser: js.UndefOr[Boolean] = js.undefined
  
  /** Browser API key, needed when making http request to Apiary. */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /** Authorized domains. */
  var authorizedDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Change email template. */
  var changeEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
  
  var dynamicLinksDomain: js.UndefOr[String] = js.undefined
  
  /** Whether anonymous user is enabled. */
  var enableAnonymousUser: js.UndefOr[Boolean] = js.undefined
  
  /** OAuth2 provider configuration. */
  var idpConfig: js.UndefOr[js.Array[IdpConfig]] = js.undefined
  
  /** Legacy reset password email template. */
  var legacyResetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  
  /** Project ID of the relying party. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Reset password email template. */
  var resetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  
  /** Whether to use email sending provided by Firebear. */
  var useEmailSending: js.UndefOr[Boolean] = js.undefined
  
  /** Verify email template. */
  var verifyEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
}
object IdentitytoolkitRelyingpartyGetProjectConfigResponse {
  
  inline def apply(): IdentitytoolkitRelyingpartyGetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartyGetProjectConfigResponse](x: Self) {
    
    inline def setAllowPasswordUser(value: Boolean): Self = StObject.set(x, "allowPasswordUser", value.asInstanceOf[js.Any])
    
    inline def setAllowPasswordUserUndefined: Self = StObject.set(x, "allowPasswordUser", js.undefined)
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAuthorizedDomains(value: js.Array[String]): Self = StObject.set(x, "authorizedDomains", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedDomainsUndefined: Self = StObject.set(x, "authorizedDomains", js.undefined)
    
    inline def setAuthorizedDomainsVarargs(value: String*): Self = StObject.set(x, "authorizedDomains", js.Array(value :_*))
    
    inline def setChangeEmailTemplate(value: EmailTemplate): Self = StObject.set(x, "changeEmailTemplate", value.asInstanceOf[js.Any])
    
    inline def setChangeEmailTemplateUndefined: Self = StObject.set(x, "changeEmailTemplate", js.undefined)
    
    inline def setDynamicLinksDomain(value: String): Self = StObject.set(x, "dynamicLinksDomain", value.asInstanceOf[js.Any])
    
    inline def setDynamicLinksDomainUndefined: Self = StObject.set(x, "dynamicLinksDomain", js.undefined)
    
    inline def setEnableAnonymousUser(value: Boolean): Self = StObject.set(x, "enableAnonymousUser", value.asInstanceOf[js.Any])
    
    inline def setEnableAnonymousUserUndefined: Self = StObject.set(x, "enableAnonymousUser", js.undefined)
    
    inline def setIdpConfig(value: js.Array[IdpConfig]): Self = StObject.set(x, "idpConfig", value.asInstanceOf[js.Any])
    
    inline def setIdpConfigUndefined: Self = StObject.set(x, "idpConfig", js.undefined)
    
    inline def setIdpConfigVarargs(value: IdpConfig*): Self = StObject.set(x, "idpConfig", js.Array(value :_*))
    
    inline def setLegacyResetPasswordTemplate(value: EmailTemplate): Self = StObject.set(x, "legacyResetPasswordTemplate", value.asInstanceOf[js.Any])
    
    inline def setLegacyResetPasswordTemplateUndefined: Self = StObject.set(x, "legacyResetPasswordTemplate", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setResetPasswordTemplate(value: EmailTemplate): Self = StObject.set(x, "resetPasswordTemplate", value.asInstanceOf[js.Any])
    
    inline def setResetPasswordTemplateUndefined: Self = StObject.set(x, "resetPasswordTemplate", js.undefined)
    
    inline def setUseEmailSending(value: Boolean): Self = StObject.set(x, "useEmailSending", value.asInstanceOf[js.Any])
    
    inline def setUseEmailSendingUndefined: Self = StObject.set(x, "useEmailSending", js.undefined)
    
    inline def setVerifyEmailTemplate(value: EmailTemplate): Self = StObject.set(x, "verifyEmailTemplate", value.asInstanceOf[js.Any])
    
    inline def setVerifyEmailTemplateUndefined: Self = StObject.set(x, "verifyEmailTemplate", js.undefined)
  }
}
