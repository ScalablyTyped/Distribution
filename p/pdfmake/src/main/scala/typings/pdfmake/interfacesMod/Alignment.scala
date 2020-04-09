package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.pdfmakeStrings.left
  - typings.pdfmake.pdfmakeStrings.right
  - typings.pdfmake.pdfmakeStrings.justify
  - typings.pdfmake.pdfmakeStrings.center
*/
trait Alignment extends js.Object

object Alignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.pdfmake.pdfmakeStrings.center = this.cast("center")
  @scala.inline
  def justify: typings.pdfmake.pdfmakeStrings.justify = this.cast("justify")
  @scala.inline
  def left: typings.pdfmake.pdfmakeStrings.left = this.cast("left")
  @scala.inline
  def right: typings.pdfmake.pdfmakeStrings.right = this.cast("right")
}

