package typings
package nodeLib

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
  def apply(trimLeft: js.Function0[java.lang.String], trimRight: js.Function0[java.lang.String]): String = {
    val __obj = js.Dynamic.literal(trimLeft = trimLeft, trimRight = trimRight)
  
    __obj.asInstanceOf[String]
  }
}

