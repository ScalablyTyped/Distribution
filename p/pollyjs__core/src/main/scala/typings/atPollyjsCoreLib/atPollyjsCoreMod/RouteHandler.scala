package typings
package atPollyjsCoreLib.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/core", "RouteHandler")
@js.native
class RouteHandler () extends js.Object {
  def configure(config: PollyConfig): RouteHandler = js.native
  def filter(callback: js.Function1[/* req */ Request, scala.Boolean]): RouteHandler = js.native
  def intercept(
    fn: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* intercept */ Intercept, 
      EventListenerResponse
    ]
  ): RouteHandler = js.native
  def off(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
  def off(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
  def off(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
  def off(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
  def on(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
  def on(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
  def on(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
  def on(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
  def once(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
  def once(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
  def once(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
  def once(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
  def passthrough(): RouteHandler = js.native
  def passthrough(value: scala.Boolean): RouteHandler = js.native
  def recordingName(): RouteHandler = js.native
  def recordingName(recordingName: java.lang.String): RouteHandler = js.native
}

