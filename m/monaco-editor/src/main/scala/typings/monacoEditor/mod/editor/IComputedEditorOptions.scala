package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputedEditorOptions extends js.Object {
  def get[T /* <: EditorOption */](id: T): FindComputedEditorOptionValueById[T]
}

object IComputedEditorOptions {
  @scala.inline
  def apply(get: js.Any => FindComputedEditorOptionValueById[js.Any]): IComputedEditorOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IComputedEditorOptions]
  }
}

