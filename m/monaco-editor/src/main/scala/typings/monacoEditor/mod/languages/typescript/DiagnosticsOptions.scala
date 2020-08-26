package typings.monacoEditor.mod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticsOptions extends js.Object {
  var diagnosticCodesToIgnore: js.UndefOr[js.Array[Double]] = js.native
  var noSemanticValidation: js.UndefOr[Boolean] = js.native
  var noSuggestionDiagnostics: js.UndefOr[Boolean] = js.native
  var noSyntaxValidation: js.UndefOr[Boolean] = js.native
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
    def setDiagnosticCodesToIgnoreVarargs(value: Double*): Self = this.set("diagnosticCodesToIgnore", js.Array(value :_*))
    @scala.inline
    def setDiagnosticCodesToIgnore(value: js.Array[Double]): Self = this.set("diagnosticCodesToIgnore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticCodesToIgnore: Self = this.set("diagnosticCodesToIgnore", js.undefined)
    @scala.inline
    def setNoSemanticValidation(value: Boolean): Self = this.set("noSemanticValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSemanticValidation: Self = this.set("noSemanticValidation", js.undefined)
    @scala.inline
    def setNoSuggestionDiagnostics(value: Boolean): Self = this.set("noSuggestionDiagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSuggestionDiagnostics: Self = this.set("noSuggestionDiagnostics", js.undefined)
    @scala.inline
    def setNoSyntaxValidation(value: Boolean): Self = this.set("noSyntaxValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSyntaxValidation: Self = this.set("noSyntaxValidation", js.undefined)
  }
  
}

