package typings.polymer.polymerMod.Global.polymerNs

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
    val __obj = js.Dynamic.literal(addedCount = addedCount, index = index, removed = removed)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolymerSplice]
  }
}

