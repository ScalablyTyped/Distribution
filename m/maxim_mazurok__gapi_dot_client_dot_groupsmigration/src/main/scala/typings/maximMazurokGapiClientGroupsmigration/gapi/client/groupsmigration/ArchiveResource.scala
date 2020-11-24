package typings.maximMazurokGapiClientGroupsmigration.gapi.client.groupsmigration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGroupsmigration.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveResource extends js.Object {
  
  /** Inserts a new mail into the archive of the Google group. */
  def insert(): Request[Groups] = js.native
  def insert(request: Accesstoken): Request[Groups] = js.native
}
