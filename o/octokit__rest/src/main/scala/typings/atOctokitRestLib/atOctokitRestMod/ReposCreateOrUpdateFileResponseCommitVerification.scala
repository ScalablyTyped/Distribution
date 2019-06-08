package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponseCommitVerification extends js.Object {
  var payload: scala.Null
  var reason: java.lang.String
  var signature: scala.Null
  var verified: scala.Boolean
}

object ReposCreateOrUpdateFileResponseCommitVerification {
  @scala.inline
  def apply(payload: scala.Null, reason: java.lang.String, signature: scala.Null, verified: scala.Boolean): ReposCreateOrUpdateFileResponseCommitVerification = {
    val __obj = js.Dynamic.literal(payload = payload, reason = reason, signature = signature, verified = verified)
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseCommitVerification]
  }
}

