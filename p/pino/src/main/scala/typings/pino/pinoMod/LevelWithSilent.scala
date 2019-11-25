package typings.pino.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pino.pinoStrings.silent
  - typings.pino.pinoStrings.fatal
  - typings.pino.pinoStrings.error
  - typings.pino.pinoStrings.warn
  - typings.pino.pinoStrings.info
  - typings.pino.pinoStrings.debug
  - typings.pino.pinoStrings.trace
*/
trait LevelWithSilent extends js.Object

object LevelWithSilent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.pino.pinoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.pino.pinoStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.pino.pinoStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.pino.pinoStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.pino.pinoStrings.silent = this.cast("silent")
  @scala.inline
  def trace: typings.pino.pinoStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.pino.pinoStrings.warn = this.cast("warn")
}

