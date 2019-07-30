package typings.mendixmodelsdk.distSdkInternalDeltasDeltaDashManagerMod

import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeltaChange extends js.Object {
  var delta: Delta
  var reverseDelta: Delta | Error
}

object IDeltaChange {
  @scala.inline
  def apply(delta: Delta, reverseDelta: Delta | Error): IDeltaChange = {
    val __obj = js.Dynamic.literal(delta = delta, reverseDelta = reverseDelta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDeltaChange]
  }
}

