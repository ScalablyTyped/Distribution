package typings.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nock.nockStrings.wild
  - typings.nock.nockStrings.dryrun
  - typings.nock.nockStrings.record
  - typings.nock.nockStrings.lockdown
*/
trait BackMode extends js.Object

object BackMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dryrun: typings.nock.nockStrings.dryrun = this.cast("dryrun")
  @scala.inline
  def lockdown: typings.nock.nockStrings.lockdown = this.cast("lockdown")
  @scala.inline
  def record: typings.nock.nockStrings.record = this.cast("record")
  @scala.inline
  def wild: typings.nock.nockStrings.wild = this.cast("wild")
}

