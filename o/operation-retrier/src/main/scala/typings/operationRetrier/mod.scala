package typings.operationRetrier

import typings.operationRetrier.anon.Initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("operation-retrier", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Backoff protected ()
    extends typings.operationRetrier.backoffMod.Backoff {
    def this(options: js.Any) = this()
  }
  /* static members */
  @js.native
  object Backoff extends js.Object {
    
    def exponential(options: js.Any): typings.operationRetrier.backoffMod.Backoff = js.native
  }
  
  /**
    * Provides retrier service
    */
  @js.native
  class Retrier protected ()
    extends typings.operationRetrier.retrierMod.Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
  }
  
  /**
    * Provides retrier service
    */
  @js.native
  class default protected ()
    extends typings.operationRetrier.retrierMod.Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
  }
}
