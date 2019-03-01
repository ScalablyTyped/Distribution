package typings
package numericLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_B extends js.Object {
  var B: Matrix
  var Q: Matrix
}

object Anon_B {
  @scala.inline
  def apply(B: Matrix, Q: Matrix): Anon_B = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("B")(B)
    __obj.updateDynamic("Q")(Q)
    __obj.asInstanceOf[Anon_B]
  }
}

