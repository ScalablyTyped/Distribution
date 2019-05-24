package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "CancellationTokenSource")
@js.native
class CancellationTokenSource () extends js.Object {
  def this(parent: CancellationToken) = this()
  val token: CancellationToken = js.native
  def cancel(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
}

