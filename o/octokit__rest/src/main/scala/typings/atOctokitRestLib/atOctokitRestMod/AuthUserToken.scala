package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthUserToken extends js.Object {
  var token: java.lang.String
  var `type`: atOctokitRestLib.atOctokitRestLibStrings.token
}

object AuthUserToken {
  @scala.inline
  def apply(token: java.lang.String, `type`: atOctokitRestLib.atOctokitRestLibStrings.token): AuthUserToken = {
    val __obj = js.Dynamic.literal(token = token)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthUserToken]
  }
}

