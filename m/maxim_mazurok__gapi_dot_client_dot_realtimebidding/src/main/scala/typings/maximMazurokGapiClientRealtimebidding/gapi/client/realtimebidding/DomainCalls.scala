package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainCalls extends js.Object {
  
  /** The domain name. */
  var domain: js.UndefOr[String] = js.native
  
  /** Number of HTTP calls made to the domain. */
  var httpCallCount: js.UndefOr[Double] = js.native
}
object DomainCalls {
  
  @scala.inline
  def apply(): DomainCalls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainCalls]
  }
  
  @scala.inline
  implicit class DomainCallsOps[Self <: DomainCalls] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setHttpCallCount(value: Double): Self = this.set("httpCallCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpCallCount: Self = this.set("httpCallCount", js.undefined)
  }
}
