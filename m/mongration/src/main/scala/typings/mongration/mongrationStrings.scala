package typings.mongration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongrationStrings {
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait `not-run` extends StObject
  @scala.inline
  def `not-run`: `not-run` = "not-run".asInstanceOf[`not-run`]
  
  @js.native
  sealed trait ok extends StObject
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait pending extends StObject
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait rollback extends StObject
  @scala.inline
  def rollback: rollback = "rollback".asInstanceOf[rollback]
  
  @js.native
  sealed trait `rollback-error` extends StObject
  @scala.inline
  def `rollback-error`: `rollback-error` = "rollback-error".asInstanceOf[`rollback-error`]
  
  @js.native
  sealed trait skipped extends StObject
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
}
