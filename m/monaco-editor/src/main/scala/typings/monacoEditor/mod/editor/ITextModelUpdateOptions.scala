package typings.monacoEditor.mod.editor

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
    indentSize: js.UndefOr[Double] = js.undefined,
    insertSpaces: js.UndefOr[Boolean] = js.undefined,
    tabSize: js.UndefOr[Double] = js.undefined,
    trimAutoWhitespace: js.UndefOr[Boolean] = js.undefined
  ): ITextModelUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indentSize)) __obj.updateDynamic("indentSize")(indentSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaces)) __obj.updateDynamic("insertSpaces")(insertSpaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trimAutoWhitespace)) __obj.updateDynamic("trimAutoWhitespace")(trimAutoWhitespace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextModelUpdateOptions]
  }
}

