package typings.pollyjsCore

import typings.pollyjsCore.mod.ACTION
import typings.pollyjsCore.mod.EXPIRY_STRATEGY
import typings.pollyjsCore.mod.MODE
import typings.pollyjsCore.mod.PollyEvent
import typings.pollyjsCore.mod.RecordingRouteEvent
import typings.pollyjsCore.mod.ResponseRouteEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pollyjsCoreStrings {
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait beforePersist
    extends StObject
       with RecordingRouteEvent
  inline def beforePersist: beforePersist = "beforePersist".asInstanceOf[beforePersist]
  
  @js.native
  sealed trait beforeReplay
    extends StObject
       with RecordingRouteEvent
  inline def beforeReplay: beforeReplay = "beforeReplay".asInstanceOf[beforeReplay]
  
  @js.native
  sealed trait beforeResponse
    extends StObject
       with ResponseRouteEvent
  inline def beforeResponse: beforeResponse = "beforeResponse".asInstanceOf[beforeResponse]
  
  @js.native
  sealed trait create
    extends StObject
       with PollyEvent
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait error
    extends StObject
       with EXPIRY_STRATEGY
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait identify extends StObject
  inline def identify: identify = "identify".asInstanceOf[identify]
  
  @js.native
  sealed trait intercept
    extends StObject
       with ACTION
  inline def intercept: intercept = "intercept".asInstanceOf[intercept]
  
  @js.native
  sealed trait passthrough
    extends StObject
       with ACTION
       with MODE
  inline def passthrough: passthrough = "passthrough".asInstanceOf[passthrough]
  
  @js.native
  sealed trait record
    extends StObject
       with ACTION
       with EXPIRY_STRATEGY
       with MODE
  inline def record: record = "record".asInstanceOf[record]
  
  @js.native
  sealed trait register
    extends StObject
       with PollyEvent
  inline def register: register = "register".asInstanceOf[register]
  
  @js.native
  sealed trait replay
    extends StObject
       with ACTION
       with MODE
  inline def replay: replay = "replay".asInstanceOf[replay]
  
  @js.native
  sealed trait request extends StObject
  inline def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait response
    extends StObject
       with ResponseRouteEvent
  inline def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait stop
    extends StObject
       with PollyEvent
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait stopped
    extends StObject
       with MODE
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait warn
    extends StObject
       with EXPIRY_STRATEGY
  inline def warn: warn = "warn".asInstanceOf[warn]
}
