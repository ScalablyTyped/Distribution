package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.transactionManagerMod.TransactionManager
import typings.mendixmodelsdk.transactionManagerMod.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Transaction")
@js.native
class Transaction protected ()
  extends typings.mendixmodelsdk.transactionManagerMod.Transaction {
  def this(transactionType: TransactionType, transactionManager: TransactionManager) = this()
}

