package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScreenshotClustersResponse extends StObject {
  
  /** The set of clusters associated with an execution Always set */
  var clusters: js.UndefOr[js.Array[ScreenshotCluster]] = js.undefined
}
object ListScreenshotClustersResponse {
  
  inline def apply(): ListScreenshotClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScreenshotClustersResponse]
  }
  
  extension [Self <: ListScreenshotClustersResponse](x: Self) {
    
    inline def setClusters(value: js.Array[ScreenshotCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: ScreenshotCluster*): Self = StObject.set(x, "clusters", js.Array(value*))
  }
}
