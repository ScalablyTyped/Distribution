package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorAction extends js.Object {
  val alias: String
  val id: String
  val label: String
  def isSupported(): Boolean
  def run(): js.Promise[Unit]
}

object IEditorAction {
  @scala.inline
  def apply(alias: String, id: String, isSupported: () => Boolean, label: String, run: () => js.Promise[Unit]): IEditorAction = {
    val __obj = js.Dynamic.literal(alias = alias, id = id, isSupported = js.Any.fromFunction0(isSupported), label = label, run = js.Any.fromFunction0(run))
  
    __obj.asInstanceOf[IEditorAction]
  }
}

