package typings.oracleOraclejet.anon

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsInitial extends js.Object {
  var isInitial: Boolean
  var newViewModel: js.Object
  var node: Node
  var oldViewModel: js.Object
}

object IsInitial {
  @scala.inline
  def apply(isInitial: Boolean, newViewModel: js.Object, node: Node, oldViewModel: js.Object): IsInitial = {
    val __obj = js.Dynamic.literal(isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInitial]
  }
}

