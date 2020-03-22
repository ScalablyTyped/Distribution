package typings.pdfmake.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.pdfmakeStrings.dashed
  - typings.pdfmake.pdfmakeStrings.dotted
  - typings.pdfmake.pdfmakeStrings.double
  - typings.pdfmake.pdfmakeStrings.wavy
*/
trait DecorationStyle extends js.Object

object DecorationStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typings.pdfmake.pdfmakeStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typings.pdfmake.pdfmakeStrings.dotted = this.cast("dotted")
  @scala.inline
  def double: typings.pdfmake.pdfmakeStrings.double = this.cast("double")
  @scala.inline
  def wavy: typings.pdfmake.pdfmakeStrings.wavy = this.cast("wavy")
}

