package typings.npmProfile

import typings.npmProfile.mod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmProfileStrings {
  
  @js.native
  sealed trait `auth-and-writes` extends StObject
  inline def `auth-and-writes`: `auth-and-writes` = "auth-and-writes".asInstanceOf[`auth-and-writes`]
  
  @js.native
  sealed trait `auth-only` extends StObject
  inline def `auth-only`: `auth-only` = "auth-only".asInstanceOf[`auth-only`]
  
  @js.native
  sealed trait disable extends StObject
  inline def disable: disable = "disable".asInstanceOf[disable]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait http
    extends StObject
       with LogLevel
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait log extends StObject
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait `log ` extends StObject
  inline def `log `: `log ` = ("log ").asInstanceOf[`log `]
  
  @js.native
  sealed trait notice
    extends StObject
       with LogLevel
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait silly
    extends StObject
       with LogLevel
  inline def silly: silly = "silly".asInstanceOf[silly]
  
  @js.native
  sealed trait timing
    extends StObject
       with LogLevel
  inline def timing: timing = "timing".asInstanceOf[timing]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
