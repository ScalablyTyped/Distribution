package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.failed_
import typings.mendixmodelsdk.mendixmodelsdkStrings.started_
import typings.mendixmodelsdk.mendixmodelsdkStrings.updating_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.mendixmodelsdkStrings.updating_
  - typings.mendixmodelsdk.mendixmodelsdkStrings.resuming
  - typings.mendixmodelsdk.mendixmodelsdkStrings.provisioning
  - typings.mendixmodelsdk.mendixmodelsdkStrings.started_
  - typings.mendixmodelsdk.mendixmodelsdkStrings.consistencyerrors
  - typings.mendixmodelsdk.mendixmodelsdkStrings.failed_
*/
trait IUpdateAppJobStatus extends js.Object

object IUpdateAppJobStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def consistencyerrors: typings.mendixmodelsdk.mendixmodelsdkStrings.consistencyerrors = this.cast("consistencyerrors")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def provisioning: typings.mendixmodelsdk.mendixmodelsdkStrings.provisioning = this.cast("provisioning")
  @scala.inline
  def resuming: typings.mendixmodelsdk.mendixmodelsdkStrings.resuming = this.cast("resuming")
  @scala.inline
  def started: started_ = this.cast("started")
  @scala.inline
  def updating: updating_ = this.cast("updating")
}

