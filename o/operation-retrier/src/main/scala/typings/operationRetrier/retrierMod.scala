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
    
    var attempt: js.Any = js.native
    
    var attemptNum: js.Any = js.native
    
    def cancel(): Unit = js.native
    
    var cleanup: js.Any = js.native
    
    var currDelay: js.Any = js.native
    
    def failed(err: Error): Unit = js.native
    def failed(err: Error, nextAttemptDelayOverride: Double): Unit = js.native
    
    var inProgress: js.Any = js.native
    
    val initialDelay: js.Any = js.native
    
    val maxAttemptsCount: js.Any = js.native
    
    val maxAttemptsTime: js.Any = js.native
    
    var maxDelay: js.Any = js.native
    
    val minDelay: js.Any = js.native
    
    var nextDelay: js.Any = js.native
    
    var prevDelay: js.Any = js.native
    
    var randomize: js.Any = js.native
    
    val randomness: js.Any = js.native
    
    var reject: js.Any = js.native
    
    var resolve: js.Any = js.native
    
    def run[T](handler: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    var scheduleAttempt: js.Any = js.native
    
    def start(): js.Promise[js.Any] = js.native
    
    var startTimestamp: js.Any = js.native
    
    def succeeded(): Unit = js.native
    def succeeded(arg: js.Any): Unit = js.native
    
    var timeout: js.Any = js.native
  }
}
