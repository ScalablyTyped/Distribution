package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltaDashProcessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/delta-processor", "DeltaProcessor")
@js.native
class DeltaProcessor protected () extends js.Object {
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel) = this()
  var getUnit: js.Any = js.native
  var model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel = js.native
  var processAttachElementDelta: js.Any = js.native
  var processCreateElementTreeDelta: js.Any = js.native
  var processCreateUnitTreeDelta: js.Any = js.native
  var processDeleteElementDelta: js.Any = js.native
  var processDeleteUnitDelta: js.Any = js.native
  var processDetachElementDelta: js.Any = js.native
  var processMutator: js.Any = js.native
  var processUpdatePropertyValueDelta: js.Any = js.native
  def processDeltas(deltas: js.Array[mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta]): scala.Unit = js.native
}

