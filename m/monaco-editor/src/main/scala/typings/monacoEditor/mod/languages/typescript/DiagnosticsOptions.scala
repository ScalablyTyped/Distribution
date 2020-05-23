package typings.monacoEditor.mod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticsOptions extends js.Object {
  var diagnosticCodesToIgnore: js.UndefOr[js.Array[Double]] = js.undefined
  var noSemanticValidation: js.UndefOr[Boolean] = js.undefined
  var noSuggestionDiagnostics: js.UndefOr[Boolean] = js.undefined
  var noSyntaxValidation: js.UndefOr[Boolean] = js.undefined
}

object DiagnosticsOptions {
  @scala.inline
  def apply(
    diagnosticCodesToIgnore: js.Array[Double] = null,
    noSemanticValidation: js.UndefOr[Boolean] = js.undefined,
    noSuggestionDiagnostics: js.UndefOr[Boolean] = js.undefined,
    noSyntaxValidation: js.UndefOr[Boolean] = js.undefined
  ): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    if (diagnosticCodesToIgnore != null) __obj.updateDynamic("diagnosticCodesToIgnore")(diagnosticCodesToIgnore.asInstanceOf[js.Any])
    if (!js.isUndefined(noSemanticValidation)) __obj.updateDynamic("noSemanticValidation")(noSemanticValidation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSuggestionDiagnostics)) __obj.updateDynamic("noSuggestionDiagnostics")(noSuggestionDiagnostics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSyntaxValidation)) __obj.updateDynamic("noSyntaxValidation")(noSyntaxValidation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticsOptions]
  }
}

