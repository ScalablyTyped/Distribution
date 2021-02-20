package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientToolresults.anon.Accesstoken
import typings.maximMazurokGapiClientToolresults.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersResource extends StObject {
  
  /** Retrieves a single screenshot cluster by its ID */
  def get(): Request[ScreenshotCluster] = js.native
  def get(request: Accesstoken): Request[ScreenshotCluster] = js.native
  
  /**
    * Lists Screenshot Clusters Returns the list of screenshot clusters corresponding to an execution. Screenshot clusters are created after the execution is finished. Clusters are
    * created from a set of screenshots. Between any two screenshots, a matching score is calculated based off their metadata that determines how similar they are. Screenshots are placed
    * in the cluster that has screens which have the highest matching scores.
    */
  def list(): Request[ListScreenshotClustersResponse] = js.native
  def list(request: Alt): Request[ListScreenshotClustersResponse] = js.native
}
