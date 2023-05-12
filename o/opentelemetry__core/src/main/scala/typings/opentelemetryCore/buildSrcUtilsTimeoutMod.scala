package typings.opentelemetryCore

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsTimeoutMod {
  
  @JSImport("@opentelemetry/core/build/src/utils/timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/utils/timeout", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def callWithTimeout[T](promise: js.Promise[T], timeout: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithTimeout")(promise.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
