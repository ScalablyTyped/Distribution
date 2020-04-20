package typings.mendixmodelsdk.undoManagerMod

import typings.mendixmodelsdk.deltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeltaChange extends js.Object {
  var delta: Delta
  var reversedDelta: Delta
}

object IDeltaChange {
  @scala.inline
  def apply(delta: Delta, reversedDelta: Delta): IDeltaChange = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], reversedDelta = reversedDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeltaChange]
  }
}

