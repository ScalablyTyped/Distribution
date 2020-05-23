package typings.ms

import typings.ms.anon.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
  * Parse the given `value` and return milliseconds.
  *
  * @param {String} value
  * @return {Number}
  */
  def apply(value: String): Double = js.native
  def apply(value: Double): String = js.native
  def apply(value: Double, options: Long): String = js.native
}

