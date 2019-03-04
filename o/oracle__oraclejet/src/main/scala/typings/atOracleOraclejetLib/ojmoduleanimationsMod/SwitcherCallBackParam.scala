package typings
package atOracleOraclejetLib.ojmoduleanimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitcherCallBackParam extends js.Object {
  var isInitial: scala.Boolean
  var newViewModel: js.Any
  var node: stdLib.Element
  var oldViewModel: js.Any
  def valueAccessor(): js.Any
}

object SwitcherCallBackParam {
  @scala.inline
  def apply(
    isInitial: scala.Boolean,
    newViewModel: js.Any,
    node: stdLib.Element,
    oldViewModel: js.Any,
    valueAccessor: js.Function0[js.Any]
  ): SwitcherCallBackParam = {
    val __obj = js.Dynamic.literal(isInitial = isInitial, newViewModel = newViewModel, node = node, oldViewModel = oldViewModel, valueAccessor = valueAccessor)
  
    __obj.asInstanceOf[SwitcherCallBackParam]
  }
}

