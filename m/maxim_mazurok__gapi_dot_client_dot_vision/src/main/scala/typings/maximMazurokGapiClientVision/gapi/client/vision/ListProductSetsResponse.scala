package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProductSetsResponse extends js.Object {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of ProductSets. */
  var productSets: js.UndefOr[js.Array[ProductSet]] = js.native
}
object ListProductSetsResponse {
  
  @scala.inline
  def apply(): ListProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductSetsResponse]
  }
  
  @scala.inline
  implicit class ListProductSetsResponseOps[Self <: ListProductSetsResponse] (val x: Self) extends AnyVal {
    
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
    def setProductSetsVarargs(value: ProductSet*): Self = this.set("productSets", js.Array(value :_*))
    
    @scala.inline
    def setProductSets(value: js.Array[ProductSet]): Self = this.set("productSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductSets: Self = this.set("productSets", js.undefined)
  }
}
