package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.phonon.phononStrings.left
  - typings.phonon.phononStrings.`title-left`
  - typings.phonon.phononStrings.right
  - typings.phonon.phononStrings.title
*/
trait PhononPopoverDirection extends js.Object

object PhononPopoverDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.phonon.phononStrings.left = this.cast("left")
  @scala.inline
  def right: typings.phonon.phononStrings.right = this.cast("right")
  @scala.inline
  def title: typings.phonon.phononStrings.title = this.cast("title")
  @scala.inline
  def `title-left`: typings.phonon.phononStrings.`title-left` = this.cast("title-left")
}

