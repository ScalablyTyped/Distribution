package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpResult extends IDisposable {
  var value: SignatureHelp
}

object SignatureHelpResult {
  @scala.inline
  def apply(dispose: () => Unit, value: SignatureHelp): SignatureHelpResult = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpResult]
  }
}

