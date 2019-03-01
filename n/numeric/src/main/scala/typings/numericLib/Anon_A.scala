package typings
package numericLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  var A: Matrix
  var I: Matrix
  var P: Vector
}

object Anon_A {
  @scala.inline
  def apply(A: Matrix, I: Matrix, P: Vector): Anon_A = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("A")(A)
    __obj.updateDynamic("I")(I)
    __obj.updateDynamic("P")(P)
    __obj.asInstanceOf[Anon_A]
  }
}

