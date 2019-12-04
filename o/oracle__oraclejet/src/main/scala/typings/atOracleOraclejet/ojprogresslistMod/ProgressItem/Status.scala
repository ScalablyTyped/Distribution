package typings.atOracleOraclejet.ojprogresslistMod.ProgressItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atOracleOraclejet.atOracleOraclejetStrings.queued
  - typings.atOracleOraclejet.atOracleOraclejetStrings.loadstarted
  - typings.atOracleOraclejet.atOracleOraclejetStrings.aborted
  - typings.atOracleOraclejet.atOracleOraclejetStrings.errored
  - typings.atOracleOraclejet.atOracleOraclejetStrings.timedout
  - typings.atOracleOraclejet.atOracleOraclejetStrings.loaded
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def aborted: typings.atOracleOraclejet.atOracleOraclejetStrings.aborted = this.cast("aborted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errored: typings.atOracleOraclejet.atOracleOraclejetStrings.errored = this.cast("errored")
  @scala.inline
  def loaded: typings.atOracleOraclejet.atOracleOraclejetStrings.loaded = this.cast("loaded")
  @scala.inline
  def loadstarted: typings.atOracleOraclejet.atOracleOraclejetStrings.loadstarted = this.cast("loadstarted")
  @scala.inline
  def queued: typings.atOracleOraclejet.atOracleOraclejetStrings.queued = this.cast("queued")
  @scala.inline
  def timedout: typings.atOracleOraclejet.atOracleOraclejetStrings.timedout = this.cast("timedout")
}

