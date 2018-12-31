package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundRecorder extends js.Object {
  /**
    *   Start recording. To access the recording, provide
    *   a p5.SoundFile as the first parameter. The
    *   p5.SoundRecorder will send its recording to that
    *   p5.SoundFile for playback once recording is
    *   complete. Optional parameters include duration (in
    *   seconds) of the recording, and a callback function
    *   that will be called once the complete recording
    *   has been transfered to the p5.SoundFile.
    *   @param soundFile p5.SoundFile
    *   @param [duration] Time (in seconds)
    *   @param [callback] The name of a function that will
    *   be called once the recording completes
    */
  def record(soundFile: p5Lib.p5Mod.SoundFile): scala.Unit = js.native
  def record(soundFile: p5Lib.p5Mod.SoundFile, duration: scala.Double): scala.Unit = js.native
  def record(
    soundFile: p5Lib.p5Mod.SoundFile,
    duration: scala.Double,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  /**
    *   Connect a specific device to the p5.SoundRecorder.
    *   If no parameter is given, p5.SoundRecorer will
    *   record all audible p5.sound from your sketch.
    *   @param [unit] p5.sound object or a web audio unit
    *   that outputs sound
    */
  def setInput(): scala.Unit = js.native
  def setInput(unit: js.Object): scala.Unit = js.native
  /**
    *   Stop the recording. Once the recording is stopped,
    *   the results will be sent to the p5.SoundFile that
    *   was given on .record(), and if a callback function
    *   was provided on record, that function will be
    *   called.
    */
  def stop(): scala.Unit = js.native
}

