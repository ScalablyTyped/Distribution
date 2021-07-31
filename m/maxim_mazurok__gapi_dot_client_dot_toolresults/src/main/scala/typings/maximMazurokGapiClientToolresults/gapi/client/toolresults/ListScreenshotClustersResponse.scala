package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScreenshotClustersResponse extends StObject {
  
  /** The set of clusters associated with an execution Always set */
  var clusters: js.UndefOr[js.Array[ScreenshotCluster]] = js.undefined
}
object ListScreenshotClustersResponse {
  
  @scala.inline
  def apply(): ListScreenshotClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScreenshotClustersResponse]
  }
  
  @scala.inline
  implicit class ListScreenshotClustersResponseMutableBuilder[Self <: ListScreenshotClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[ScreenshotCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: ScreenshotCluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
  }
}
