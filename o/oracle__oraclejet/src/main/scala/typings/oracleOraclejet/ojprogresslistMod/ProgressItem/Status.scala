package typings.oracleOraclejet.ojprogresslistMod.ProgressItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.oracleOraclejetStrings.queued
  - typings.oracleOraclejet.oracleOraclejetStrings.loadstarted
  - typings.oracleOraclejet.oracleOraclejetStrings.aborted
  - typings.oracleOraclejet.oracleOraclejetStrings.errored
  - typings.oracleOraclejet.oracleOraclejetStrings.timedout
  - typings.oracleOraclejet.oracleOraclejetStrings.loaded
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def aborted: typings.oracleOraclejet.oracleOraclejetStrings.aborted = this.cast("aborted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errored: typings.oracleOraclejet.oracleOraclejetStrings.errored = this.cast("errored")
  @scala.inline
  def loaded: typings.oracleOraclejet.oracleOraclejetStrings.loaded = this.cast("loaded")
  @scala.inline
  def loadstarted: typings.oracleOraclejet.oracleOraclejetStrings.loadstarted = this.cast("loadstarted")
  @scala.inline
  def queued: typings.oracleOraclejet.oracleOraclejetStrings.queued = this.cast("queued")
  @scala.inline
  def timedout: typings.oracleOraclejet.oracleOraclejetStrings.timedout = this.cast("timedout")
}

