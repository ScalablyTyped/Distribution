package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var additionalAuthorizedParties: js.UndefOr[String | js.Array[String]] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAdditionalAuthorizedPartiesVarargs(value: String*): Self = this.set("additionalAuthorizedParties", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalAuthorizedParties(value: String | js.Array[String]): Self = this.set("additionalAuthorizedParties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAuthorizedParties: Self = this.set("additionalAuthorizedParties", js.undefined)
  }
}
