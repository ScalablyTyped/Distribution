package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.interactionMod.Interaction
import typings.onflowFlowJsTesting.interactionMod.ScriptResponse
import typings.onflowFlowJsTesting.interactionMod.TransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestAssertsMod {
  
  @JSImport("@onflow/flow-js-testing/src/jest-asserts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shallPass(ix: Interaction): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallPass")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  
  inline def shallResolve(ix: Interaction): js.Promise[ScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallResolve")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptResponse]]
  
  inline def shallRevert(ix: Interaction): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  inline def shallRevert(ix: Interaction, message: String): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
  inline def shallRevert(ix: Interaction, message: js.RegExp): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
}
