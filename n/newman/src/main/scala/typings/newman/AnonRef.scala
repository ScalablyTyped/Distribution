package typings.newman

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef extends js.Object {
  var ref: String
}

object AnonRef {
  @scala.inline
  def apply(ref: String): AnonRef = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRef]
  }
}

