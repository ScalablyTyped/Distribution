package typings.nodeTurn

import typings.nodeTurn.mod.TurnAuthMech
import typings.nodeTurn.mod.TurnDebugLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTurnStrings {
  
  @js.native
  sealed trait ALL
    extends StObject
       with TurnDebugLevel
  inline def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with TurnDebugLevel
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with TurnDebugLevel
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait FATAL
    extends StObject
       with TurnDebugLevel
  inline def FATAL: FATAL = "FATAL".asInstanceOf[FATAL]
  
  @js.native
  sealed trait INFO
    extends StObject
       with TurnDebugLevel
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait OFF
    extends StObject
       with TurnDebugLevel
  inline def OFF: OFF = "OFF".asInstanceOf[OFF]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with TurnDebugLevel
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait WARN
    extends StObject
       with TurnDebugLevel
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait `long-term`
    extends StObject
       with TurnAuthMech
  inline def `long-term`: `long-term` = "long-term".asInstanceOf[`long-term`]
  
  @js.native
  sealed trait none
    extends StObject
       with TurnAuthMech
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `short-term`
    extends StObject
       with TurnAuthMech
  inline def `short-term`: `short-term` = "short-term".asInstanceOf[`short-term`]
}
