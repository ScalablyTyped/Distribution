package typings
package naturalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I extends js.Object {
  def nth(i: scala.Double): java.lang.String
}

object Anon_I {
  @scala.inline
  def apply(nth: scala.Double => java.lang.String): Anon_I = {
    val __obj = js.Dynamic.literal(nth = js.Any.fromFunction1(nth))
  
    __obj.asInstanceOf[Anon_I]
  }
}

