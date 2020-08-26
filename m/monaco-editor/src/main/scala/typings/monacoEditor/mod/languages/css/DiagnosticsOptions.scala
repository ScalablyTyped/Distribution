package typings.monacoEditor.mod.languages.css

import typings.monacoEditor.anon.ArgumentsInColorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticsOptions extends js.Object {
  val lint: js.UndefOr[ArgumentsInColorFunction] = js.native
  val validate: js.UndefOr[Boolean] = js.native
}

object DiagnosticsOptions {
  @scala.inline
  def apply(): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticsOptions]
  }
  @scala.inline
  implicit class DiagnosticsOptionsOps[Self <: DiagnosticsOptions] (val x: Self) extends AnyVal {
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
    def setLint(value: ArgumentsInColorFunction): Self = this.set("lint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLint: Self = this.set("lint", js.undefined)
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

