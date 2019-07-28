package typings.microserviceDashUtilities.microserviceDashUtilitiesMod

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
    val __obj = js.Dynamic.literal(policyDocument = policyDocument, principalId = principalId)
  
    __obj.asInstanceOf[AuthorizerPolicy]
  }
}

