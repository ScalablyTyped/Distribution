package typings.mendixmodelsdk.distSdkInternalDeltasDeltaDashProcessorMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/delta-processor", "DeltaProcessor")
@js.native
class DeltaProcessor protected () extends js.Object {
  def this(model: AbstractModel) = this()
  var getUnit: js.Any = js.native
  var model: AbstractModel = js.native
  var processAttachElementDelta: js.Any = js.native
  var processCreateElementTreeDelta: js.Any = js.native
  var processCreateUnitTreeDelta: js.Any = js.native
  var processDeleteElementDelta: js.Any = js.native
  var processDeleteUnitDelta: js.Any = js.native
  var processDetachElementDelta: js.Any = js.native
  var processMutator: js.Any = js.native
  var processUpdatePropertyValueDelta: js.Any = js.native
  def processDeltas(deltas: js.Array[Delta]): Unit = js.native
}

