package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeKeywordList extends js.Object {
  
  /** Output only. The unique ID of the advertiser the negative keyword list belongs to. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Required. The display name of the negative keyword list. Must be UTF-8 encoded with a maximum size of 255 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the negative keyword list. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the negative keyword list. Assigned by the system. */
  var negativeKeywordListId: js.UndefOr[String] = js.native
}
object NegativeKeywordList {
  
  @scala.inline
  def apply(): NegativeKeywordList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegativeKeywordList]
  }
  
  @scala.inline
  implicit class NegativeKeywordListOps[Self <: NegativeKeywordList] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNegativeKeywordListId(value: String): Self = this.set("negativeKeywordListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeKeywordListId: Self = this.set("negativeKeywordListId", js.undefined)
  }
}
