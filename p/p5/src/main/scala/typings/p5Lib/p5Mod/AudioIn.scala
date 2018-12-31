package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "AudioIn")
@js.native
/**
  *   Get audio from an input, i.e. your computer's
  *   microphone. Turn the mic on/off with the start()
  *   and stop() methods. When the mic is on, its volume
  *   can be measured with getLevel or by connecting an
  *   FFT object.
  *
  *   If you want to hear the AudioIn, use the
  *   .connect() method. AudioIn does not connect to
  *   p5.sound output by default to prevent feedback.
  *
  *   Note: This uses the getUserMedia/ Stream API,
  *   which is not supported by certain browsers. Access
  *   in Chrome browser is limited to localhost and
  *   https, but access over http may be limited.
  *
  *   @param [errorCallback] A function to call if there
  *   is an error accessing the AudioIn. For example,
  *   Safari and iOS devices do not currently allow
  *   microphone access.
  */
class AudioIn ()
  extends p5Lib.p5Mod.p5Ns.AudioIn {
  def this(errorCallback: js.Function1[/* repeated */ js.Any, _]) = this()
}

