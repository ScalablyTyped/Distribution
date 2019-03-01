package typings
package modeslLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HIGH extends js.Object {
  var HIGH: java.lang.String
  var LOW: java.lang.String
  var NORMAL: java.lang.String
}

object Anon_HIGH {
  @scala.inline
  def apply(HIGH: java.lang.String, LOW: java.lang.String, NORMAL: java.lang.String): Anon_HIGH = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HIGH")(HIGH)
    __obj.updateDynamic("LOW")(LOW)
    __obj.updateDynamic("NORMAL")(NORMAL)
    __obj.asInstanceOf[Anon_HIGH]
  }
}

