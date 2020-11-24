package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceLevelObjectivesResponse extends js.Object {
  
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
  implicit class ListServiceLevelObjectivesResponseOps[Self <: ListServiceLevelObjectivesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setServiceLevelObjectivesVarargs(value: ServiceLevelObjective*): Self = this.set("serviceLevelObjectives", js.Array(value :_*))
    
    @scala.inline
    def setServiceLevelObjectives(value: js.Array[ServiceLevelObjective]): Self = this.set("serviceLevelObjectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceLevelObjectives: Self = this.set("serviceLevelObjectives", js.undefined)
  }
}
