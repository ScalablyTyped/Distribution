package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.natsDashHemera.natsDashHemeraStrings.fatal
  - typings.natsDashHemera.natsDashHemeraStrings.error
  - typings.natsDashHemera.natsDashHemeraStrings.warn
  - typings.natsDashHemera.natsDashHemeraStrings.info
  - typings.natsDashHemera.natsDashHemeraStrings.debug
  - typings.natsDashHemera.natsDashHemeraStrings.trace
  - typings.natsDashHemera.natsDashHemeraStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.natsDashHemera.natsDashHemeraStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.natsDashHemera.natsDashHemeraStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.natsDashHemera.natsDashHemeraStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.natsDashHemera.natsDashHemeraStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.natsDashHemera.natsDashHemeraStrings.silent = this.cast("silent")
  @scala.inline
  def trace: typings.natsDashHemera.natsDashHemeraStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.natsDashHemera.natsDashHemeraStrings.warn = this.cast("warn")
}

