package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.idle
  - typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.startmigration
  - typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.fileready_disabled
  - typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.prepare_restore
  - typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.restoring
*/
trait BackupStatus extends js.Object

object BackupStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fileready_disabled: typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.fileready_disabled = this.cast("fileready_disabled")
  @scala.inline
  def idle: typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.idle = this.cast("idle")
  @scala.inline
  def prepare_restore: typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.prepare_restore = this.cast("prepare_restore")
  @scala.inline
  def restoring: typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.restoring = this.cast("restoring")
  @scala.inline
  def startmigration: typings.nodeDashHueDashApi.nodeDashHueDashApiStrings.startmigration = this.cast("startmigration")
}

