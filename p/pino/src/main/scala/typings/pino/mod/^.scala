package typings.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pino", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @param [optionsOrStream]: an options object or a writable stream where the logs will be written. It can also receive some log-line metadata, if the
    * relative protocol is enabled. Default: process.stdout
    * @returns a new logger instance.
    */
  def apply(): Logger = js.native
  def apply(optionsOrStream: DestinationStream): Logger = js.native
  def apply(optionsOrStream: LoggerOptions): Logger = js.native
  /**
    * @param [options]: an options object
    * @param [stream]: a writable stream where the logs will be written. It can also receive some log-line metadata, if the
    * relative protocol is enabled. Default: process.stdout
    * @returns a new logger instance.
    */
  def apply(options: LoggerOptions, stream: DestinationStream): Logger = js.native
}
