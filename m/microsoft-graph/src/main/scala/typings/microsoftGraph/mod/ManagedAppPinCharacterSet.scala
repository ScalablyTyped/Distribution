package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.numeric
  - typings.microsoftGraph.microsoftGraphStrings.alphanumericAndSymbol
*/
trait ManagedAppPinCharacterSet extends js.Object

object ManagedAppPinCharacterSet {
  @scala.inline
  def alphanumericAndSymbol: typings.microsoftGraph.microsoftGraphStrings.alphanumericAndSymbol = this.cast("alphanumericAndSymbol")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def numeric: typings.microsoftGraph.microsoftGraphStrings.numeric = this.cast("numeric")
}

