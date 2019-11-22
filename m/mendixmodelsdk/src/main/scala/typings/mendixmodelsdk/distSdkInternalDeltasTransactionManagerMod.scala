package typings.mendixmodelsdk

import typings.mendixmodelsdk.distCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
import typings.mendixmodelsdk.distSdkInternalDeltasTransactionManagerMod.Transaction
import typings.mendixmodelsdk.distSdkInternalDeltasTransactionManagerMod.TransactionManager
import typings.mendixmodelsdk.distSdkInternalDeltasTransactionManagerMod.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/TransactionManager", JSImport.Namespace)
@js.native
object distSdkInternalDeltasTransactionManagerMod extends js.Object {
  @js.native
  class Transaction protected () extends js.Object {
    def this(transactionType: TransactionType, transactionManager: TransactionManager) = this()
    var checkTransaction: js.Any = js.native
    var transactionManager: js.Any = js.native
    val transactionType: TransactionType = js.native
    def commit(): Unit = js.native
    def rollback(): Unit = js.native
  }
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.mendixmodelsdkStrings.explicit
    - typings.mendixmodelsdk.mendixmodelsdkStrings.`implicit`
  */
  trait TransactionType extends js.Object
  
  def beginTransaction(model: IAbstractModel): Transaction = js.native
  def runInTransaction[T](model: IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  @JSName("runInTransaction")
  def runInTransaction_T_T[T](model: IAbstractModel, action: js.Function0[T]): T = js.native
}

