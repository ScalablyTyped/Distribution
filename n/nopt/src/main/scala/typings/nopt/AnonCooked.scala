package typings.nopt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCooked extends js.Object {
  var cooked: js.Array[String]
  var original: js.Array[String]
  var remain: js.Array[String]
}

object AnonCooked {
  @scala.inline
  def apply(cooked: js.Array[String], original: js.Array[String], remain: js.Array[String]): AnonCooked = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], remain = remain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCooked]
  }
}

