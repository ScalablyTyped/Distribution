package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileResponseCommitVerification extends js.Object {
  var payload: Null
  var reason: String
  var signature: Null
  var verified: Boolean
}

object ReposUpdateFileResponseCommitVerification {
  @scala.inline
  def apply(payload: Null, reason: String, signature: Null, verified: Boolean): ReposUpdateFileResponseCommitVerification = {
    val __obj = js.Dynamic.literal(payload = payload, reason = reason, signature = signature, verified = verified)
  
    __obj.asInstanceOf[ReposUpdateFileResponseCommitVerification]
  }
}

