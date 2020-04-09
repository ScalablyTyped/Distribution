package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.pdfmakeStrings.`lower-alpha`
  - typings.pdfmake.pdfmakeStrings.`upper-alpha`
  - typings.pdfmake.pdfmakeStrings.`lower-roman`
  - typings.pdfmake.pdfmakeStrings.`upper-roman`
  - typings.pdfmake.pdfmakeStrings.none
*/
trait OrderedListType extends js.Object

object OrderedListType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `lower-alpha`: typings.pdfmake.pdfmakeStrings.`lower-alpha` = this.cast("lower-alpha")
  @scala.inline
  def `lower-roman`: typings.pdfmake.pdfmakeStrings.`lower-roman` = this.cast("lower-roman")
  @scala.inline
  def none: typings.pdfmake.pdfmakeStrings.none = this.cast("none")
  @scala.inline
  def `upper-alpha`: typings.pdfmake.pdfmakeStrings.`upper-alpha` = this.cast("upper-alpha")
  @scala.inline
  def `upper-roman`: typings.pdfmake.pdfmakeStrings.`upper-roman` = this.cast("upper-roman")
}

