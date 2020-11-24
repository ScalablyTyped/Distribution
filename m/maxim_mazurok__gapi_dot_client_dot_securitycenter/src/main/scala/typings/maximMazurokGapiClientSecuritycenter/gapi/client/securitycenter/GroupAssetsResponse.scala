package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupAssetsResponse extends js.Object {
  
  /**
    * Group results. There exists an element for each existing unique combination of property/values. The element contains a count for the number of times those specific property/values
    * appear.
    */
  var groupByResults: js.UndefOr[js.Array[GroupResult]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Time used for executing the groupBy request. */
  var readTime: js.UndefOr[String] = js.native
  
  /** The total number of results matching the query. */
  var totalSize: js.UndefOr[Double] = js.native
}
object GroupAssetsResponse {
  
  @scala.inline
  def apply(): GroupAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupAssetsResponse]
  }
  
  @scala.inline
  implicit class GroupAssetsResponseOps[Self <: GroupAssetsResponse] (val x: Self) extends AnyVal {
    
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
    def setGroupByResultsVarargs(value: GroupResult*): Self = this.set("groupByResults", js.Array(value :_*))
    
    @scala.inline
    def setGroupByResults(value: js.Array[GroupResult]): Self = this.set("groupByResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByResults: Self = this.set("groupByResults", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
