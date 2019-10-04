package typings.atPollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atPollyjsCoreMod {
  import typings.atPollyjsCore.atPollyjsCoreStrings.error
  import typings.atPollyjsCore.atPollyjsCoreStrings.request
  import typings.std.Record

  type ErrorEventListener = js.Function3[
    /* req */ Request, 
    /* error */ js.Any, 
    /* event */ ListenerEvent, 
    Unit | js.Promise[Unit]
  ]
  type ErrorRouteEvent = error
  type Headers = Record[String, String | js.Array[String]]
  type InterceptHandler = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* interceptor */ Interceptor, 
    Unit | js.Promise[Unit]
  ]
  type MatchBy[T, R] = js.Function1[/* input */ T, R]
  type PollyEventListener = js.Function1[/* poll */ Polly, Unit]
  type RecordingEventListener = js.Function3[
    /* req */ Request, 
    /* recording */ js.Any, 
    /* event */ ListenerEvent, 
    Unit | js.Promise[Unit]
  ]
  type RequestEventListener = js.Function2[/* req */ Request, /* event */ ListenerEvent, Unit | js.Promise[Unit]]
  type RequestRouteEvent = request
  type ResponseEventListener = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* event */ ListenerEvent, 
    Unit | js.Promise[Unit]
  ]
}
