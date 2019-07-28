package typings.p5.p5Mod

import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaElement extends js.Object {
  /**
    *   Path to the media element source.
    */
  var src: js.Any = js.native
  /**
    *   Schedule events to trigger every time a
    *   MediaElement (audio/video) reaches a playback cue
    *   point. Accepts a callback function, a time (in
    *   seconds) at which to trigger the callback, and an
    *   optional parameter for the callback.
    *
    *   Time will be passed as the first parameter to the
    *   callback function, and param will be the second
    *   parameter.
    *   @param time Time in seconds, relative to this
    *   media element's playback. For example, to trigger
    *   an event every time playback reaches two seconds,
    *   pass in the number 2. This will be passed as the
    *   first parameter to the callback function.
    *   @param callback Name of a function that will be
    *   called at the given time. The callback will
    *   receive time and (optionally) param as its two
    *   parameters.
    *   @param [value] An object to be passed as the
    *   second parameter to the callback function.
    *   @return id ID of this cue, useful for
    *   removeCue(id)
    */
  def addCue(time: Double, callback: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  def addCue(time: Double, callback: js.Function1[/* repeated */ js.Any, _], value: js.Object): Double = js.native
  /**
    *   Set HTML5 media element to autoplay or not.
    *   @param autoplay whether the element should
    *   autoplay
    *   @chainable
    */
  def autoplay(autoplay: Boolean): MediaElement = js.native
  /**
    *   Remove all of the callbacks that had originally
    *   been scheduled via the addCue method.
    *   @param id ID of the cue, as returned by addCue
    */
  def clearCues(id: Double): Unit = js.native
  def connect(audioNode: js.Object): Unit = js.native
  /**
    *   Send the audio output of this element to a
    *   specified audioNode or p5.sound object. If no
    *   element is provided, connects to p5's master
    *   output. That connection is established when this
    *   method is first called. All connections are
    *   removed by the .disconnect() method. This method
    *   is meant to be used with the p5.sound.js addon
    *   library.
    *   @param audioNode AudioNode from the Web Audio API,
    *   or an object from the p5.sound library
    */
  def connect(audioNode: AudioNode): Unit = js.native
  /**
    *   Disconnect all Web Audio routing, including to
    *   master output. This is useful if you want to
    *   re-route the output through audio effects, for
    *   example.
    */
  def disconnect(): Unit = js.native
  /**
    *   Returns the duration of the HTML5 media element.
    *   @return duration
    */
  def duration(): Double = js.native
  /**
    *   Hide the default mediaElement controls.
    */
  def hideControls(): Unit = js.native
  /**
    *   Set 'loop' to true for an HTML5 media element, and
    *   starts playing.
    *   @chainable
    */
  def loop(): MediaElement = js.native
  /**
    *   Set 'loop' to false for an HTML5 media element.
    *   Element will stop when it reaches the end.
    *   @chainable
    */
  def noLoop(): MediaElement = js.native
  /**
    *   Schedule an event to be called when the audio or
    *   video element reaches the end. If the element is
    *   looping, this will not be called. The element is
    *   passed in as the argument to the onended callback.
    *   @param callback function to call when the
    *   soundfile has ended. The media element will be
    *   passed in as the argument to the callback.
    *   @chainable
    */
  def onended(callback: js.Function1[/* repeated */ js.Any, _]): MediaElement = js.native
  /**
    *   Pauses an HTML5 media element.
    *   @chainable
    */
  def pause(): MediaElement = js.native
  /**
    *   Play an HTML5 media element.
    *   @chainable
    */
  def play(): MediaElement = js.native
  /**
    *   Remove a callback based on its ID. The ID is
    *   returned by the addCue method.
    *   @param id ID of the cue, as returned by addCue
    */
  def removeCue(id: Double): Unit = js.native
  /**
    *   Show the default MediaElement controls, as
    *   determined by the web browser.
    */
  def showControls(): Unit = js.native
  /**
    *   If no arguments are given, returns the current
    *   playback speed of the element. The speed parameter
    *   sets the speed where 2.0 will play the element
    *   twice as fast, 0.5 will play at half the speed,
    *   and -1 will play the element in normal speed in
    *   reverse.(Note that not all browsers support
    *   backward playback and even if they do, playback
    *   might not be smooth.)
    *   @return current playback speed of the element
    */
  def speed(): Double = js.native
  /**
    *   If no arguments are given, returns the current
    *   playback speed of the element. The speed parameter
    *   sets the speed where 2.0 will play the element
    *   twice as fast, 0.5 will play at half the speed,
    *   and -1 will play the element in normal speed in
    *   reverse.(Note that not all browsers support
    *   backward playback and even if they do, playback
    *   might not be smooth.)
    *   @param speed speed multiplier for element playback
    *   @chainable
    */
  def speed(speed: Double): MediaElement = js.native
  /**
    *   Stops an HTML5 media element (sets current time to
    *   zero).
    *   @chainable
    */
  def stop(): MediaElement = js.native
  /**
    *   If no arguments are given, returns the current
    *   time of the element. If an argument is given the
    *   current time of the element is set to it.
    *   @return current time (in seconds)
    */
  def time(): Double = js.native
  /**
    *   If no arguments are given, returns the current
    *   time of the element. If an argument is given the
    *   current time of the element is set to it.
    *   @param time time to jump to (in seconds)
    *   @chainable
    */
  def time(time: Double): MediaElement = js.native
  /**
    *   Sets volume for this HTML5 media element. If no
    *   argument is given, returns the current volume.
    *   @return current volume
    */
  def volume(): Double = js.native
  /**
    *   Sets volume for this HTML5 media element. If no
    *   argument is given, returns the current volume.
    *   @param val volume between 0.0 and 1.0
    *   @chainable
    */
  def volume(`val`: Double): MediaElement = js.native
}

