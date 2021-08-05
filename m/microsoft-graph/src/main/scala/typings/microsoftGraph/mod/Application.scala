package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application
  extends StObject
     with DirectoryObject {
  
  /**
    * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications
    * that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services
    * like Microsoft 365 call the application in the context of a document the user is working on.
    */
  var addIns: js.UndefOr[js.Array[AddIn]] = js.undefined
  
  // Specifies settings for an application that implements a web API.
  var api: js.UndefOr[NullableOption[ApiApplication]] = js.undefined
  
  // The unique identifier for the application that is assigned to an application by Azure AD. Not nullable. Read-only.
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The collection of roles the application declares. With app role assignments, these roles can be assigned to users,
    * groups, or other applications' service principals. Not nullable.
    */
  var appRoles: js.UndefOr[js.Array[AppRole]] = js.undefined
  
  var applicationTemplateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time the application was registered. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only.
  var createdOnBehalfOf: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for the application.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Nullable.
  var extensionProperties: js.UndefOr[NullableOption[js.Array[ExtensionProperty]]] = js.undefined
  
  /**
    * Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this
    * attribute, use one of the following valid string values:NoneSecurityGroup: For security groups and Azure AD rolesAll:
    * This will get all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is
    * a member of
    */
  var groupMembershipClaims: js.UndefOr[NullableOption[String]] = js.undefined
  
  var homeRealmDiscoveryPolicies: js.UndefOr[NullableOption[js.Array[HomeRealmDiscoveryPolicy]]] = js.undefined
  
  /**
    * The URIs that identify the application within its Azure AD tenant, or within a verified custom domain if the
    * application is multi-tenant. For more information see Application Objects and Service Principal Objects. The any
    * operator is required for filter expressions on multi-valued properties. Not nullable.
    */
  var identifierUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Basic profile information of the application such as app's marketing, support, terms of service and privacy statement
    * URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more
    * info, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
    */
  var info: js.UndefOr[NullableOption[InformationalUrl]] = js.undefined
  
  var isDeviceOnlyAuthSupported: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Specifies the fallback application type as public client, such as an installed application running on a mobile device.
    * The default value is false which means the fallback application type is confidential client such as web app. There are
    * certain scenarios where Azure AD cannot determine the client application type (e.g. ROPC flow where it is configured
    * without specifying a redirect URI). In those cases Azure AD will interpret the application type based on the value of
    * this property.
    */
  var isFallbackPublicClient: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The collection of key credentials associated with the application Not nullable.
  var keyCredentials: js.UndefOr[js.Array[KeyCredential]] = js.undefined
  
  // The main logo for the application. Not nullable.
  var logo: js.UndefOr[js.Any] = js.undefined
  
  var notes: js.UndefOr[NullableOption[String]] = js.undefined
  
  var oauth2RequirePostResponse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Application developers can configure optional claims in their Azure AD apps to specify which claims they want in tokens
    * sent to their application by the Microsoft security token service. See provide optional claims to your Azure AD app for
    * more information.
    */
  var optionalClaims: js.UndefOr[NullableOption[OptionalClaims]] = js.undefined
  
  /**
    * Directory objects that are owners of the application. The owners are a set of non-admin users who are allowed to modify
    * this object. Requires version 2013-11-08 or newer. Read-only. Nullable.
    */
  var owners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // Specifies parental control settings for an application.
  var parentalControlSettings: js.UndefOr[NullableOption[ParentalControlSettings]] = js.undefined
  
  // The collection of password credentials associated with the application. Not nullable.
  var passwordCredentials: js.UndefOr[js.Array[PasswordCredential]] = js.undefined
  
  // Specifies settings for installed clients such as desktop or mobile devices.
  var publicClient: js.UndefOr[NullableOption[PublicClientApplication]] = js.undefined
  
  // The verified publisher domain for the application. Read-only.
  var publisherDomain: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies resources that this application requires access to and the set of OAuth permission scopes and application
    * roles that it needs under each of those resources. This pre-configuration of required resource access drives the
    * consent experience. Not nullable.
    */
  var requiredResourceAccess: js.UndefOr[js.Array[RequiredResourceAccess]] = js.undefined
  
  /**
    * Specifies the Microsoft accounts that are supported for the current application. Supported values are:AzureADMyOrg:
    * Users with a Microsoft work or school account in my organization’s Azure AD tenant (single tenant)AzureADMultipleOrgs:
    * Users with a Microsoft work or school account in any organization’s Azure AD tenant
    * (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account
    * in any organization’s Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
    */
  var signInAudience: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Custom strings that can be used to categorize and identify the application. Not nullable.
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the
    * tokens it emits by using the key this property points to. The application code that receives the encrypted token must
    * use the matching private key to decrypt the token before it can be used for the signed-in user.
    */
  var tokenEncryptionKeyId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var tokenIssuancePolicies: js.UndefOr[NullableOption[js.Array[TokenIssuancePolicy]]] = js.undefined
  
  var tokenLifetimePolicies: js.UndefOr[NullableOption[js.Array[TokenLifetimePolicy]]] = js.undefined
  
  // Specifies settings for a web application.
  var web: js.UndefOr[NullableOption[WebApplication]] = js.undefined
}
object Application {
  
  inline def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  extension [Self <: Application](x: Self) {
    
    inline def setAddIns(value: js.Array[AddIn]): Self = StObject.set(x, "addIns", value.asInstanceOf[js.Any])
    
    inline def setAddInsUndefined: Self = StObject.set(x, "addIns", js.undefined)
    
    inline def setAddInsVarargs(value: AddIn*): Self = StObject.set(x, "addIns", js.Array(value :_*))
    
    inline def setApi(value: NullableOption[ApiApplication]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiNull: Self = StObject.set(x, "api", null)
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAppRoles(value: js.Array[AppRole]): Self = StObject.set(x, "appRoles", value.asInstanceOf[js.Any])
    
    inline def setAppRolesUndefined: Self = StObject.set(x, "appRoles", js.undefined)
    
    inline def setAppRolesVarargs(value: AppRole*): Self = StObject.set(x, "appRoles", js.Array(value :_*))
    
    inline def setApplicationTemplateId(value: NullableOption[String]): Self = StObject.set(x, "applicationTemplateId", value.asInstanceOf[js.Any])
    
    inline def setApplicationTemplateIdNull: Self = StObject.set(x, "applicationTemplateId", null)
    
    inline def setApplicationTemplateIdUndefined: Self = StObject.set(x, "applicationTemplateId", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCreatedOnBehalfOf(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "createdOnBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setCreatedOnBehalfOfNull: Self = StObject.set(x, "createdOnBehalfOf", null)
    
    inline def setCreatedOnBehalfOfUndefined: Self = StObject.set(x, "createdOnBehalfOf", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExtensionProperties(value: NullableOption[js.Array[ExtensionProperty]]): Self = StObject.set(x, "extensionProperties", value.asInstanceOf[js.Any])
    
    inline def setExtensionPropertiesNull: Self = StObject.set(x, "extensionProperties", null)
    
    inline def setExtensionPropertiesUndefined: Self = StObject.set(x, "extensionProperties", js.undefined)
    
    inline def setExtensionPropertiesVarargs(value: ExtensionProperty*): Self = StObject.set(x, "extensionProperties", js.Array(value :_*))
    
    inline def setGroupMembershipClaims(value: NullableOption[String]): Self = StObject.set(x, "groupMembershipClaims", value.asInstanceOf[js.Any])
    
    inline def setGroupMembershipClaimsNull: Self = StObject.set(x, "groupMembershipClaims", null)
    
    inline def setGroupMembershipClaimsUndefined: Self = StObject.set(x, "groupMembershipClaims", js.undefined)
    
    inline def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = StObject.set(x, "homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    inline def setHomeRealmDiscoveryPoliciesNull: Self = StObject.set(x, "homeRealmDiscoveryPolicies", null)
    
    inline def setHomeRealmDiscoveryPoliciesUndefined: Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.undefined)
    
    inline def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.Array(value :_*))
    
    inline def setIdentifierUris(value: js.Array[String]): Self = StObject.set(x, "identifierUris", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUrisUndefined: Self = StObject.set(x, "identifierUris", js.undefined)
    
    inline def setIdentifierUrisVarargs(value: String*): Self = StObject.set(x, "identifierUris", js.Array(value :_*))
    
    inline def setInfo(value: NullableOption[InformationalUrl]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoNull: Self = StObject.set(x, "info", null)
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setIsDeviceOnlyAuthSupported(value: NullableOption[Boolean]): Self = StObject.set(x, "isDeviceOnlyAuthSupported", value.asInstanceOf[js.Any])
    
    inline def setIsDeviceOnlyAuthSupportedNull: Self = StObject.set(x, "isDeviceOnlyAuthSupported", null)
    
    inline def setIsDeviceOnlyAuthSupportedUndefined: Self = StObject.set(x, "isDeviceOnlyAuthSupported", js.undefined)
    
    inline def setIsFallbackPublicClient(value: NullableOption[Boolean]): Self = StObject.set(x, "isFallbackPublicClient", value.asInstanceOf[js.Any])
    
    inline def setIsFallbackPublicClientNull: Self = StObject.set(x, "isFallbackPublicClient", null)
    
    inline def setIsFallbackPublicClientUndefined: Self = StObject.set(x, "isFallbackPublicClient", js.undefined)
    
    inline def setKeyCredentials(value: js.Array[KeyCredential]): Self = StObject.set(x, "keyCredentials", value.asInstanceOf[js.Any])
    
    inline def setKeyCredentialsUndefined: Self = StObject.set(x, "keyCredentials", js.undefined)
    
    inline def setKeyCredentialsVarargs(value: KeyCredential*): Self = StObject.set(x, "keyCredentials", js.Array(value :_*))
    
    inline def setLogo(value: js.Any): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOauth2RequirePostResponse(value: Boolean): Self = StObject.set(x, "oauth2RequirePostResponse", value.asInstanceOf[js.Any])
    
    inline def setOauth2RequirePostResponseUndefined: Self = StObject.set(x, "oauth2RequirePostResponse", js.undefined)
    
    inline def setOptionalClaims(value: NullableOption[OptionalClaims]): Self = StObject.set(x, "optionalClaims", value.asInstanceOf[js.Any])
    
    inline def setOptionalClaimsNull: Self = StObject.set(x, "optionalClaims", null)
    
    inline def setOptionalClaimsUndefined: Self = StObject.set(x, "optionalClaims", js.undefined)
    
    inline def setOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: DirectoryObject*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    inline def setParentalControlSettings(value: NullableOption[ParentalControlSettings]): Self = StObject.set(x, "parentalControlSettings", value.asInstanceOf[js.Any])
    
    inline def setParentalControlSettingsNull: Self = StObject.set(x, "parentalControlSettings", null)
    
    inline def setParentalControlSettingsUndefined: Self = StObject.set(x, "parentalControlSettings", js.undefined)
    
    inline def setPasswordCredentials(value: js.Array[PasswordCredential]): Self = StObject.set(x, "passwordCredentials", value.asInstanceOf[js.Any])
    
    inline def setPasswordCredentialsUndefined: Self = StObject.set(x, "passwordCredentials", js.undefined)
    
    inline def setPasswordCredentialsVarargs(value: PasswordCredential*): Self = StObject.set(x, "passwordCredentials", js.Array(value :_*))
    
    inline def setPublicClient(value: NullableOption[PublicClientApplication]): Self = StObject.set(x, "publicClient", value.asInstanceOf[js.Any])
    
    inline def setPublicClientNull: Self = StObject.set(x, "publicClient", null)
    
    inline def setPublicClientUndefined: Self = StObject.set(x, "publicClient", js.undefined)
    
    inline def setPublisherDomain(value: NullableOption[String]): Self = StObject.set(x, "publisherDomain", value.asInstanceOf[js.Any])
    
    inline def setPublisherDomainNull: Self = StObject.set(x, "publisherDomain", null)
    
    inline def setPublisherDomainUndefined: Self = StObject.set(x, "publisherDomain", js.undefined)
    
    inline def setRequiredResourceAccess(value: js.Array[RequiredResourceAccess]): Self = StObject.set(x, "requiredResourceAccess", value.asInstanceOf[js.Any])
    
    inline def setRequiredResourceAccessUndefined: Self = StObject.set(x, "requiredResourceAccess", js.undefined)
    
    inline def setRequiredResourceAccessVarargs(value: RequiredResourceAccess*): Self = StObject.set(x, "requiredResourceAccess", js.Array(value :_*))
    
    inline def setSignInAudience(value: NullableOption[String]): Self = StObject.set(x, "signInAudience", value.asInstanceOf[js.Any])
    
    inline def setSignInAudienceNull: Self = StObject.set(x, "signInAudience", null)
    
    inline def setSignInAudienceUndefined: Self = StObject.set(x, "signInAudience", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTokenEncryptionKeyId(value: NullableOption[String]): Self = StObject.set(x, "tokenEncryptionKeyId", value.asInstanceOf[js.Any])
    
    inline def setTokenEncryptionKeyIdNull: Self = StObject.set(x, "tokenEncryptionKeyId", null)
    
    inline def setTokenEncryptionKeyIdUndefined: Self = StObject.set(x, "tokenEncryptionKeyId", js.undefined)
    
    inline def setTokenIssuancePolicies(value: NullableOption[js.Array[TokenIssuancePolicy]]): Self = StObject.set(x, "tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    inline def setTokenIssuancePoliciesNull: Self = StObject.set(x, "tokenIssuancePolicies", null)
    
    inline def setTokenIssuancePoliciesUndefined: Self = StObject.set(x, "tokenIssuancePolicies", js.undefined)
    
    inline def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = StObject.set(x, "tokenIssuancePolicies", js.Array(value :_*))
    
    inline def setTokenLifetimePolicies(value: NullableOption[js.Array[TokenLifetimePolicy]]): Self = StObject.set(x, "tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    inline def setTokenLifetimePoliciesNull: Self = StObject.set(x, "tokenLifetimePolicies", null)
    
    inline def setTokenLifetimePoliciesUndefined: Self = StObject.set(x, "tokenLifetimePolicies", js.undefined)
    
    inline def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = StObject.set(x, "tokenLifetimePolicies", js.Array(value :_*))
    
    inline def setWeb(value: NullableOption[WebApplication]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebNull: Self = StObject.set(x, "web", null)
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
  }
}
