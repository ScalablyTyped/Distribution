package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolymerSplice extends js.Object {
  var addedCount: scala.Double
  var index: scala.Double
  var `object`: js.Array[js.Object]
  var removed: js.Array[js.Object]
  var `type`: java.lang.String
}

object PolymerSplice {
  @scala.inline
  def apply(
    addedCount: scala.Double,
    index: scala.Double,
    `object`: js.Array[js.Object],
    removed: js.Array[js.Object],
    `type`: java.lang.String
  ): PolymerSplice = {
    val __obj = js.Dynamic.literal(addedCount = addedCount, index = index, removed = removed)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolymerSplice]
  }
}

