package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "PolySynth")
@js.native
/**
  *   An AudioVoice is used as a single voice for sound
  *   synthesis. The PolySynth class holds an array of
  *   AudioVoice, and deals with voices allocations,
  *   with setting notes to be played, and parameters to
  *   be set.
  *
  *   @param [synthVoice] A monophonic synth voice
  *   inheriting the AudioVoice class. Defaults to
  *   p5.MonoSynth
  *   @param [maxVoices] Number of voices, defaults to
  *   8;
  */
class PolySynth ()
  extends p5Lib.p5Mod.p5Ns.PolySynth {
  def this(synthVoice: scala.Double) = this()
  def this(synthVoice: scala.Double, maxVoices: scala.Double) = this()
}

