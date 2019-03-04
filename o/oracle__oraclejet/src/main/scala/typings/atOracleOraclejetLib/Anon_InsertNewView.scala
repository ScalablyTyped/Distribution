package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertNewView extends js.Object {
  var isInitial: scala.Boolean
  var newViewModel: js.Object
  var newViewParent: stdLib.Node
  var node: stdLib.Node
  var oldDomNodes: js.Array[_]
  var oldViewModel: js.Object
  var oldViewParent: stdLib.Node
  def insertNewView(): js.UndefOr[scala.Nothing]
  def removeOldView(): js.UndefOr[scala.Nothing]
}

object Anon_InsertNewView {
  @scala.inline
  def apply(
    insertNewView: js.Function0[js.UndefOr[scala.Nothing]],
    isInitial: scala.Boolean,
    newViewModel: js.Object,
    newViewParent: stdLib.Node,
    node: stdLib.Node,
    oldDomNodes: js.Array[_],
    oldViewModel: js.Object,
    oldViewParent: stdLib.Node,
    removeOldView: js.Function0[js.UndefOr[scala.Nothing]]
  ): Anon_InsertNewView = {
    val __obj = js.Dynamic.literal(insertNewView = insertNewView, isInitial = isInitial, newViewModel = newViewModel, newViewParent = newViewParent, node = node, oldDomNodes = oldDomNodes, oldViewModel = oldViewModel, oldViewParent = oldViewParent, removeOldView = removeOldView)
  
    __obj.asInstanceOf[Anon_InsertNewView]
  }
}

