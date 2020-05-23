package typings.officeJsPreview.global.Office

import org.scalablytyped.runtime.TopLevel
import typings.officeJsPreview.Office.IPromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Promise")
@js.native
class Promise[T] protected ()
  extends typings.std.Promise[T] {
  /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}

/** A Promise object. Promises can be chained via ".then", and errors can be caught via ".catch".
  * When a browser-provided native Promise implementation is available, Office.Promise will switch to use the native Promise instead.
  */
@JSGlobal("Office.Promise")
@js.native
object Promise extends TopLevel[IPromiseConstructor]

