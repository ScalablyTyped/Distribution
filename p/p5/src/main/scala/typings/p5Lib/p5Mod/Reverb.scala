package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Reverb")
@js.native
/**
  *   Reverb adds depth to a sound through a large
  *   number of decaying echoes. It creates the
  *   perception that sound is occurring in a physical
  *   space. The p5.Reverb has parameters for Time (how
  *   long does the reverb last) and decayRate (how much
  *   the sound decays with each echo) that can be set
  *   with the .set() or .process() methods. The
  *   p5.Convolver extends p5.Reverb allowing you to
  *   recreate the sound of actual physical spaces
  *   through convolution. This class extends p5.Effect.
  *   Methods amp(), chain(), drywet(), connect(), and
  *   disconnect() are available.
  *
  */
class Reverb ()
  extends p5Lib.p5Mod.p5Ns.Reverb

