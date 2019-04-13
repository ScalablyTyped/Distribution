package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pinoLibStrings {
  @js.native
  sealed trait debug
    extends pinoLib.pinoMod.Level
  
  @js.native
  sealed trait error
    extends pinoLib.pinoMod.Level
  
  @js.native
  sealed trait fatal
    extends pinoLib.pinoMod.Level
  
  @js.native
  sealed trait info
    extends pinoLib.pinoMod.Level
  
  @js.native
  sealed trait `level-change` extends js.Object
  
  @js.native
  sealed trait silent
    extends pinoLib.pinoMod.LevelWithSilent
  
  @js.native
  sealed trait trace
    extends pinoLib.pinoMod.Level
  
  @js.native
  sealed trait warn
    extends pinoLib.pinoMod.Level
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def `level-change`: `level-change` = "level-change".asInstanceOf[`level-change`]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

