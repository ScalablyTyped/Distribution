package typings.octokitEndpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpand extends js.Object {
  def expand(context: js.Object): String
}

object AnonExpand {
  @scala.inline
  def apply(expand: js.Object => String): AnonExpand = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
  
    __obj.asInstanceOf[AnonExpand]
  }
}

