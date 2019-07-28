package typings.atOracleOraclejet

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertNewView extends js.Object {
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

object Anon_InsertNewView {
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
  ): Anon_InsertNewView = {
    val __obj = js.Dynamic.literal(insertNewView = js.Any.fromFunction0(insertNewView), isInitial = isInitial, newViewModel = newViewModel, newViewParent = newViewParent, node = node, oldDomNodes = oldDomNodes, oldViewModel = oldViewModel, oldViewParent = oldViewParent, removeOldView = js.Any.fromFunction0(removeOldView))
  
    __obj.asInstanceOf[Anon_InsertNewView]
  }
}

