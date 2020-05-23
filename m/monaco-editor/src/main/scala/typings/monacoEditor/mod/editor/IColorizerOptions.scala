package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorizerOptions extends js.Object {
  var tabSize: js.UndefOr[Double] = js.undefined
}

object IColorizerOptions {
  @scala.inline
  def apply(tabSize: js.UndefOr[Double] = js.undefined): IColorizerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorizerOptions]
  }
}

