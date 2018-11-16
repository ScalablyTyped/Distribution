package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltaDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/delta-manager", "DeltaManager")
@js.native
class DeltaManager protected () extends IDeltaManager {
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel) = this()
  var callCloseCallback: js.Any = js.native
  var callErrorCallback: js.Any = js.native
  var checkDetachedStructures: scala.Boolean = js.native
  var closeCallback: js.Any = js.native
  var commitTransaction: js.Any = js.native
  var deltaProcessor: js.Any = js.native
  var deltaReverser: js.Any = js.native
  var deltaSender: js.Any = js.native
  var errorCallback: js.Any = js.native
  var eventEmitter: js.Any = js.native
  var model: js.Any = js.native
  var scheduleCommitTransaction: js.Any = js.native
  var transactionChecks: js.Any = js.native
  var transactionPending: js.Any = js.native
}

