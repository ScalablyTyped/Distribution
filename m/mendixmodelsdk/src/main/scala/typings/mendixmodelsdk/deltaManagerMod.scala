package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.commonMod.common.IVoidCallback
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import typings.mendixmodelsdk.transactionManagerMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaManagerMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/DeltaManager", "DeltaManager")
  @js.native
  open class DeltaManager protected ()
    extends StObject
       with IDeltaManager {
    def this(model: AbstractModel) = this()
    
    /* private */ var callErrorCallbacks: Any = js.native
    
    /* private */ var callFlushCallbacks: Any = js.native
    
    /* private */ var deltaProcessor: Any = js.native
    
    /* private */ var deltaReverser: Any = js.native
    
    /* private */ var deltaSender: Any = js.native
    
    /* private */ var errorCallbacks: Any = js.native
    
    /* private */ var eventEmitter: Any = js.native
    
    /* private */ var flushCallbacks: Any = js.native
    
    /* private */ var getReverseDelta: Any = js.native
    
    /* private */ var handleTransactionCommited: Any = js.native
    
    /* private */ var handleTransactionRollback: Any = js.native
    
    /* private */ var model: Any = js.native
    
    /* private */ var transactionManager: Any = js.native
  }
  
  trait IDeltaChange extends StObject {
    
    var delta: Delta
    
    var reverseDelta: Delta | js.Error
  }
  object IDeltaChange {
    
    inline def apply(delta: Delta, reverseDelta: Delta | js.Error): IDeltaChange = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], reverseDelta = reverseDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDeltaChange]
    }
    
    extension [Self <: IDeltaChange](x: Self) {
      
      inline def setDelta(value: Delta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setReverseDelta(value: Delta | js.Error): Self = StObject.set(x, "reverseDelta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDeltaManager extends StObject {
    
    def beginTransaction(): Transaction = js.native
    def beginTransaction(commitCurrentImplicitTransaction: Boolean): Transaction = js.native
    
    def closeConnection(callback: IVoidCallback): Unit = js.native
    def closeConnection(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def flushChanges(callback: IVoidCallback): Unit = js.native
    def flushChanges(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def onNewDelta(callback: js.Function1[/* delta */ Delta, Unit]): Unit = js.native
    
    def onTransactionCommitted(callback: js.Function0[Unit]): Unit = js.native
    
    def onTransactionRollback(callback: js.Function0[Unit]): Unit = js.native
    
    def processDeltas(deltas: js.Array[Delta]): Unit = js.native
    
    def push(delta: Delta): Unit = js.native
    
    def reverseDelta(delta: Delta): Delta = js.native
  }
}
