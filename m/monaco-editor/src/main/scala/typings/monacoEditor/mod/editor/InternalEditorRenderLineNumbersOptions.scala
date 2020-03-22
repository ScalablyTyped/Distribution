package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalEditorRenderLineNumbersOptions extends js.Object {
  val renderFn: (js.Function1[/* lineNumber */ Double, String]) | Null
  val renderType: RenderLineNumbersType
}

object InternalEditorRenderLineNumbersOptions {
  @scala.inline
  def apply(renderType: RenderLineNumbersType, renderFn: /* lineNumber */ Double => String = null): InternalEditorRenderLineNumbersOptions = {
    val __obj = js.Dynamic.literal(renderType = renderType.asInstanceOf[js.Any])
    if (renderFn != null) __obj.updateDynamic("renderFn")(js.Any.fromFunction1(renderFn))
    __obj.asInstanceOf[InternalEditorRenderLineNumbersOptions]
  }
}

