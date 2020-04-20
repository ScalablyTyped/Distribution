package typings.mjml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLParseResults extends js.Object {
  var errors: js.Array[MJMLParseError]
  var html: String
}

object MJMLParseResults {
  @scala.inline
  def apply(errors: js.Array[MJMLParseError], html: String): MJMLParseResults = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[MJMLParseResults]
  }
}

