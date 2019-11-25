package typings.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The winding / filling rule accepted by PDFKit:
/* Rewritten from type alias, can be one of: 
  - typings.pdfkit.pdfkitStrings.`even-odd`
  - typings.pdfkit.pdfkitStrings.evenodd
  - typings.pdfkit.pdfkitStrings.`non-zero`
  - typings.pdfkit.pdfkitStrings.nonzero
*/
trait RuleValue extends js.Object

object RuleValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `even-odd`: typings.pdfkit.pdfkitStrings.`even-odd` = this.cast("even-odd")
  @scala.inline
  def evenodd: typings.pdfkit.pdfkitStrings.evenodd = this.cast("evenodd")
  @scala.inline
  def `non-zero`: typings.pdfkit.pdfkitStrings.`non-zero` = this.cast("non-zero")
  @scala.inline
  def nonzero: typings.pdfkit.pdfkitStrings.nonzero = this.cast("nonzero")
}

