package typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpReputation extends js.Object {
  
  /** Total number of unique IPs in this reputation category. This metric only pertains to traffic that passed [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/). */
  var numIps: js.UndefOr[String] = js.native
  
  /** The reputation category this IP reputation represents. */
  var reputation: js.UndefOr[String] = js.native
  
  /** A sample of IPs in this reputation category. */
  var sampleIps: js.UndefOr[js.Array[String]] = js.native
}
object IpReputation {
  
  @scala.inline
  def apply(): IpReputation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpReputation]
  }
  
  @scala.inline
  implicit class IpReputationOps[Self <: IpReputation] (val x: Self) extends AnyVal {
    
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
    def setNumIps(value: String): Self = this.set("numIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumIps: Self = this.set("numIps", js.undefined)
    
    @scala.inline
    def setReputation(value: String): Self = this.set("reputation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReputation: Self = this.set("reputation", js.undefined)
    
    @scala.inline
    def setSampleIpsVarargs(value: String*): Self = this.set("sampleIps", js.Array(value :_*))
    
    @scala.inline
    def setSampleIps(value: js.Array[String]): Self = this.set("sampleIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleIps: Self = this.set("sampleIps", js.undefined)
  }
}
