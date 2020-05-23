package typings.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/disposable/
@JSGlobal("Disposable")
@js.native
class Disposable ()
  extends typings.novaEditorNode.Disposable {
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("Disposable")
@js.native
object Disposable extends js.Object {
  def isDisposable(x: js.Any): /* is nova-editor-node.Disposable */ Boolean = js.native
}

