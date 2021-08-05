package typings.operationRetrier

import typings.operationRetrier.anon.Initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Provides retrier service
    */
  @JSImport("operation-retrier", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.operationRetrier.retrierMod.Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
  }
  
  @JSImport("operation-retrier", "Backoff")
  @js.native
  class Backoff protected ()
    extends typings.operationRetrier.backoffMod.Backoff {
    def this(options: js.Any) = this()
  }
  object Backoff {
    
    @JSImport("operation-retrier", "Backoff")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def exponential(options: js.Any): typings.operationRetrier.backoffMod.Backoff = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")(options.asInstanceOf[js.Any]).asInstanceOf[typings.operationRetrier.backoffMod.Backoff]
  }
  
  /**
    * Provides retrier service
    */
  @JSImport("operation-retrier", "Retrier")
  @js.native
  class Retrier protected ()
    extends typings.operationRetrier.retrierMod.Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
  }
}
