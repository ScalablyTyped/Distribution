package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.transactionManagerMod.ITransactionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "beginTransaction")
@js.native
object beginTransaction extends js.Object {
  
  def apply(model: IAbstractModel): typings.mendixmodelsdk.transactionManagerMod.Transaction = js.native
  def apply(model: IAbstractModel, options: ITransactionOptions): typings.mendixmodelsdk.transactionManagerMod.Transaction = js.native
}
