package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.accountMod.Address
import typings.onflowFlowJsTesting.interactionMod.TransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowTokenMod {
  
  @JSImport("@onflow/flow-js-testing/src/flow-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFlowBalance(address: Address): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlowBalance")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def mintFlow(recipient: Address, amount: String): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("mintFlow")(recipient.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
}
