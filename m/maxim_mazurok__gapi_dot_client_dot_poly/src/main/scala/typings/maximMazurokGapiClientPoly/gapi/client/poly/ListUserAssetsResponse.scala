package typings.maximMazurokGapiClientPoly.gapi.client.poly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserAssetsResponse extends js.Object {
  
  /**
    * The continuation token for retrieving the next page. If empty, indicates that there are no more pages. To get the next page, submit the same request specifying this value as the
    * page_token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total number of assets in the list, without pagination. */
  var totalSize: js.UndefOr[Double] = js.native
  
  /** A list of UserAssets matching the request. */
  var userAssets: js.UndefOr[js.Array[UserAsset]] = js.native
}
object ListUserAssetsResponse {
  
  @scala.inline
  def apply(): ListUserAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserAssetsResponse]
  }
  
  @scala.inline
  implicit class ListUserAssetsResponseOps[Self <: ListUserAssetsResponse] (val x: Self) extends AnyVal {
    
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
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
    
    @scala.inline
    def setUserAssetsVarargs(value: UserAsset*): Self = this.set("userAssets", js.Array(value :_*))
    
    @scala.inline
    def setUserAssets(value: js.Array[UserAsset]): Self = this.set("userAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAssets: Self = this.set("userAssets", js.undefined)
  }
}
