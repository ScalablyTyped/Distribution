package typings
package popcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopcornImpl extends js.Object {
  var media: stdLib.HTMLMediaElement = js.native
  def autoplay(flag: scala.Boolean): js.Any = js.native
  def buffered(): stdLib.TimeRanges = js.native
  def compose(name: java.lang.String, definitionObject: js.Any): js.Any = js.native
  def compose(name: java.lang.String, definitionObject: js.Any, manifest: js.Any): js.Any = js.native
  def controls(flag: scala.Boolean): js.Any = js.native
  def cue(time: java.lang.String, callback: js.Function): js.Any = js.native
  def cue(time: scala.Double, callback: js.Function): js.Any = js.native
  def currentTime(): scala.Double = js.native
  def currentTime(time: java.lang.String): scala.Double = js.native
  def currentTime(time: scala.Double): scala.Double = js.native
  def defaults(pluginName: java.lang.String, options: js.Any): js.Any = js.native
  def destroy(): js.Any = js.native
  def disable(pluginName: java.lang.String): js.Any = js.native
  def duration(): scala.Double = js.native
  def emit(eventName: java.lang.String): js.Any = js.native
  def emit(eventName: java.lang.String, dataObject: js.Any): js.Any = js.native
  def enable(pluginName: java.lang.String): PopcornImpl = js.native
  def exec(time: java.lang.String, callback: js.Function): js.Any = js.native
  def exec(time: scala.Double, callback: js.Function): js.Any = js.native
  def footnote(data: Footnote): js.Any = js.native
  def getLastTrackEventId(): java.lang.String = js.native
  def listen(eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def load(): js.Any = js.native
  def loop(flag: scala.Boolean): js.Any = js.native
  def mute(): js.Any = js.native
  def muted(flag: scala.Boolean): js.Any = js.native
  def off(eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def on(eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def pause(): js.Any = js.native
  def pause(time: java.lang.String): js.Any = js.native
  def pause(time: scala.Double): js.Any = js.native
  def paused(): scala.Boolean = js.native
  def play(): js.Any = js.native
  def play(time: java.lang.String): js.Any = js.native
  def play(time: scala.Double): js.Any = js.native
  def playbackRate(): js.Any = js.native
  def playbackRate(rate: scala.Double): js.Any = js.native
  def played(): stdLib.TimeRanges = js.native
  def position(): stdLib.ClientRect = js.native
  def preload(state: java.lang.String): js.Any = js.native
  def readyState(): scala.Double = js.native
  def removeTrackEvent(id: java.lang.String): js.Any = js.native
  def roundTime(): scala.Double = js.native
  def seekable(): js.Any = js.native
   // TimeRages?
  def seeking(): scala.Boolean = js.native
  def toggle(pluginName: java.lang.String): js.Any = js.native
  def trigger(eventName: java.lang.String): js.Any = js.native
  def trigger(eventName: java.lang.String, dataObject: js.Any): js.Any = js.native
  def unlisten(eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def unmute(): js.Any = js.native
  def volume(): scala.Double = js.native
  def volume(value: scala.Double): scala.Double = js.native
}

