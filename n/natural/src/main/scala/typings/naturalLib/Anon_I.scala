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
  def apply(nth: js.Function1[scala.Double, java.lang.String]): Anon_I = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nth")(nth)
    __obj.asInstanceOf[Anon_I]
  }
}

