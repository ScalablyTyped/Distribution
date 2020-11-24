package typings.megajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountInfo extends js.Object {
  
  var downloadBandwidthTotal: Double = js.native
  
  var downloadBandwidthUsed: Double = js.native
  
  var sharedBandwidthLimit: Double = js.native
  
  var sharedBandwidthUsed: Double = js.native
  
  var spaceTotal: Double = js.native
  
  var spaceUsed: Double = js.native
  
  var `type`: String = js.native
}
object AccountInfo {
  
  @scala.inline
  def apply(
    downloadBandwidthTotal: Double,
    downloadBandwidthUsed: Double,
    sharedBandwidthLimit: Double,
    sharedBandwidthUsed: Double,
    spaceTotal: Double,
    spaceUsed: Double,
    `type`: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(downloadBandwidthTotal = downloadBandwidthTotal.asInstanceOf[js.Any], downloadBandwidthUsed = downloadBandwidthUsed.asInstanceOf[js.Any], sharedBandwidthLimit = sharedBandwidthLimit.asInstanceOf[js.Any], sharedBandwidthUsed = sharedBandwidthUsed.asInstanceOf[js.Any], spaceTotal = spaceTotal.asInstanceOf[js.Any], spaceUsed = spaceUsed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
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
    def setDownloadBandwidthTotal(value: Double): Self = this.set("downloadBandwidthTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadBandwidthUsed(value: Double): Self = this.set("downloadBandwidthUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedBandwidthLimit(value: Double): Self = this.set("sharedBandwidthLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedBandwidthUsed(value: Double): Self = this.set("sharedBandwidthUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceTotal(value: Double): Self = this.set("spaceTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUsed(value: Double): Self = this.set("spaceUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
