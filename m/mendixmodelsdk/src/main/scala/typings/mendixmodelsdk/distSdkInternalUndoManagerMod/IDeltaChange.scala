package typings.mendixmodelsdk.distSdkInternalUndoManagerMod

import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
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
    val __obj = js.Dynamic.literal(delta = delta, reversedDelta = reversedDelta)
  
    __obj.asInstanceOf[IDeltaChange]
  }
}

