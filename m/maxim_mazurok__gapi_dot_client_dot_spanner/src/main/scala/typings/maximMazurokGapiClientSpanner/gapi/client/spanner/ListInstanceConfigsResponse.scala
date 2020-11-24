package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstanceConfigsResponse extends js.Object {
  
  /** The list of requested instance configurations. */
  var instanceConfigs: js.UndefOr[js.Array[InstanceConfig]] = js.native
  
  /** `next_page_token` can be sent in a subsequent ListInstanceConfigs call to fetch more of the matching instance configurations. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListInstanceConfigsResponse {
  
  @scala.inline
  def apply(): ListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceConfigsResponse]
  }
  
  @scala.inline
  implicit class ListInstanceConfigsResponseOps[Self <: ListInstanceConfigsResponse] (val x: Self) extends AnyVal {
    
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
    def setInstanceConfigsVarargs(value: InstanceConfig*): Self = this.set("instanceConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInstanceConfigs(value: js.Array[InstanceConfig]): Self = this.set("instanceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceConfigs: Self = this.set("instanceConfigs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
