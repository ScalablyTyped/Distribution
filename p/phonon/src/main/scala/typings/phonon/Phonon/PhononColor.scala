package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Components ***/
/* Rewritten from type alias, can be one of: 
  - typings.phonon.phononStrings.positive
  - typings.phonon.phononStrings.negative
*/
trait PhononColor extends js.Object

object PhononColor {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def negative: typings.phonon.phononStrings.negative = this.cast("negative")
  @scala.inline
  def positive: typings.phonon.phononStrings.positive = this.cast("positive")
}

