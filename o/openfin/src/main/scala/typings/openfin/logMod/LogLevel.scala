package typings.openfin.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.openfinStrings.verbose
  - typings.openfin.openfinStrings.info
  - typings.openfin.openfinStrings.warning
  - typings.openfin.openfinStrings.error
  - typings.openfin.openfinStrings.fatal
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.openfin.openfinStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.openfin.openfinStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.openfin.openfinStrings.info = this.cast("info")
  @scala.inline
  def verbose: typings.openfin.openfinStrings.verbose = this.cast("verbose")
  @scala.inline
  def warning: typings.openfin.openfinStrings.warning = this.cast("warning")
}

