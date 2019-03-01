package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CIRC extends js.Object {
  var CIRC: scala.Double
  var ELIP: scala.Double
  var POLY: scala.Double
  var RECT: scala.Double
  var RREC: scala.Double
}

object Anon_CIRC {
  @scala.inline
  def apply(CIRC: scala.Double, ELIP: scala.Double, POLY: scala.Double, RECT: scala.Double, RREC: scala.Double): Anon_CIRC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CIRC")(CIRC)
    __obj.updateDynamic("ELIP")(ELIP)
    __obj.updateDynamic("POLY")(POLY)
    __obj.updateDynamic("RECT")(RECT)
    __obj.updateDynamic("RREC")(RREC)
    __obj.asInstanceOf[Anon_CIRC]
  }
}

