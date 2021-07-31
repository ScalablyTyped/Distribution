package typings.maximMazurokGapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMl.anon.AccesstokenAlt
import typings.maximMazurokGapiClientMl.anon.Alt
import typings.maximMazurokGapiClientMl.anon.Fields
import typings.maximMazurokGapiClientMl.anon.Parent
import typings.maximMazurokGapiClientMl.anon.QuotaUser
import typings.maximMazurokGapiClientMl.anon.Resource
import typings.maximMazurokGapiClientMl.anon.UploadType
import typings.maximMazurokGapiClientMl.anon.Uploadprotocol
import typings.maximMazurokGapiClientMl.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialsResource extends StObject {
  
  def addMeasurement(request: Alt, body: GoogleCloudMlV1AddTrialMeasurementRequest): Request[GoogleCloudMlV1Trial] = js.native
  /** Adds a measurement of the objective metrics to a trial. This measurement is assumed to have been taken before the trial is complete. */
  def addMeasurement(request: QuotaUser): Request[GoogleCloudMlV1Trial] = js.native
  
  def checkEarlyStoppingState(request: Alt, body: GoogleCloudMlV1CheckTrialEarlyStoppingStateRequest): Request[GoogleLongrunningOperation] = js.native
  /** Checks whether a trial should stop or not. Returns a long-running operation. When the operation is successful, it will contain a CheckTrialEarlyStoppingStateResponse. */
  def checkEarlyStoppingState(request: Resource): Request[GoogleLongrunningOperation] = js.native
  
  def complete(request: Alt, body: GoogleCloudMlV1CompleteTrialRequest): Request[GoogleCloudMlV1Trial] = js.native
  /** Marks a trial as complete. */
  def complete(request: UploadType): Request[GoogleCloudMlV1Trial] = js.native
  
  def create(request: Fields, body: GoogleCloudMlV1Trial): Request[GoogleCloudMlV1Trial] = js.native
  /** Adds a user provided trial to a study. */
  def create(request: Parent): Request[GoogleCloudMlV1Trial] = js.native
  
  /** Deletes a trial. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a trial. */
  def get(): Request[GoogleCloudMlV1Trial] = js.native
  def get(request: Alt): Request[GoogleCloudMlV1Trial] = js.native
  
  /** Lists the trials associated with a study. */
  def list(): Request[GoogleCloudMlV1ListTrialsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudMlV1ListTrialsResponse] = js.native
  
  def listOptimalTrials(request: Fields, body: GoogleCloudMlV1ListOptimalTrialsRequest): Request[GoogleCloudMlV1ListOptimalTrialsResponse] = js.native
  /**
    * Lists the pareto-optimal trials for multi-objective study or the optimal trials for single-objective study. The definition of pareto-optimal can be checked in wiki page.
    * https://en.wikipedia.org/wiki/Pareto_efficiency
    */
  def listOptimalTrials(request: Uploadprotocol): Request[GoogleCloudMlV1ListOptimalTrialsResponse] = js.native
  
  def stop(request: Alt, body: GoogleCloudMlV1StopTrialRequest): Request[GoogleCloudMlV1Trial] = js.native
  /** Stops a trial. */
  def stop(request: Xgafv): Request[GoogleCloudMlV1Trial] = js.native
  
  /**
    * Adds one or more trials to a study, with parameter values suggested by AI Platform Vizier. Returns a long-running operation associated with the generation of trial suggestions. When
    * this long-running operation succeeds, it will contain a SuggestTrialsResponse.
    */
  def suggest(request: AccesstokenAlt): Request[GoogleLongrunningOperation] = js.native
  def suggest(request: Fields, body: GoogleCloudMlV1SuggestTrialsRequest): Request[GoogleLongrunningOperation] = js.native
}
