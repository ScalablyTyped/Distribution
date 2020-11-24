package typings.mendixmodelsdk.transactionManagerMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/TransactionManager", "beginTransaction")
@js.native
object beginTransaction extends js.Object {
  
  def apply(model: IAbstractModel): Transaction = js.native
  def apply(model: IAbstractModel, options: ITransactionOptions): Transaction = js.native
}
