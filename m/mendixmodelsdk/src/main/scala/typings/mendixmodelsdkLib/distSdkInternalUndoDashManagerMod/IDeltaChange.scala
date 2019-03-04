package typings
package mendixmodelsdkLib.distSdkInternalUndoDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeltaChange extends js.Object {
  var delta: mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta
  var reversedDelta: mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta
}

object IDeltaChange {
  @scala.inline
  def apply(
    delta: mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta,
    reversedDelta: mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta
  ): IDeltaChange = {
    val __obj = js.Dynamic.literal(delta = delta, reversedDelta = reversedDelta)
  
    __obj.asInstanceOf[IDeltaChange]
  }
}

