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

