package typings.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelaySummary extends js.Object {
  
  /**
    * Array of IPv4 or IPv6 addresses where the relay accepts onion-routing connections or which the relay
    * used to exit to the Internet in the past 24 hours. The first address is the primary onion-routing address
    * that the relay used to register in the network, subsequent addresses are in arbitrary order. IPv6 hex
    * characters are all lower-case.
    */
  var a: js.Array[String] = js.native
  
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var f: String = js.native
  
  /**
    * Relay nickname consisting of 1–19 alphanumerical characters.
    */
  var n: String = js.native
  
  /**
    * Boolean field saying whether this relay was listed as running in the last relay network status consensus.
    */
  var r: Boolean = js.native
}
object RelaySummary {
  
  @scala.inline
  def apply(a: js.Array[String], f: String, n: String, r: Boolean): RelaySummary = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelaySummary]
  }
  
  @scala.inline
  implicit class RelaySummaryOps[Self <: RelaySummary] (val x: Self) extends AnyVal {
    
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
    def setAVarargs(value: String*): Self = this.set("a", js.Array(value :_*))
    
    @scala.inline
    def setA(value: js.Array[String]): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: String): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Boolean): Self = this.set("r", value.asInstanceOf[js.Any])
  }
}
