package typings.meyda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.meyda.meydaStrings.blackman
  - typings.meyda.meydaStrings.sine
  - typings.meyda.meydaStrings.hanning
  - typings.meyda.meydaStrings.hamming
*/
trait MeydaWindowingFunction extends js.Object

object MeydaWindowingFunction {
  @scala.inline
  def blackman: typings.meyda.meydaStrings.blackman = this.cast("blackman")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hamming: typings.meyda.meydaStrings.hamming = this.cast("hamming")
  @scala.inline
  def hanning: typings.meyda.meydaStrings.hanning = this.cast("hanning")
  @scala.inline
  def sine: typings.meyda.meydaStrings.sine = this.cast("sine")
}

