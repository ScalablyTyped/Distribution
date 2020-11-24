package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHoldsResponse extends js.Object {
  
  /** The list of holds. */
  var holds: js.UndefOr[js.Array[Hold]] = js.native
  
  /** Page token to retrieve the next page of results in the list. If this is empty, then there are no more holds to list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListHoldsResponse {
  
  @scala.inline
  def apply(): ListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHoldsResponse]
  }
  
  @scala.inline
  implicit class ListHoldsResponseOps[Self <: ListHoldsResponse] (val x: Self) extends AnyVal {
    
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
    def setHoldsVarargs(value: Hold*): Self = this.set("holds", js.Array(value :_*))
    
    @scala.inline
    def setHolds(value: js.Array[Hold]): Self = this.set("holds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolds: Self = this.set("holds", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
