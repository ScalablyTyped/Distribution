package typings.officeDashJsDashPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnorePunct extends js.Object {
  var ignorePunct: js.UndefOr[Boolean] = js.undefined
  var ignoreSpace: js.UndefOr[Boolean] = js.undefined
  var matchCase: js.UndefOr[Boolean] = js.undefined
  var matchPrefix: js.UndefOr[Boolean] = js.undefined
  var matchSuffix: js.UndefOr[Boolean] = js.undefined
  var matchWholeWord: js.UndefOr[Boolean] = js.undefined
  var matchWildcards: js.UndefOr[Boolean] = js.undefined
}

object Anon_IgnorePunct {
  @scala.inline
  def apply(
    ignorePunct: js.UndefOr[Boolean] = js.undefined,
    ignoreSpace: js.UndefOr[Boolean] = js.undefined,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    matchPrefix: js.UndefOr[Boolean] = js.undefined,
    matchSuffix: js.UndefOr[Boolean] = js.undefined,
    matchWholeWord: js.UndefOr[Boolean] = js.undefined,
    matchWildcards: js.UndefOr[Boolean] = js.undefined
  ): Anon_IgnorePunct = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignorePunct)) __obj.updateDynamic("ignorePunct")(ignorePunct.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSpace)) __obj.updateDynamic("ignoreSpace")(ignoreSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.asInstanceOf[js.Any])
    if (!js.isUndefined(matchPrefix)) __obj.updateDynamic("matchPrefix")(matchPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(matchSuffix)) __obj.updateDynamic("matchSuffix")(matchSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(matchWholeWord)) __obj.updateDynamic("matchWholeWord")(matchWholeWord.asInstanceOf[js.Any])
    if (!js.isUndefined(matchWildcards)) __obj.updateDynamic("matchWildcards")(matchWildcards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IgnorePunct]
  }
}

