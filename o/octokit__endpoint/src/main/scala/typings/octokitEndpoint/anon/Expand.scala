package typings.octokitEndpoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand extends js.Object {
  def expand(context: js.Object): String
}

object Expand {
  @scala.inline
  def apply(expand: js.Object => String): Expand = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
    __obj.asInstanceOf[Expand]
  }
}

