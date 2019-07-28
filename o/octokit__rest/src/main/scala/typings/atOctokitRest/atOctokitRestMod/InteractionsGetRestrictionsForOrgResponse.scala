package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsGetRestrictionsForOrgResponse extends js.Object {
  var expires_at: String
  var limit: String
  var origin: String
}

object InteractionsGetRestrictionsForOrgResponse {
  @scala.inline
  def apply(expires_at: String, limit: String, origin: String): InteractionsGetRestrictionsForOrgResponse = {
    val __obj = js.Dynamic.literal(expires_at = expires_at, limit = limit, origin = origin)
  
    __obj.asInstanceOf[InteractionsGetRestrictionsForOrgResponse]
  }
}

