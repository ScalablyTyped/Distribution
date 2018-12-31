package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "EQ")
@js.native
/**
  *   p5.EQ is an audio effect that performs the
  *   function of a multiband audio equalizer.
  *   Equalization is used to adjust the balance of
  *   frequency compoenents of an audio signal. This
  *   process is commonly used in sound production and
  *   recording to change the waveform before it reaches
  *   a sound output device. EQ can also be used as an
  *   audio effect to create interesting distortions by
  *   filtering out parts of the spectrum. p5.EQ is
  *   built using a chain of Web Audio Biquad Filter
  *   Nodes and can be instantiated with 3 or 8 bands.
  *   Bands can be added or removed from the EQ by
  *   directly modifying p5.EQ.bands (the array that
  *   stores filters). This class extends p5.Effect.
  *   Methods amp(), chain(), drywet(), connect(), and
  *   disconnect() are available.
  *
  *   @param [_eqsize] Constructor will accept 3 or 8,
  *   defaults to 3
  *   @return p5.EQ object
  */
class EQ ()
  extends p5Lib.p5Mod.p5Ns.EQ {
  def this(_eqsize: scala.Double) = this()
}

