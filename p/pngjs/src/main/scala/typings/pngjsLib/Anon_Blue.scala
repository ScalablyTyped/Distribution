package typings
package pngjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blue extends js.Object {
  var blue: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object Anon_Blue {
  @scala.inline
  def apply(blue: scala.Double, green: scala.Double, red: scala.Double): Anon_Blue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[Anon_Blue]
  }
}

