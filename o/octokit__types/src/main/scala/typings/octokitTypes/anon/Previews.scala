package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Previews extends js.Object {
  var format: String
  var previews: js.Array[String]
}

object Previews {
  @scala.inline
  def apply(format: String, previews: js.Array[String]): Previews = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previews]
  }
}

