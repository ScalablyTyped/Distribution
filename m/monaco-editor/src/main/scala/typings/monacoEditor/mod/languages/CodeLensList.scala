package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensList extends js.Object {
  var lenses: js.Array[CodeLens]
  def dispose(): Unit
}

object CodeLensList {
  @scala.inline
  def apply(dispose: () => Unit, lenses: js.Array[CodeLens]): CodeLensList = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), lenses = lenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLensList]
  }
}

