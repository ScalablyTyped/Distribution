package typings.atOracleOraclejet.ojmoduleanimationsMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitcherCallBackParam extends js.Object {
  var isInitial: Boolean
  var newViewModel: js.Any
  var node: Element
  var oldViewModel: js.Any
  def valueAccessor(): js.Any
}

object SwitcherCallBackParam {
  @scala.inline
  def apply(
    isInitial: Boolean,
    newViewModel: js.Any,
    node: Element,
    oldViewModel: js.Any,
    valueAccessor: () => js.Any
  ): SwitcherCallBackParam = {
    val __obj = js.Dynamic.literal(isInitial = isInitial, newViewModel = newViewModel, node = node, oldViewModel = oldViewModel, valueAccessor = js.Any.fromFunction0(valueAccessor))
  
    __obj.asInstanceOf[SwitcherCallBackParam]
  }
}

