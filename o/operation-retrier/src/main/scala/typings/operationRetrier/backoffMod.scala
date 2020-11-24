package typings.operationRetrier

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("operation-retrier/lib/backoff", JSImport.Namespace)
@js.native
object backoffMod extends js.Object {
  
  @js.native
  class Backoff protected () extends EventEmitter {
    def this(options: js.Any) = this()
    
    def backoff(): Unit = js.native
    def backoff(err: js.Any): Unit = js.native
    
    var backoffDelay: js.Any = js.native
    
    var backoffNumber: js.Any = js.native
    
    val factor: js.Any = js.native
    
    def failAfter(maxNumberOfRetry: js.Any): Unit = js.native
    
    val initialDelay: js.Any = js.native
    
    val maxDelay: js.Any = js.native
    
    var maxNumberOfRetry: js.Any = js.native
    
    def next(): Double = js.native
    
    var nextBackoffDelay: js.Any = js.native
    
    def onBackoff(): Unit = js.native
    
    val randomisationFactor: js.Any = js.native
    
    def reset(): Unit = js.native
    
    var timeoutID: js.Any = js.native
  }
  /* static members */
  @js.native
  object Backoff extends js.Object {
    
    def exponential(options: js.Any): Backoff = js.native
  }
  
  @js.native
  class default protected () extends Backoff {
    def this(options: js.Any) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def exponential(options: js.Any): Backoff = js.native
  }
}
