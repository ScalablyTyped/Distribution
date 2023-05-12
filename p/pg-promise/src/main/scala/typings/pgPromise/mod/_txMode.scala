package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// internal namespace for "txMode" property:
object _txMode {
  
  @js.native
  sealed trait isolationLevel extends StObject
  // Transaction Isolation Level;
  // API: http://vitaly-t.github.io/pg-promise/txMode.html#.isolationLevel
  @JSImport("pg-promise", "_txMode.isolationLevel")
  @js.native
  object isolationLevel extends StObject {
    
    @js.native
    sealed trait none
      extends StObject
         with isolationLevel
    
    @js.native
    sealed trait readCommitted
      extends StObject
         with isolationLevel
    
    @js.native
    sealed trait repeatableRead
      extends StObject
         with isolationLevel
    
    @js.native
    sealed trait serializable
      extends StObject
         with isolationLevel
  }
  
  // TransactionMode class;
  // API: http://vitaly-t.github.io/pg-promise/txMode.TransactionMode.html
  @js.native
  trait TransactionMode extends StObject {
    
    def begin(): String = js.native
    def begin(cap: Boolean): String = js.native
  }
}
