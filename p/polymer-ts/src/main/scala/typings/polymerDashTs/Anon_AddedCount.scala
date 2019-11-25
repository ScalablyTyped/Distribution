package typings.polymerDashTs

import typings.polymerDashTs.polymerDashTsStrings.splice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddedCount extends js.Object {
  var addedCount: Double
  var index: Double
  var `object`: js.Array[_]
  var removed: js.Array[_]
  var `type`: splice
}

object Anon_AddedCount {
  @scala.inline
  def apply(addedCount: Double, index: Double, `object`: js.Array[_], removed: js.Array[_], `type`: splice): Anon_AddedCount = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddedCount]
  }
}

