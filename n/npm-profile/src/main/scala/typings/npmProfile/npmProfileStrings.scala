package typings.npmProfile

import typings.npmProfile.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmProfileStrings {
  
  @scala.inline
  def `auth-and-writes`: `auth-and-writes` = "auth-and-writes".asInstanceOf[`auth-and-writes`]
  
  @scala.inline
  def `auth-only`: `auth-only` = "auth-only".asInstanceOf[`auth-only`]
  
  @scala.inline
  def disable: disable = "disable".asInstanceOf[disable]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @scala.inline
  def `log `: `log ` = ("log ").asInstanceOf[`log `]
  
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  
  @scala.inline
  def silly: silly = "silly".asInstanceOf[silly]
  
  @scala.inline
  def timing: timing = "timing".asInstanceOf[timing]
  
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait `auth-and-writes` extends js.Object
  
  @js.native
  sealed trait `auth-only` extends js.Object
  
  @js.native
  sealed trait disable extends js.Object
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait http extends LogLevel
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait log extends js.Object
  
  @js.native
  sealed trait `log ` extends js.Object
  
  @js.native
  sealed trait notice extends LogLevel
  
  @js.native
  sealed trait silly extends LogLevel
  
  @js.native
  sealed trait timing extends LogLevel
  
  @js.native
  sealed trait verbose extends LogLevel
  
  @js.native
  sealed trait warn extends LogLevel
}
