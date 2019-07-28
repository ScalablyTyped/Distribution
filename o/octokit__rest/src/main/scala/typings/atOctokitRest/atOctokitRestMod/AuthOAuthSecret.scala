package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.oauth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOAuthSecret extends js.Object {
  var key: String
  var secret: String
  var `type`: oauth
}

object AuthOAuthSecret {
  @scala.inline
  def apply(key: String, secret: String, `type`: oauth): AuthOAuthSecret = {
    val __obj = js.Dynamic.literal(key = key, secret = secret)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthOAuthSecret]
  }
}

