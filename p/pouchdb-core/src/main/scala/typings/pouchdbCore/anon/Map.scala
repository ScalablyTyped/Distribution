package typings.pouchdbCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var map: String
  var reduce: js.UndefOr[String] = js.undefined
}

object Map {
  @scala.inline
  def apply(map: String, reduce: String = null): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (reduce != null) __obj.updateDynamic("reduce")(reduce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}

