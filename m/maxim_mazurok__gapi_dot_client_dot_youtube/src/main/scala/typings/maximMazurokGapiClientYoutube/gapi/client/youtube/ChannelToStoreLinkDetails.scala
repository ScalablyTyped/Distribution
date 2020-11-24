package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelToStoreLinkDetails extends js.Object {
  
  /** Name of the store. */
  var storeName: js.UndefOr[String] = js.native
  
  /** Landing page of the store. */
  var storeUrl: js.UndefOr[String] = js.native
}
object ChannelToStoreLinkDetails {
  
  @scala.inline
  def apply(): ChannelToStoreLinkDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelToStoreLinkDetails]
  }
  
  @scala.inline
  implicit class ChannelToStoreLinkDetailsOps[Self <: ChannelToStoreLinkDetails] (val x: Self) extends AnyVal {
    
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
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreName: Self = this.set("storeName", js.undefined)
    
    @scala.inline
    def setStoreUrl(value: String): Self = this.set("storeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreUrl: Self = this.set("storeUrl", js.undefined)
  }
}
