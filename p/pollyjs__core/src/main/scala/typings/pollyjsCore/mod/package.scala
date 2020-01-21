package typings.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorEventListener = js.Function3[
    /* req */ typings.pollyjsCore.mod.Request, 
    /* error */ js.Any, 
    /* event */ typings.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type ErrorRouteEvent = typings.pollyjsCore.pollyjsCoreStrings.error
  type Headers = typings.std.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]]
  type InterceptHandler = js.Function3[
    /* req */ typings.pollyjsCore.mod.Request, 
    /* res */ typings.pollyjsCore.mod.Response, 
    /* interceptor */ typings.pollyjsCore.mod.Interceptor, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type MatchBy[T, R] = js.Function1[/* input */ T, R]
  type PollyEventListener = js.Function1[/* poll */ typings.pollyjsCore.mod.Polly, scala.Unit]
  type RecordingEventListener = js.Function3[
    /* req */ typings.pollyjsCore.mod.Request, 
    /* recording */ js.Any, 
    /* event */ typings.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type RequestEventListener = js.Function2[
    /* req */ typings.pollyjsCore.mod.Request, 
    /* event */ typings.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type RequestRouteEvent = typings.pollyjsCore.pollyjsCoreStrings.request
  type ResponseEventListener = js.Function3[
    /* req */ typings.pollyjsCore.mod.Request, 
    /* res */ typings.pollyjsCore.mod.Response, 
    /* event */ typings.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
}
