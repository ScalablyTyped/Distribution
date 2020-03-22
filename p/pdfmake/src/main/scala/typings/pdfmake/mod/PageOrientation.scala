package typings.pdfmake.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.pdfmakeStrings.portrait
  - typings.pdfmake.pdfmakeStrings.landscape
*/
trait PageOrientation extends js.Object

object PageOrientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typings.pdfmake.pdfmakeStrings.landscape = this.cast("landscape")
  @scala.inline
  def portrait: typings.pdfmake.pdfmakeStrings.portrait = this.cast("portrait")
}

