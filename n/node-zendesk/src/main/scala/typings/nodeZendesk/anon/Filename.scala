package typings.nodeZendesk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filename extends js.Object {
  var filename: String
  var token: js.UndefOr[String] = js.undefined
}

object Filename {
  @scala.inline
  def apply(filename: String, token: String = null): Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
}

