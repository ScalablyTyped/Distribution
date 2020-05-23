package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/tree-data-provider/
@js.native
trait TreeDataProvider[E] extends js.Object {
  var getParent: js.UndefOr[js.Function1[/* element */ E, E]] = js.native
  def getChildren(): js.Array[E] | js.Promise[js.Array[E]] = js.native
  def getChildren(element: E): js.Array[E] | js.Promise[js.Array[E]] = js.native
  def getTreeItem(element: E): TreeItem = js.native
}

