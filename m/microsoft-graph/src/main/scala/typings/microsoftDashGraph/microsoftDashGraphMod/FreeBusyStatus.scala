package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.free
  - typings.microsoftDashGraph.microsoftDashGraphStrings.tentative
  - typings.microsoftDashGraph.microsoftDashGraphStrings.busy
  - typings.microsoftDashGraph.microsoftDashGraphStrings.oof
  - typings.microsoftDashGraph.microsoftDashGraphStrings.workingElsewhere
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
*/
trait FreeBusyStatus extends js.Object

object FreeBusyStatus {
  @scala.inline
  def busy: typings.microsoftDashGraph.microsoftDashGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def free: typings.microsoftDashGraph.microsoftDashGraphStrings.free = this.cast("free")
  @scala.inline
  def oof: typings.microsoftDashGraph.microsoftDashGraphStrings.oof = this.cast("oof")
  @scala.inline
  def tentative: typings.microsoftDashGraph.microsoftDashGraphStrings.tentative = this.cast("tentative")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def workingElsewhere: typings.microsoftDashGraph.microsoftDashGraphStrings.workingElsewhere = this.cast("workingElsewhere")
}

