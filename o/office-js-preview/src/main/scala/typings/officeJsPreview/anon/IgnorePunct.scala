package typings.officeJsPreview.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnorePunct extends js.Object {
  var ignorePunct: js.UndefOr[Boolean] = js.undefined
  var ignoreSpace: js.UndefOr[Boolean] = js.undefined
  var matchCase: js.UndefOr[Boolean] = js.undefined
  var matchPrefix: js.UndefOr[Boolean] = js.undefined
  var matchSuffix: js.UndefOr[Boolean] = js.undefined
  var matchWholeWord: js.UndefOr[Boolean] = js.undefined
  var matchWildcards: js.UndefOr[Boolean] = js.undefined
}

object IgnorePunct {
  @scala.inline
  def apply(
    ignorePunct: js.UndefOr[Boolean] = js.undefined,
    ignoreSpace: js.UndefOr[Boolean] = js.undefined,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    matchPrefix: js.UndefOr[Boolean] = js.undefined,
    matchSuffix: js.UndefOr[Boolean] = js.undefined,
    matchWholeWord: js.UndefOr[Boolean] = js.undefined,
    matchWildcards: js.UndefOr[Boolean] = js.undefined
  ): IgnorePunct = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignorePunct)) __obj.updateDynamic("ignorePunct")(ignorePunct.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSpace)) __obj.updateDynamic("ignoreSpace")(ignoreSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchPrefix)) __obj.updateDynamic("matchPrefix")(matchPrefix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchSuffix)) __obj.updateDynamic("matchSuffix")(matchSuffix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchWholeWord)) __obj.updateDynamic("matchWholeWord")(matchWholeWord.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchWildcards)) __obj.updateDynamic("matchWildcards")(matchWildcards.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnorePunct]
  }
}

