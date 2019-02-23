package typings
package atPollyjsCoreLib.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/core", "RouteHandler")
@js.native
class RouteHandler () extends js.Object {
  def configure(config: PollyConfig): RouteHandler = js.native
  def intercept(
    fn: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* intercept */ Intercept, 
      EventListenerResponse
    ]
  ): RouteHandler = js.native
  def off(
    event: RecordingRouteEvent | ResponseRouteEvent,
    listener: RecordingEventListener | ResponseEventListener
  ): RouteHandler = js.native
  def off(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
  def off(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
  def on(
    event: RecordingRouteEvent | ResponseRouteEvent,
    listener: RecordingEventListener | ResponseEventListener
  ): RouteHandler = js.native
  def on(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
  def on(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
  def once(
    event: RecordingRouteEvent | ResponseRouteEvent,
    listener: RecordingEventListener | ResponseEventListener
  ): RouteHandler = js.native
  def once(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
  def once(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
  def passthrough(): RouteHandler = js.native
  def passthrough(value: scala.Boolean): RouteHandler = js.native
  def recordingName(recordingName: java.lang.String): RouteHandler = js.native
}

