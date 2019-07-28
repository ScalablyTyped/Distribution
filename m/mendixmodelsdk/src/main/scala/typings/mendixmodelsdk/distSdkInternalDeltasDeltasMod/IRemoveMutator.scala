package typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemoveMutator extends Mutator {
  var mutatorType: REMOVE
  var removalIndex: Double
}

object IRemoveMutator {
  @scala.inline
  def apply(mutatorType: REMOVE, removalIndex: Double): IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType, removalIndex = removalIndex)
  
    __obj.asInstanceOf[IRemoveMutator]
  }
}

