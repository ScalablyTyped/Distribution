package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.app
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthJWT extends js.Object {
  var token: String
  var `type`: app
}

object AuthJWT {
  @scala.inline
  def apply(token: String, `type`: app): AuthJWT = {
    val __obj = js.Dynamic.literal(token = token)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthJWT]
  }
}

