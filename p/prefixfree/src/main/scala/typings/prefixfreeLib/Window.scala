package typings
package prefixfreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var PrefixFree: prefixfreeLib.PrefixFree
  var StyleFix: prefixfreeLib.StyleFix
}

object Window {
  @scala.inline
  def apply(PrefixFree: PrefixFree, StyleFix: StyleFix): Window = {
    val __obj = js.Dynamic.literal(PrefixFree = PrefixFree, StyleFix = StyleFix)
  
    __obj.asInstanceOf[Window]
  }
}

