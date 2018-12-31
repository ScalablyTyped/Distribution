package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Delay")
@js.native
/**
  *   Delay is an echo effect. It processes an existing
  *   sound source, and outputs a delayed version of
  *   that sound. The p5.Delay can produce different
  *   effects depending on the delayTime, feedback,
  *   filter, and type. In the example below, a feedback
  *   of 0.5 (the defaul value) will produce a looping
  *   delay that decreases in volume by 50% each repeat.
  *   A filter will cut out the high frequencies so that
  *   the delay does not sound as piercing as the
  *   original source. This class extends p5.Effect.
  *   Methods amp(), chain(), drywet(), connect(), and
  *   disconnect() are available.
  *
  */
class Delay ()
  extends p5Lib.p5Mod.p5Ns.Delay

