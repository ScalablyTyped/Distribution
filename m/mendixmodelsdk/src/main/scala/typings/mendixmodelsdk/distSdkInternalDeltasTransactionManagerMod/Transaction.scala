package typings.mendixmodelsdk.distSdkInternalDeltasTransactionManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/TransactionManager", "Transaction")
@js.native
class Transaction protected () extends js.Object {
  def this(transactionType: TransactionType, transactionManager: TransactionManager) = this()
  var checkTransaction: js.Any = js.native
  var transactionManager: js.Any = js.native
  val transactionType: TransactionType = js.native
  def commit(): Unit = js.native
  def rollback(): Unit = js.native
}

