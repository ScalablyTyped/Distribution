package typings.maximMazurokGapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDns.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRecordSetsResource extends StObject {
  
  /** Enumerate ResourceRecordSets that have been created but not yet deleted. */
  def list(): Request[ResourceRecordSetsListResponse] = js.native
  def list(request: Name): Request[ResourceRecordSetsListResponse] = js.native
}
