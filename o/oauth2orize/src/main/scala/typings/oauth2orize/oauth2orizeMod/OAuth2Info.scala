package typings.oauth2orize.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Info extends js.Object {
  var scope: String
}

object OAuth2Info {
  @scala.inline
  def apply(scope: String): OAuth2Info = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OAuth2Info]
  }
}

