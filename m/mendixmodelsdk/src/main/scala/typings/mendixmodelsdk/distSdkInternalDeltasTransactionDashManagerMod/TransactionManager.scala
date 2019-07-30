package typings.mendixmodelsdk.distSdkInternalDeltasTransactionDashManagerMod

import typings.mendixmodelsdk.distCommonMod.commonNs.IErrorCallback
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/transaction-manager", "TransactionManager")
@js.native
class TransactionManager protected () extends js.Object {
  def this(model: AbstractModel, errorCallback: IErrorCallback) = this()
  var beginImplicitTransaction: js.Any = js.native
  var checkModel: js.Any = js.native
  var currentTransaction: Transaction | Null = js.native
  var detachedRequiredProperties: js.Any = js.native
  var errorCallback: js.Any = js.native
  var eventEmitter: js.Any = js.native
  var model: js.Any = js.native
  def beginTransaction(): Transaction = js.native
  def commit(): Unit = js.native
  def deltaReceived(delta: Delta): Unit = js.native
  def onCommitted(callback: js.Function0[Unit]): Unit = js.native
  def onRollback(callback: js.Function0[Unit]): Unit = js.native
  def rollback(): Unit = js.native
}

