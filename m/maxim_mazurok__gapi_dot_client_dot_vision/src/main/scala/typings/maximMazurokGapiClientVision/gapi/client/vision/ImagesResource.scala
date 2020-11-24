package typings.maximMazurokGapiClientVision.gapi.client.vision

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVision.anon.Alt
import typings.maximMazurokGapiClientVision.anon.Key
import typings.maximMazurokGapiClientVision.anon.Parent
import typings.maximMazurokGapiClientVision.anon.PrettyPrint
import typings.maximMazurokGapiClientVision.anon.QuotaUser
import typings.maximMazurokGapiClientVision.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesResource extends js.Object {
  
  def annotate(request: Alt, body: BatchAnnotateImagesRequest): Request[BatchAnnotateImagesResponse] = js.native
  def annotate(request: Key, body: BatchAnnotateImagesRequest): Request[BatchAnnotateImagesResponse] = js.native
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: Parent): Request[BatchAnnotateImagesResponse] = js.native
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: PrettyPrint): Request[BatchAnnotateImagesResponse] = js.native
  
  def asyncBatchAnnotate(request: Alt, body: AsyncBatchAnnotateImagesRequest): Request[Operation] = js.native
  def asyncBatchAnnotate(request: Key, body: AsyncBatchAnnotateImagesRequest): Request[Operation] = js.native
  /**
    * Run asynchronous image detection and annotation for a list of images. Progress and results can be retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateImagesResponse` (results). This service will write image annotation
    * outputs to json files in customer GCS bucket, each json file containing BatchAnnotateImagesResponse proto.
    */
  def asyncBatchAnnotate(request: QuotaUser): Request[Operation] = js.native
  /**
    * Run asynchronous image detection and annotation for a list of images. Progress and results can be retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateImagesResponse` (results). This service will write image annotation
    * outputs to json files in customer GCS bucket, each json file containing BatchAnnotateImagesResponse proto.
    */
  def asyncBatchAnnotate(request: Resource): Request[Operation] = js.native
}
