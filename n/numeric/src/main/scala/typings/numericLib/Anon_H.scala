package typings
package numericLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_H extends js.Object {
  var H: Matrix
  var Q: Matrix
}

object Anon_H {
  @scala.inline
  def apply(H: Matrix, Q: Matrix): Anon_H = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("H")(H)
    __obj.updateDynamic("Q")(Q)
    __obj.asInstanceOf[Anon_H]
  }
}

