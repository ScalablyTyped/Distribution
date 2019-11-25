package typings.monacoDashEditor.monacoDashEditorMod.languages.css

import typings.monacoDashEditor.Anon_ArgumentsInColorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticsOptions extends js.Object {
  val lint: js.UndefOr[Anon_ArgumentsInColorFunction] = js.undefined
  val validate: js.UndefOr[Boolean] = js.undefined
}

object DiagnosticsOptions {
  @scala.inline
  def apply(lint: Anon_ArgumentsInColorFunction = null, validate: js.UndefOr[Boolean] = js.undefined): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    if (lint != null) __obj.updateDynamic("lint")(lint.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticsOptions]
  }
}

