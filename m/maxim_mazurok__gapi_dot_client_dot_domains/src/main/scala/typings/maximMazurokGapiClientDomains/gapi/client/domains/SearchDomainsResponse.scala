package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDomainsResponse extends js.Object {
  
  /** Results of the domain name search. */
  var registerParameters: js.UndefOr[js.Array[RegisterParameters]] = js.native
}
object SearchDomainsResponse {
  
  @scala.inline
  def apply(): SearchDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDomainsResponse]
  }
  
  @scala.inline
  implicit class SearchDomainsResponseOps[Self <: SearchDomainsResponse] (val x: Self) extends AnyVal {
    
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
    def setRegisterParametersVarargs(value: RegisterParameters*): Self = this.set("registerParameters", js.Array(value :_*))
    
    @scala.inline
    def setRegisterParameters(value: js.Array[RegisterParameters]): Self = this.set("registerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterParameters: Self = this.set("registerParameters", js.undefined)
  }
}
