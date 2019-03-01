package typings
package netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var access_token: java.lang.String
  var expires_at: java.lang.String | scala.Double
  var expires_in: java.lang.String | scala.Double
  var refresh_token: java.lang.String
  var token_type: java.lang.String
}

object Token {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expires_at: java.lang.String | scala.Double,
    expires_in: java.lang.String | scala.Double,
    refresh_token: java.lang.String,
    token_type: java.lang.String
  ): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("expires_at")(expires_at.asInstanceOf[js.Any])
    __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    __obj.updateDynamic("refresh_token")(refresh_token)
    __obj.updateDynamic("token_type")(token_type)
    __obj.asInstanceOf[Token]
  }
}

