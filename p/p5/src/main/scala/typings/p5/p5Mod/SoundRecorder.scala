package typings.p5.p5Mod

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
  def record(soundFile: SoundFile): Unit = js.native
  def record(soundFile: SoundFile, duration: Double): Unit = js.native
  def record(soundFile: SoundFile, duration: Double, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /**
    *   Connect a specific device to the p5.SoundRecorder.
    *   If no parameter is given, p5.SoundRecorer will
    *   record all audible p5.sound from your sketch.
    *   @param [unit] p5.sound object or a web audio unit
    *   that outputs sound
    */
  def setInput(): Unit = js.native
  def setInput(unit: js.Object): Unit = js.native
  /**
    *   Stop the recording. Once the recording is stopped,
    *   the results will be sent to the p5.SoundFile that
    *   was given on .record(), and if a callback function
    *   was provided on record, that function will be
    *   called.
    */
  def stop(): Unit = js.native
}

