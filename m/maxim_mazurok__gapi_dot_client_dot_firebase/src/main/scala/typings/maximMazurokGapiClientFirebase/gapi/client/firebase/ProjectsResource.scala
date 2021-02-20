package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebase.anon.Accesstoken
import typings.maximMazurokGapiClientFirebase.anon.AccesstokenAlt
import typings.maximMazurokGapiClientFirebase.anon.Alt
import typings.maximMazurokGapiClientFirebase.anon.AltCallback
import typings.maximMazurokGapiClientFirebase.anon.Fields
import typings.maximMazurokGapiClientFirebase.anon.Filter
import typings.maximMazurokGapiClientFirebase.anon.PrettyPrint
import typings.maximMazurokGapiClientFirebase.anon.Project
import typings.maximMazurokGapiClientFirebase.anon.Uploadprotocol
import typings.maximMazurokGapiClientFirebase.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /**
    * Adds Firebase resources to the specified existing [Google Cloud Platform (GCP) `Project`] (https://cloud.google.com/resource-manager/reference/rest/v1/projects). Since a
    * FirebaseProject is actually also a GCP `Project`, a `FirebaseProject` has the same underlying GCP identifiers (`projectNumber` and `projectId`). This allows for easy interop with
    * Google APIs. The result of this call is an [`Operation`](../../v1beta1/operations). Poll the `Operation` to track the provisioning process by calling GetOperation until
    * [`done`](../../v1beta1/operations#Operation.FIELDS.done) is `true`. When `done` is `true`, the `Operation` has either succeeded or failed. If the `Operation` succeeded, its
    * [`response`](../../v1beta1/operations#Operation.FIELDS.response) is set to a FirebaseProject; if the `Operation` failed, its
    * [`error`](../../v1beta1/operations#Operation.FIELDS.error) is set to a google.rpc.Status. The `Operation` is automatically deleted after completion, so there is no need to call
    * DeleteOperation. This method does not modify any billing account information on the underlying GCP `Project`. To call `AddFirebase`, a project member or service account must have
    * the following permissions (the IAM roles of Editor and Owner contain these permissions): `firebase.projects.update`, `resourcemanager.projects.get`, `serviceusage.services.enable`,
    * and `serviceusage.services.get`.
    */
  def addFirebase(request: Project): Request[Operation] = js.native
  def addFirebase(request: Uploadprotocol, body: AddFirebaseRequest): Request[Operation] = js.native
  
  def addGoogleAnalytics(request: Fields, body: AddGoogleAnalyticsRequest): Request[Operation] = js.native
  /**
    * Links the specified FirebaseProject with an existing [Google Analytics account](http://www.google.com/analytics/). Using this call, you can either: - Specify an `analyticsAccountId`
    * to provision a new Google Analytics property within the specified account and associate the new property with the `FirebaseProject`. - Specify an existing `analyticsPropertyId` to
    * associate the property with the `FirebaseProject`. Note that when you call `AddGoogleAnalytics`: 1. The first check determines if any existing data streams in the Google Analytics
    * property correspond to any existing Firebase Apps in the `FirebaseProject` (based on the `packageName` or `bundleId` associated with the data stream). Then, as applicable, the data
    * streams and apps are linked. Note that this auto-linking only applies to `AndroidApps` and `IosApps`. 2. If no corresponding data streams are found for the Firebase Apps, new data
    * streams are provisioned in the Google Analytics property for each of the Firebase Apps. Note that a new data stream is always provisioned for a Web App even if it was previously
    * associated with a data stream in the Analytics property. Learn more about the hierarchy and structure of Google Analytics accounts in the [Analytics
    * documentation](https://support.google.com/analytics/answer/9303323). The result of this call is an [`Operation`](../../v1beta1/operations). Poll the `Operation` to track the
    * provisioning process by calling GetOperation until [`done`](../../v1beta1/operations#Operation.FIELDS.done) is `true`. When `done` is `true`, the `Operation` has either succeeded or
    * failed. If the `Operation` succeeded, its [`response`](../../v1beta1/operations#Operation.FIELDS.response) is set to an AnalyticsDetails; if the `Operation` failed, its
    * [`error`](../../v1beta1/operations#Operation.FIELDS.error) is set to a google.rpc.Status. To call `AddGoogleAnalytics`, a project member must be an Owner for the existing
    * `FirebaseProject` and have the [`Edit` permission](https://support.google.com/analytics/answer/2884495) for the Google Analytics account. If the `FirebaseProject` already has Google
    * Analytics enabled, and you call `AddGoogleAnalytics` using an `analyticsPropertyId` that's different from the currently associated property, then the call will fail. Analytics may
    * have already been enabled in the Firebase console or by specifying `timeZone` and `regionCode` in the call to [`AddFirebase`](../../v1beta1/projects/addFirebase).
    */
  def addGoogleAnalytics(request: Xgafv): Request[Operation] = js.native
  
  var androidApps: AndroidAppsResource = js.native
  
  var availableLocations: AvailableLocationsResource = js.native
  
  var defaultLocation: DefaultLocationResource = js.native
  
  /** Gets the specified FirebaseProject. */
  def get(): Request[FirebaseProject] = js.native
  def get(request: Alt): Request[FirebaseProject] = js.native
  
  /**
    * Gets the configuration artifact associated with the specified FirebaseProject, which can be used by servers to simplify initialization. Typically, this configuration is used with
    * the Firebase Admin SDK [initializeApp](https://firebase.google.com/docs/admin/setup#initialize_the_sdk) command.
    */
  def getAdminSdkConfig(): Request[AdminSdkConfig] = js.native
  def getAdminSdkConfig(request: Alt): Request[AdminSdkConfig] = js.native
  
  /**
    * Gets the Google Analytics details currently associated with the specified FirebaseProject. If the `FirebaseProject` is not yet linked to Google Analytics, then the response to
    * `GetAnalyticsDetails` is `NOT_FOUND`.
    */
  def getAnalyticsDetails(): Request[AnalyticsDetails] = js.native
  def getAnalyticsDetails(request: Alt): Request[AnalyticsDetails] = js.native
  
  var iosApps: IosAppsResource = js.native
  
  /**
    * Lists each FirebaseProject accessible to the caller. The elements are returned in no particular order, but they will be a consistent view of the Projects when additional requests
    * are made with a `pageToken`. This method is eventually consistent with Project mutations, which means newly provisioned Projects and recent modifications to existing Projects might
    * not be reflected in the set of Projects. The list will include only ACTIVE Projects. Use GetFirebaseProject for consistent reads as well as for additional Project details.
    */
  def list(): Request[ListFirebaseProjectsResponse] = js.native
  def list(request: Accesstoken): Request[ListFirebaseProjectsResponse] = js.native
  
  /** Updates the attributes of the specified FirebaseProject. All [query parameters](#query-parameters) are required. */
  def patch(request: AccesstokenAlt): Request[FirebaseProject] = js.native
  def patch(request: PrettyPrint, body: FirebaseProject): Request[FirebaseProject] = js.native
  
  /**
    * Unlinks the specified FirebaseProject from its Google Analytics account. This call removes the association of the specified `FirebaseProject` with its current Google Analytics
    * property. However, this call does not delete the Google Analytics resources, such as the Google Analytics property or any data streams. These resources may be re-associated later to
    * the `FirebaseProject` by calling [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) and specifying the same `analyticsPropertyId`. For Android Apps and iOS Apps, this
    * call re-links data streams with their corresponding apps. However, for Web Apps, this call provisions a *new* data stream for each Web App. To call `RemoveAnalytics`, a project
    * member must be an Owner for the `FirebaseProject`.
    */
  def removeAnalytics(request: AltCallback): Request[js.Object] = js.native
  def removeAnalytics(request: Fields, body: RemoveAnalyticsRequest): Request[js.Object] = js.native
  
  /**
    * Lists all available Apps for the specified FirebaseProject. This is a convenience method. Typically, interaction with an App should be done using the platform-specific service, but
    * some tool use-cases require a summary of all known Apps (such as for App selector interfaces).
    */
  def searchApps(): Request[SearchFirebaseAppsResponse] = js.native
  def searchApps(request: Filter): Request[SearchFirebaseAppsResponse] = js.native
  
  var webApps: WebAppsResource = js.native
}
