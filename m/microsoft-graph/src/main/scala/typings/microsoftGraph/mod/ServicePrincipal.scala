package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePrincipal
  extends StObject
     with DirectoryObject {
  
  // true if the service principal account is enabled; otherwise, false.
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications
    * that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services
    * like Microsoft 365 call the application in the context of a document the user is working on.
    */
  var addIns: js.UndefOr[js.Array[AddIn]] = js.undefined
  
  /**
    * Used to retrieve service principals by subscription, identify resource group and full resource ids for managed
    * identities.
    */
  var alternativeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var appDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name exposed by the associated application.
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the associated application (its appId property).
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Contains the tenant id where the application is registered. This is applicable only to service principals backed by
    * applications.
    */
  var appOwnerOrganizationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Principals (users, groups, and service principals) that are assigned to this service principal. Read-only.
  var appRoleAssignedTo: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.undefined
  
  /**
    * Specifies whether users or other service principals need to be granted an app role assignment for this service
    * principal before users can sign in or apps can get tokens. The default value is false. Not nullable.
    */
  var appRoleAssignmentRequired: js.UndefOr[Boolean] = js.undefined
  
  // Applications that this service principal is assigned to. Read-only. Nullable.
  var appRoleAssignments: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.undefined
  
  /**
    * The roles exposed by the application which this service principal represents. For more information see the appRoles
    * property definition on the application entity. Not nullable.
    */
  var appRoles: js.UndefOr[js.Array[AppRole]] = js.undefined
  
  // Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only.
  var applicationTemplateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The claimsMappingPolicies assigned to this service principal.
  var claimsMappingPolicies: js.UndefOr[NullableOption[js.Array[ClaimsMappingPolicy]]] = js.undefined
  
  // Directory objects created by this service principal. Read-only. Nullable.
  var createdObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  var delegatedPermissionClassifications: js.UndefOr[NullableOption[js.Array[DelegatedPermissionClassification]]] = js.undefined
  
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for the service principal.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Endpoints available for discovery. Services like Sharepoint populate this property with a tenant specific SharePoint
    * endpoints that other applications can discover and use in their experiences.
    */
  var endpoints: js.UndefOr[NullableOption[js.Array[Endpoint]]] = js.undefined
  
  // The homeRealmDiscoveryPolicies assigned to this service principal.
  var homeRealmDiscoveryPolicies: js.UndefOr[NullableOption[js.Array[HomeRealmDiscoveryPolicy]]] = js.undefined
  
  // Home page or landing page of the application.
  var homepage: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy
    * statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience.
    * For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
    */
  var info: js.UndefOr[NullableOption[InformationalUrl]] = js.undefined
  
  // The collection of key credentials associated with the service principal. Not nullable.
  var keyCredentials: js.UndefOr[js.Array[KeyCredential]] = js.undefined
  
  /**
    * Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to
    * launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on
    * for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the
    * Azure AD My Apps, or the Azure AD SSO URL.
    */
  var loginUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect
    * front-channel, back-channel or SAML logout protocols.
    */
  var logoutUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  var notes: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the
    * expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery
    * applications.
    */
  var notificationEmailAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user.
    * Read-only. Nullable.
    */
  var oauth2PermissionGrants: js.UndefOr[NullableOption[js.Array[OAuth2PermissionGrant]]] = js.undefined
  
  /**
    * The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on
    * the application entity's api property. Not nullable.
    */
  var oauth2PermissionScopes: js.UndefOr[js.Array[PermissionScope]] = js.undefined
  
  // Directory objects that are owned by this service principal. Read-only. Nullable.
  var ownedObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or
    * servicePrincipals who are allowed to modify this object. Read-only. Nullable.
    */
  var owners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // The collection of password credentials associated with the service principal. Not nullable.
  var passwordCredentials: js.UndefOr[js.Array[PasswordCredential]] = js.undefined
  
  /**
    * Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to
    * launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, external,
    * and oidc.
    */
  var preferredSingleSignOnMode: js.UndefOr[NullableOption[String]] = js.undefined
  
  var preferredTokenSigningKeyThumbprint: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0
    * authorization codes and access tokens are sent to for the associated application. Not nullable.
    */
  var replyUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  // The collection for settings related to saml single sign-on.
  var samlSingleSignOnSettings: js.UndefOr[NullableOption[SamlSingleSignOnSettings]] = js.undefined
  
  /**
    * Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to
    * hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For
    * example,Client apps can specify a resource URI which is based on the values of this property to acquire an access
    * token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued
    * properties. Not nullable.
    */
  var servicePrincipalNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Identifies if the service principal represents an application or a managed identity. This is set by Azure AD
    * internally. For a service principal that represents an application this is set as Application. For a service principal
    * that represent a managed identity this is set as ManagedIdentity.
    */
  var servicePrincipalType: js.UndefOr[NullableOption[String]] = js.undefined
  
  var signInAudience: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Custom strings that can be used to categorize and identify the service principal. Not nullable.
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for
    * this application encrypted using the key specified by this property. The application code that receives the encrypted
    * token must use the matching private key to decrypt the token before it can be used for the signed-in user.
    */
  var tokenEncryptionKeyId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The tokenIssuancePolicies assigned to this service principal.
  var tokenIssuancePolicies: js.UndefOr[NullableOption[js.Array[TokenIssuancePolicy]]] = js.undefined
  
  // The tokenLifetimePolicies assigned to this service principal.
  var tokenLifetimePolicies: js.UndefOr[NullableOption[js.Array[TokenLifetimePolicy]]] = js.undefined
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
}
object ServicePrincipal {
  
  @scala.inline
  def apply(): ServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePrincipal]
  }
  
  @scala.inline
  implicit class ServicePrincipalMutableBuilder[Self <: ServicePrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "accountEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEnabledNull: Self = StObject.set(x, "accountEnabled", null)
    
    @scala.inline
    def setAccountEnabledUndefined: Self = StObject.set(x, "accountEnabled", js.undefined)
    
    @scala.inline
    def setAddIns(value: js.Array[AddIn]): Self = StObject.set(x, "addIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddInsUndefined: Self = StObject.set(x, "addIns", js.undefined)
    
    @scala.inline
    def setAddInsVarargs(value: AddIn*): Self = StObject.set(x, "addIns", js.Array(value :_*))
    
    @scala.inline
    def setAlternativeNames(value: js.Array[String]): Self = StObject.set(x, "alternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeNamesUndefined: Self = StObject.set(x, "alternativeNames", js.undefined)
    
    @scala.inline
    def setAlternativeNamesVarargs(value: String*): Self = StObject.set(x, "alternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setAppDescription(value: NullableOption[String]): Self = StObject.set(x, "appDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppDescriptionNull: Self = StObject.set(x, "appDescription", null)
    
    @scala.inline
    def setAppDescriptionUndefined: Self = StObject.set(x, "appDescription", js.undefined)
    
    @scala.inline
    def setAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "appDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppDisplayNameNull: Self = StObject.set(x, "appDisplayName", null)
    
    @scala.inline
    def setAppDisplayNameUndefined: Self = StObject.set(x, "appDisplayName", js.undefined)
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setAppOwnerOrganizationId(value: NullableOption[String]): Self = StObject.set(x, "appOwnerOrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppOwnerOrganizationIdNull: Self = StObject.set(x, "appOwnerOrganizationId", null)
    
    @scala.inline
    def setAppOwnerOrganizationIdUndefined: Self = StObject.set(x, "appOwnerOrganizationId", js.undefined)
    
    @scala.inline
    def setAppRoleAssignedTo(value: NullableOption[js.Array[AppRoleAssignment]]): Self = StObject.set(x, "appRoleAssignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRoleAssignedToNull: Self = StObject.set(x, "appRoleAssignedTo", null)
    
    @scala.inline
    def setAppRoleAssignedToUndefined: Self = StObject.set(x, "appRoleAssignedTo", js.undefined)
    
    @scala.inline
    def setAppRoleAssignedToVarargs(value: AppRoleAssignment*): Self = StObject.set(x, "appRoleAssignedTo", js.Array(value :_*))
    
    @scala.inline
    def setAppRoleAssignmentRequired(value: Boolean): Self = StObject.set(x, "appRoleAssignmentRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRoleAssignmentRequiredUndefined: Self = StObject.set(x, "appRoleAssignmentRequired", js.undefined)
    
    @scala.inline
    def setAppRoleAssignments(value: NullableOption[js.Array[AppRoleAssignment]]): Self = StObject.set(x, "appRoleAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRoleAssignmentsNull: Self = StObject.set(x, "appRoleAssignments", null)
    
    @scala.inline
    def setAppRoleAssignmentsUndefined: Self = StObject.set(x, "appRoleAssignments", js.undefined)
    
    @scala.inline
    def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = StObject.set(x, "appRoleAssignments", js.Array(value :_*))
    
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
    def setClaimsMappingPolicies(value: NullableOption[js.Array[ClaimsMappingPolicy]]): Self = StObject.set(x, "claimsMappingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsMappingPoliciesNull: Self = StObject.set(x, "claimsMappingPolicies", null)
    
    @scala.inline
    def setClaimsMappingPoliciesUndefined: Self = StObject.set(x, "claimsMappingPolicies", js.undefined)
    
    @scala.inline
    def setClaimsMappingPoliciesVarargs(value: ClaimsMappingPolicy*): Self = StObject.set(x, "claimsMappingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setCreatedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "createdObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedObjectsNull: Self = StObject.set(x, "createdObjects", null)
    
    @scala.inline
    def setCreatedObjectsUndefined: Self = StObject.set(x, "createdObjects", js.undefined)
    
    @scala.inline
    def setCreatedObjectsVarargs(value: DirectoryObject*): Self = StObject.set(x, "createdObjects", js.Array(value :_*))
    
    @scala.inline
    def setDelegatedPermissionClassifications(value: NullableOption[js.Array[DelegatedPermissionClassification]]): Self = StObject.set(x, "delegatedPermissionClassifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedPermissionClassificationsNull: Self = StObject.set(x, "delegatedPermissionClassifications", null)
    
    @scala.inline
    def setDelegatedPermissionClassificationsUndefined: Self = StObject.set(x, "delegatedPermissionClassifications", js.undefined)
    
    @scala.inline
    def setDelegatedPermissionClassificationsVarargs(value: DelegatedPermissionClassification*): Self = StObject.set(x, "delegatedPermissionClassifications", js.Array(value :_*))
    
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
    def setEndpoints(value: NullableOption[js.Array[Endpoint]]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsNull: Self = StObject.set(x, "endpoints", null)
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    
    @scala.inline
    def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = StObject.set(x, "homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesNull: Self = StObject.set(x, "homeRealmDiscoveryPolicies", null)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesUndefined: Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.undefined)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.Array(value :_*))
    
    @scala.inline
    def setHomepage(value: NullableOption[String]): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepageNull: Self = StObject.set(x, "homepage", null)
    
    @scala.inline
    def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    @scala.inline
    def setInfo(value: NullableOption[InformationalUrl]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoNull: Self = StObject.set(x, "info", null)
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setKeyCredentials(value: js.Array[KeyCredential]): Self = StObject.set(x, "keyCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCredentialsUndefined: Self = StObject.set(x, "keyCredentials", js.undefined)
    
    @scala.inline
    def setKeyCredentialsVarargs(value: KeyCredential*): Self = StObject.set(x, "keyCredentials", js.Array(value :_*))
    
    @scala.inline
    def setLoginUrl(value: NullableOption[String]): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUrlNull: Self = StObject.set(x, "loginUrl", null)
    
    @scala.inline
    def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
    
    @scala.inline
    def setLogoutUrl(value: NullableOption[String]): Self = StObject.set(x, "logoutUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoutUrlNull: Self = StObject.set(x, "logoutUrl", null)
    
    @scala.inline
    def setLogoutUrlUndefined: Self = StObject.set(x, "logoutUrl", js.undefined)
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    @scala.inline
    def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesNull: Self = StObject.set(x, "notes", null)
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotificationEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "notificationEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEmailAddressesUndefined: Self = StObject.set(x, "notificationEmailAddresses", js.undefined)
    
    @scala.inline
    def setNotificationEmailAddressesVarargs(value: String*): Self = StObject.set(x, "notificationEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setOauth2PermissionGrants(value: NullableOption[js.Array[OAuth2PermissionGrant]]): Self = StObject.set(x, "oauth2PermissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2PermissionGrantsNull: Self = StObject.set(x, "oauth2PermissionGrants", null)
    
    @scala.inline
    def setOauth2PermissionGrantsUndefined: Self = StObject.set(x, "oauth2PermissionGrants", js.undefined)
    
    @scala.inline
    def setOauth2PermissionGrantsVarargs(value: OAuth2PermissionGrant*): Self = StObject.set(x, "oauth2PermissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setOauth2PermissionScopes(value: js.Array[PermissionScope]): Self = StObject.set(x, "oauth2PermissionScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2PermissionScopesUndefined: Self = StObject.set(x, "oauth2PermissionScopes", js.undefined)
    
    @scala.inline
    def setOauth2PermissionScopesVarargs(value: PermissionScope*): Self = StObject.set(x, "oauth2PermissionScopes", js.Array(value :_*))
    
    @scala.inline
    def setOwnedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "ownedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnedObjectsNull: Self = StObject.set(x, "ownedObjects", null)
    
    @scala.inline
    def setOwnedObjectsUndefined: Self = StObject.set(x, "ownedObjects", js.undefined)
    
    @scala.inline
    def setOwnedObjectsVarargs(value: DirectoryObject*): Self = StObject.set(x, "ownedObjects", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: DirectoryObject*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    @scala.inline
    def setPasswordCredentials(value: js.Array[PasswordCredential]): Self = StObject.set(x, "passwordCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordCredentialsUndefined: Self = StObject.set(x, "passwordCredentials", js.undefined)
    
    @scala.inline
    def setPasswordCredentialsVarargs(value: PasswordCredential*): Self = StObject.set(x, "passwordCredentials", js.Array(value :_*))
    
    @scala.inline
    def setPreferredSingleSignOnMode(value: NullableOption[String]): Self = StObject.set(x, "preferredSingleSignOnMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredSingleSignOnModeNull: Self = StObject.set(x, "preferredSingleSignOnMode", null)
    
    @scala.inline
    def setPreferredSingleSignOnModeUndefined: Self = StObject.set(x, "preferredSingleSignOnMode", js.undefined)
    
    @scala.inline
    def setPreferredTokenSigningKeyThumbprint(value: NullableOption[String]): Self = StObject.set(x, "preferredTokenSigningKeyThumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredTokenSigningKeyThumbprintNull: Self = StObject.set(x, "preferredTokenSigningKeyThumbprint", null)
    
    @scala.inline
    def setPreferredTokenSigningKeyThumbprintUndefined: Self = StObject.set(x, "preferredTokenSigningKeyThumbprint", js.undefined)
    
    @scala.inline
    def setReplyUrls(value: js.Array[String]): Self = StObject.set(x, "replyUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyUrlsUndefined: Self = StObject.set(x, "replyUrls", js.undefined)
    
    @scala.inline
    def setReplyUrlsVarargs(value: String*): Self = StObject.set(x, "replyUrls", js.Array(value :_*))
    
    @scala.inline
    def setSamlSingleSignOnSettings(value: NullableOption[SamlSingleSignOnSettings]): Self = StObject.set(x, "samlSingleSignOnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamlSingleSignOnSettingsNull: Self = StObject.set(x, "samlSingleSignOnSettings", null)
    
    @scala.inline
    def setSamlSingleSignOnSettingsUndefined: Self = StObject.set(x, "samlSingleSignOnSettings", js.undefined)
    
    @scala.inline
    def setServicePrincipalNames(value: js.Array[String]): Self = StObject.set(x, "servicePrincipalNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalNamesUndefined: Self = StObject.set(x, "servicePrincipalNames", js.undefined)
    
    @scala.inline
    def setServicePrincipalNamesVarargs(value: String*): Self = StObject.set(x, "servicePrincipalNames", js.Array(value :_*))
    
    @scala.inline
    def setServicePrincipalType(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalTypeNull: Self = StObject.set(x, "servicePrincipalType", null)
    
    @scala.inline
    def setServicePrincipalTypeUndefined: Self = StObject.set(x, "servicePrincipalType", js.undefined)
    
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
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    @scala.inline
    def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value :_*))
  }
}
