package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.srcInteractionMod.Interaction
import typings.onflowFlowJsTesting.srcInteractionMod.TransactionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJestAssertsMod {
  
  @JSImport("@onflow/flow-js-testing/src/jest-asserts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shallPass(ix: Interaction): js.Promise[js.Tuple2[TransactionStatus, Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallPass")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[TransactionStatus, Null]]]
  
  inline def shallResolve(ix: Interaction): js.Promise[js.Tuple2[Any, Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallResolve")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[Any, Null]]]
  
  inline def shallRevert(ix: Interaction): js.Promise[js.Tuple2[TransactionStatus | Null, String | js.Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[TransactionStatus | Null, String | js.Error]]]
  inline def shallRevert(ix: Interaction, message: String): js.Promise[js.Tuple2[TransactionStatus | Null, String | js.Error]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[TransactionStatus | Null, String | js.Error]]]
  inline def shallRevert(ix: Interaction, message: js.RegExp): js.Promise[js.Tuple2[TransactionStatus | Null, String | js.Error]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[TransactionStatus | Null, String | js.Error]]]
}
