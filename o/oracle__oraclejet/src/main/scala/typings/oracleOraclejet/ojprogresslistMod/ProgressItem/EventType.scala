package typings.oracleOraclejet.ojprogresslistMod.ProgressItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.oracleOraclejetStrings.loadstart
  - typings.oracleOraclejet.oracleOraclejetStrings.progress
  - typings.oracleOraclejet.oracleOraclejetStrings.abort
  - typings.oracleOraclejet.oracleOraclejetStrings.error
  - typings.oracleOraclejet.oracleOraclejetStrings.load
  - typings.oracleOraclejet.oracleOraclejetStrings.timeout
  - typings.oracleOraclejet.oracleOraclejetStrings.loadend
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def abort: typings.oracleOraclejet.oracleOraclejetStrings.abort = this.cast("abort")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.oracleOraclejet.oracleOraclejetStrings.error = this.cast("error")
  @scala.inline
  def load: typings.oracleOraclejet.oracleOraclejetStrings.load = this.cast("load")
  @scala.inline
  def loadend: typings.oracleOraclejet.oracleOraclejetStrings.loadend = this.cast("loadend")
  @scala.inline
  def loadstart: typings.oracleOraclejet.oracleOraclejetStrings.loadstart = this.cast("loadstart")
  @scala.inline
  def progress: typings.oracleOraclejet.oracleOraclejetStrings.progress = this.cast("progress")
  @scala.inline
  def timeout: typings.oracleOraclejet.oracleOraclejetStrings.timeout = this.cast("timeout")
}

