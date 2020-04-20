package typings.oracleOraclejet

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsInitial extends js.Object {
  var isInitial: Boolean
  var newViewModel: js.Object
  var node: Node
  var oldViewModel: js.Object
}

object AnonIsInitial {
  @scala.inline
  def apply(isInitial: Boolean, newViewModel: js.Object, node: Node, oldViewModel: js.Object): AnonIsInitial = {
    val __obj = js.Dynamic.literal(isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsInitial]
  }
}

