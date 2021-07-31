package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceRolloutsResponse extends StObject {
  
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of rollout resources. */
  var rollouts: js.UndefOr[js.Array[Rollout]] = js.undefined
}
object ListServiceRolloutsResponse {
  
  @scala.inline
  def apply(): ListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceRolloutsResponse]
  }
  
  @scala.inline
  implicit class ListServiceRolloutsResponseMutableBuilder[Self <: ListServiceRolloutsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRollouts(value: js.Array[Rollout]): Self = StObject.set(x, "rollouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloutsUndefined: Self = StObject.set(x, "rollouts", js.undefined)
    
    @scala.inline
    def setRolloutsVarargs(value: Rollout*): Self = StObject.set(x, "rollouts", js.Array(value :_*))
  }
}
