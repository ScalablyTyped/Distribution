package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeHueApi.nodeHueApiStrings.idle
  - typings.nodeHueApi.nodeHueApiStrings.startmigration
  - typings.nodeHueApi.nodeHueApiStrings.fileready_disabled
  - typings.nodeHueApi.nodeHueApiStrings.prepare_restore
  - typings.nodeHueApi.nodeHueApiStrings.restoring
*/
trait BackupStatus extends js.Object

object BackupStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fileready_disabled: typings.nodeHueApi.nodeHueApiStrings.fileready_disabled = this.cast("fileready_disabled")
  @scala.inline
  def idle: typings.nodeHueApi.nodeHueApiStrings.idle = this.cast("idle")
  @scala.inline
  def prepare_restore: typings.nodeHueApi.nodeHueApiStrings.prepare_restore = this.cast("prepare_restore")
  @scala.inline
  def restoring: typings.nodeHueApi.nodeHueApiStrings.restoring = this.cast("restoring")
  @scala.inline
  def startmigration: typings.nodeHueApi.nodeHueApiStrings.startmigration = this.cast("startmigration")
}

