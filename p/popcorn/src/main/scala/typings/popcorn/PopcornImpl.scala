package typings.popcorn

import typings.std.ClientRect
import typings.std.HTMLMediaElement
import typings.std.TimeRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopcornImpl extends StObject {
  
  def autoplay(flag: Boolean): Any = js.native
  
  def buffered(): TimeRanges = js.native
  
  def compose(name: String, definitionObject: Any, manifest: Any): Any = js.native
  
  def controls(flag: Boolean): Any = js.native
  
  def cue(time: String, callback: js.Function): Any = js.native
  def cue(time: Double, callback: js.Function): Any = js.native
  
  def currentTime(): Double = js.native
  def currentTime(time: String): Double = js.native
  def currentTime(time: Double): Double = js.native
  
  def defaults(pluginName: String, options: Any): Any = js.native
  
  def destroy(): Any = js.native
  
  def disable(pluginName: String): Any = js.native
  
  def duration(): Double = js.native
  
  def emit(eventName: String, dataObject: Any): Any = js.native
  
  def enable(pluginName: String): PopcornImpl = js.native
  
  def exec(time: String, callback: js.Function): Any = js.native
  def exec(time: Double, callback: js.Function): Any = js.native
  
  def footnote(data: Footnote): Any = js.native
  
  def getLastTrackEventId(): String = js.native
  
  def listen(eventName: String, callback: js.Function): Any = js.native
  
  def load(): Any = js.native
  
  def loop(flag: Boolean): Any = js.native
  
  var media: HTMLMediaElement = js.native
  
  def mute(): Any = js.native
  
  def muted(flag: Boolean): Any = js.native
  
  def off(eventName: String, callback: js.Function): Any = js.native
  
  def on(eventName: String, callback: js.Function): Any = js.native
  
  def pause(): Any = js.native
  def pause(time: String): Any = js.native
  def pause(time: Double): Any = js.native
  
  def paused(): Boolean = js.native
  
  def play(): Any = js.native
  def play(time: String): Any = js.native
  def play(time: Double): Any = js.native
  
  def playbackRate(): Any = js.native
  def playbackRate(rate: Double): Any = js.native
  
  def played(): TimeRanges = js.native
  
  def position(): ClientRect = js.native
  
  def preload(state: String): Any = js.native
  
  def readyState(): Double = js.native
  
  def removeTrackEvent(id: String): Any = js.native
  
  def roundTime(): Double = js.native
  
  def seekable(): Any = js.native
  
  // TimeRages?
  def seeking(): Boolean = js.native
  
  def toggle(pluginName: String): Any = js.native
  
  def trigger(eventName: String, dataObject: Any): Any = js.native
  
  def unlisten(eventName: String, callback: js.Function): Any = js.native
  
  def unmute(): Any = js.native
  
  def volume(): Double = js.native
  def volume(value: Double): Double = js.native
}
