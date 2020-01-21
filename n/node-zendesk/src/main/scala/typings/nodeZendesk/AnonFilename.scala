package typings.nodeZendesk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilename extends js.Object {
  var filename: String
  var token: js.UndefOr[String] = js.undefined
}

object AnonFilename {
  @scala.inline
  def apply(filename: String, token: String = null): AnonFilename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilename]
  }
}

