package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.mendixmodelsdkStrings.APP_NOT_FOUND
  - typings.mendixmodelsdk.mendixmodelsdkStrings.STAGING
  - typings.mendixmodelsdk.mendixmodelsdkStrings.UPDATING
  - typings.mendixmodelsdk.mendixmodelsdkStrings.STARTING
  - typings.mendixmodelsdk.mendixmodelsdkStrings.FAILED_STAGING
  - typings.mendixmodelsdk.mendixmodelsdkStrings.FAILED
  - typings.mendixmodelsdk.mendixmodelsdkStrings.STARTED
  - typings.mendixmodelsdk.mendixmodelsdkStrings.MXBUILD_STARTED
  - typings.mendixmodelsdk.mendixmodelsdkStrings.STOPPED
*/
trait SuccessAppState extends js.Object

object SuccessAppState {
  @scala.inline
  def APP_NOT_FOUND: typings.mendixmodelsdk.mendixmodelsdkStrings.APP_NOT_FOUND = this.cast("APP_NOT_FOUND")
  @scala.inline
  def FAILED: typings.mendixmodelsdk.mendixmodelsdkStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def FAILED_STAGING: typings.mendixmodelsdk.mendixmodelsdkStrings.FAILED_STAGING = this.cast("FAILED_STAGING")
  @scala.inline
  def MXBUILD_STARTED: typings.mendixmodelsdk.mendixmodelsdkStrings.MXBUILD_STARTED = this.cast("MXBUILD_STARTED")
  @scala.inline
  def STAGING: typings.mendixmodelsdk.mendixmodelsdkStrings.STAGING = this.cast("STAGING")
  @scala.inline
  def STARTED: typings.mendixmodelsdk.mendixmodelsdkStrings.STARTED = this.cast("STARTED")
  @scala.inline
  def STARTING: typings.mendixmodelsdk.mendixmodelsdkStrings.STARTING = this.cast("STARTING")
  @scala.inline
  def STOPPED: typings.mendixmodelsdk.mendixmodelsdkStrings.STOPPED = this.cast("STOPPED")
  @scala.inline
  def UPDATING: typings.mendixmodelsdk.mendixmodelsdkStrings.UPDATING = this.cast("UPDATING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

