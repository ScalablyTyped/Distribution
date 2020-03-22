package typings.pdfmake.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.pdfmakeStrings.before
  - typings.pdfmake.pdfmakeStrings.after
*/
trait PageBreak extends js.Object

object PageBreak {
  @scala.inline
  def after: typings.pdfmake.pdfmakeStrings.after = this.cast("after")
  @scala.inline
  def before: typings.pdfmake.pdfmakeStrings.before = this.cast("before")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

