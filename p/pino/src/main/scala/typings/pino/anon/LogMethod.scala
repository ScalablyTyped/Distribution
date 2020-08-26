package typings.pino.anon

import typings.pino.mod.LogFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMethod extends js.Object {
  /**
    * Allows for manipulating the parameters passed to logger methods. The signature for this hook is
    * logMethod (args, method) {}, where args is an array of the arguments that were passed to the
    * log method and method is the log method itself. This hook must invoke the method function by
    * using apply, like so: method.apply(this, newArgumentsArray).
    */
  var logMethod: js.UndefOr[js.Function2[/* args */ js.Array[_], /* method */ LogFn, Unit]] = js.native
}

object LogMethod {
  @scala.inline
  def apply(): LogMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogMethod]
  }
  @scala.inline
  implicit class LogMethodOps[Self <: LogMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogMethod(value: (/* args */ js.Array[_], /* method */ LogFn) => Unit): Self = this.set("logMethod", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLogMethod: Self = this.set("logMethod", js.undefined)
  }
  
}

