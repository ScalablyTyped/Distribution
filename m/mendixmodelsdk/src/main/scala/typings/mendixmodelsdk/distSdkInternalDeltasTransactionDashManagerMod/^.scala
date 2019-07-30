package typings.mendixmodelsdk.distSdkInternalDeltasTransactionDashManagerMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/transaction-manager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def beginTransaction(model: IAbstractModel): Transaction = js.native
  def runInTransaction[T](model: IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  @JSName("runInTransaction")
  def runInTransaction_T_T[T](model: IAbstractModel, action: js.Function0[T]): T = js.native
}

