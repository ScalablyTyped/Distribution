package typings.maximMazurokGapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDrive.anon.AcknowledgeAbuse
import typings.maximMazurokGapiClientDrive.anon.AddParents
import typings.maximMazurokGapiClientDrive.anon.AltEnforceSingleParent
import typings.maximMazurokGapiClientDrive.anon.AltFields
import typings.maximMazurokGapiClientDrive.anon.Corpora
import typings.maximMazurokGapiClientDrive.anon.Count
import typings.maximMazurokGapiClientDrive.anon.EnforceSingleParent
import typings.maximMazurokGapiClientDrive.anon.FieldsFileId
import typings.maximMazurokGapiClientDrive.anon.IgnoreDefaultVisibility
import typings.maximMazurokGapiClientDrive.anon.IncludeLabels
import typings.maximMazurokGapiClientDrive.anon.IncludePermissionsForView
import typings.maximMazurokGapiClientDrive.anon.KeepRevisionForever
import typings.maximMazurokGapiClientDrive.anon.MaxResults
import typings.maximMazurokGapiClientDrive.anon.Oauthtoken
import typings.maximMazurokGapiClientDrive.anon.SupportsAllDrives
import typings.maximMazurokGapiClientDrive.anon.SupportsTeamDrives
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends StObject {
  
  /** Creates a copy of a file and applies any requested updates with patch semantics. Folders cannot be copied. */
  def copy(request: EnforceSingleParent): Request[File] = js.native
  def copy(request: IgnoreDefaultVisibility, body: File): Request[File] = js.native
  
  /** Creates a new file. */
  def create(request: IncludeLabels): Request[File] = js.native
  def create(request: IncludePermissionsForView, body: File): Request[File] = js.native
  
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a shared drive the user must be an organizer on the parent. If the target is a
    * folder, all descendants owned by the user are also deleted.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: SupportsAllDrives): Request[Unit] = js.native
  
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(): Request[Unit] = js.native
  def emptyTrash(request: AltEnforceSingleParent): Request[Unit] = js.native
  
  /** Exports a Google Workspace document to the requested MIME type and returns exported byte content. Note that the exported content is limited to 10MB. */
  def `export`(): Request[Unit] = js.native
  def `export`(request: AltFields): Request[Unit] = js.native
  
  /** Generates a set of file IDs which can be provided in create or copy requests. */
  def generateIds(): Request[GeneratedIds] = js.native
  def generateIds(request: Count): Request[GeneratedIds] = js.native
  
  /** Gets a file's metadata or content by ID. */
  def get(): Request[File] = js.native
  def get(request: AcknowledgeAbuse): Request[File] = js.native
  
  /** Lists or searches files. */
  def list(): Request[FileList] = js.native
  def list(request: Corpora): Request[FileList] = js.native
  
  /** Lists the labels on a file. */
  def listLabels(): Request[LabelList] = js.native
  def listLabels(request: MaxResults): Request[LabelList] = js.native
  
  /** Modifies the set of labels on a file. */
  def modifyLabels(request: FieldsFileId): Request[ModifyLabelsResponse] = js.native
  def modifyLabels(request: Oauthtoken, body: ModifyLabelsRequest): Request[ModifyLabelsResponse] = js.native
  
  /**
    * Updates a file's metadata and/or content. When calling this method, only populate fields in the request that you want to modify. When updating fields, some fields might change
    * automatically, such as modifiedDate. This method supports patch semantics.
    */
  def update(request: AddParents): Request[File] = js.native
  def update(request: KeepRevisionForever, body: File): Request[File] = js.native
  
  def watch(request: AcknowledgeAbuse, body: Channel): Request[Channel] = js.native
  /** Subscribes to changes to a file. While you can establish a channel for changes to a file on a shared drive, a change to a shared drive file won't create a notification. */
  def watch(request: SupportsTeamDrives): Request[Channel] = js.native
}
