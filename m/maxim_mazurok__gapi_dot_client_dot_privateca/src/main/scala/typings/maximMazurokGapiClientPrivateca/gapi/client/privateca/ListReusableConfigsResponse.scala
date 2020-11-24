package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReusableConfigsResponse extends js.Object {
  
  /** A token to retrieve next page of results. Pass this value in ListReusableConfigsRequest.next_page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of ReusableConfigs. */
  var reusableConfigs: js.UndefOr[js.Array[ReusableConfig]] = js.native
  
  /** A list of locations (e.g. "us-west1") that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListReusableConfigsResponse {
  
  @scala.inline
  def apply(): ListReusableConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReusableConfigsResponse]
  }
  
  @scala.inline
  implicit class ListReusableConfigsResponseOps[Self <: ListReusableConfigsResponse] (val x: Self) extends AnyVal {
    
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
    def setReusableConfigsVarargs(value: ReusableConfig*): Self = this.set("reusableConfigs", js.Array(value :_*))
    
    @scala.inline
    def setReusableConfigs(value: js.Array[ReusableConfig]): Self = this.set("reusableConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReusableConfigs: Self = this.set("reusableConfigs", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
