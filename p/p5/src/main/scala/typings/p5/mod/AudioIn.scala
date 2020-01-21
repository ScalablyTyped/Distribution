package typings.p5.mod

import typings.std.GainNode
import typings.std.MediaStream
import typings.std.MediaStreamAudioSourceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioIn extends js.Object {
  /**
    *   Input amplitude, connect to it by default but not
    *   to master out
    */
  var amplitude: Amplitude = js.native
  var currentSource: Double | Null = js.native
  /**
    *   Client must allow browser to access their
    *   microphone / audioin source. Default: false. Will
    *   become true when the client enables acces.
    */
  var enabled: Boolean = js.native
  var input: GainNode = js.native
  var mediaStream: MediaStreamAudioSourceNode | Null = js.native
  var output: GainNode = js.native
  var stream: MediaStream | Null = js.native
  /**
    *   Set amplitude (volume) of a mic input between 0
    *   and 1.0.
    *   @param vol between 0 and 1.0
    *   @param [time] ramp time (optional)
    */
  def amp(vol: Double): Unit = js.native
  def amp(vol: Double, time: Double): Unit = js.native
  /**
    *   Connect to an audio unit. If no parameter is
    *   provided, will connect to the master output (i.e.
    *   your speakers).
    *   @param [unit] An object that accepts audio input,
    *   such as an FFT
    */
  def connect(): Unit = js.native
  def connect(unit: js.Object): Unit = js.native
  /**
    *   Disconnect the AudioIn from all audio units. For
    *   example, if connect() had been called,
    *   disconnect() will stop sending signal to your
    *   speakers.
    */
  def disconnect(): Unit = js.native
  /**
    *   Read the Amplitude (volume level) of an AudioIn.
    *   The AudioIn class contains its own instance of the
    *   Amplitude class to help make it easy to get a
    *   microphone's volume level. Accepts an optional
    *   smoothing value (0.0 < 1.0). NOTE: AudioIn must
    *   .start() before using .getLevel().
    *   @param [smoothing] Smoothing is 0.0 by default.
    *   Smooths values based on previous values.
    *   @return Volume level (between 0.0 and 1.0)
    */
  def getLevel(): Double = js.native
  def getLevel(smoothing: Double): Double = js.native
  /**
    *   Returns a list of available input sources. This is
    *   a wrapper for <a
    *   title="MediaDevices.enumerateDevices() - Web APIs
    *   | MDN" target="_blank" href=
    *   "https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/enumerateDevices"
    *   and it returns a Promise.
    *   @param [successCallback] This callback function
    *   handles the sources when they have been
    *   enumerated. The callback function receives the
    *   deviceList array as its only argument
    *   @param [errorCallback] This optional callback
    *   receives the error message as its argument.
    *   @return Returns a Promise that can be used in
    *   place of the callbacks, similar to the
    *   enumerateDevices() method
    */
  def getSources(): js.Promise[_] = js.native
  def getSources(successCallback: js.Function1[/* repeated */ js.Any, _]): js.Promise[_] = js.native
  def getSources(
    successCallback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _]
  ): js.Promise[_] = js.native
  /**
    *   Set the input source. Accepts a number
    *   representing a position in the array returned by
    *   getSources(). This is only available in browsers
    *   that support <a
    *   title="MediaDevices.enumerateDevices() - Web APIs
    *   | MDN" target="_blank" href=
    *   "https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/enumerateDevices"
    *   navigator.mediaDevices.enumerateDevices().
    *   @param num position of input source in the array
    */
  def setSource(num: Double): Unit = js.native
  /**
    *   Start processing audio input. This enables the use
    *   of other AudioIn methods like getLevel(). Note
    *   that by default, AudioIn is not connected to
    *   p5.sound's output. So you won't hear anything
    *   unless you use the connect() method.
    *
    *   Certain browsers limit access to the user's
    *   microphone. For example, Chrome only allows access
    *   from localhost and over https. For this reason,
    *   you may want to include an errorCallback—a
    *   function that is called in case the browser won't
    *   provide mic access.
    *   @param [successCallback] Name of a function to
    *   call on success.
    *   @param [errorCallback] Name of a function to call
    *   if there was an error. For example, some browsers
    *   do not support getUserMedia.
    */
  def start(): Unit = js.native
  def start(successCallback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def start(
    successCallback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /**
    *   Turn the AudioIn off. If the AudioIn is stopped,
    *   it cannot getLevel(). If re-starting, the user may
    *   be prompted for permission access.
    */
  def stop(): Unit = js.native
}

