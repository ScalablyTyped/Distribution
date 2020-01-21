package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Noise extends Oscillator {
  /**
    *   Set type of noise to 'white', 'pink' or 'brown'.
    *   White is the default.
    *   @param [type] 'white', 'pink' or 'brown'
    */
  def setType(): Unit = js.native
}

