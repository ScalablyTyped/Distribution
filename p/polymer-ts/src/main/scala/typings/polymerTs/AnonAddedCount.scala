package typings.polymerTs

import typings.polymerTs.polymerTsStrings.splice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddedCount extends js.Object {
  var addedCount: Double
  var index: Double
  var `object`: js.Array[_]
  var removed: js.Array[_]
  var `type`: splice
}

object AnonAddedCount {
  @scala.inline
  def apply(addedCount: Double, index: Double, `object`: js.Array[_], removed: js.Array[_], `type`: splice): AnonAddedCount = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddedCount]
  }
}

