package typings.maximMazurokGapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDrive.anon.AcknowledgeAbuseAlt
import typings.maximMazurokGapiClientDrive.anon.KeyOauthtoken
import typings.maximMazurokGapiClientDrive.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientDrive.anon.RevisionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionsResource extends StObject {
  
  /**
    * Permanently deletes a file version. You can only delete revisions for files with binary content in Google Drive, like images or videos. Revisions for other files, like Google Docs
    * or Sheets, and the last remaining file version can't be deleted.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: RevisionId): Request[Unit] = js.native
  
  /** Gets a revision's metadata or content by ID. */
  def get(): Request[Revision] = js.native
  def get(request: AcknowledgeAbuseAlt): Request[Revision] = js.native
  
  /** Lists a file's revisions. */
  def list(): Request[RevisionList] = js.native
  def list(request: KeyOauthtoken): Request[RevisionList] = js.native
  
  /** Updates a revision with patch semantics. */
  def update(request: OauthtokenPrettyPrint): Request[Revision] = js.native
  def update(request: RevisionId, body: Revision): Request[Revision] = js.native
}
