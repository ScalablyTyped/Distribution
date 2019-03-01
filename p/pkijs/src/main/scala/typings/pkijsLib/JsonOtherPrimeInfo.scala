package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOtherPrimeInfo extends js.Object {
  var d: java.lang.String
  var r: java.lang.String
  var t: java.lang.String
}

object JsonOtherPrimeInfo {
  @scala.inline
  def apply(d: java.lang.String, r: java.lang.String, t: java.lang.String): JsonOtherPrimeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("d")(d)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("t")(t)
    __obj.asInstanceOf[JsonOtherPrimeInfo]
  }
}

