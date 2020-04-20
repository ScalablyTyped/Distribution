package typings.nwGui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatatype extends js.Object {
  var datatype: String
  var format: String
}

object AnonDatatype {
  @scala.inline
  def apply(datatype: String, format: String): AnonDatatype = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatatype]
  }
}

