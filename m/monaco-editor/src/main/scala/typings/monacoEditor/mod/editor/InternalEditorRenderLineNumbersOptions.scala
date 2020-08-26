package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalEditorRenderLineNumbersOptions extends js.Object {
  val renderFn: (js.Function1[/* lineNumber */ Double, String]) | Null = js.native
  val renderType: RenderLineNumbersType = js.native
}

object InternalEditorRenderLineNumbersOptions {
  @scala.inline
  def apply(renderType: RenderLineNumbersType): InternalEditorRenderLineNumbersOptions = {
    val __obj = js.Dynamic.literal(renderType = renderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEditorRenderLineNumbersOptions]
  }
  @scala.inline
  implicit class InternalEditorRenderLineNumbersOptionsOps[Self <: InternalEditorRenderLineNumbersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRenderType(value: RenderLineNumbersType): Self = this.set("renderType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderFn(value: /* lineNumber */ Double => String): Self = this.set("renderFn", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderFnNull: Self = this.set("renderFn", null)
  }
  
}

