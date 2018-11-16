package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "SoundLoop")
@js.native
class SoundLoop protected ()
  extends p5Lib.p5Mod.p5Ns.SoundLoop {
  /**
       *   SoundLoop
       *
       *   @param callback this function will be called on
       *   each iteration of theloop
       *   @param [interval] amount of time or beats for each
       *   iteration of the loop defaults to 1
       */
  def this(callback: js.Function1[/* repeated */js.Any, _]) = this()
  /**
       *   SoundLoop
       *
       *   @param callback this function will be called on
       *   each iteration of theloop
       *   @param [interval] amount of time or beats for each
       *   iteration of the loop defaults to 1
       */
  def this(callback: js.Function1[/* repeated */js.Any, _], interval: java.lang.String) = this()
  /**
       *   SoundLoop
       *
       *   @param callback this function will be called on
       *   each iteration of theloop
       *   @param [interval] amount of time or beats for each
       *   iteration of the loop defaults to 1
       */
  def this(callback: js.Function1[/* repeated */js.Any, _], interval: scala.Double) = this()
}

