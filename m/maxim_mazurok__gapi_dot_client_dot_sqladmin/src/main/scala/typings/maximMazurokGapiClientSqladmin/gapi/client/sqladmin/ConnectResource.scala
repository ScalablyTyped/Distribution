package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSqladmin.anon.Callback
import typings.maximMazurokGapiClientSqladmin.anon.Instance
import typings.maximMazurokGapiClientSqladmin.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectResource extends StObject {
  
  def generateEphemeralCert(request: Callback, body: GenerateEphemeralCertRequest): Request[GenerateEphemeralCertResponse] = js.native
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use the certificate to
    * authenticate as themselves when connecting to the database.
    */
  def generateEphemeralCert(request: Instance): Request[GenerateEphemeralCertResponse] = js.native
  
  /** Retrieves connect settings about a Cloud SQL instance. */
  def get(): Request[ConnectSettings] = js.native
  def get(request: Key): Request[ConnectSettings] = js.native
}
