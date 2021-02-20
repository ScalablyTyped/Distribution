package typings.maximMazurokGapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDrive.anon.FieldsKey
import typings.maximMazurokGapiClientDrive.anon.PageToken
import typings.maximMazurokGapiClientDrive.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientDrive.anon.QuotaUserResource
import typings.maximMazurokGapiClientDrive.anon.RequestId
import typings.maximMazurokGapiClientDrive.anon.TeamDriveId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamdrivesResource extends StObject {
  
  /** Deprecated use drives.create instead. */
  def create(request: FieldsKey): Request[TeamDrive] = js.native
  def create(request: RequestId, body: TeamDrive): Request[TeamDrive] = js.native
  
  /** Deprecated use drives.delete instead. */
  def delete(): Request[Unit] = js.native
  def delete(request: TeamDriveId): Request[Unit] = js.native
  
  /** Deprecated use drives.get instead. */
  def get(): Request[TeamDrive] = js.native
  def get(request: PrettyPrintQuotaUser): Request[TeamDrive] = js.native
  
  /** Deprecated use drives.list instead. */
  def list(): Request[TeamDriveList] = js.native
  def list(request: PageToken): Request[TeamDriveList] = js.native
  
  def update(request: PrettyPrintQuotaUser, body: TeamDrive): Request[TeamDrive] = js.native
  /** Deprecated use drives.update instead */
  def update(request: QuotaUserResource): Request[TeamDrive] = js.native
}
