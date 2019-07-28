package typings.atPollyjsCore

import typings.atPollyjsCore.atPollyjsCoreStrings.error
import typings.atPollyjsCore.atPollyjsCoreStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atPollyjsCoreMod {
  type ErrorEventListener = js.Function2[/* req */ Request, /* error */ js.Any, EventListenerResponse]
  type ErrorRouteEvent = error
  type EventListenerResponse = js.Any
  type InterceptHandler = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* intercept */ Intercept, 
    EventListenerResponse
  ]
  type MatchBy[T, R] = js.Function1[/* input */ T, R]
  type PollyEventListener = js.Function1[/* poll */ Polly, Unit]
  type RecordingEventListener = js.Function2[/* req */ Request, /* recording */ js.Any, EventListenerResponse]
  type RequestEventListener = js.Function1[/* req */ Request, EventListenerResponse]
  type RequestRouteEvent = request
  type ResponseEventListener = js.Function2[/* req */ Request, /* res */ Response, EventListenerResponse]
}
