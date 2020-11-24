package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.PromiseConstructor
import typings.minappEnv.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Promise")
@js.native
class Promise[T] protected ()
  extends typings.minappEnv.Promise[T] {
  /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}
@JSGlobal("Promise")
@js.native
object Promise extends TopLevel[PromiseConstructor]
