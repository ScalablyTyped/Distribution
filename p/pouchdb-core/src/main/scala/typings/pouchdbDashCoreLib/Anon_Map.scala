package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: java.lang.String
  var reduce: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Map {
  @scala.inline
  def apply(map: java.lang.String, reduce: java.lang.String = null): Anon_Map = {
    val __obj = js.Dynamic.literal(map = map)
    if (reduce != null) __obj.updateDynamic("reduce")(reduce)
    __obj.asInstanceOf[Anon_Map]
  }
}

