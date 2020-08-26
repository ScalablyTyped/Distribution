package typings.popcorn

import typings.std.ClientRect
import typings.std.HTMLMediaElement
import typings.std.TimeRanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopcornImpl extends js.Object {
  var media: HTMLMediaElement = js.native
  def autoplay(flag: Boolean): js.Any = js.native
  def buffered(): TimeRanges = js.native
  def compose(name: String, definitionObject: js.Any, manifest: js.Any): js.Any = js.native
  def controls(flag: Boolean): js.Any = js.native
  def cue(time: String, callback: js.Function): js.Any = js.native
  def cue(time: Double, callback: js.Function): js.Any = js.native
  def currentTime(): Double = js.native
  def currentTime(time: String): Double = js.native
  def currentTime(time: Double): Double = js.native
  def defaults(pluginName: String, options: js.Any): js.Any = js.native
  def destroy(): js.Any = js.native
  def disable(pluginName: String): js.Any = js.native
  def duration(): Double = js.native
  def emit(eventName: String, dataObject: js.Any): js.Any = js.native
  def enable(pluginName: String): PopcornImpl = js.native
  def exec(time: String, callback: js.Function): js.Any = js.native
  def exec(time: Double, callback: js.Function): js.Any = js.native
  def footnote(data: Footnote): js.Any = js.native
  def getLastTrackEventId(): String = js.native
  def listen(eventName: String, callback: js.Function): js.Any = js.native
  def load(): js.Any = js.native
  def loop(flag: Boolean): js.Any = js.native
  def mute(): js.Any = js.native
  def muted(flag: Boolean): js.Any = js.native
  def off(eventName: String, callback: js.Function): js.Any = js.native
  def on(eventName: String, callback: js.Function): js.Any = js.native
  def pause(): js.Any = js.native
  def pause(time: String): js.Any = js.native
  def pause(time: Double): js.Any = js.native
  def paused(): Boolean = js.native
  def play(): js.Any = js.native
  def play(time: String): js.Any = js.native
  def play(time: Double): js.Any = js.native
  def playbackRate(): js.Any = js.native
  def playbackRate(rate: Double): js.Any = js.native
  def played(): TimeRanges = js.native
  def position(): ClientRect = js.native
  def preload(state: String): js.Any = js.native
  def readyState(): Double = js.native
  def removeTrackEvent(id: String): js.Any = js.native
  def roundTime(): Double = js.native
  def seekable(): js.Any = js.native
   // TimeRages?
  def seeking(): Boolean = js.native
  def toggle(pluginName: String): js.Any = js.native
  def trigger(eventName: String, dataObject: js.Any): js.Any = js.native
  def unlisten(eventName: String, callback: js.Function): js.Any = js.native
  def unmute(): js.Any = js.native
  def volume(): Double = js.native
  def volume(value: Double): Double = js.native
}

