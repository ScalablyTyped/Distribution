package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.srcAccountMod.Address
import typings.onflowFlowJsTesting.srcAccountMod.SignerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInteractionMod {
  
  @JSImport("@onflow/flow-js-testing/src/interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeScript(name: String): js.Promise[ScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptResponse]]
  inline def executeScript(name: String, args: js.Array[Any]): js.Promise[ScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptResponse]]
  inline def executeScript(props: ScriptProps): js.Promise[ScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptResponse]]
  
  inline def sendTransaction(name: String, signers: js.Array[Address | SignerInfo]): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTransaction")(name.asInstanceOf[js.Any], signers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
  inline def sendTransaction(name: String, signers: js.Array[Address | SignerInfo], args: js.Array[Any]): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTransaction")(name.asInstanceOf[js.Any], signers.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
  inline def sendTransaction(props: TransactionProps): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendTransaction")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  
  type Interaction = js.Promise[Any] | js.Function0[js.Promise[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.onflowFlowJsTesting.anon.Code
    - typings.onflowFlowJsTesting.anon.Transformers
  */
  trait ScriptProps extends StObject
  object ScriptProps {
    
    inline def Code(name: String): typings.onflowFlowJsTesting.anon.Code = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onflowFlowJsTesting.anon.Code]
    }
    
    inline def Transformers(code: String): typings.onflowFlowJsTesting.anon.Transformers = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onflowFlowJsTesting.anon.Transformers]
    }
  }
  
  type ScriptResponse = js.Tuple2[Any, js.Error | Null]
  
  trait TransactionEvent extends StObject {
    
    var data: Any
    
    var eventIndex: Double
    
    var transactionId: String
    
    var transactionIndex: Double
    
    var `type`: String
  }
  object TransactionEvent {
    
    inline def apply(data: Any, eventIndex: Double, transactionId: String, transactionIndex: Double, `type`: String): TransactionEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventIndex = eventIndex.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionEvent]
    }
    
    extension [Self <: TransactionEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEventIndex(value: Double): Self = StObject.set(x, "eventIndex", value.asInstanceOf[js.Any])
      
      inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
      
      inline def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.onflowFlowJsTesting.anon.Signers
    - typings.onflowFlowJsTesting.anon.AddressMapArgs
  */
  trait TransactionProps extends StObject
  object TransactionProps {
    
    inline def AddressMapArgs(code: String, signers: js.Array[Address | SignerInfo]): typings.onflowFlowJsTesting.anon.AddressMapArgs = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onflowFlowJsTesting.anon.AddressMapArgs]
    }
    
    inline def Signers(name: String, signers: js.Array[Address | SignerInfo]): typings.onflowFlowJsTesting.anon.Signers = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onflowFlowJsTesting.anon.Signers]
    }
  }
  
  type TransactionResponse = js.Tuple2[TransactionStatus | Null, js.Error | Null]
  
  trait TransactionStatus extends StObject {
    
    var blockId: String
    
    var errorMessage: String
    
    var events: js.Array[TransactionEvent]
    
    var status: Double
    
    var statusCode: Double
    
    var statusString: String
  }
  object TransactionStatus {
    
    inline def apply(
      blockId: String,
      errorMessage: String,
      events: js.Array[TransactionEvent],
      status: Double,
      statusCode: Double,
      statusString: String
    ): TransactionStatus = {
      val __obj = js.Dynamic.literal(blockId = blockId.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusString = statusString.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionStatus]
    }
    
    extension [Self <: TransactionStatus](x: Self) {
      
      inline def setBlockId(value: String): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: js.Array[TransactionEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: TransactionEvent*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusString(value: String): Self = StObject.set(x, "statusString", value.asInstanceOf[js.Any])
    }
  }
}
