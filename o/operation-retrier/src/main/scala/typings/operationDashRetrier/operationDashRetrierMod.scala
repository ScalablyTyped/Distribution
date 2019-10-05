package typings.operationDashRetrier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("operation-retrier", JSImport.Namespace)
@js.native
object operationDashRetrierMod extends js.Object {
  @js.native
  class Backoff protected ()
    extends typings.operationDashRetrier.libBackoffMod.Backoff {
    def this(options: js.Any) = this()
  }
  
  /**
    * Provides retrier service
    */
  @js.native
  class Retrier protected ()
    extends typings.operationDashRetrier.libRetrierMod.Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Anon_Initial) = this()
  }
  
  /**
    * Provides retrier service
    */
  @js.native
  class default protected ()
    extends typings.operationDashRetrier.libRetrierMod.Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Anon_Initial) = this()
  }
  
  /* static members */
  @js.native
  object Backoff extends js.Object {
    def exponential(options: js.Any): typings.operationDashRetrier.libBackoffMod.Backoff = js.native
  }
  
}

