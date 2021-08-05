package typings.operationRetrier

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backoffMod {
  
  @JSImport("operation-retrier/lib/backoff", JSImport.Default)
  @js.native
  class default protected () extends Backoff {
    def this(options: js.Any) = this()
  }
  object default {
    
    @JSImport("operation-retrier/lib/backoff", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def exponential(options: js.Any): Backoff = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")(options.asInstanceOf[js.Any]).asInstanceOf[Backoff]
  }
  
  @JSImport("operation-retrier/lib/backoff", "Backoff")
  @js.native
  class Backoff protected () extends EventEmitter {
    def this(options: js.Any) = this()
    
    def backoff(): Unit = js.native
    def backoff(err: js.Any): Unit = js.native
    
    /* private */ var backoffDelay: js.Any = js.native
    
    /* private */ var backoffNumber: js.Any = js.native
    
    /* private */ val factor: js.Any = js.native
    
    def failAfter(maxNumberOfRetry: js.Any): Unit = js.native
    
    /* private */ val initialDelay: js.Any = js.native
    
    /* private */ val maxDelay: js.Any = js.native
    
    /* private */ var maxNumberOfRetry: js.Any = js.native
    
    def next(): Double = js.native
    
    /* private */ var nextBackoffDelay: js.Any = js.native
    
    def onBackoff(): Unit = js.native
    
    /* private */ val randomisationFactor: js.Any = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var timeoutID: js.Any = js.native
  }
  object Backoff {
    
    @JSImport("operation-retrier/lib/backoff", "Backoff")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def exponential(options: js.Any): Backoff = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")(options.asInstanceOf[js.Any]).asInstanceOf[Backoff]
  }
}
