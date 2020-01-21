package typings.oracleOraclejet

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsertNewView extends js.Object {
  var isInitial: Boolean
  var newViewModel: js.Object
  var newViewParent: Node
  var node: Node
  var oldDomNodes: js.Array[_]
  var oldViewModel: js.Object
  var oldViewParent: Node
  def insertNewView(): js.UndefOr[scala.Nothing]
  def removeOldView(): js.UndefOr[scala.Nothing]
}

object AnonInsertNewView {
  @scala.inline
  def apply(
    insertNewView: () => js.UndefOr[scala.Nothing],
    isInitial: Boolean,
    newViewModel: js.Object,
    newViewParent: Node,
    node: Node,
    oldDomNodes: js.Array[_],
    oldViewModel: js.Object,
    oldViewParent: Node,
    removeOldView: () => js.UndefOr[scala.Nothing]
  ): AnonInsertNewView = {
    val __obj = js.Dynamic.literal(insertNewView = js.Any.fromFunction0(insertNewView), isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], newViewParent = newViewParent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldDomNodes = oldDomNodes.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any], oldViewParent = oldViewParent.asInstanceOf[js.Any], removeOldView = js.Any.fromFunction0(removeOldView))
  
    __obj.asInstanceOf[AnonInsertNewView]
  }
}

