package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGenomics.anon.Accesstoken
import typings.maximMazurokGapiClientGenomics.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelinesResource extends StObject {
  
  /**
    * Runs a pipeline. The returned Operation's metadata field will contain a google.genomics.v2alpha1.Metadata object describing the status of the pipeline execution. The [response]
    * field will contain a google.genomics.v2alpha1.RunPipelineResponse object if the pipeline completes successfully. **Note:** Before you can use this method, the Genomics Service Agent
    * must have access to your project. This is done automatically when the Cloud Genomics API is first enabled, but if you delete this permission, or if you enabled the Cloud Genomics
    * API before the v2alpha1 API launch, you must disable and re-enable the API to grant the Genomics Service Agent the required permissions. Authorization requires the following [Google
    * IAM](https://cloud.google.com/iam/) permission: * `genomics.operations.create` [1]: /genomics/gsa
    */
  def run(request: Accesstoken): Request[Operation] = js.native
  def run(request: Alt, body: RunPipelineRequest): Request[Operation] = js.native
}
