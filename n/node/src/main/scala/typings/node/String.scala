package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Node.js ESNEXT support
trait String extends js.Object {
  /** Removes whitespace from the left end of a string. */
  def trimLeft(): java.lang.String
  /** Removes whitespace from the right end of a string. */
  def trimRight(): java.lang.String
}

object String {
  @scala.inline
  def apply(trimLeft: () => java.lang.String, trimRight: () => java.lang.String): String = {
    val __obj = js.Dynamic.literal(trimLeft = js.Any.fromFunction0(trimLeft), trimRight = js.Any.fromFunction0(trimRight))
  
    __obj.asInstanceOf[String]
  }
}

