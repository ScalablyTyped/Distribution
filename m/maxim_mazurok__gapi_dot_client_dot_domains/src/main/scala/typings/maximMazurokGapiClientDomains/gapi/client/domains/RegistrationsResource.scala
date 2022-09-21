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
import typings.maximMazurokGapiClientDomains.anon.Query
import typings.maximMazurokGapiClientDomains.anon.QuotaUser
import typings.maximMazurokGapiClientDomains.anon.Resource
import typings.maximMazurokGapiClientDomains.anon.UpdateMask
import typings.maximMazurokGapiClientDomains.anon.UploadType
import typings.maximMazurokGapiClientDomains.anon.Uploadprotocol
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
    * Deletes a `Registration` resource. This method works on any `Registration` resource using [Subscription or Commitment billing](/domains/pricing#billing-models), provided that the
    * resource was created at least 1 day in the past. For `Registration` resources using [Monthly billing](/domains/pricing#billing-models), this method works if: * `state` is `EXPORTED`
    * with `expire_time` in the past * `state` is `REGISTRATION_FAILED` * `state` is `TRANSFER_FAILED` When an active registration is successfully deleted, you can continue to use the
    * domain in [Google Domains](https://domains.google/) until it expires. The calling user becomes the domain's sole owner in Google Domains, and permissions for the domain are
    * subsequently managed there. The domain does not renew automatically unless the new owner sets up billing in Google Domains.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  def `export`(request: Accesstoken, body: ExportRegistrationRequest): Request[Operation] = js.native
  /**
    * Exports a `Registration` resource, such that it is no longer managed by Cloud Domains. When an active domain is successfully exported, you can continue to use the domain in [Google
    * Domains](https://domains.google/) until it expires. The calling user becomes the domain's sole owner in Google Domains, and permissions for the domain are subsequently managed
    * there. The domain does not renew automatically unless the new owner sets up billing in Google Domains.
    */
  def `export`(request: Name): Request[Operation] = js.native
  
  /** Gets the details of a `Registration` resource. */
  def get(): Request[Registration] = js.native
  def get(request: Accesstoken): Request[Registration] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /**
    * Imports a domain name from [Google Domains](https://domains.google/) for use in Cloud Domains. To transfer a domain from another registrar, use the `TransferDomain` method instead.
    * Since individual users can own domains in Google Domains, the calling user must have ownership permission on the domain.
    */
  def `import`(request: Parent): Request[Operation] = js.native
  def `import`(request: PrettyPrint, body: ImportDomainRequest): Request[Operation] = js.native
  
  /** Lists the `Registration` resources in a project. */
  def list(): Request[ListRegistrationsResponse] = js.native
  def list(request: Filter): Request[ListRegistrationsResponse] = js.native
  
  /**
    * Updates select fields of a `Registration` resource, notably `labels`. To update other fields, use the appropriate custom update method: * To update management settings, see
    * `ConfigureManagementSettings` * To update DNS configuration, see `ConfigureDnsSettings` * To update contact information, see `ConfigureContactSettings`
    */
  def patch(request: QuotaUser): Request[Operation] = js.native
  def patch(request: UpdateMask, body: Registration): Request[Operation] = js.native
  
  def register(request: PrettyPrint, body: RegisterDomainRequest): Request[Operation] = js.native
  /**
    * Registers a new domain name and creates a corresponding `Registration` resource. Call `RetrieveRegisterParameters` first to check availability of the domain name and determine
    * parameters like price that are needed to build a call to this method. A successful call creates a `Registration` resource in state `REGISTRATION_PENDING`, which resolves to `ACTIVE`
    * within 1-2 minutes, indicating that the domain was successfully registered. If the resource ends up in state `REGISTRATION_FAILED`, it indicates that the domain was not registered
    * successfully, and you can safely delete the resource and retry registration.
    */
  def register(request: Resource): Request[Operation] = js.native
  
  def resetAuthorizationCode(request: Fields, body: ResetAuthorizationCodeRequest): Request[AuthorizationCode] = js.native
  /** Resets the authorization code of the `Registration` to a new random string. You can call this method only after 60 days have elapsed since the initial domain registration. */
  def resetAuthorizationCode(request: typings.maximMazurokGapiClientDomains.anon.Registration): Request[AuthorizationCode] = js.native
  
  /**
    * Gets the authorization code of the `Registration` for the purpose of transferring the domain to another registrar. You can call this method only after 60 days have elapsed since the
    * initial domain registration.
    */
  def retrieveAuthorizationCode(): Request[AuthorizationCode] = js.native
  def retrieveAuthorizationCode(request: Fields): Request[AuthorizationCode] = js.native
  
  /**
    * Lists domain names from [Google Domains](https://domains.google/) that can be imported to Cloud Domains using the `ImportDomain` method. Since individual users can own domains in
    * Google Domains, the list of domains returned depends on the individual user making the call. Domains supported by Google Domains, but not supported by Cloud Domains, are not
    * returned.
    */
  def retrieveImportableDomains(): Request[RetrieveImportableDomainsResponse] = js.native
  def retrieveImportableDomains(request: typings.maximMazurokGapiClientDomains.anon.Location): Request[RetrieveImportableDomainsResponse] = js.native
  
  /** Gets parameters needed to register a new domain name, including price and up-to-date availability. Use the returned values to call `RegisterDomain`. */
  def retrieveRegisterParameters(): Request[RetrieveRegisterParametersResponse] = js.native
  def retrieveRegisterParameters(request: DomainName): Request[RetrieveRegisterParametersResponse] = js.native
  
  /**
    * Gets parameters needed to transfer a domain name from another registrar to Cloud Domains. For domains already managed by [Google Domains](https://domains.google/), use
    * `ImportDomain` instead. Use the returned values to call `TransferDomain`.
    */
  def retrieveTransferParameters(): Request[RetrieveTransferParametersResponse] = js.native
  def retrieveTransferParameters(request: DomainName): Request[RetrieveTransferParametersResponse] = js.native
  
  /**
    * Searches for available domain names similar to the provided query. Availability results from this method are approximate; call `RetrieveRegisterParameters` on a domain before
    * registering to confirm availability.
    */
  def searchDomains(): Request[SearchDomainsResponse] = js.native
  def searchDomains(request: Query): Request[SearchDomainsResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: UploadType, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: UploadType, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def transfer(request: PrettyPrint, body: TransferDomainRequest): Request[Operation] = js.native
  /**
    * Transfers a domain name from another registrar to Cloud Domains. For domains already managed by [Google Domains](https://domains.google/), use `ImportDomain` instead. Before calling
    * this method, go to the domain's current registrar to unlock the domain for transfer and retrieve the domain's transfer authorization code. Then call `RetrieveTransferParameters` to
    * confirm that the domain is unlocked and to get values needed to build a call to this method. A successful call creates a `Registration` resource in state `TRANSFER_PENDING`. It can
    * take several days to complete the transfer process. The registrant can often speed up this process by approving the transfer through the current registrar, either by clicking a link
    * in an email from the registrar or by visiting the registrar's website. A few minutes after transfer approval, the resource transitions to state `ACTIVE`, indicating that the
    * transfer was successful. If the transfer is rejected or the request expires without being approved, the resource can end up in state `TRANSFER_FAILED`. If transfer fails, you can
    * safely delete the resource and retry the transfer.
    */
  def transfer(request: Uploadprotocol): Request[Operation] = js.native
}
