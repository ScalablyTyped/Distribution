package typings.nodeForge.mod.pkcs12

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BagsFilter extends js.Object {
  
  var bagType: js.UndefOr[String] = js.native
  
  var friendlyName: js.UndefOr[String] = js.native
  
  var localKeyId: js.UndefOr[String] = js.native
  
  var localKeyIdHex: js.UndefOr[String] = js.native
}
object BagsFilter {
  
  @scala.inline
  def apply(): BagsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BagsFilter]
  }
  
  @scala.inline
  implicit class BagsFilterOps[Self <: BagsFilter] (val x: Self) extends AnyVal {
    
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
    def setBagType(value: String): Self = this.set("bagType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBagType: Self = this.set("bagType", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setLocalKeyId(value: String): Self = this.set("localKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalKeyId: Self = this.set("localKeyId", js.undefined)
    
    @scala.inline
    def setLocalKeyIdHex(value: String): Self = this.set("localKeyIdHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalKeyIdHex: Self = this.set("localKeyIdHex", js.undefined)
  }
}
