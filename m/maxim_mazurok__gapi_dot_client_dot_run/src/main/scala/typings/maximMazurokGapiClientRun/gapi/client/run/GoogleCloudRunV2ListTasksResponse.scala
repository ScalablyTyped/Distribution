package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ListTasksResponse extends StObject {
  
  /** A token indicating there are more items than page_size. Use it in the next ListTasks request to continue. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The resulting list of Tasks. */
  var tasks: js.UndefOr[js.Array[GoogleCloudRunV2Task]] = js.undefined
}
object GoogleCloudRunV2ListTasksResponse {
  
  inline def apply(): GoogleCloudRunV2ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ListTasksResponse]
  }
  
  extension [Self <: GoogleCloudRunV2ListTasksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTasks(value: js.Array[GoogleCloudRunV2Task]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: GoogleCloudRunV2Task*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
