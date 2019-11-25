package typings.prefixfree.PrefixFree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The known prefixes used for CSS properties in `CSSStyleDeclaration`. */
/* Rewritten from type alias, can be one of: 
  - typings.prefixfree.prefixfreeStrings.Moz
  - typings.prefixfree.prefixfreeStrings.Ms
  - typings.prefixfree.prefixfreeStrings.O
  - typings.prefixfree.prefixfreeStrings.Webkit
*/
trait KnownPrefixJS extends js.Object

object KnownPrefixJS {
  @scala.inline
  def Moz: typings.prefixfree.prefixfreeStrings.Moz = this.cast("Moz")
  @scala.inline
  def Ms: typings.prefixfree.prefixfreeStrings.Ms = this.cast("Ms")
  @scala.inline
  def O: typings.prefixfree.prefixfreeStrings.O = this.cast("O")
  @scala.inline
  def Webkit: typings.prefixfree.prefixfreeStrings.Webkit = this.cast("Webkit")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

