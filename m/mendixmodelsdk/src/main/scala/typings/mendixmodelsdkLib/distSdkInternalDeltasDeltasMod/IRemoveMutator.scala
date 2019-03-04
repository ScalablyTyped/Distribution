package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemoveMutator extends Mutator {
  var mutatorType: mendixmodelsdkLib.mendixmodelsdkLibStrings.REMOVE
  var removalIndex: scala.Double
}

object IRemoveMutator {
  @scala.inline
  def apply(mutatorType: mendixmodelsdkLib.mendixmodelsdkLibStrings.REMOVE, removalIndex: scala.Double): IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType, removalIndex = removalIndex)
  
    __obj.asInstanceOf[IRemoveMutator]
  }
}

