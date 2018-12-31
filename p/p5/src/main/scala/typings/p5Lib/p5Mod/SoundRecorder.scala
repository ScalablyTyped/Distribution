package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "SoundRecorder")
@js.native
/**
  *   Record sounds for playback and/or to save as a
  *   .wav file. The p5.SoundRecorder records all sound
  *   output from your sketch, or can be assigned a
  *   specific source with setInput(). The record()
  *   method accepts a p5.SoundFile as a parameter. When
  *   playback is stopped (either after the given amount
  *   of time, or with the stop() method), the
  *   p5.SoundRecorder will send its recording to that
  *   p5.SoundFile for playback.
  *
  */
class SoundRecorder ()
  extends p5Lib.p5Mod.p5Ns.SoundRecorder

