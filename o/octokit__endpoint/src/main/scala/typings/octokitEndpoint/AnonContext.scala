package typings.octokitEndpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  def expand(context: js.Object): String
}

object AnonContext {
  @scala.inline
  def apply(expand: js.Object => String): AnonContext = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
  
    __obj.asInstanceOf[AnonContext]
  }
}

