package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPretargetingConfigsResponse extends js.Object {
  
  /** A token which can be passed to a subsequent call to the `ListPretargetingConfigs` method to retrieve the next page of results in ListPretargetingConfigsRequest.pageToken. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of pretargeting configurations. */
  var pretargetingConfigs: js.UndefOr[js.Array[PretargetingConfig]] = js.native
}
object ListPretargetingConfigsResponse {
  
  @scala.inline
  def apply(): ListPretargetingConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPretargetingConfigsResponse]
  }
  
  @scala.inline
  implicit class ListPretargetingConfigsResponseOps[Self <: ListPretargetingConfigsResponse] (val x: Self) extends AnyVal {
    
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
    def setPretargetingConfigsVarargs(value: PretargetingConfig*): Self = this.set("pretargetingConfigs", js.Array(value :_*))
    
    @scala.inline
    def setPretargetingConfigs(value: js.Array[PretargetingConfig]): Self = this.set("pretargetingConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretargetingConfigs: Self = this.set("pretargetingConfigs", js.undefined)
  }
}
