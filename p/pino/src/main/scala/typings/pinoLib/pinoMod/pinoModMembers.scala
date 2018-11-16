package typings
package pinoLib.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino", JSImport.Namespace)
@js.native
object pinoModMembers extends js.Object {
  /**
       * Holds the current log format version (as output in the v property of each log record).
       */
  val LOG_VERSION: scala.Double = js.native
  val levels: pinoLib.pinoMod.PNs.LevelMapping = js.native
  /**
       * Provides functions for serializing objects common to many projects.
       */
  val stdSerializers: pinoLib.Anon_Req = js.native
  /**
       * Provides functions for generating the timestamp property in the log output. You can set the `timestamp` option during
       * initialization to one of these functions to adjust the output format. Alternatively, you can specify your own time function.
       * A time function must synchronously return a string that would be a valid component of a JSON string. For example,
       * the default function returns a string like `,"time":1493426328206`.
       */
  val stdTimeFunctions: pinoLib.Anon_NullTime = js.native
  /**
   * @param [optionsOrStream]: an options object or a writable stream where the logs will be written. It can also receive some log-line metadata, if the
   * relative protocol is enabled. Default: process.stdout
   * @returns a new logger instance.
   */
  def apply(): pinoLib.pinoMod.PNs.Logger = js.native
  /**
   * @param [optionsOrStream]: an options object or a writable stream where the logs will be written. It can also receive some log-line metadata, if the
   * relative protocol is enabled. Default: process.stdout
   * @returns a new logger instance.
   */
  def apply(
    optionsOrStream: pinoLib.pinoMod.PNs.LoggerOptions | nodeLib.streamMod.Writable | nodeLib.streamMod.Duplex | nodeLib.streamMod.Transform | nodeLib.NodeJSNs.WritableStream | sonicDashBoomLib.sonicDashBoomMod.namespaced
  ): pinoLib.pinoMod.PNs.Logger = js.native
  /**
   * @param [options]: an options object
   * @param [stream]: a writable stream where the logs will be written. It can also receive some log-line metadata, if the
   * relative protocol is enabled. Default: process.stdout
   * @returns a new logger instance.
   */
  def apply(
    options: pinoLib.pinoMod.PNs.LoggerOptions,
    stream: nodeLib.streamMod.Writable | nodeLib.streamMod.Duplex | nodeLib.streamMod.Transform | nodeLib.NodeJSNs.WritableStream | sonicDashBoomLib.sonicDashBoomMod.namespaced
  ): pinoLib.pinoMod.PNs.Logger = js.native
  /**
       * Create a Pino Destination instance: a stream-like object with significantly more throughput (over 30%) than a standard Node.js stream.
       * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
       * @returns A Sonic-Boom  stream to be used as destination for the pino function
       */
  def destination(): sonicDashBoomLib.sonicDashBoomMod.namespaced = js.native
  /**
       * Create a Pino Destination instance: a stream-like object with significantly more throughput (over 30%) than a standard Node.js stream.
       * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
       * @returns A Sonic-Boom  stream to be used as destination for the pino function
       */
  def destination(fileDescriptor: java.lang.String): sonicDashBoomLib.sonicDashBoomMod.namespaced = js.native
  /**
       * Create a Pino Destination instance: a stream-like object with significantly more throughput (over 30%) than a standard Node.js stream.
       * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
       * @returns A Sonic-Boom  stream to be used as destination for the pino function
       */
  def destination(fileDescriptor: scala.Double): sonicDashBoomLib.sonicDashBoomMod.namespaced = js.native
  /**
       * Create an extreme mode destination. This yields an additional 60% performance boost.
       * There are trade-offs that should be understood before usage.
       * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
       * @returns A Sonic-Boom  stream to be used as destination for the pino function
       */
  def extreme(): sonicDashBoomLib.sonicDashBoomMod.namespaced = js.native
  /**
       * Create an extreme mode destination. This yields an additional 60% performance boost.
       * There are trade-offs that should be understood before usage.
       * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
       * @returns A Sonic-Boom  stream to be used as destination for the pino function
       */
  def extreme(fileDescriptor: java.lang.String): sonicDashBoomLib.sonicDashBoomMod.namespaced = js.native
  /**
       * Create an extreme mode destination. This yields an additional 60% performance boost.
       * There are trade-offs that should be understood before usage.
       * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
       * @returns A Sonic-Boom  stream to be used as destination for the pino function
       */
  def extreme(fileDescriptor: scala.Double): sonicDashBoomLib.sonicDashBoomMod.namespaced = js.native
  /**
       * The pino.final method can be used to acquire a final logger instance that synchronously flushes on every write.
       * @param [logger]: pino logger that serves as reference for the final logger
       * @returns Final, synchronous logger
       */
  def `final`(logger: pinoLib.pinoMod.PNs.Logger): pinoLib.pinoMod.PNs.Logger = js.native
  /**
       * The pino.final method can be used to create an exit listener function.
       * This listener function can be supplied to process exit events.
       * The exit listener function will cal the handler with
       * @param [logger]: pino logger that serves as reference for the final logger
       * @param [handler]: Function that will be called by the handler returned from this function
       * @returns Exit listener function that can be supplied to process exit events and will call the supplied handler function
       */
  def `final`(
    logger: pinoLib.pinoMod.PNs.Logger,
    handler: js.Function3[
      /* error */ nodeLib.Error, 
      /* finalLogger */ pinoLib.pinoMod.PNs.Logger, 
      /* repeated */js.Any, 
      scala.Unit
    ]
  ): js.Function2[/* error */ nodeLib.Error | scala.Null, /* repeated */js.Any, scala.Unit] = js.native
}

