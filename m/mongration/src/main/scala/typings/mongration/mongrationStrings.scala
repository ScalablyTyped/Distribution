package typings.mongration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mongrationStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait `not-run` extends js.Object
  
  @js.native
  sealed trait ok extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait rollback extends js.Object
  
  @js.native
  sealed trait `rollback-error` extends js.Object
  
  @js.native
  sealed trait skipped extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def `not-run`: `not-run` = "not-run".asInstanceOf[`not-run`]
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def rollback: rollback = "rollback".asInstanceOf[rollback]
  @scala.inline
  def `rollback-error`: `rollback-error` = "rollback-error".asInstanceOf[`rollback-error`]
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
}

