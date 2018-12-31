package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Envelope")
@js.native
/**
  *   Envelopes are pre-defined amplitude distribution
  *   over time. Typically, envelopes are used to
  *   control the output volume of an object, a series
  *   of fades referred to as Attack, Decay, Sustain and
  *   Release ( ADSR ). Envelopes can also control other
  *   Web Audio Parameters—for example, a p5.Envelope
  *   can control an Oscillator's frequency like this:
  *   osc.freq(env). Use setRange to change the
  *   attack/release level. Use setADSR to change
  *   attackTime, decayTime, sustainPercent and
  *   releaseTime.
  *
  *   Use the play method to play the entire envelope,
  *   the ramp method for a pingable trigger, or
  *   triggerAttack/ triggerRelease to trigger
  *   noteOn/noteOff.
  *
  */
class Envelope ()
  extends p5Lib.p5Mod.p5Ns.Envelope

