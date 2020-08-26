package typings.octokitAuthToken.mod

import typings.octokitAuthToken.typesMod.Authentication
import typings.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  var Authentication: typings.octokitAuthToken.typesMod.Authentication = js.native
  var StrategyOptions: Token = js.native
}

object Types {
  @scala.inline
  def apply(Authentication: Authentication, StrategyOptions: Token): Types = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any], StrategyOptions = StrategyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthentication(value: Authentication): Self = this.set("Authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrategyOptions(value: Token): Self = this.set("StrategyOptions", value.asInstanceOf[js.Any])
  }
  
}

