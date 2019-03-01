package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_COMPLETE extends js.Object {
  var COMPLETE: scala.Double
  var DATA_URL: scala.Double
  var LOADING: scala.Double
  var NONE: scala.Double
}

object Anon_COMPLETE {
  @scala.inline
  def apply(COMPLETE: scala.Double, DATA_URL: scala.Double, LOADING: scala.Double, NONE: scala.Double): Anon_COMPLETE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COMPLETE")(COMPLETE)
    __obj.updateDynamic("DATA_URL")(DATA_URL)
    __obj.updateDynamic("LOADING")(LOADING)
    __obj.updateDynamic("NONE")(NONE)
    __obj.asInstanceOf[Anon_COMPLETE]
  }
}

