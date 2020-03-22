package typings.monacoEditor.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarkdownString extends js.Object {
  val isTrusted: js.UndefOr[Boolean] = js.undefined
  val supportThemeIcons: js.UndefOr[Boolean] = js.undefined
  var uris: js.UndefOr[StringDictionary[UriComponents]] = js.undefined
  val value: String
}

object IMarkdownString {
  @scala.inline
  def apply(
    value: String,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    supportThemeIcons: js.UndefOr[Boolean] = js.undefined,
    uris: StringDictionary[UriComponents] = null
  ): IMarkdownString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted.asInstanceOf[js.Any])
    if (!js.isUndefined(supportThemeIcons)) __obj.updateDynamic("supportThemeIcons")(supportThemeIcons.asInstanceOf[js.Any])
    if (uris != null) __obj.updateDynamic("uris")(uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownString]
  }
}

