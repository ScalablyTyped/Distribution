package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends DirectoryObject {
  
  /**
    * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications
    * that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services
    * like Microsoft 365 call the application in the context of a document the user is working on.
    */
  var addIns: js.UndefOr[js.Array[AddIn]] = js.native
  
  // Specifies settings for an application that implements a web API.
  var api: js.UndefOr[NullableOption[ApiApplication]] = js.native
  
  // The unique identifier for the application that is assigned to an application by Azure AD. Not nullable. Read-only.
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The collection of roles the application declares. With app role assignments, these roles can be assigned to users,
    * groups, or other applications' service principals. Not nullable.
    */
  var appRoles: js.UndefOr[js.Array[AppRole]] = js.native
  
  var applicationTemplateId: js.UndefOr[NullableOption[String]] = js.native
  
  // The date and time the application was registered. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only.
  var createdOnBehalfOf: js.UndefOr[NullableOption[DirectoryObject]] = js.native
  
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name for the application.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable.
  var extensionProperties: js.UndefOr[NullableOption[js.Array[ExtensionProperty]]] = js.native
  
  /**
    * Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this
    * attribute, use one of the following valid string values:NoneSecurityGroup: For security groups and Azure AD rolesAll:
    * This will get all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is
    * a member of
    */
  var groupMembershipClaims: js.UndefOr[NullableOption[String]] = js.native
  
  var homeRealmDiscoveryPolicies: js.UndefOr[NullableOption[js.Array[HomeRealmDiscoveryPolicy]]] = js.native
  
  /**
    * The URIs that identify the application within its Azure AD tenant, or within a verified custom domain if the
    * application is multi-tenant. For more information see Application Objects and Service Principal Objects. The any
    * operator is required for filter expressions on multi-valued properties. Not nullable.
    */
  var identifierUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Basic profile information of the application such as app's marketing, support, terms of service and privacy statement
    * URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more
    * info, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
    */
  var info: js.UndefOr[NullableOption[InformationalUrl]] = js.native
  
  var isDeviceOnlyAuthSupported: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Specifies the fallback application type as public client, such as an installed application running on a mobile device.
    * The default value is false which means the fallback application type is confidential client such as web app. There are
    * certain scenarios where Azure AD cannot determine the client application type (e.g. ROPC flow where it is configured
    * without specifying a redirect URI). In those cases Azure AD will interpret the application type based on the value of
    * this property.
    */
  var isFallbackPublicClient: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The collection of key credentials associated with the application Not nullable.
  var keyCredentials: js.UndefOr[js.Array[KeyCredential]] = js.native
  
  // The main logo for the application. Not nullable.
  var logo: js.UndefOr[js.Any] = js.native
  
  var notes: js.UndefOr[NullableOption[String]] = js.native
  
  var oauth2RequirePostResponse: js.UndefOr[Boolean] = js.native
  
  /**
    * Application developers can configure optional claims in their Azure AD apps to specify which claims they want in tokens
    * sent to their application by the Microsoft security token service. See provide optional claims to your Azure AD app for
    * more information.
    */
  var optionalClaims: js.UndefOr[NullableOption[OptionalClaims]] = js.native
  
  /**
    * Directory objects that are owners of the application. The owners are a set of non-admin users who are allowed to modify
    * this object. Requires version 2013-11-08 or newer. Read-only. Nullable.
    */
  var owners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // Specifies parental control settings for an application.
  var parentalControlSettings: js.UndefOr[NullableOption[ParentalControlSettings]] = js.native
  
  // The collection of password credentials associated with the application. Not nullable.
  var passwordCredentials: js.UndefOr[js.Array[PasswordCredential]] = js.native
  
  // Specifies settings for installed clients such as desktop or mobile devices.
  var publicClient: js.UndefOr[NullableOption[PublicClientApplication]] = js.native
  
  // The verified publisher domain for the application. Read-only.
  var publisherDomain: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies resources that this application requires access to and the set of OAuth permission scopes and application
    * roles that it needs under each of those resources. This pre-configuration of required resource access drives the
    * consent experience. Not nullable.
    */
  var requiredResourceAccess: js.UndefOr[js.Array[RequiredResourceAccess]] = js.native
  
  /**
    * Specifies the Microsoft accounts that are supported for the current application. Supported values are:AzureADMyOrg:
    * Users with a Microsoft work or school account in my organization’s Azure AD tenant (single tenant)AzureADMultipleOrgs:
    * Users with a Microsoft work or school account in any organization’s Azure AD tenant
    * (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account
    * in any organization’s Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
    */
  var signInAudience: js.UndefOr[NullableOption[String]] = js.native
  
  // Custom strings that can be used to categorize and identify the application. Not nullable.
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the
    * tokens it emits by using the key this property points to. The application code that receives the encrypted token must
    * use the matching private key to decrypt the token before it can be used for the signed-in user.
    */
  var tokenEncryptionKeyId: js.UndefOr[NullableOption[String]] = js.native
  
  var tokenIssuancePolicies: js.UndefOr[NullableOption[js.Array[TokenIssuancePolicy]]] = js.native
  
  var tokenLifetimePolicies: js.UndefOr[NullableOption[js.Array[TokenLifetimePolicy]]] = js.native
  
  // Specifies settings for a web application.
  var web: js.UndefOr[NullableOption[WebApplication]] = js.native
}
object Application {
  
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddIns(value: js.Array[AddIn]): Self = StObject.set(x, "addIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddInsUndefined: Self = StObject.set(x, "addIns", js.undefined)
    
    @scala.inline
    def setAddInsVarargs(value: AddIn*): Self = StObject.set(x, "addIns", js.Array(value :_*))
    
    @scala.inline
    def setApi(value: NullableOption[ApiApplication]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiNull: Self = StObject.set(x, "api", null)
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setAppRoles(value: js.Array[AppRole]): Self = StObject.set(x, "appRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRolesUndefined: Self = StObject.set(x, "appRoles", js.undefined)
    
    @scala.inline
    def setAppRolesVarargs(value: AppRole*): Self = StObject.set(x, "appRoles", js.Array(value :_*))
    
    @scala.inline
    def setApplicationTemplateId(value: NullableOption[String]): Self = StObject.set(x, "applicationTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationTemplateIdNull: Self = StObject.set(x, "applicationTemplateId", null)
    
    @scala.inline
    def setApplicationTemplateIdUndefined: Self = StObject.set(x, "applicationTemplateId", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedOnBehalfOf(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "createdOnBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOnBehalfOfNull: Self = StObject.set(x, "createdOnBehalfOf", null)
    
    @scala.inline
    def setCreatedOnBehalfOfUndefined: Self = StObject.set(x, "createdOnBehalfOf", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExtensionProperties(value: NullableOption[js.Array[ExtensionProperty]]): Self = StObject.set(x, "extensionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionPropertiesNull: Self = StObject.set(x, "extensionProperties", null)
    
    @scala.inline
    def setExtensionPropertiesUndefined: Self = StObject.set(x, "extensionProperties", js.undefined)
    
    @scala.inline
    def setExtensionPropertiesVarargs(value: ExtensionProperty*): Self = StObject.set(x, "extensionProperties", js.Array(value :_*))
    
    @scala.inline
    def setGroupMembershipClaims(value: NullableOption[String]): Self = StObject.set(x, "groupMembershipClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupMembershipClaimsNull: Self = StObject.set(x, "groupMembershipClaims", null)
    
    @scala.inline
    def setGroupMembershipClaimsUndefined: Self = StObject.set(x, "groupMembershipClaims", js.undefined)
    
    @scala.inline
    def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = StObject.set(x, "homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesNull: Self = StObject.set(x, "homeRealmDiscoveryPolicies", null)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesUndefined: Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.undefined)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.Array(value :_*))
    
    @scala.inline
    def setIdentifierUris(value: js.Array[String]): Self = StObject.set(x, "identifierUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUrisUndefined: Self = StObject.set(x, "identifierUris", js.undefined)
    
    @scala.inline
    def setIdentifierUrisVarargs(value: String*): Self = StObject.set(x, "identifierUris", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: NullableOption[InformationalUrl]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoNull: Self = StObject.set(x, "info", null)
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setIsDeviceOnlyAuthSupported(value: NullableOption[Boolean]): Self = StObject.set(x, "isDeviceOnlyAuthSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeviceOnlyAuthSupportedNull: Self = StObject.set(x, "isDeviceOnlyAuthSupported", null)
    
    @scala.inline
    def setIsDeviceOnlyAuthSupportedUndefined: Self = StObject.set(x, "isDeviceOnlyAuthSupported", js.undefined)
    
    @scala.inline
    def setIsFallbackPublicClient(value: NullableOption[Boolean]): Self = StObject.set(x, "isFallbackPublicClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFallbackPublicClientNull: Self = StObject.set(x, "isFallbackPublicClient", null)
    
    @scala.inline
    def setIsFallbackPublicClientUndefined: Self = StObject.set(x, "isFallbackPublicClient", js.undefined)
    
    @scala.inline
    def setKeyCredentials(value: js.Array[KeyCredential]): Self = StObject.set(x, "keyCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCredentialsUndefined: Self = StObject.set(x, "keyCredentials", js.undefined)
    
    @scala.inline
    def setKeyCredentialsVarargs(value: KeyCredential*): Self = StObject.set(x, "keyCredentials", js.Array(value :_*))
    
    @scala.inline
    def setLogo(value: js.Any): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesNull: Self = StObject.set(x, "notes", null)
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setOauth2RequirePostResponse(value: Boolean): Self = StObject.set(x, "oauth2RequirePostResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2RequirePostResponseUndefined: Self = StObject.set(x, "oauth2RequirePostResponse", js.undefined)
    
    @scala.inline
    def setOptionalClaims(value: NullableOption[OptionalClaims]): Self = StObject.set(x, "optionalClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalClaimsNull: Self = StObject.set(x, "optionalClaims", null)
    
    @scala.inline
    def setOptionalClaimsUndefined: Self = StObject.set(x, "optionalClaims", js.undefined)
    
    @scala.inline
    def setOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: DirectoryObject*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    @scala.inline
    def setParentalControlSettings(value: NullableOption[ParentalControlSettings]): Self = StObject.set(x, "parentalControlSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentalControlSettingsNull: Self = StObject.set(x, "parentalControlSettings", null)
    
    @scala.inline
    def setParentalControlSettingsUndefined: Self = StObject.set(x, "parentalControlSettings", js.undefined)
    
    @scala.inline
    def setPasswordCredentials(value: js.Array[PasswordCredential]): Self = StObject.set(x, "passwordCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordCredentialsUndefined: Self = StObject.set(x, "passwordCredentials", js.undefined)
    
    @scala.inline
    def setPasswordCredentialsVarargs(value: PasswordCredential*): Self = StObject.set(x, "passwordCredentials", js.Array(value :_*))
    
    @scala.inline
    def setPublicClient(value: NullableOption[PublicClientApplication]): Self = StObject.set(x, "publicClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicClientNull: Self = StObject.set(x, "publicClient", null)
    
    @scala.inline
    def setPublicClientUndefined: Self = StObject.set(x, "publicClient", js.undefined)
    
    @scala.inline
    def setPublisherDomain(value: NullableOption[String]): Self = StObject.set(x, "publisherDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherDomainNull: Self = StObject.set(x, "publisherDomain", null)
    
    @scala.inline
    def setPublisherDomainUndefined: Self = StObject.set(x, "publisherDomain", js.undefined)
    
    @scala.inline
    def setRequiredResourceAccess(value: js.Array[RequiredResourceAccess]): Self = StObject.set(x, "requiredResourceAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredResourceAccessUndefined: Self = StObject.set(x, "requiredResourceAccess", js.undefined)
    
    @scala.inline
    def setRequiredResourceAccessVarargs(value: RequiredResourceAccess*): Self = StObject.set(x, "requiredResourceAccess", js.Array(value :_*))
    
    @scala.inline
    def setSignInAudience(value: NullableOption[String]): Self = StObject.set(x, "signInAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInAudienceNull: Self = StObject.set(x, "signInAudience", null)
    
    @scala.inline
    def setSignInAudienceUndefined: Self = StObject.set(x, "signInAudience", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTokenEncryptionKeyId(value: NullableOption[String]): Self = StObject.set(x, "tokenEncryptionKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEncryptionKeyIdNull: Self = StObject.set(x, "tokenEncryptionKeyId", null)
    
    @scala.inline
    def setTokenEncryptionKeyIdUndefined: Self = StObject.set(x, "tokenEncryptionKeyId", js.undefined)
    
    @scala.inline
    def setTokenIssuancePolicies(value: NullableOption[js.Array[TokenIssuancePolicy]]): Self = StObject.set(x, "tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenIssuancePoliciesNull: Self = StObject.set(x, "tokenIssuancePolicies", null)
    
    @scala.inline
    def setTokenIssuancePoliciesUndefined: Self = StObject.set(x, "tokenIssuancePolicies", js.undefined)
    
    @scala.inline
    def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = StObject.set(x, "tokenIssuancePolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenLifetimePolicies(value: NullableOption[js.Array[TokenLifetimePolicy]]): Self = StObject.set(x, "tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenLifetimePoliciesNull: Self = StObject.set(x, "tokenLifetimePolicies", null)
    
    @scala.inline
    def setTokenLifetimePoliciesUndefined: Self = StObject.set(x, "tokenLifetimePolicies", js.undefined)
    
    @scala.inline
    def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = StObject.set(x, "tokenLifetimePolicies", js.Array(value :_*))
    
    @scala.inline
    def setWeb(value: NullableOption[WebApplication]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebNull: Self = StObject.set(x, "web", null)
    
    @scala.inline
    def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
  }
}
