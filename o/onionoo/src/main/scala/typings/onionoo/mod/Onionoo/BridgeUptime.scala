package typings.onionoo.mod.Onionoo

import typings.onionoo.anon.PartialRecord1week1month6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BridgeUptime extends js.Object {
  
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String = js.native
  
  /**
    * Object containing uptime history objects for different time periods. The specification of uptime history
    * objects is similar to those in the `uptime` field of `RelayUptime`.
    */
  var uptime: js.UndefOr[PartialRecord1week1month6] = js.native
}
object BridgeUptime {
  
  @scala.inline
  def apply(fingerprint: String): BridgeUptime = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeUptime]
  }
  
  @scala.inline
  implicit class BridgeUptimeOps[Self <: BridgeUptime] (val x: Self) extends AnyVal {
    
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptime(value: PartialRecord1week1month6): Self = this.set("uptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUptime: Self = this.set("uptime", js.undefined)
  }
}
