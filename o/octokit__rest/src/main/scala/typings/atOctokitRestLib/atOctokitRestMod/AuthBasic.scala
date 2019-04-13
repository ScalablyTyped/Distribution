package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthBasic extends js.Object {
  var password: java.lang.String
  var `type`: atOctokitRestLib.atOctokitRestLibStrings.basic
  var username: java.lang.String
}

object AuthBasic {
  @scala.inline
  def apply(
    password: java.lang.String,
    `type`: atOctokitRestLib.atOctokitRestLibStrings.basic,
    username: java.lang.String
  ): AuthBasic = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthBasic]
  }
}

