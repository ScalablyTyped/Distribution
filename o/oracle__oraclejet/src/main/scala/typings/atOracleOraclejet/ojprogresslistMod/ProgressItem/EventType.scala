package typings.atOracleOraclejet.ojprogresslistMod.ProgressItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atOracleOraclejet.atOracleOraclejetStrings.loadstart
  - typings.atOracleOraclejet.atOracleOraclejetStrings.progress
  - typings.atOracleOraclejet.atOracleOraclejetStrings.abort
  - typings.atOracleOraclejet.atOracleOraclejetStrings.error
  - typings.atOracleOraclejet.atOracleOraclejetStrings.load
  - typings.atOracleOraclejet.atOracleOraclejetStrings.timeout
  - typings.atOracleOraclejet.atOracleOraclejetStrings.loadend
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def abort: typings.atOracleOraclejet.atOracleOraclejetStrings.abort = this.cast("abort")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.atOracleOraclejet.atOracleOraclejetStrings.error = this.cast("error")
  @scala.inline
  def load: typings.atOracleOraclejet.atOracleOraclejetStrings.load = this.cast("load")
  @scala.inline
  def loadend: typings.atOracleOraclejet.atOracleOraclejetStrings.loadend = this.cast("loadend")
  @scala.inline
  def loadstart: typings.atOracleOraclejet.atOracleOraclejetStrings.loadstart = this.cast("loadstart")
  @scala.inline
  def progress: typings.atOracleOraclejet.atOracleOraclejetStrings.progress = this.cast("progress")
  @scala.inline
  def timeout: typings.atOracleOraclejet.atOracleOraclejetStrings.timeout = this.cast("timeout")
}

