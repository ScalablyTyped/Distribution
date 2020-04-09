package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.pdfmakeStrings.noBorders
  - typings.pdfmake.pdfmakeStrings.headerLineOnly
  - typings.pdfmake.pdfmakeStrings.lightHorizontalLines
*/
trait PredefinedTableLayout extends TableLayout

object PredefinedTableLayout {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def headerLineOnly: typings.pdfmake.pdfmakeStrings.headerLineOnly = this.cast("headerLineOnly")
  @scala.inline
  def lightHorizontalLines: typings.pdfmake.pdfmakeStrings.lightHorizontalLines = this.cast("lightHorizontalLines")
  @scala.inline
  def noBorders: typings.pdfmake.pdfmakeStrings.noBorders = this.cast("noBorders")
}

