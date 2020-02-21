package typings.octokitAuthToken.mod

import typings.octokitAuthToken.typesMod.Authentication
import typings.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var Authentication: typings.octokitAuthToken.typesMod.Authentication
  var StrategyOptions: Token
}

object Types {
  @scala.inline
  def apply(Authentication: Authentication, StrategyOptions: Token): Types = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any], StrategyOptions = StrategyOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Types]
  }
}

