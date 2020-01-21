package typings.monacoEditor.mod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticsOptions extends js.Object {
  var noSemanticValidation: js.UndefOr[Boolean] = js.undefined
  var noSyntaxValidation: js.UndefOr[Boolean] = js.undefined
}

object DiagnosticsOptions {
  @scala.inline
  def apply(
    noSemanticValidation: js.UndefOr[Boolean] = js.undefined,
    noSyntaxValidation: js.UndefOr[Boolean] = js.undefined
  ): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noSemanticValidation)) __obj.updateDynamic("noSemanticValidation")(noSemanticValidation.asInstanceOf[js.Any])
    if (!js.isUndefined(noSyntaxValidation)) __obj.updateDynamic("noSyntaxValidation")(noSyntaxValidation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticsOptions]
  }
}

