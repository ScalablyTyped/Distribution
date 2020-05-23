package typings.nodal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Convert extends js.Object {
  var convert: js.Function
}

object Convert {
  @scala.inline
  def apply(convert: js.Function): Convert = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Convert]
  }
}

