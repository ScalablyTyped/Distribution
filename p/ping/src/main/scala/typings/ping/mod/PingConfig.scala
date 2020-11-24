package typings.ping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PingConfig extends js.Object {
  
  /**
    * Additional arguments. Default `[]`
    */
  var extra: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *  Exit after sending number of `ECHO_REQUEST`. Default `1`
    */
  var min_reply: js.UndefOr[Double] = js.native
  
  /**
    * Map IP address to hostname or not. Default `true`
    */
  var numeric: js.UndefOr[Boolean] = js.native
  
  /**
    * Source address for sending the ping.
    */
  var sourceAddr: js.UndefOr[String] = js.native
  
  /**
    * Time duration, in seconds, for ping command to exit. Default `2` on Mac/Linux, `5` on Windows.
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Ping via ipv6 or not. Default `false`
    */
  var v6: js.UndefOr[Boolean] = js.native
}
object PingConfig {
  
  @scala.inline
  def apply(): PingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PingConfig]
  }
  
  @scala.inline
  implicit class PingConfigOps[Self <: PingConfig] (val x: Self) extends AnyVal {
    
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
    def setExtraVarargs(value: String*): Self = this.set("extra", js.Array(value :_*))
    
    @scala.inline
    def setExtra(value: js.Array[String]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setMin_reply(value: Double): Self = this.set("min_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_reply: Self = this.set("min_reply", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    
    @scala.inline
    def setSourceAddr(value: String): Self = this.set("sourceAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAddr: Self = this.set("sourceAddr", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setV6(value: Boolean): Self = this.set("v6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV6: Self = this.set("v6", js.undefined)
  }
}
