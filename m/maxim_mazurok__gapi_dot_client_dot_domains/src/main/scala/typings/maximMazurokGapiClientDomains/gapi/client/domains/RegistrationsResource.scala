package typings.maximMazurokGapiClientDomains.gapi.client.domains

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDomains.anon.Accesstoken
import typings.maximMazurokGapiClientDomains.anon.Callback
import typings.maximMazurokGapiClientDomains.anon.DomainName
import typings.maximMazurokGapiClientDomains.anon.Fields
import typings.maximMazurokGapiClientDomains.anon.Filter
import typings.maximMazurokGapiClientDomains.anon.Key
import typings.maximMazurokGapiClientDomains.anon.Name
import typings.maximMazurokGapiClientDomains.anon.Oauthtoken
import typings.maximMazurokGapiClientDomains.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientDomains.anon.Parent
import typings.maximMazurokGapiClientDomains.anon.PrettyPrint
import typings.maximMazurokGapiClientDomains.anon.QuotaUser
import typings.maximMazurokGapiClientDomains.anon.Resource
import typings.maximMazurokGapiClientDomains.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationsResource extends StObject {
  
  /** Updates a `Registration`'s contact settings. Some changes require confirmation by the domain's registrant contact . */
  def configureContactSettings(request: Callback): Request[Operation] = js.native
  def configureContactSettings(request: Fields, body: ConfigureContactSettingsRequest): Request[Operation] = js.native
  
  def configureDnsSettings(request: Fields, body: ConfigureDnsSettingsRequest): Request[Operation] = js.native
  /** Updates a `Registration`'s DNS settings. */
  def configureDnsSettings(request: Key): Request[Operation] = js.native
  
  def configureManagementSettings(request: Fields, body: ConfigureManagementSettingsRequest): Request[Operation] = js.native
  /** Updates a `Registration`'s management settings. */
  def configureManagementSettings(request: Oauthtoken): Request[Operation] = js.native
  
  /**
    * Deletes a `Registration` resource. This method only works on resources in one of the following states: * `state` is `EXPORTED` with `expire_time` in the past * `state` is
    * `REGISTRATION_FAILED`
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  def `export`(request: Accesstoken, body: ExportRegistrationRequest): Request[Operation] = js.native
  /**
    * Exports a `Registration` that you no longer want to use with Cloud Domains. You can continue to use the domain in [Google Domains](https://domains.google/) until it expires. If the
    * export is successful: * The resource's `state` becomes `EXPORTED`, meaning that it is no longer managed by Cloud Domains * Because individual users can own domains in Google
    * Domains, the calling user becomes the domain's sole owner. Permissions for the domain are subsequently managed in Google Domains. * Without further action, the domain does not renew
    * automatically. The new owner can set up billing in Google Domains to renew the domain if needed.
    */
  def `export`(request: Name): Request[Operation] = js.native
  
  /** Gets the details of a `Registration` resource. */
  def get(): Request[Registration] = js.native
  def get(request: Accesstoken): Request[Registration] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Lists the `Registration` resources in a project. */
  def list(): Request[ListRegistrationsResponse] = js.native
  def list(request: Filter): Request[ListRegistrationsResponse] = js.native
  
  /**
    * Updates select fields of a `Registration` resource, notably `labels`. To update other fields, use the appropriate custom update method: * To update management settings, see
    * `ConfigureManagementSettings` * To update DNS configuration, see `ConfigureDnsSettings` * To update contact information, see `ConfigureContactSettings`
    */
  def patch(request: PrettyPrint): Request[Operation] = js.native
  def patch(request: QuotaUser, body: Registration): Request[Operation] = js.native
  
  /**
    * Registers a new domain name and creates a corresponding `Registration` resource. Call `RetrieveRegisterParameters` first to check availability of the domain name and determine
    * parameters like price that are needed to build a call to this method. A successful call creates a `Registration` resource in state `REGISTRATION_PENDING`, which resolves to `ACTIVE`
    * within 1-2 minutes, indicating that the domain was successfully registered. If the resource ends up in state `REGISTRATION_FAILED`, it indicates that the domain was not registered
    * successfully, and you can safely delete the resource and retry registration.
    */
  def register(request: Parent): Request[Operation] = js.native
  def register(request: UploadType, body: RegisterDomainRequest): Request[Operation] = js.native
  
  def resetAuthorizationCode(request: Fields, body: ResetAuthorizationCodeRequest): Request[AuthorizationCode] = js.native
  /** Resets the authorization code of the `Registration` to a new random string. You can call this method only after 60 days have elapsed since the initial domain registration. */
  def resetAuthorizationCode(request: typings.maximMazurokGapiClientDomains.anon.Registration): Request[AuthorizationCode] = js.native
  
  /**
    * Gets the authorization code of the `Registration` for the purpose of transferring the domain to another registrar. You can call this method only after 60 days have elapsed since the
    * initial domain registration.
    */
  def retrieveAuthorizationCode(): Request[AuthorizationCode] = js.native
  def retrieveAuthorizationCode(request: Fields): Request[AuthorizationCode] = js.native
  
  /** Gets parameters needed to register a new domain name, including price and up-to-date availability. Use the returned values to call `RegisterDomain`. */
  def retrieveRegisterParameters(): Request[RetrieveRegisterParametersResponse] = js.native
  def retrieveRegisterParameters(request: DomainName): Request[RetrieveRegisterParametersResponse] = js.native
  
  /**
    * Searches for available domain names similar to the provided query. Availability results from this method are approximate; call `RetrieveRegisterParameters` on a domain before
    * registering to confirm availability.
    */
  def searchDomains(): Request[SearchDomainsResponse] = js.native
  def searchDomains(request: typings.maximMazurokGapiClientDomains.anon.Location): Request[SearchDomainsResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
