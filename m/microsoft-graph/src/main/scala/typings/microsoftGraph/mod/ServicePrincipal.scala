package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePrincipal
  extends StObject
     with DirectoryObject {
  
  /**
    * true if the service principal account is enabled; otherwise, false. If set to false, then no users will be able to sign
    * in to this app, even if they are assigned to it. Supports $filter (eq, ne, not, in).
    */
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications
    * that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services
    * like Microsoft 365 call the application in the context of a document the user is working on.
    */
  var addIns: js.UndefOr[js.Array[AddIn]] = js.undefined
  
  /**
    * Used to retrieve service principals by subscription, identify resource group and full resource ids for managed
    * identities. Supports $filter (eq, not, ge, le, startsWith).
    */
  var alternativeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  // The description exposed by the associated application.
  var appDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name exposed by the associated application.
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The unique identifier for the associated application (its appId property). Supports $filter (eq, ne, not, in,
    * startsWith).
    */
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The appManagementPolicy applied to this application.
  var appManagementPolicies: js.UndefOr[NullableOption[js.Array[AppManagementPolicy]]] = js.undefined
  
  /**
    * Contains the tenant id where the application is registered. This is applicable only to service principals backed by
    * applications. Supports $filter (eq, ne, NOT, ge, le).
    */
  var appOwnerOrganizationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand.
  var appRoleAssignedTo: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.undefined
  
  /**
    * Specifies whether users or other service principals need to be granted an app role assignment for this service
    * principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter
    * (eq, ne, NOT).
    */
  var appRoleAssignmentRequired: js.UndefOr[Boolean] = js.undefined
  
  // App role assignment for another app or service, granted to this service principal. Supports $expand.
  var appRoleAssignments: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.undefined
  
  /**
    * The roles exposed by the application which this service principal represents. For more information see the appRoles
    * property definition on the application entity. Not nullable.
    */
  var appRoles: js.UndefOr[js.Array[AppRole]] = js.undefined
  
  /**
    * Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter
    * (eq, ne, NOT, startsWith).
    */
  var applicationTemplateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The claimsMappingPolicies assigned to this service principal. Supports $expand.
  var claimsMappingPolicies: js.UndefOr[NullableOption[js.Array[ClaimsMappingPolicy]]] = js.undefined
  
  // Directory objects created by this service principal. Read-only. Nullable.
  var createdObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  var delegatedPermissionClassifications: js.UndefOr[NullableOption[js.Array[DelegatedPermissionClassification]]] = js.undefined
  
  /**
    * Free text field to provide an internal end-user facing description of the service principal. End-user portals such
    * MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports
    * $filter (eq, ne, not, ge, le, startsWith) and $search.
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value),
    * NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious
    * activity, or a violation of the Microsoft Services Agreement). Supports $filter (eq, ne, not).
    */
  var disabledByMicrosoftStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null
    * values), $search, and $orderBy.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var endpoints: js.UndefOr[NullableOption[js.Array[Endpoint]]] = js.undefined
  
  /**
    * Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (/$count
    * eq 0, /$count ne 0).
    */
  var federatedIdentityCredentials: js.UndefOr[NullableOption[js.Array[FederatedIdentityCredential]]] = js.undefined
  
  // The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
  var homeRealmDiscoveryPolicies: js.UndefOr[NullableOption[js.Array[HomeRealmDiscoveryPolicy]]] = js.undefined
  
  // Home page or landing page of the application.
  var homepage: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy
    * statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience.
    * For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter
    * (eq, ne, not, ge, le, and eq on null values).
    */
  var info: js.UndefOr[NullableOption[InformationalUrl]] = js.undefined
  
  /**
    * The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge,
    * le).
    */
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
  
  // Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Free text field to capture information about the service principal, typically used for operational purposes. Maximum
    * allowed size is 1024 characters.
    */
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
  
  /**
    * Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand and $filter (/$count
    * eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
    */
  var ownedObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or
    * servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand and $filter (/$count eq
    * 0, /$count ne 0, /$count eq 1, /$count ne 1).
    */
  var owners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // The collection of password credentials associated with the application. Not nullable.
  var passwordCredentials: js.UndefOr[js.Array[PasswordCredential]] = js.undefined
  
  /**
    * Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to
    * launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml,
    * notSupported, and oidc.
    */
  var preferredSingleSignOnMode: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which
    * certificate is used to sign the SAML responses. For applications that are not SAML, do not write or otherwise rely on
    * this property.
    */
  var preferredTokenSigningKeyThumbprint: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0
    * authorization codes and access tokens are sent to for the associated application. Not nullable.
    */
  var replyUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are
    * only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only.
    */
  var resourceSpecificApplicationPermissions: js.UndefOr[js.Array[ResourceSpecificPermission]] = js.undefined
  
  // The collection for settings related to saml single sign-on.
  var samlSingleSignOnSettings: js.UndefOr[NullableOption[SamlSingleSignOnSettings]] = js.undefined
  
  /**
    * Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to
    * hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For
    * example,Client apps can specify a resource URI which is based on the values of this property to acquire an access
    * token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued
    * properties. Not nullable. Supports $filter (eq, not, ge, le, startsWith).
    */
  var servicePrincipalNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Identifies whether the service principal represents an application, a managed identity, or a legacy application. This
    * is set by Azure AD internally. The servicePrincipalType property can be set to three different values: __Application -
    * A service principal that represents an application or service. The appId property identifies the associated app
    * registration, and matches the appId of an application, possibly from a different tenant. If the associated app
    * registration is missing, tokens are not issued for the service principal.__ManagedIdentity - A service principal that
    * represents a managed identity. Service principals representing managed identities can be granted access and
    * permissions, but cannot be updated or modified directly.__Legacy - A service principal that represents an app created
    * before app registrations, or through legacy experiences. Legacy service principal can have credentials, service
    * principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an
    * associated app registration. The appId value does not associate the service principal with an app registration. The
    * service principal can only be used in the tenant where it was created.__SocialIdp - For internal use.
    */
  var servicePrincipalType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values
    * are:AzureADMyOrg: Users with a Microsoft work or school account in my organization's Azure AD tenant
    * (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization's Azure AD
    * tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school
    * account in any organization's Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
    */
  var signInAudience: js.UndefOr[NullableOption[String]] = js.undefined
  
  var synchronization: js.UndefOr[NullableOption[Synchronization]] = js.undefined
  
  /**
    * Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union
    * of strings set here and on the associated application entity's tags property.Supports $filter (eq, not, ge, le,
    * startsWith).
    */
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
  
  // Specifies the verified publisher of the application which this service principal represents.
  var verifiedPublisher: js.UndefOr[NullableOption[VerifiedPublisher]] = js.undefined
}
object ServicePrincipal {
  
  inline def apply(): ServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePrincipal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServicePrincipal] (val x: Self) extends AnyVal {
    
    inline def setAccountEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "accountEnabled", value.asInstanceOf[js.Any])
    
    inline def setAccountEnabledNull: Self = StObject.set(x, "accountEnabled", null)
    
    inline def setAccountEnabledUndefined: Self = StObject.set(x, "accountEnabled", js.undefined)
    
    inline def setAddIns(value: js.Array[AddIn]): Self = StObject.set(x, "addIns", value.asInstanceOf[js.Any])
    
    inline def setAddInsUndefined: Self = StObject.set(x, "addIns", js.undefined)
    
    inline def setAddInsVarargs(value: AddIn*): Self = StObject.set(x, "addIns", js.Array(value*))
    
    inline def setAlternativeNames(value: js.Array[String]): Self = StObject.set(x, "alternativeNames", value.asInstanceOf[js.Any])
    
    inline def setAlternativeNamesUndefined: Self = StObject.set(x, "alternativeNames", js.undefined)
    
    inline def setAlternativeNamesVarargs(value: String*): Self = StObject.set(x, "alternativeNames", js.Array(value*))
    
    inline def setAppDescription(value: NullableOption[String]): Self = StObject.set(x, "appDescription", value.asInstanceOf[js.Any])
    
    inline def setAppDescriptionNull: Self = StObject.set(x, "appDescription", null)
    
    inline def setAppDescriptionUndefined: Self = StObject.set(x, "appDescription", js.undefined)
    
    inline def setAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "appDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAppDisplayNameNull: Self = StObject.set(x, "appDisplayName", null)
    
    inline def setAppDisplayNameUndefined: Self = StObject.set(x, "appDisplayName", js.undefined)
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAppManagementPolicies(value: NullableOption[js.Array[AppManagementPolicy]]): Self = StObject.set(x, "appManagementPolicies", value.asInstanceOf[js.Any])
    
    inline def setAppManagementPoliciesNull: Self = StObject.set(x, "appManagementPolicies", null)
    
    inline def setAppManagementPoliciesUndefined: Self = StObject.set(x, "appManagementPolicies", js.undefined)
    
    inline def setAppManagementPoliciesVarargs(value: AppManagementPolicy*): Self = StObject.set(x, "appManagementPolicies", js.Array(value*))
    
    inline def setAppOwnerOrganizationId(value: NullableOption[String]): Self = StObject.set(x, "appOwnerOrganizationId", value.asInstanceOf[js.Any])
    
    inline def setAppOwnerOrganizationIdNull: Self = StObject.set(x, "appOwnerOrganizationId", null)
    
    inline def setAppOwnerOrganizationIdUndefined: Self = StObject.set(x, "appOwnerOrganizationId", js.undefined)
    
    inline def setAppRoleAssignedTo(value: NullableOption[js.Array[AppRoleAssignment]]): Self = StObject.set(x, "appRoleAssignedTo", value.asInstanceOf[js.Any])
    
    inline def setAppRoleAssignedToNull: Self = StObject.set(x, "appRoleAssignedTo", null)
    
    inline def setAppRoleAssignedToUndefined: Self = StObject.set(x, "appRoleAssignedTo", js.undefined)
    
    inline def setAppRoleAssignedToVarargs(value: AppRoleAssignment*): Self = StObject.set(x, "appRoleAssignedTo", js.Array(value*))
    
    inline def setAppRoleAssignmentRequired(value: Boolean): Self = StObject.set(x, "appRoleAssignmentRequired", value.asInstanceOf[js.Any])
    
    inline def setAppRoleAssignmentRequiredUndefined: Self = StObject.set(x, "appRoleAssignmentRequired", js.undefined)
    
    inline def setAppRoleAssignments(value: NullableOption[js.Array[AppRoleAssignment]]): Self = StObject.set(x, "appRoleAssignments", value.asInstanceOf[js.Any])
    
    inline def setAppRoleAssignmentsNull: Self = StObject.set(x, "appRoleAssignments", null)
    
    inline def setAppRoleAssignmentsUndefined: Self = StObject.set(x, "appRoleAssignments", js.undefined)
    
    inline def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = StObject.set(x, "appRoleAssignments", js.Array(value*))
    
    inline def setAppRoles(value: js.Array[AppRole]): Self = StObject.set(x, "appRoles", value.asInstanceOf[js.Any])
    
    inline def setAppRolesUndefined: Self = StObject.set(x, "appRoles", js.undefined)
    
    inline def setAppRolesVarargs(value: AppRole*): Self = StObject.set(x, "appRoles", js.Array(value*))
    
    inline def setApplicationTemplateId(value: NullableOption[String]): Self = StObject.set(x, "applicationTemplateId", value.asInstanceOf[js.Any])
    
    inline def setApplicationTemplateIdNull: Self = StObject.set(x, "applicationTemplateId", null)
    
    inline def setApplicationTemplateIdUndefined: Self = StObject.set(x, "applicationTemplateId", js.undefined)
    
    inline def setClaimsMappingPolicies(value: NullableOption[js.Array[ClaimsMappingPolicy]]): Self = StObject.set(x, "claimsMappingPolicies", value.asInstanceOf[js.Any])
    
    inline def setClaimsMappingPoliciesNull: Self = StObject.set(x, "claimsMappingPolicies", null)
    
    inline def setClaimsMappingPoliciesUndefined: Self = StObject.set(x, "claimsMappingPolicies", js.undefined)
    
    inline def setClaimsMappingPoliciesVarargs(value: ClaimsMappingPolicy*): Self = StObject.set(x, "claimsMappingPolicies", js.Array(value*))
    
    inline def setCreatedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "createdObjects", value.asInstanceOf[js.Any])
    
    inline def setCreatedObjectsNull: Self = StObject.set(x, "createdObjects", null)
    
    inline def setCreatedObjectsUndefined: Self = StObject.set(x, "createdObjects", js.undefined)
    
    inline def setCreatedObjectsVarargs(value: DirectoryObject*): Self = StObject.set(x, "createdObjects", js.Array(value*))
    
    inline def setDelegatedPermissionClassifications(value: NullableOption[js.Array[DelegatedPermissionClassification]]): Self = StObject.set(x, "delegatedPermissionClassifications", value.asInstanceOf[js.Any])
    
    inline def setDelegatedPermissionClassificationsNull: Self = StObject.set(x, "delegatedPermissionClassifications", null)
    
    inline def setDelegatedPermissionClassificationsUndefined: Self = StObject.set(x, "delegatedPermissionClassifications", js.undefined)
    
    inline def setDelegatedPermissionClassificationsVarargs(value: DelegatedPermissionClassification*): Self = StObject.set(x, "delegatedPermissionClassifications", js.Array(value*))
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabledByMicrosoftStatus(value: NullableOption[String]): Self = StObject.set(x, "disabledByMicrosoftStatus", value.asInstanceOf[js.Any])
    
    inline def setDisabledByMicrosoftStatusNull: Self = StObject.set(x, "disabledByMicrosoftStatus", null)
    
    inline def setDisabledByMicrosoftStatusUndefined: Self = StObject.set(x, "disabledByMicrosoftStatus", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndpoints(value: NullableOption[js.Array[Endpoint]]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsNull: Self = StObject.set(x, "endpoints", null)
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setFederatedIdentityCredentials(value: NullableOption[js.Array[FederatedIdentityCredential]]): Self = StObject.set(x, "federatedIdentityCredentials", value.asInstanceOf[js.Any])
    
    inline def setFederatedIdentityCredentialsNull: Self = StObject.set(x, "federatedIdentityCredentials", null)
    
    inline def setFederatedIdentityCredentialsUndefined: Self = StObject.set(x, "federatedIdentityCredentials", js.undefined)
    
    inline def setFederatedIdentityCredentialsVarargs(value: FederatedIdentityCredential*): Self = StObject.set(x, "federatedIdentityCredentials", js.Array(value*))
    
    inline def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = StObject.set(x, "homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    inline def setHomeRealmDiscoveryPoliciesNull: Self = StObject.set(x, "homeRealmDiscoveryPolicies", null)
    
    inline def setHomeRealmDiscoveryPoliciesUndefined: Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.undefined)
    
    inline def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.Array(value*))
    
    inline def setHomepage(value: NullableOption[String]): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageNull: Self = StObject.set(x, "homepage", null)
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setInfo(value: NullableOption[InformationalUrl]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoNull: Self = StObject.set(x, "info", null)
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setKeyCredentials(value: js.Array[KeyCredential]): Self = StObject.set(x, "keyCredentials", value.asInstanceOf[js.Any])
    
    inline def setKeyCredentialsUndefined: Self = StObject.set(x, "keyCredentials", js.undefined)
    
    inline def setKeyCredentialsVarargs(value: KeyCredential*): Self = StObject.set(x, "keyCredentials", js.Array(value*))
    
    inline def setLoginUrl(value: NullableOption[String]): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
    
    inline def setLoginUrlNull: Self = StObject.set(x, "loginUrl", null)
    
    inline def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
    
    inline def setLogoutUrl(value: NullableOption[String]): Self = StObject.set(x, "logoutUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoutUrlNull: Self = StObject.set(x, "logoutUrl", null)
    
    inline def setLogoutUrlUndefined: Self = StObject.set(x, "logoutUrl", js.undefined)
    
    inline def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    inline def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    inline def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    inline def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value*))
    
    inline def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotificationEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "notificationEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setNotificationEmailAddressesUndefined: Self = StObject.set(x, "notificationEmailAddresses", js.undefined)
    
    inline def setNotificationEmailAddressesVarargs(value: String*): Self = StObject.set(x, "notificationEmailAddresses", js.Array(value*))
    
    inline def setOauth2PermissionGrants(value: NullableOption[js.Array[OAuth2PermissionGrant]]): Self = StObject.set(x, "oauth2PermissionGrants", value.asInstanceOf[js.Any])
    
    inline def setOauth2PermissionGrantsNull: Self = StObject.set(x, "oauth2PermissionGrants", null)
    
    inline def setOauth2PermissionGrantsUndefined: Self = StObject.set(x, "oauth2PermissionGrants", js.undefined)
    
    inline def setOauth2PermissionGrantsVarargs(value: OAuth2PermissionGrant*): Self = StObject.set(x, "oauth2PermissionGrants", js.Array(value*))
    
    inline def setOauth2PermissionScopes(value: js.Array[PermissionScope]): Self = StObject.set(x, "oauth2PermissionScopes", value.asInstanceOf[js.Any])
    
    inline def setOauth2PermissionScopesUndefined: Self = StObject.set(x, "oauth2PermissionScopes", js.undefined)
    
    inline def setOauth2PermissionScopesVarargs(value: PermissionScope*): Self = StObject.set(x, "oauth2PermissionScopes", js.Array(value*))
    
    inline def setOwnedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "ownedObjects", value.asInstanceOf[js.Any])
    
    inline def setOwnedObjectsNull: Self = StObject.set(x, "ownedObjects", null)
    
    inline def setOwnedObjectsUndefined: Self = StObject.set(x, "ownedObjects", js.undefined)
    
    inline def setOwnedObjectsVarargs(value: DirectoryObject*): Self = StObject.set(x, "ownedObjects", js.Array(value*))
    
    inline def setOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: DirectoryObject*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setPasswordCredentials(value: js.Array[PasswordCredential]): Self = StObject.set(x, "passwordCredentials", value.asInstanceOf[js.Any])
    
    inline def setPasswordCredentialsUndefined: Self = StObject.set(x, "passwordCredentials", js.undefined)
    
    inline def setPasswordCredentialsVarargs(value: PasswordCredential*): Self = StObject.set(x, "passwordCredentials", js.Array(value*))
    
    inline def setPreferredSingleSignOnMode(value: NullableOption[String]): Self = StObject.set(x, "preferredSingleSignOnMode", value.asInstanceOf[js.Any])
    
    inline def setPreferredSingleSignOnModeNull: Self = StObject.set(x, "preferredSingleSignOnMode", null)
    
    inline def setPreferredSingleSignOnModeUndefined: Self = StObject.set(x, "preferredSingleSignOnMode", js.undefined)
    
    inline def setPreferredTokenSigningKeyThumbprint(value: NullableOption[String]): Self = StObject.set(x, "preferredTokenSigningKeyThumbprint", value.asInstanceOf[js.Any])
    
    inline def setPreferredTokenSigningKeyThumbprintNull: Self = StObject.set(x, "preferredTokenSigningKeyThumbprint", null)
    
    inline def setPreferredTokenSigningKeyThumbprintUndefined: Self = StObject.set(x, "preferredTokenSigningKeyThumbprint", js.undefined)
    
    inline def setReplyUrls(value: js.Array[String]): Self = StObject.set(x, "replyUrls", value.asInstanceOf[js.Any])
    
    inline def setReplyUrlsUndefined: Self = StObject.set(x, "replyUrls", js.undefined)
    
    inline def setReplyUrlsVarargs(value: String*): Self = StObject.set(x, "replyUrls", js.Array(value*))
    
    inline def setResourceSpecificApplicationPermissions(value: js.Array[ResourceSpecificPermission]): Self = StObject.set(x, "resourceSpecificApplicationPermissions", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecificApplicationPermissionsUndefined: Self = StObject.set(x, "resourceSpecificApplicationPermissions", js.undefined)
    
    inline def setResourceSpecificApplicationPermissionsVarargs(value: ResourceSpecificPermission*): Self = StObject.set(x, "resourceSpecificApplicationPermissions", js.Array(value*))
    
    inline def setSamlSingleSignOnSettings(value: NullableOption[SamlSingleSignOnSettings]): Self = StObject.set(x, "samlSingleSignOnSettings", value.asInstanceOf[js.Any])
    
    inline def setSamlSingleSignOnSettingsNull: Self = StObject.set(x, "samlSingleSignOnSettings", null)
    
    inline def setSamlSingleSignOnSettingsUndefined: Self = StObject.set(x, "samlSingleSignOnSettings", js.undefined)
    
    inline def setServicePrincipalNames(value: js.Array[String]): Self = StObject.set(x, "servicePrincipalNames", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalNamesUndefined: Self = StObject.set(x, "servicePrincipalNames", js.undefined)
    
    inline def setServicePrincipalNamesVarargs(value: String*): Self = StObject.set(x, "servicePrincipalNames", js.Array(value*))
    
    inline def setServicePrincipalType(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalType", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalTypeNull: Self = StObject.set(x, "servicePrincipalType", null)
    
    inline def setServicePrincipalTypeUndefined: Self = StObject.set(x, "servicePrincipalType", js.undefined)
    
    inline def setSignInAudience(value: NullableOption[String]): Self = StObject.set(x, "signInAudience", value.asInstanceOf[js.Any])
    
    inline def setSignInAudienceNull: Self = StObject.set(x, "signInAudience", null)
    
    inline def setSignInAudienceUndefined: Self = StObject.set(x, "signInAudience", js.undefined)
    
    inline def setSynchronization(value: NullableOption[Synchronization]): Self = StObject.set(x, "synchronization", value.asInstanceOf[js.Any])
    
    inline def setSynchronizationNull: Self = StObject.set(x, "synchronization", null)
    
    inline def setSynchronizationUndefined: Self = StObject.set(x, "synchronization", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTokenEncryptionKeyId(value: NullableOption[String]): Self = StObject.set(x, "tokenEncryptionKeyId", value.asInstanceOf[js.Any])
    
    inline def setTokenEncryptionKeyIdNull: Self = StObject.set(x, "tokenEncryptionKeyId", null)
    
    inline def setTokenEncryptionKeyIdUndefined: Self = StObject.set(x, "tokenEncryptionKeyId", js.undefined)
    
    inline def setTokenIssuancePolicies(value: NullableOption[js.Array[TokenIssuancePolicy]]): Self = StObject.set(x, "tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    inline def setTokenIssuancePoliciesNull: Self = StObject.set(x, "tokenIssuancePolicies", null)
    
    inline def setTokenIssuancePoliciesUndefined: Self = StObject.set(x, "tokenIssuancePolicies", js.undefined)
    
    inline def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = StObject.set(x, "tokenIssuancePolicies", js.Array(value*))
    
    inline def setTokenLifetimePolicies(value: NullableOption[js.Array[TokenLifetimePolicy]]): Self = StObject.set(x, "tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    inline def setTokenLifetimePoliciesNull: Self = StObject.set(x, "tokenLifetimePolicies", null)
    
    inline def setTokenLifetimePoliciesUndefined: Self = StObject.set(x, "tokenLifetimePolicies", js.undefined)
    
    inline def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = StObject.set(x, "tokenLifetimePolicies", js.Array(value*))
    
    inline def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    inline def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    inline def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    inline def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value*))
    
    inline def setVerifiedPublisher(value: NullableOption[VerifiedPublisher]): Self = StObject.set(x, "verifiedPublisher", value.asInstanceOf[js.Any])
    
    inline def setVerifiedPublisherNull: Self = StObject.set(x, "verifiedPublisher", null)
    
    inline def setVerifiedPublisherUndefined: Self = StObject.set(x, "verifiedPublisher", js.undefined)
  }
}
