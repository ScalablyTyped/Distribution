package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarkdownString extends js.Object {
  var isTrusted: js.UndefOr[scala.Boolean] = js.undefined
  var uris: js.UndefOr[org.scalablytyped.runtime.StringDictionary[UriComponents]] = js.undefined
  var value: java.lang.String
}

object IMarkdownString {
  @scala.inline
  def apply(
    value: java.lang.String,
    isTrusted: js.UndefOr[scala.Boolean] = js.undefined,
    uris: org.scalablytyped.runtime.StringDictionary[UriComponents] = null
  ): IMarkdownString = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted)
    if (uris != null) __obj.updateDynamic("uris")(uris)
    __obj.asInstanceOf[IMarkdownString]
  }
}

