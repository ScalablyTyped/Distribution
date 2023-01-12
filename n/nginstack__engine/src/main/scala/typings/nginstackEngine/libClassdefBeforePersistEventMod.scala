package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefBeforePersistEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/BeforePersistEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BeforePersistEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var afterValues: Any = js.native
    
    /* CompleteClass */
    var beforeValues: Any = js.native
    
    /* CompleteClass */
    var transaction: Transaction = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/BeforePersistEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BeforePersistEvent extends StObject {
    
    var afterValues: Any
    
    var beforeValues: Any
    
    var transaction: Transaction
  }
  object BeforePersistEvent {
    
    inline def apply(afterValues: Any, beforeValues: Any, transaction: Transaction): BeforePersistEvent = {
      val __obj = js.Dynamic.literal(afterValues = afterValues.asInstanceOf[js.Any], beforeValues = beforeValues.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforePersistEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforePersistEvent] (val x: Self) extends AnyVal {
      
      inline def setAfterValues(value: Any): Self = StObject.set(x, "afterValues", value.asInstanceOf[js.Any])
      
      inline def setBeforeValues(value: Any): Self = StObject.set(x, "beforeValues", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  type Transaction = typings.nginstackEngine.libDatasetTransactionMod.^
}
