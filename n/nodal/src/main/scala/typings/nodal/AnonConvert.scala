package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConvert extends js.Object {
  var convert: js.Function
}

object AnonConvert {
  @scala.inline
  def apply(convert: js.Function): AnonConvert = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConvert]
  }
}

