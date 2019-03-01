package typings
package atPollyjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atPollyjsCoreLibStrings {
  @js.native
  sealed trait beforePersist
    extends atPollyjsCoreLib.atPollyjsCoreMod.RecordingRouteEvent
  
  @js.native
  sealed trait beforeReplay
    extends atPollyjsCoreLib.atPollyjsCoreMod.RecordingRouteEvent
  
  @js.native
  sealed trait beforeResponse
    extends atPollyjsCoreLib.atPollyjsCoreMod.ResponseRouteEvent
  
  @js.native
  sealed trait create
    extends atPollyjsCoreLib.atPollyjsCoreMod.PollyEvent
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait register
    extends atPollyjsCoreLib.atPollyjsCoreMod.PollyEvent
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait response
    extends atPollyjsCoreLib.atPollyjsCoreMod.ResponseRouteEvent
  
  @js.native
  sealed trait stop
    extends atPollyjsCoreLib.atPollyjsCoreMod.PollyEvent
  
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
  def register: register = "register".asInstanceOf[register]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
}

