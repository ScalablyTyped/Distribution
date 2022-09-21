package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.accountMod.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contractMod {
  
  @JSImport("@onflow/flow-js-testing/src/contract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContractAddress(name: String): js.Promise[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Address]]
}
