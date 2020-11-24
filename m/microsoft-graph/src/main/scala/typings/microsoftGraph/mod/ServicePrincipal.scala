package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicePrincipal extends DirectoryObject {
  
  // true if the service principal account is enabled; otherwise, false.
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications
    * that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services
    * like Microsoft 365 call the application in the context of a document the user is working on.
    */
  var addIns: js.UndefOr[js.Array[AddIn]] = js.native
  
  /**
    * Used to retrieve service principals by subscription, identify resource group and full resource ids for managed
    * identities.
    */
  var alternativeNames: js.UndefOr[js.Array[String]] = js.native
  
  var appDescription: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name exposed by the associated application.
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier for the associated application (its appId property).
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains the tenant id where the application is registered. This is applicable only to service principals backed by
    * applications.
    */
  var appOwnerOrganizationId: js.UndefOr[NullableOption[String]] = js.native
  
  // Principals (users, groups, and service principals) that are assigned to this service principal. Read-only.
  var appRoleAssignedTo: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.native
  
  /**
    * Specifies whether users or other service principals need to be granted an app role assignment for this service
    * principal before users can sign in or apps can get tokens. The default value is false. Not nullable.
    */
  var appRoleAssignmentRequired: js.UndefOr[Boolean] = js.native
  
  // Applications that this service principal is assigned to. Read-only. Nullable.
  var appRoleAssignments: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.native
  
  /**
    * The roles exposed by the application which this service principal represents. For more information see the appRoles
    * property definition on the application entity. Not nullable.
    */
  var appRoles: js.UndefOr[js.Array[AppRole]] = js.native
  
  // Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only.
  var applicationTemplateId: js.UndefOr[NullableOption[String]] = js.native
  
  // The claimsMappingPolicies assigned to this service principal.
  var claimsMappingPolicies: js.UndefOr[NullableOption[js.Array[ClaimsMappingPolicy]]] = js.native
  
  // Directory objects created by this service principal. Read-only. Nullable.
  var createdObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  var delegatedPermissionClassifications: js.UndefOr[NullableOption[js.Array[DelegatedPermissionClassification]]] = js.native
  
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name for the service principal.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Endpoints available for discovery. Services like Sharepoint populate this property with a tenant specific SharePoint
    * endpoints that other applications can discover and use in their experiences.
    */
  var endpoints: js.UndefOr[NullableOption[js.Array[Endpoint]]] = js.native
  
  // The homeRealmDiscoveryPolicies assigned to this service principal.
  var homeRealmDiscoveryPolicies: js.UndefOr[NullableOption[js.Array[HomeRealmDiscoveryPolicy]]] = js.native
  
  // Home page or landing page of the application.
  var homepage: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy
    * statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience.
    * For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
    */
  var info: js.UndefOr[NullableOption[InformationalUrl]] = js.native
  
  // The collection of key credentials associated with the service principal. Not nullable.
  var keyCredentials: js.UndefOr[js.Array[KeyCredential]] = js.native
  
  /**
    * Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to
    * launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on
    * for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the
    * Azure AD My Apps, or the Azure AD SSO URL.
    */
  var loginUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect
    * front-channel, back-channel or SAML logout protocols.
    */
  var logoutUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  var notes: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the
    * expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery
    * applications.
    */
  var notificationEmailAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user.
    * Read-only. Nullable.
    */
  var oauth2PermissionGrants: js.UndefOr[NullableOption[js.Array[OAuth2PermissionGrant]]] = js.native
  
  /**
    * The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on
    * the application entity's api property. Not nullable.
    */
  var oauth2PermissionScopes: js.UndefOr[js.Array[PermissionScope]] = js.native
  
  // Directory objects that are owned by this service principal. Read-only. Nullable.
  var ownedObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or
    * servicePrincipals who are allowed to modify this object. Read-only. Nullable.
    */
  var owners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // The collection of password credentials associated with the service principal. Not nullable.
  var passwordCredentials: js.UndefOr[js.Array[PasswordCredential]] = js.native
  
  /**
    * Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to
    * launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, external,
    * and oidc.
    */
  var preferredSingleSignOnMode: js.UndefOr[NullableOption[String]] = js.native
  
  var preferredTokenSigningKeyThumbprint: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0
    * authorization codes and access tokens are sent to for the associated application. Not nullable.
    */
  var replyUrls: js.UndefOr[js.Array[String]] = js.native
  
  // The collection for settings related to saml single sign-on.
  var samlSingleSignOnSettings: js.UndefOr[NullableOption[SamlSingleSignOnSettings]] = js.native
  
  /**
    * Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to
    * hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For
    * example,Client apps can specify a resource URI which is based on the values of this property to acquire an access
    * token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued
    * properties. Not nullable.
    */
  var servicePrincipalNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Identifies if the service principal represents an application or a managed identity. This is set by Azure AD
    * internally. For a service principal that represents an application this is set as Application. For a service principal
    * that represent a managed identity this is set as ManagedIdentity.
    */
  var servicePrincipalType: js.UndefOr[NullableOption[String]] = js.native
  
  var signInAudience: js.UndefOr[NullableOption[String]] = js.native
  
  // Custom strings that can be used to categorize and identify the service principal. Not nullable.
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for
    * this application encrypted using the key specified by this property. The application code that receives the encrypted
    * token must use the matching private key to decrypt the token before it can be used for the signed-in user.
    */
  var tokenEncryptionKeyId: js.UndefOr[NullableOption[String]] = js.native
  
  // The tokenIssuancePolicies assigned to this service principal.
  var tokenIssuancePolicies: js.UndefOr[NullableOption[js.Array[TokenIssuancePolicy]]] = js.native
  
  // The tokenLifetimePolicies assigned to this service principal.
  var tokenLifetimePolicies: js.UndefOr[NullableOption[js.Array[TokenLifetimePolicy]]] = js.native
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
}
object ServicePrincipal {
  
  @scala.inline
  def apply(): ServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePrincipal]
  }
  
  @scala.inline
  implicit class ServicePrincipalOps[Self <: ServicePrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountEnabled(value: NullableOption[Boolean]): Self = this.set("accountEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountEnabled: Self = this.set("accountEnabled", js.undefined)
    
    @scala.inline
    def setAccountEnabledNull: Self = this.set("accountEnabled", null)
    
    @scala.inline
    def setAddInsVarargs(value: AddIn*): Self = this.set("addIns", js.Array(value :_*))
    
    @scala.inline
    def setAddIns(value: js.Array[AddIn]): Self = this.set("addIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddIns: Self = this.set("addIns", js.undefined)
    
    @scala.inline
    def setAlternativeNamesVarargs(value: String*): Self = this.set("alternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setAlternativeNames(value: js.Array[String]): Self = this.set("alternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativeNames: Self = this.set("alternativeNames", js.undefined)
    
    @scala.inline
    def setAppDescription(value: NullableOption[String]): Self = this.set("appDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppDescription: Self = this.set("appDescription", js.undefined)
    
    @scala.inline
    def setAppDescriptionNull: Self = this.set("appDescription", null)
    
    @scala.inline
    def setAppDisplayName(value: NullableOption[String]): Self = this.set("appDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppDisplayName: Self = this.set("appDisplayName", js.undefined)
    
    @scala.inline
    def setAppDisplayNameNull: Self = this.set("appDisplayName", null)
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppIdNull: Self = this.set("appId", null)
    
    @scala.inline
    def setAppOwnerOrganizationId(value: NullableOption[String]): Self = this.set("appOwnerOrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppOwnerOrganizationId: Self = this.set("appOwnerOrganizationId", js.undefined)
    
    @scala.inline
    def setAppOwnerOrganizationIdNull: Self = this.set("appOwnerOrganizationId", null)
    
    @scala.inline
    def setAppRoleAssignedToVarargs(value: AppRoleAssignment*): Self = this.set("appRoleAssignedTo", js.Array(value :_*))
    
    @scala.inline
    def setAppRoleAssignedTo(value: NullableOption[js.Array[AppRoleAssignment]]): Self = this.set("appRoleAssignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRoleAssignedTo: Self = this.set("appRoleAssignedTo", js.undefined)
    
    @scala.inline
    def setAppRoleAssignedToNull: Self = this.set("appRoleAssignedTo", null)
    
    @scala.inline
    def setAppRoleAssignmentRequired(value: Boolean): Self = this.set("appRoleAssignmentRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRoleAssignmentRequired: Self = this.set("appRoleAssignmentRequired", js.undefined)
    
    @scala.inline
    def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = this.set("appRoleAssignments", js.Array(value :_*))
    
    @scala.inline
    def setAppRoleAssignments(value: NullableOption[js.Array[AppRoleAssignment]]): Self = this.set("appRoleAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRoleAssignments: Self = this.set("appRoleAssignments", js.undefined)
    
    @scala.inline
    def setAppRoleAssignmentsNull: Self = this.set("appRoleAssignments", null)
    
    @scala.inline
    def setAppRolesVarargs(value: AppRole*): Self = this.set("appRoles", js.Array(value :_*))
    
    @scala.inline
    def setAppRoles(value: js.Array[AppRole]): Self = this.set("appRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRoles: Self = this.set("appRoles", js.undefined)
    
    @scala.inline
    def setApplicationTemplateId(value: NullableOption[String]): Self = this.set("applicationTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationTemplateId: Self = this.set("applicationTemplateId", js.undefined)
    
    @scala.inline
    def setApplicationTemplateIdNull: Self = this.set("applicationTemplateId", null)
    
    @scala.inline
    def setClaimsMappingPoliciesVarargs(value: ClaimsMappingPolicy*): Self = this.set("claimsMappingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setClaimsMappingPolicies(value: NullableOption[js.Array[ClaimsMappingPolicy]]): Self = this.set("claimsMappingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimsMappingPolicies: Self = this.set("claimsMappingPolicies", js.undefined)
    
    @scala.inline
    def setClaimsMappingPoliciesNull: Self = this.set("claimsMappingPolicies", null)
    
    @scala.inline
    def setCreatedObjectsVarargs(value: DirectoryObject*): Self = this.set("createdObjects", js.Array(value :_*))
    
    @scala.inline
    def setCreatedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("createdObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedObjects: Self = this.set("createdObjects", js.undefined)
    
    @scala.inline
    def setCreatedObjectsNull: Self = this.set("createdObjects", null)
    
    @scala.inline
    def setDelegatedPermissionClassificationsVarargs(value: DelegatedPermissionClassification*): Self = this.set("delegatedPermissionClassifications", js.Array(value :_*))
    
    @scala.inline
    def setDelegatedPermissionClassifications(value: NullableOption[js.Array[DelegatedPermissionClassification]]): Self = this.set("delegatedPermissionClassifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedPermissionClassifications: Self = this.set("delegatedPermissionClassifications", js.undefined)
    
    @scala.inline
    def setDelegatedPermissionClassificationsNull: Self = this.set("delegatedPermissionClassifications", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: NullableOption[js.Array[Endpoint]]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsNull: Self = this.set("endpoints", null)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = this.set("homeRealmDiscoveryPolicies", js.Array(value :_*))
    
    @scala.inline
    def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = this.set("homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeRealmDiscoveryPolicies: Self = this.set("homeRealmDiscoveryPolicies", js.undefined)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesNull: Self = this.set("homeRealmDiscoveryPolicies", null)
    
    @scala.inline
    def setHomepage(value: NullableOption[String]): Self = this.set("homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    
    @scala.inline
    def setHomepageNull: Self = this.set("homepage", null)
    
    @scala.inline
    def setInfo(value: NullableOption[InformationalUrl]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setInfoNull: Self = this.set("info", null)
    
    @scala.inline
    def setKeyCredentialsVarargs(value: KeyCredential*): Self = this.set("keyCredentials", js.Array(value :_*))
    
    @scala.inline
    def setKeyCredentials(value: js.Array[KeyCredential]): Self = this.set("keyCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCredentials: Self = this.set("keyCredentials", js.undefined)
    
    @scala.inline
    def setLoginUrl(value: NullableOption[String]): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    
    @scala.inline
    def setLoginUrlNull: Self = this.set("loginUrl", null)
    
    @scala.inline
    def setLogoutUrl(value: NullableOption[String]): Self = this.set("logoutUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoutUrl: Self = this.set("logoutUrl", js.undefined)
    
    @scala.inline
    def setLogoutUrlNull: Self = this.set("logoutUrl", null)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = this.set("memberOf", js.Array(value :_*))
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberOf: Self = this.set("memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfNull: Self = this.set("memberOf", null)
    
    @scala.inline
    def setNotes(value: NullableOption[String]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setNotesNull: Self = this.set("notes", null)
    
    @scala.inline
    def setNotificationEmailAddressesVarargs(value: String*): Self = this.set("notificationEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setNotificationEmailAddresses(value: js.Array[String]): Self = this.set("notificationEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEmailAddresses: Self = this.set("notificationEmailAddresses", js.undefined)
    
    @scala.inline
    def setOauth2PermissionGrantsVarargs(value: OAuth2PermissionGrant*): Self = this.set("oauth2PermissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setOauth2PermissionGrants(value: NullableOption[js.Array[OAuth2PermissionGrant]]): Self = this.set("oauth2PermissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth2PermissionGrants: Self = this.set("oauth2PermissionGrants", js.undefined)
    
    @scala.inline
    def setOauth2PermissionGrantsNull: Self = this.set("oauth2PermissionGrants", null)
    
    @scala.inline
    def setOauth2PermissionScopesVarargs(value: PermissionScope*): Self = this.set("oauth2PermissionScopes", js.Array(value :_*))
    
    @scala.inline
    def setOauth2PermissionScopes(value: js.Array[PermissionScope]): Self = this.set("oauth2PermissionScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth2PermissionScopes: Self = this.set("oauth2PermissionScopes", js.undefined)
    
    @scala.inline
    def setOwnedObjectsVarargs(value: DirectoryObject*): Self = this.set("ownedObjects", js.Array(value :_*))
    
    @scala.inline
    def setOwnedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("ownedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnedObjects: Self = this.set("ownedObjects", js.undefined)
    
    @scala.inline
    def setOwnedObjectsNull: Self = this.set("ownedObjects", null)
    
    @scala.inline
    def setOwnersVarargs(value: DirectoryObject*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    
    @scala.inline
    def setOwnersNull: Self = this.set("owners", null)
    
    @scala.inline
    def setPasswordCredentialsVarargs(value: PasswordCredential*): Self = this.set("passwordCredentials", js.Array(value :_*))
    
    @scala.inline
    def setPasswordCredentials(value: js.Array[PasswordCredential]): Self = this.set("passwordCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordCredentials: Self = this.set("passwordCredentials", js.undefined)
    
    @scala.inline
    def setPreferredSingleSignOnMode(value: NullableOption[String]): Self = this.set("preferredSingleSignOnMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredSingleSignOnMode: Self = this.set("preferredSingleSignOnMode", js.undefined)
    
    @scala.inline
    def setPreferredSingleSignOnModeNull: Self = this.set("preferredSingleSignOnMode", null)
    
    @scala.inline
    def setPreferredTokenSigningKeyThumbprint(value: NullableOption[String]): Self = this.set("preferredTokenSigningKeyThumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredTokenSigningKeyThumbprint: Self = this.set("preferredTokenSigningKeyThumbprint", js.undefined)
    
    @scala.inline
    def setPreferredTokenSigningKeyThumbprintNull: Self = this.set("preferredTokenSigningKeyThumbprint", null)
    
    @scala.inline
    def setReplyUrlsVarargs(value: String*): Self = this.set("replyUrls", js.Array(value :_*))
    
    @scala.inline
    def setReplyUrls(value: js.Array[String]): Self = this.set("replyUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyUrls: Self = this.set("replyUrls", js.undefined)
    
    @scala.inline
    def setSamlSingleSignOnSettings(value: NullableOption[SamlSingleSignOnSettings]): Self = this.set("samlSingleSignOnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamlSingleSignOnSettings: Self = this.set("samlSingleSignOnSettings", js.undefined)
    
    @scala.inline
    def setSamlSingleSignOnSettingsNull: Self = this.set("samlSingleSignOnSettings", null)
    
    @scala.inline
    def setServicePrincipalNamesVarargs(value: String*): Self = this.set("servicePrincipalNames", js.Array(value :_*))
    
    @scala.inline
    def setServicePrincipalNames(value: js.Array[String]): Self = this.set("servicePrincipalNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePrincipalNames: Self = this.set("servicePrincipalNames", js.undefined)
    
    @scala.inline
    def setServicePrincipalType(value: NullableOption[String]): Self = this.set("servicePrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePrincipalType: Self = this.set("servicePrincipalType", js.undefined)
    
    @scala.inline
    def setServicePrincipalTypeNull: Self = this.set("servicePrincipalType", null)
    
    @scala.inline
    def setSignInAudience(value: NullableOption[String]): Self = this.set("signInAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignInAudience: Self = this.set("signInAudience", js.undefined)
    
    @scala.inline
    def setSignInAudienceNull: Self = this.set("signInAudience", null)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTokenEncryptionKeyId(value: NullableOption[String]): Self = this.set("tokenEncryptionKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenEncryptionKeyId: Self = this.set("tokenEncryptionKeyId", js.undefined)
    
    @scala.inline
    def setTokenEncryptionKeyIdNull: Self = this.set("tokenEncryptionKeyId", null)
    
    @scala.inline
    def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = this.set("tokenIssuancePolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenIssuancePolicies(value: NullableOption[js.Array[TokenIssuancePolicy]]): Self = this.set("tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenIssuancePolicies: Self = this.set("tokenIssuancePolicies", js.undefined)
    
    @scala.inline
    def setTokenIssuancePoliciesNull: Self = this.set("tokenIssuancePolicies", null)
    
    @scala.inline
    def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = this.set("tokenLifetimePolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenLifetimePolicies(value: NullableOption[js.Array[TokenLifetimePolicy]]): Self = this.set("tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenLifetimePolicies: Self = this.set("tokenLifetimePolicies", js.undefined)
    
    @scala.inline
    def setTokenLifetimePoliciesNull: Self = this.set("tokenLifetimePolicies", null)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = this.set("transitiveMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitiveMemberOf: Self = this.set("transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = this.set("transitiveMemberOf", null)
  }
}
