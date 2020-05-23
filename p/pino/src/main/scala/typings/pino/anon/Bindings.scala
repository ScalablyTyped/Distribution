package typings.pino.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bindings extends js.Object {
  /**
    * Changes the shape of the bindings.
    * The default shape is { pid, hostname }.
    * The function takes a single argument, the bindings object.
    * It will be called every time a child logger is created.
    */
  var bindings: js.UndefOr[js.Function1[/* bindings */ typings.pino.mod.Bindings, js.Object]] = js.undefined
  /**
    * Changes the shape of the log level.
    * The default shape is { level: number }.
    * The function takes two arguments, the label of the level (e.g. 'info') and the numeric value (e.g. 30).
    */
  var level: js.UndefOr[js.Function2[/* level */ String, /* number */ Double, js.Object]] = js.undefined
  /**
    * Changes the shape of the log object.
    * This function will be called every time one of the log methods (such as .info) is called.
    * All arguments passed to the log method, except the message, will be pass to this function.
    * By default it does not change the shape of the log object.
    */
  var log: js.UndefOr[js.Function1[/* object */ js.Object, js.Object]] = js.undefined
}

object Bindings {
  @scala.inline
  def apply(
    bindings: /* bindings */ typings.pino.mod.Bindings => js.Object = null,
    level: (/* level */ String, /* number */ Double) => js.Object = null,
    log: /* object */ js.Object => js.Object = null
  ): Bindings = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(js.Any.fromFunction1(bindings))
    if (level != null) __obj.updateDynamic("level")(js.Any.fromFunction2(level))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    __obj.asInstanceOf[Bindings]
  }
}

