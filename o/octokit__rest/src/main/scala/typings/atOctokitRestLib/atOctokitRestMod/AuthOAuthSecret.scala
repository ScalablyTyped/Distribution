package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOAuthSecret extends js.Object {
  var key: java.lang.String
  var secret: java.lang.String
  var `type`: atOctokitRestLib.atOctokitRestLibStrings.oauth
}

object AuthOAuthSecret {
  @scala.inline
  def apply(
    key: java.lang.String,
    secret: java.lang.String,
    `type`: atOctokitRestLib.atOctokitRestLibStrings.oauth
  ): AuthOAuthSecret = {
    val __obj = js.Dynamic.literal(key = key, secret = secret)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthOAuthSecret]
  }
}

