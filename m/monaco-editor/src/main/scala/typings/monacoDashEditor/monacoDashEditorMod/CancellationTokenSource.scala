package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "CancellationTokenSource")
@js.native
class CancellationTokenSource () extends js.Object {
  def this(parent: CancellationToken) = this()
  val token: CancellationToken = js.native
  def cancel(): Unit = js.native
  def dispose(): Unit = js.native
}

