package typings.maximMazurokGapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGames.anon.SnapshotId
import typings.maximMazurokGapiClientGames.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsResource extends StObject {
  
  /** Retrieves the metadata for a given snapshot ID. */
  def get(): Request[Snapshot] = js.native
  def get(request: SnapshotId): Request[Snapshot] = js.native
  
  /** Retrieves a list of snapshots created by your application for the player corresponding to the player ID. */
  def list(): Request[SnapshotListResponse] = js.native
  def list(request: UploadType): Request[SnapshotListResponse] = js.native
}
