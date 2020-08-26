package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerPolicy extends js.Object {
  var policyDocument: js.Object = js.native
  var principalId: String = js.native
}

object AuthorizerPolicy {
  @scala.inline
  def apply(policyDocument: js.Object, principalId: String): AuthorizerPolicy = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerPolicy]
  }
  @scala.inline
  implicit class AuthorizerPolicyOps[Self <: AuthorizerPolicy] (val x: Self) extends AnyVal {
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
    def setPolicyDocument(value: js.Object): Self = this.set("policyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipalId(value: String): Self = this.set("principalId", value.asInstanceOf[js.Any])
  }
  
}

