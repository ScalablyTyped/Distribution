package typings.npmlog

import typings.npmlog.mod.LogLevels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmlogStrings {
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevels
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait http
    extends StObject
       with LogLevels
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevels
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait notice
    extends StObject
       with LogLevels
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevels
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait silly
    extends StObject
       with LogLevels
  inline def silly: silly = "silly".asInstanceOf[silly]
  
  @js.native
  sealed trait timing
    extends StObject
       with LogLevels
  inline def timing: timing = "timing".asInstanceOf[timing]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevels
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevels
  inline def warn: warn = "warn".asInstanceOf[warn]
}
