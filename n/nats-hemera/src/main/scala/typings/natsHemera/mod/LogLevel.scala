package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.natsHemera.natsHemeraStrings.fatal
  - typings.natsHemera.natsHemeraStrings.error
  - typings.natsHemera.natsHemeraStrings.warn
  - typings.natsHemera.natsHemeraStrings.info
  - typings.natsHemera.natsHemeraStrings.debug
  - typings.natsHemera.natsHemeraStrings.trace
  - typings.natsHemera.natsHemeraStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.natsHemera.natsHemeraStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.natsHemera.natsHemeraStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.natsHemera.natsHemeraStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.natsHemera.natsHemeraStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.natsHemera.natsHemeraStrings.silent = this.cast("silent")
  @scala.inline
  def trace: typings.natsHemera.natsHemeraStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.natsHemera.natsHemeraStrings.warn = this.cast("warn")
}

