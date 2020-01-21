package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaProcessor", JSImport.Namespace)
@js.native
object deltaProcessorMod extends js.Object {
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
  
}

