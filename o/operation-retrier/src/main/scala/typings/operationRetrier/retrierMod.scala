package typings.operationRetrier

import typings.node.eventsMod.EventEmitter
import typings.operationRetrier.anon.Initial
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retrierMod {
  
  /**
    * Provides retrier service
    */
  @JSImport("operation-retrier/lib/retrier", JSImport.Default)
  @js.native
  class default protected () extends Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
  }
  
  /**
    * Provides retrier service
    */
  @JSImport("operation-retrier/lib/retrier", "Retrier")
  @js.native
  class Retrier protected () extends EventEmitter {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
    
    /* private */ var attempt: js.Any = js.native
    
    /* private */ var attemptNum: js.Any = js.native
    
    def cancel(): Unit = js.native
    
    /* private */ var cleanup: js.Any = js.native
    
    /* private */ var currDelay: js.Any = js.native
    
    def failed(err: Error): Unit = js.native
    def failed(err: Error, nextAttemptDelayOverride: Double): Unit = js.native
    
    /* private */ var inProgress: js.Any = js.native
    
    /* private */ val initialDelay: js.Any = js.native
    
    /* private */ val maxAttemptsCount: js.Any = js.native
    
    /* private */ val maxAttemptsTime: js.Any = js.native
    
    /* private */ var maxDelay: js.Any = js.native
    
    /* private */ val minDelay: js.Any = js.native
    
    /* private */ var nextDelay: js.Any = js.native
    
    /* private */ var prevDelay: js.Any = js.native
    
    /* private */ var randomize: js.Any = js.native
    
    /* private */ val randomness: js.Any = js.native
    
    /* private */ var reject: js.Any = js.native
    
    /* private */ var resolve: js.Any = js.native
    
    def run[T](handler: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /* private */ var scheduleAttempt: js.Any = js.native
    
    def start(): js.Promise[js.Any] = js.native
    
    /* private */ var startTimestamp: js.Any = js.native
    
    def succeeded(): Unit = js.native
    def succeeded(arg: js.Any): Unit = js.native
    
    /* private */ var timeout: js.Any = js.native
  }
}
