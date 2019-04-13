package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOAuthToken extends js.Object {
  var token: java.lang.String
  var `type`: atOctokitRestLib.atOctokitRestLibStrings.oauth
}

object AuthOAuthToken {
  @scala.inline
  def apply(token: java.lang.String, `type`: atOctokitRestLib.atOctokitRestLibStrings.oauth): AuthOAuthToken = {
    val __obj = js.Dynamic.literal(token = token)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthOAuthToken]
  }
}

