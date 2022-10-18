package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.anon.AddressMap
import typings.onflowFlowJsTesting.anon.Args
import typings.onflowFlowJsTesting.srcInteractionMod.TransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDeployCodeMod {
  
  @JSImport("@onflow/flow-js-testing/src/deploy-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deployContract(props: AddressMap): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("deployContract")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  
  inline def deployContractByName(props: Args): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("deployContractByName")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
}
