package typings.nwGui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datatype extends js.Object {
  var datatype: String
  var format: String
}

object Datatype {
  @scala.inline
  def apply(datatype: String, format: String): Datatype = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datatype]
  }
}

