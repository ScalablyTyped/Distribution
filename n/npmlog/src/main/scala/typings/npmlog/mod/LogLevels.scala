package typings.npmlog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.npmlog.npmlogStrings.silly
  - typings.npmlog.npmlogStrings.verbose
  - typings.npmlog.npmlogStrings.info
  - typings.npmlog.npmlogStrings.timing
  - typings.npmlog.npmlogStrings.http
  - typings.npmlog.npmlogStrings.notice
  - typings.npmlog.npmlogStrings.warn
  - typings.npmlog.npmlogStrings.error
  - typings.npmlog.npmlogStrings.silent
*/
trait LogLevels extends js.Object

object LogLevels {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.npmlog.npmlogStrings.error = this.cast("error")
  @scala.inline
  def http: typings.npmlog.npmlogStrings.http = this.cast("http")
  @scala.inline
  def info: typings.npmlog.npmlogStrings.info = this.cast("info")
  @scala.inline
  def notice: typings.npmlog.npmlogStrings.notice = this.cast("notice")
  @scala.inline
  def silent: typings.npmlog.npmlogStrings.silent = this.cast("silent")
  @scala.inline
  def silly: typings.npmlog.npmlogStrings.silly = this.cast("silly")
  @scala.inline
  def timing: typings.npmlog.npmlogStrings.timing = this.cast("timing")
  @scala.inline
  def verbose: typings.npmlog.npmlogStrings.verbose = this.cast("verbose")
  @scala.inline
  def warn: typings.npmlog.npmlogStrings.warn = this.cast("warn")
}

