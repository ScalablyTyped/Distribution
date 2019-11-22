package typings.mendixmodelsdk.distSdkInternalDeltasDeltaManagerMod

import typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaManager", "DeltaManager")
@js.native
class DeltaManager protected () extends IDeltaManager {
  def this(model: AbstractModel) = this()
  var callErrorCallbacks: js.Any = js.native
  var callFlushCallbacks: js.Any = js.native
  var deltaProcessor: js.Any = js.native
  var deltaReverser: js.Any = js.native
  var deltaSender: js.Any = js.native
  var errorCallbacks: js.Any = js.native
  var eventEmitter: js.Any = js.native
  var flushCallbacks: js.Any = js.native
  var getReverseDelta: js.Any = js.native
  var handleTransactionCommited: js.Any = js.native
  var handleTransactionRollback: js.Any = js.native
  var model: js.Any = js.native
  var transactionManager: js.Any = js.native
}

