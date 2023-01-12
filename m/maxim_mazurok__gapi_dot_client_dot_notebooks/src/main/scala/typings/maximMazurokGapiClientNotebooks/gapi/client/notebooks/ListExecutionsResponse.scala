package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExecutionsResponse extends StObject {
  
  /** A list of returned instances. */
  var executions: js.UndefOr[js.Array[Execution]] = js.undefined
  
  /** Page token that can be used to continue listing from the last result in the next list call. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Executions IDs that could not be reached. For example: ['projects/{project_id}/location/{location}/executions/imagenet_test1',
    * 'projects/{project_id}/location/{location}/executions/classifier_train1']
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListExecutionsResponse {
  
  inline def apply(): ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExecutionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExecutionsResponse] (val x: Self) extends AnyVal {
    
    inline def setExecutions(value: js.Array[Execution]): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    inline def setExecutionsUndefined: Self = StObject.set(x, "executions", js.undefined)
    
    inline def setExecutionsVarargs(value: Execution*): Self = StObject.set(x, "executions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
