package typings
package atPollyjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atPollyjsCoreMod {
  type ErrorEventListener = js.Function2[/* req */ Request, /* error */ js.Any, EventListenerResponse]
  type ErrorRouteEvent = atPollyjsCoreLib.atPollyjsCoreLibStrings.error
  type EventListenerResponse = js.Any
  type InterceptHandler = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* intercept */ Intercept, 
    EventListenerResponse
  ]
  type MatchBy[T, R] = js.Function1[/* input */ T, R]
  type PollyEvent = atPollyjsCoreLib.atPollyjsCoreLibStrings.create | atPollyjsCoreLib.atPollyjsCoreLibStrings.stop | atPollyjsCoreLib.atPollyjsCoreLibStrings.register
  type PollyEventListener = js.Function1[/* poll */ Polly, scala.Unit]
  type RecordingEventListener = js.Function2[/* req */ Request, /* recording */ js.Any, EventListenerResponse]
  type RecordingRouteEvent = atPollyjsCoreLib.atPollyjsCoreLibStrings.beforeReplay | atPollyjsCoreLib.atPollyjsCoreLibStrings.beforePersist
  type RequestEventListener = js.Function1[/* req */ Request, EventListenerResponse]
  type RequestRouteEvent = atPollyjsCoreLib.atPollyjsCoreLibStrings.request
  type ResponseEventListener = js.Function2[/* req */ Request, /* res */ Response, EventListenerResponse]
  type ResponseRouteEvent = atPollyjsCoreLib.atPollyjsCoreLibStrings.beforeResponse | atPollyjsCoreLib.atPollyjsCoreLibStrings.response
}
