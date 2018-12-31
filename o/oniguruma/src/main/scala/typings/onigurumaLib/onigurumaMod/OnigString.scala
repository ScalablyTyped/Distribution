package typings
package onigurumaLib.onigurumaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oniguruma", "OnigString")
@js.native
class OnigString protected () extends js.Object {
  /**
    * Wrap a string primitive in a new OnigString object
    * @param string The string primitive to be wrapped
    */
  def this(string: java.lang.String) = this()
  /** The string primitive wrapped by the object */
  val content: java.lang.String = js.native
  /** The character length of the string primitive wrapped by the object */
  val length: scala.Double = js.native
  /**
    * Returns a substring of the string primitive wrapped by the object
    * @param start The index of the first character to include
    * @param end The index before which the substring should end
    * @return A new string primitive containing the specified index range
    */
  def substring(start: scala.Double, end: scala.Double): java.lang.String = js.native
}

