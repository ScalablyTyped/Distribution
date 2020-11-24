package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthenticationResultIntermediate extends js.Object {
  
  val AttemptIdentifier: String = js.native
  
  val AuthenticationData: INamedValues = js.native
}
object IAuthenticationResultIntermediate {
  
  @scala.inline
  def apply(AttemptIdentifier: String, AuthenticationData: INamedValues): IAuthenticationResultIntermediate = {
    val __obj = js.Dynamic.literal(AttemptIdentifier = AttemptIdentifier.asInstanceOf[js.Any], AuthenticationData = AuthenticationData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultIntermediate]
  }
  
  @scala.inline
  implicit class IAuthenticationResultIntermediateOps[Self <: IAuthenticationResultIntermediate] (val x: Self) extends AnyVal {
    
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
    def setAttemptIdentifier(value: String): Self = this.set("AttemptIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationData(value: INamedValues): Self = this.set("AuthenticationData", value.asInstanceOf[js.Any])
  }
}
