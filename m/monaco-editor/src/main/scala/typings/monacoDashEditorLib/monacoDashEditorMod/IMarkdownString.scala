package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarkdownString extends js.Object {
  var isTrusted: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String
}

object IMarkdownString {
  @scala.inline
  def apply(value: java.lang.String, isTrusted: js.UndefOr[scala.Boolean] = js.undefined): IMarkdownString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted)
    __obj.asInstanceOf[IMarkdownString]
  }
}

