package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "AudioVoice")
@js.native
/**
  *   Base class for monophonic synthesizers. Any
  *   extensions of this class should follow the API and
  *   implement the methods below in order to remain
  *   compatible with p5.PolySynth();
  *
  */
class AudioVoice ()
  extends p5Lib.p5Mod.p5Ns.AudioVoice {
  /**
    *   Connect to p5 objects or Web Audio Nodes
    */
  /* CompleteClass */
  override def connect(unit: js.Object): scala.Unit = js.native
  /**
    *   Disconnect from soundOut
    */
  /* CompleteClass */
  override def disconnect(): scala.Unit = js.native
}

