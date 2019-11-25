package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextModelUpdateOptions extends js.Object {
  var indentSize: js.UndefOr[Double] = js.undefined
  var insertSpaces: js.UndefOr[Boolean] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  var trimAutoWhitespace: js.UndefOr[Boolean] = js.undefined
}

object ITextModelUpdateOptions {
  @scala.inline
  def apply(
    indentSize: Int | Double = null,
    insertSpaces: js.UndefOr[Boolean] = js.undefined,
    tabSize: Int | Double = null,
    trimAutoWhitespace: js.UndefOr[Boolean] = js.undefined
  ): ITextModelUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaces)) __obj.updateDynamic("insertSpaces")(insertSpaces.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (!js.isUndefined(trimAutoWhitespace)) __obj.updateDynamic("trimAutoWhitespace")(trimAutoWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextModelUpdateOptions]
  }
}

