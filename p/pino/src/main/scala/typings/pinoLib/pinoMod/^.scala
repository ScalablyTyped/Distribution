package typings
package pinoLib.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Holds the current log format version (as output in the v property of each log record).
    */
  val LOG_VERSION: scala.Double = js.native
  val levels: LevelMapping = js.native
  /**
    * @param [optionsOrStream]: an options object or a writable stream where the logs will be written. It can also receive some log-line metadata, if the
    * relative protocol is enabled. Default: process.stdout
    * @returns a new logger instance.
    */
  def apply(): Logger = js.native
  def apply(optionsOrStream: LoggerOptions | DestinationStream): Logger = js.native
  /**
    * @param [options]: an options object
    * @param [stream]: a writable stream where the logs will be written. It can also receive some log-line metadata, if the
    * relative protocol is enabled. Default: process.stdout
    * @returns a new logger instance.
    */
  def apply(options: LoggerOptions, stream: DestinationStream): Logger = js.native
  /**
    * Create a Pino Destination instance: a stream-like object with significantly more throughput (over 30%) than a standard Node.js stream.
    * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
    * @returns A Sonic-Boom  stream to be used as destination for the pino function
    */
  def destination(): sonicDashBoomLib.sonicDashBoomMod.^ = js.native
  def destination(fileDescriptor: java.lang.String): sonicDashBoomLib.sonicDashBoomMod.^ = js.native
  def destination(fileDescriptor: scala.Double): sonicDashBoomLib.sonicDashBoomMod.^ = js.native
  /**
    * Create an extreme mode destination. This yields an additional 60% performance boost.
    * There are trade-offs that should be understood before usage.
    * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
    * @returns A Sonic-Boom  stream to be used as destination for the pino function
    */
  def extreme(): sonicDashBoomLib.sonicDashBoomMod.^ = js.native
  def extreme(fileDescriptor: java.lang.String): sonicDashBoomLib.sonicDashBoomMod.^ = js.native
  def extreme(fileDescriptor: scala.Double): sonicDashBoomLib.sonicDashBoomMod.^ = js.native
  /**
    * The pino.final method can be used to acquire a final logger instance that synchronously flushes on every write.
    * @param [logger]: pino logger that serves as reference for the final logger
    * @returns Final, synchronous logger
    */
  def `final`(logger: Logger): Logger = js.native
  /**
    * The pino.final method can be used to create an exit listener function.
    * This listener function can be supplied to process exit events.
    * The exit listener function will cal the handler with
    * @param [logger]: pino logger that serves as reference for the final logger
    * @param [handler]: Function that will be called by the handler returned from this function
    * @returns Exit listener function that can be supplied to process exit events and will call the supplied handler function
    */
  def `final`(
    logger: Logger,
    handler: js.Function3[/* error */ stdLib.Error, /* finalLogger */ Logger, /* repeated */ js.Any, scala.Unit]
  ): js.Function2[/* error */ stdLib.Error | scala.Null, /* repeated */ js.Any, scala.Unit] = js.native
}

