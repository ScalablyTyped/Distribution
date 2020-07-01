package typings.pino.anon

import typings.pino.mod.LogFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMethod extends js.Object {
  /**
    * Allows for manipulating the parameters passed to logger methods. The signature for this hook is
    * logMethod (args, method) {}, where args is an array of the arguments that were passed to the
    * log method and method is the log method itself. This hook must invoke the method function by
    * using apply, like so: method.apply(this, newArgumentsArray).
    */
  var logMethod: js.UndefOr[js.Function2[/* args */ js.Array[_], /* method */ LogFn, Unit]] = js.undefined
}

object LogMethod {
  @scala.inline
  def apply(logMethod: (/* args */ js.Array[_], /* method */ LogFn) => Unit = null): LogMethod = {
    val __obj = js.Dynamic.literal()
    if (logMethod != null) __obj.updateDynamic("logMethod")(js.Any.fromFunction2(logMethod))
    __obj.asInstanceOf[LogMethod]
  }
}

