package typings.pdfmake.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.pdfmakeStrings.underline
  - typings.pdfmake.pdfmakeStrings.lineThrough
  - typings.pdfmake.pdfmakeStrings.overline
*/
trait Decoration extends js.Object

object Decoration {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lineThrough: typings.pdfmake.pdfmakeStrings.lineThrough = this.cast("lineThrough")
  @scala.inline
  def overline: typings.pdfmake.pdfmakeStrings.overline = this.cast("overline")
  @scala.inline
  def underline: typings.pdfmake.pdfmakeStrings.underline = this.cast("underline")
}

