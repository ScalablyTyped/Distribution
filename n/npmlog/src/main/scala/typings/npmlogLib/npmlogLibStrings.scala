package typings
package npmlogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object npmlogLibStrings {
  @js.native
  sealed trait error
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait http
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait info
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait notice
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait silent
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait silly
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait timing
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait verbose
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait warn
    extends npmlogLib.npmlogMod.LogLevels
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def silly: silly = "silly".asInstanceOf[silly]
  @scala.inline
  def timing: timing = "timing".asInstanceOf[timing]
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

