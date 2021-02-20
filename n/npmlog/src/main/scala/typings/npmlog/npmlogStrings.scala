package typings.npmlog

import typings.npmlog.mod.LogLevels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmlogStrings {
  
  @js.native
  sealed trait error extends LogLevels
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait http extends LogLevels
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait info extends LogLevels
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait notice extends LogLevels
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait silent extends LogLevels
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait silly extends LogLevels
  @scala.inline
  def silly: silly = "silly".asInstanceOf[silly]
  
  @js.native
  sealed trait timing extends LogLevels
  @scala.inline
  def timing: timing = "timing".asInstanceOf[timing]
  
  @js.native
  sealed trait verbose extends LogLevels
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn extends LogLevels
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
