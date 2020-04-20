package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizerPolicy extends js.Object {
  var policyDocument: js.Object
  var principalId: String
}

object AuthorizerPolicy {
  @scala.inline
  def apply(policyDocument: js.Object, principalId: String): AuthorizerPolicy = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerPolicy]
  }
}

