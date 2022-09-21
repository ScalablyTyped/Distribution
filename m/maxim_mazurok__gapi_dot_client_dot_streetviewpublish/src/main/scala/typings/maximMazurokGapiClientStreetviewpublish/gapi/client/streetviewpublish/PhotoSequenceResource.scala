package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStreetviewpublish.anon.Alt
import typings.maximMazurokGapiClientStreetviewpublish.anon.InputType
import typings.maximMazurokGapiClientStreetviewpublish.anon.Key
import typings.maximMazurokGapiClientStreetviewpublish.anon.SequenceId
import typings.maximMazurokGapiClientStreetviewpublish.anon.UploadType
import typings.maximMazurokGapiClientStreetviewpublish.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoSequenceResource extends StObject {
  
  /**
    * After the client finishes uploading the PhotoSequence with the returned UploadRef, CreatePhotoSequence extracts a sequence of 360 photos from a video or Extensible Device Metadata
    * (XDM, http://www.xdm.org/) to be published to Street View on Google Maps. `CreatePhotoSequence` returns an Operation, with the PhotoSequence Id set in the `Operation.name` field.
    * This method returns the following error codes: * google.rpc.Code.INVALID_ARGUMENT if the request is malformed. * google.rpc.Code.NOT_FOUND if the upload reference does not exist.
    */
  def create(request: InputType): Request[Operation] = js.native
  def create(request: UploadType, body: PhotoSequence): Request[Operation] = js.native
  
  /**
    * Deletes a PhotoSequence and its metadata. This method returns the following error codes: * google.rpc.Code.PERMISSION_DENIED if the requesting user did not create the requested
    * photo sequence. * google.rpc.Code.NOT_FOUND if the photo sequence ID does not exist. * google.rpc.Code.FAILED_PRECONDITION if the photo sequence ID is not yet finished processing.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: SequenceId): Request[js.Object] = js.native
  
  /**
    * Gets the metadata of the specified PhotoSequence via the Operation interface. This method returns the following three types of responses: * `Operation.done` = false, if the
    * processing of PhotoSequence is not finished yet. * `Operation.done` = true and `Operation.error` is populated, if there was an error in processing. * `Operation.done` = true and
    * `Operation.response` is poulated, which contains a PhotoSequence message. This method returns the following error codes: * google.rpc.Code.PERMISSION_DENIED if the requesting user
    * did not create the requested PhotoSequence. * google.rpc.Code.NOT_FOUND if the requested PhotoSequence does not exist.
    */
  def get(): Request[Operation] = js.native
  def get(request: Uploadprotocol): Request[Operation] = js.native
  
  def startUpload(request: Alt, body: Empty): Request[UploadRef] = js.native
  /**
    * Creates an upload session to start uploading photo sequence data. The upload URL of the returned UploadRef is used to upload the data for the `photoSequence`. After the upload is
    * complete, the UploadRef is used with CreatePhotoSequence to create the PhotoSequence object entry.
    */
  def startUpload(request: Key): Request[UploadRef] = js.native
}
