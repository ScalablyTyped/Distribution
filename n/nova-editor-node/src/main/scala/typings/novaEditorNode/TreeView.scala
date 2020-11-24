package typings.novaEditorNode

import typings.novaEditorNode.anon.Focus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/tree-view/
@js.native
trait TreeView[E] extends Disposable {
  
  def onDidChangeSelection(callback: js.Function1[/* selectedElements */ js.Array[E], Unit]): Disposable = js.native
  
  def onDidChangeVisibility(callback: js.Function0[Unit]): Disposable = js.native
  
  def onDidCollapseElement(callback: js.Function1[/* element */ E, Unit]): Disposable = js.native
  
  def onDidExpandElement(callback: js.Function1[/* element */ E, Unit]): Disposable = js.native
  
  def reload(): js.Promise[Unit] = js.native
  def reload(element: E): js.Promise[Unit] = js.native
  
  def reveal(): Unit = js.native
  def reveal(element: E): Unit = js.native
  def reveal(element: E, options: Focus): Unit = js.native
  def reveal(element: Null, options: Focus): Unit = js.native
  
  val selection: js.Array[E] = js.native
  
  val visible: Boolean = js.native
}
