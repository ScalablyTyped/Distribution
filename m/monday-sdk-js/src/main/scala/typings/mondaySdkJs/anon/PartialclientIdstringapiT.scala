package typings.mondaySdkJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  clientId :string,   apiToken :string}> */
@js.native
trait PartialclientIdstringapiT extends js.Object {
  
  var apiToken: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String] = js.native
}
object PartialclientIdstringapiT {
  
  @scala.inline
  def apply(): PartialclientIdstringapiT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialclientIdstringapiT]
  }
  
  @scala.inline
  implicit class PartialclientIdstringapiTOps[Self <: PartialclientIdstringapiT] (val x: Self) extends AnyVal {
    
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
    def setApiToken(value: String): Self = this.set("apiToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiToken: Self = this.set("apiToken", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
  }
}
