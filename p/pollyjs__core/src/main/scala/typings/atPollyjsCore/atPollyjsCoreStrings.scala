package typings.atPollyjsCore

import typings.atPollyjsCore.atPollyjsCoreMod.PollyEvent
import typings.atPollyjsCore.atPollyjsCoreMod.RecordingRouteEvent
import typings.atPollyjsCore.atPollyjsCoreMod.ResponseRouteEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atPollyjsCoreStrings {
  @js.native
  sealed trait beforePersist extends RecordingRouteEvent
  
  @js.native
  sealed trait beforeReplay extends RecordingRouteEvent
  
  @js.native
  sealed trait beforeResponse extends ResponseRouteEvent
  
  @js.native
  sealed trait create extends PollyEvent
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait record extends js.Object
  
  @js.native
  sealed trait register extends PollyEvent
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait response extends ResponseRouteEvent
  
  @js.native
  sealed trait stop extends PollyEvent
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def beforePersist: beforePersist = "beforePersist".asInstanceOf[beforePersist]
  @scala.inline
  def beforeReplay: beforeReplay = "beforeReplay".asInstanceOf[beforeReplay]
  @scala.inline
  def beforeResponse: beforeResponse = "beforeResponse".asInstanceOf[beforeResponse]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def record: record = "record".asInstanceOf[record]
  @scala.inline
  def register: register = "register".asInstanceOf[register]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

