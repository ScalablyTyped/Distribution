package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceLevelObjectivesResponse extends StObject {
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The ServiceLevelObjectives matching the specified filter. */
  var serviceLevelObjectives: js.UndefOr[js.Array[ServiceLevelObjective]] = js.native
}
object ListServiceLevelObjectivesResponse {
  
  @scala.inline
  def apply(): ListServiceLevelObjectivesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceLevelObjectivesResponse]
  }
  
  @scala.inline
  implicit class ListServiceLevelObjectivesResponseMutableBuilder[Self <: ListServiceLevelObjectivesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setServiceLevelObjectives(value: js.Array[ServiceLevelObjective]): Self = StObject.set(x, "serviceLevelObjectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceLevelObjectivesUndefined: Self = StObject.set(x, "serviceLevelObjectives", js.undefined)
    
    @scala.inline
    def setServiceLevelObjectivesVarargs(value: ServiceLevelObjective*): Self = StObject.set(x, "serviceLevelObjectives", js.Array(value :_*))
  }
}
