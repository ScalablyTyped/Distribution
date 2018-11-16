package typings
package mendixmodelsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSdkInternalDeltasDeltasMod {
  type Delta = ICreateElementTreeDelta | IDeleteElementDelta | IAttachElementDelta | IDetachElementDelta | ICreateUnitTreeDelta | IDeleteUnitDelta | IUpdatePropertyValueDelta
  type Mutator = IChangeMutator | IAddMutator | IRemoveMutator
  type PrimitiveValue = scala.Boolean | scala.Double | java.lang.String | mendixmodelsdkLib.distCommonMod.commonNs.IPoint | mendixmodelsdkLib.distCommonMod.commonNs.ISize | mendixmodelsdkLib.distCommonMod.commonNs.IColor
}
