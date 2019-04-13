package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsGetRestrictionsForOrgResponse extends js.Object {
  var expires_at: java.lang.String
  var limit: java.lang.String
  var origin: java.lang.String
}

object InteractionsGetRestrictionsForOrgResponse {
  @scala.inline
  def apply(expires_at: java.lang.String, limit: java.lang.String, origin: java.lang.String): InteractionsGetRestrictionsForOrgResponse = {
    val __obj = js.Dynamic.literal(expires_at = expires_at, limit = limit, origin = origin)
  
    __obj.asInstanceOf[InteractionsGetRestrictionsForOrgResponse]
  }
}

