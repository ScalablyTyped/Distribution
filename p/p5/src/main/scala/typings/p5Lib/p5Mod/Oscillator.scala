package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Oscillator")
@js.native
class Oscillator ()
  extends p5Lib.p5Mod.p5Ns.Oscillator {
  /**
       *   Creates a signal that oscillates between -1.0 and
       *   1.0. By default, the oscillation takes the form of
       *   a sinusoidal shape ('sine'). Additional types
       *   include 'triangle', 'sawtooth' and 'square'. The
       *   frequency defaults to 440 oscillations per second
       *   (440Hz, equal to the pitch of an 'A' note). Set
       *   the type of oscillation with setType(), or by
       *   instantiating a specific oscillator: p5.SinOsc,
       *   p5.TriOsc, p5.SqrOsc, or p5.SawOsc.
       *
       *   @param [freq] frequency defaults to 440Hz
       *   @param [type] type of oscillator. Options: 'sine'
       *   (default), 'triangle', 'sawtooth', 'square'
       */
  def this(freq: scala.Double) = this()
  /**
       *   Creates a signal that oscillates between -1.0 and
       *   1.0. By default, the oscillation takes the form of
       *   a sinusoidal shape ('sine'). Additional types
       *   include 'triangle', 'sawtooth' and 'square'. The
       *   frequency defaults to 440 oscillations per second
       *   (440Hz, equal to the pitch of an 'A' note). Set
       *   the type of oscillation with setType(), or by
       *   instantiating a specific oscillator: p5.SinOsc,
       *   p5.TriOsc, p5.SqrOsc, or p5.SawOsc.
       *
       *   @param [freq] frequency defaults to 440Hz
       *   @param [type] type of oscillator. Options: 'sine'
       *   (default), 'triangle', 'sawtooth', 'square'
       */
  def this(freq: scala.Double, `type`: java.lang.String) = this()
}

