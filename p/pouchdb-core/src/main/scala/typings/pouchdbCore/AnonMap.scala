package typings.pouchdbCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMap extends js.Object {
  var map: String
  var reduce: js.UndefOr[String] = js.undefined
}

object AnonMap {
  @scala.inline
  def apply(map: String, reduce: String = null): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (reduce != null) __obj.updateDynamic("reduce")(reduce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMap]
  }
}

