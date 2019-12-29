package typings.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/core", "RouteHandler")
@js.native
class RouteHandler () extends js.Object {
  def configure(config: PollyConfig): RouteHandler = js.native
  def filter(callback: js.Function1[/* req */ Request, Boolean]): RouteHandler = js.native
  def intercept(fn: InterceptHandler): RouteHandler = js.native
  def off(event: ErrorRouteEvent): RouteHandler = js.native
  def off(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
  def off(event: RecordingRouteEvent): RouteHandler = js.native
  def off(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
  def off(event: RequestRouteEvent): RouteHandler = js.native
  def off(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
  def off(event: ResponseRouteEvent): RouteHandler = js.native
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
  def passthrough(value: Boolean): RouteHandler = js.native
  def recordingName(): RouteHandler = js.native
  def recordingName(recordingName: String): RouteHandler = js.native
  def times(): RouteHandler = js.native
  def times(n: Double): RouteHandler = js.native
}

