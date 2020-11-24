package typings.pino

import typings.pino.mod.Level
import typings.pino.mod.LevelWithSilent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinoStrings {
  
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
  
  @js.native
  sealed trait debug
    extends Level
       with LevelWithSilent
  
  @js.native
  sealed trait error
    extends Level
       with LevelWithSilent
  
  @js.native
  sealed trait fatal
    extends Level
       with LevelWithSilent
  
  @js.native
  sealed trait info
    extends Level
       with LevelWithSilent
  
  @js.native
  sealed trait `level-change` extends js.Object
  
  @js.native
  sealed trait silent extends LevelWithSilent
  
  @js.native
  sealed trait trace
    extends Level
       with LevelWithSilent
  
  @js.native
  sealed trait warn
    extends Level
       with LevelWithSilent
}
