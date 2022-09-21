package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.Callback
import typings.maximMazurokGapiClientHealthcare.anon.Fields
import typings.maximMazurokGapiClientHealthcare.anon.Oauthtoken
import typings.maximMazurokGapiClientHealthcare.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsentArtifactsResource extends StObject {
  
  /** Creates a new Consent artifact in the parent consent store. */
  def create(request: Oauthtoken): Request[ConsentArtifact] = js.native
  def create(request: Parent, body: ConsentArtifact): Request[ConsentArtifact] = js.native
  
  /** Deletes the specified Consent artifact. Fails if the artifact is referenced by the latest revision of any Consent. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the specified Consent artifact. */
  def get(): Request[ConsentArtifact] = js.native
  def get(request: Callback): Request[ConsentArtifact] = js.native
  
  /** Lists the Consent artifacts in the specified consent store. */
  def list(): Request[ListConsentArtifactsResponse] = js.native
  def list(request: Fields): Request[ListConsentArtifactsResponse] = js.native
}
