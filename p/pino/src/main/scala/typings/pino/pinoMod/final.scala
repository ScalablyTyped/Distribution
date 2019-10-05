package typings.pino.pinoMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino", "final")
@js.native
object `final` extends js.Object {
  /**
    * The pino.final method can be used to acquire a final logger instance that synchronously flushes on every write.
    * @param [logger]: pino logger that serves as reference for the final logger
    * @returns Final, synchronous logger
    */
  def apply(logger: Logger): Logger = js.native
  /**
    * The pino.final method can be used to create an exit listener function.
    * This listener function can be supplied to process exit events.
    * The exit listener function will cal the handler with
    * @param [logger]: pino logger that serves as reference for the final logger
    * @param [handler]: Function that will be called by the handler returned from this function
    * @returns Exit listener function that can be supplied to process exit events and will call the supplied handler function
    */
  def apply(
    logger: Logger,
    handler: js.Function3[/* error */ Error, /* finalLogger */ Logger, /* repeated */ js.Any, Unit]
  ): js.Function2[/* error */ Error | Null, /* repeated */ js.Any, Unit] = js.native
}

