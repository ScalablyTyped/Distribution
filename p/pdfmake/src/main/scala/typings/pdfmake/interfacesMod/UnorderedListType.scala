package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.pdfmakeStrings.square
  - typings.pdfmake.pdfmakeStrings.circle
  - typings.pdfmake.pdfmakeStrings.none
*/
trait UnorderedListType extends js.Object

object UnorderedListType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.pdfmake.pdfmakeStrings.circle = this.cast("circle")
  @scala.inline
  def none: typings.pdfmake.pdfmakeStrings.none = this.cast("none")
  @scala.inline
  def square: typings.pdfmake.pdfmakeStrings.square = this.cast("square")
}

