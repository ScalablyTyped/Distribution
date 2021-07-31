package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSqladmin.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TiersResource extends StObject {
  
  /** Lists all available machine types (tiers) for Cloud SQL, for example, db-n1-standard-1. For related information, see Pricing. */
  def list(): Request[TiersListResponse] = js.native
  def list(request: Uploadprotocol): Request[TiersListResponse] = js.native
}
