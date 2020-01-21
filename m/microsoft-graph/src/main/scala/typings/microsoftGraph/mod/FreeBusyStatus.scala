package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.free
  - typings.microsoftGraph.microsoftGraphStrings.tentative
  - typings.microsoftGraph.microsoftGraphStrings.busy
  - typings.microsoftGraph.microsoftGraphStrings.oof
  - typings.microsoftGraph.microsoftGraphStrings.workingElsewhere
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait FreeBusyStatus extends js.Object

object FreeBusyStatus {
  @scala.inline
  def busy: typings.microsoftGraph.microsoftGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def free: typings.microsoftGraph.microsoftGraphStrings.free = this.cast("free")
  @scala.inline
  def oof: typings.microsoftGraph.microsoftGraphStrings.oof = this.cast("oof")
  @scala.inline
  def tentative: typings.microsoftGraph.microsoftGraphStrings.tentative = this.cast("tentative")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def workingElsewhere: typings.microsoftGraph.microsoftGraphStrings.workingElsewhere = this.cast("workingElsewhere")
}

