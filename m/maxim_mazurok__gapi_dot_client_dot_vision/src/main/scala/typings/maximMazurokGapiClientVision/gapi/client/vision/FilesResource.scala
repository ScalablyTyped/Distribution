package typings.maximMazurokGapiClientVision.gapi.client.vision

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVision.anon.Accesstoken
import typings.maximMazurokGapiClientVision.anon.Alt
import typings.maximMazurokGapiClientVision.anon.Callback
import typings.maximMazurokGapiClientVision.anon.Fields
import typings.maximMazurokGapiClientVision.anon.Key
import typings.maximMazurokGapiClientVision.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends StObject {
  
  /**
    * Service that performs image detection and annotation for a batch of files. Now only "application/pdf", "image/tiff" and "image/gif" are supported. This service will extract at most
    * 5 (customers can specify which 5 in AnnotateFileRequest.pages) frames (gif) or pages (pdf or tiff) from each file provided and perform detection and annotation for each image
    * extracted.
    */
  def annotate(request: Accesstoken): Request[BatchAnnotateFilesResponse] = js.native
  def annotate(request: Alt, body: BatchAnnotateFilesRequest): Request[BatchAnnotateFilesResponse] = js.native
  /**
    * Service that performs image detection and annotation for a batch of files. Now only "application/pdf", "image/tiff" and "image/gif" are supported. This service will extract at most
    * 5 (customers can specify which 5 in AnnotateFileRequest.pages) frames (gif) or pages (pdf or tiff) from each file provided and perform detection and annotation for each image
    * extracted.
    */
  def annotate(request: Fields): Request[BatchAnnotateFilesResponse] = js.native
  def annotate(request: Key, body: BatchAnnotateFilesRequest): Request[BatchAnnotateFilesResponse] = js.native
  
  def asyncBatchAnnotate(request: Alt, body: AsyncBatchAnnotateFilesRequest): Request[Operation] = js.native
  /**
    * Run asynchronous image detection and annotation for a list of generic files, such as PDF files, which may contain multiple pages and multiple images per page. Progress and results
    * can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains
    * `AsyncBatchAnnotateFilesResponse` (results).
    */
  def asyncBatchAnnotate(request: Callback): Request[Operation] = js.native
  def asyncBatchAnnotate(request: Key, body: AsyncBatchAnnotateFilesRequest): Request[Operation] = js.native
  /**
    * Run asynchronous image detection and annotation for a list of generic files, such as PDF files, which may contain multiple pages and multiple images per page. Progress and results
    * can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains
    * `AsyncBatchAnnotateFilesResponse` (results).
    */
  def asyncBatchAnnotate(request: Oauthtoken): Request[Operation] = js.native
}
