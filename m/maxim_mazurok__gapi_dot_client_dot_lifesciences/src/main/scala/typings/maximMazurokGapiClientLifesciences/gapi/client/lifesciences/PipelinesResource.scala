package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLifesciences.anon.Fields
import typings.maximMazurokGapiClientLifesciences.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelinesResource extends js.Object {
  
  /**
    * Runs a pipeline. The returned Operation's metadata field will contain a google.cloud.lifesciences.v2beta.Metadata object describing the status of the pipeline execution. The
    * response field will contain a google.cloud.lifesciences.v2beta.RunPipelineResponse object if the pipeline completes successfully. **Note:** Before you can use this method, the *Life
    * Sciences Service Agent* must have access to your project. This is done automatically when the Cloud Life Sciences API is first enabled, but if you delete this permission you must
    * disable and re-enable the API to grant the Life Sciences Service Agent the required permissions. Authorization requires the following [Google IAM](https://cloud.google.com/iam/)
    * permission: * `lifesciences.workflows.run`
    */
  def run(request: Fields): Request[Operation] = js.native
  def run(request: Key, body: RunPipelineRequest): Request[Operation] = js.native
}
