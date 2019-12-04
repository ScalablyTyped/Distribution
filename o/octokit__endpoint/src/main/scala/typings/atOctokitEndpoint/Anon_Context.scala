package typings.atOctokitEndpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  def expand(context: js.Object): String
}

object Anon_Context {
  @scala.inline
  def apply(expand: js.Object => String): Anon_Context = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
  
    __obj.asInstanceOf[Anon_Context]
  }
}

