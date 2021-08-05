package typings.natsHemera

import typings.natsHemera.mod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object natsHemeraStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait depth extends StObject
  inline def depth: depth = "depth".asInstanceOf[depth]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends StObject
       with LogLevel
  inline def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait insertion extends StObject
  inline def insertion: insertion = "insertion".asInstanceOf[insertion]
  
  @js.native
  sealed trait onAct extends StObject
  inline def onAct: onAct = "onAct".asInstanceOf[onAct]
  
  @js.native
  sealed trait onActFinished extends StObject
  inline def onActFinished: onActFinished = "onActFinished".asInstanceOf[onActFinished]
  
  @js.native
  sealed trait onAdd extends StObject
  inline def onAdd: onAdd = "onAdd".asInstanceOf[onAdd]
  
  @js.native
  sealed trait onClose extends StObject
  inline def onClose: onClose = "onClose".asInstanceOf[onClose]
  
  @js.native
  sealed trait onError extends StObject
  inline def onError: onError = "onError".asInstanceOf[onError]
  
  @js.native
  sealed trait onRequest extends StObject
  inline def onRequest: onRequest = "onRequest".asInstanceOf[onRequest]
  
  @js.native
  sealed trait onResponse extends StObject
  inline def onResponse: onResponse = "onResponse".asInstanceOf[onResponse]
  
  @js.native
  sealed trait onSend extends StObject
  inline def onSend: onSend = "onSend".asInstanceOf[onSend]
  
  @js.native
  sealed trait preHandler extends StObject
  inline def preHandler: preHandler = "preHandler".asInstanceOf[preHandler]
  
  @js.native
  sealed trait pubsub extends StObject
  inline def pubsub: pubsub = "pubsub".asInstanceOf[pubsub]
  
  @js.native
  sealed trait request extends StObject
  inline def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait trace
    extends StObject
       with LogLevel
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
