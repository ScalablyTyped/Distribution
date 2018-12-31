package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Signal")
@js.native
/**
  *   p5.Signal is a constant audio-rate signal used by
  *   p5.Oscillator and p5.Envelope for modulation math.
  *   This is necessary because Web Audio is processed
  *   on a seprate clock. For example, the p5 draw loop
  *   runs about 60 times per second. But the audio
  *   clock must process samples 44100 times per second.
  *   If we want to add a value to each of those
  *   samples, we can't do it in the draw loop, but we
  *   can do it by adding a constant-rate audio
  *   signal.</p.
  *
  *   This class mostly functions behind the scenes in
  *   p5.sound, and returns a Tone.Signal from the
  *   Tone.js library by Yotam Mann. If you want to work
  *   directly with audio signals for modular synthesis,
  *   check out tone.js.
  *
  *   @return A Signal object from the Tone.js library
  */
class Signal ()
  extends p5Lib.p5Mod.p5Ns.Signal

