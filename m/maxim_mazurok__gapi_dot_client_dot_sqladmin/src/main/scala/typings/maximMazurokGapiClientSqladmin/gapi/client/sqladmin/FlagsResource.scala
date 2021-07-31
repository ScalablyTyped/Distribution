package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSqladmin.anon.DatabaseVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlagsResource extends StObject {
  
  /** List all available database flags for Cloud SQL instances. */
  def list(): Request[FlagsListResponse] = js.native
  def list(request: DatabaseVersion): Request[FlagsListResponse] = js.native
}
