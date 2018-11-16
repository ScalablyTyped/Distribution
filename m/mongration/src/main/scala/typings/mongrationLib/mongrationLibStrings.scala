package typings
package mongrationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mongrationLibStrings {
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
  
  def error: error = "error".asInstanceOf[error]
  def `not-run`: `not-run` = "not-run".asInstanceOf[`not-run`]
  def ok: ok = "ok".asInstanceOf[ok]
  def pending: pending = "pending".asInstanceOf[pending]
  def rollback: rollback = "rollback".asInstanceOf[rollback]
  def `rollback-error`: `rollback-error` = "rollback-error".asInstanceOf[`rollback-error`]
  def skipped: skipped = "skipped".asInstanceOf[skipped]
}

