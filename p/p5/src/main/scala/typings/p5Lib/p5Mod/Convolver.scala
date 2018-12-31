package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Convolver")
@js.native
class Convolver protected ()
  extends p5Lib.p5Mod.p5Ns.Convolver {
  /**
    *   p5.Convolver extends p5.Reverb. It can emulate the
    *   sound of real physical spaces through a process
    *   called  convolution. Convolution multiplies any
    *   audio input by an "impulse response" to simulate
    *   the dispersion of sound over time. The impulse
    *   response is generated from an audio file that you
    *   provide. One way to generate an impulse response
    *   is to pop a balloon in a reverberant space and
    *   record the echo. Convolution can also be used to
    *   experiment with sound.
    *
    *   Use the method createConvolution(path) to
    *   instantiate a p5.Convolver with a path to your
    *   impulse response audio file.
    *
    *   @param path path to a sound file
    *   @param [callback] function to call when loading
    *   succeeds
    *   @param [errorCallback] function to call if loading
    *   fails. This function will receive an error or
    *   XMLHttpRequest object with information about what
    *   went wrong.
    */
  def this(path: java.lang.String) = this()
  def this(path: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]) = this()
  def this(path: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _], errorCallback: js.Function1[/* repeated */ js.Any, _]) = this()
}

