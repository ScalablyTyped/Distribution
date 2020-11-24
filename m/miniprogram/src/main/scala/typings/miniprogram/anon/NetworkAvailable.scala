package typings.miniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAvailable extends js.Object {
  
  var networkAvailable: Boolean = js.native
  
  /**
    * Network type, UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN.
    */
  var networkType: String = js.native
}
object NetworkAvailable {
  
  @scala.inline
  def apply(networkAvailable: Boolean, networkType: String): NetworkAvailable = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAvailable]
  }
  
  @scala.inline
  implicit class NetworkAvailableOps[Self <: NetworkAvailable] (val x: Self) extends AnyVal {
    
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
    def setNetworkAvailable(value: Boolean): Self = this.set("networkAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: String): Self = this.set("networkType", value.asInstanceOf[js.Any])
  }
}
