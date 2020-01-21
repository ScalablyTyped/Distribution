package typings.polymer.mod._Global_.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolymerSplice extends js.Object {
  var addedCount: Double
  var index: Double
  var `object`: js.Array[js.Object]
  var removed: js.Array[js.Object]
  var `type`: String
}

object PolymerSplice {
  @scala.inline
  def apply(
    addedCount: Double,
    index: Double,
    `object`: js.Array[js.Object],
    removed: js.Array[js.Object],
    `type`: String
  ): PolymerSplice = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolymerSplice]
  }
}

