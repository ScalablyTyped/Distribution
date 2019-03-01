package typings
package officeDashJsDashPreviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnorePunct extends js.Object {
  var ignorePunct: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreSpace: js.UndefOr[scala.Boolean] = js.undefined
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  var matchPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var matchSuffix: js.UndefOr[scala.Boolean] = js.undefined
  var matchWholeWord: js.UndefOr[scala.Boolean] = js.undefined
  var matchWildcards: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IgnorePunct {
  @scala.inline
  def apply(
    ignorePunct: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSpace: js.UndefOr[scala.Boolean] = js.undefined,
    matchCase: js.UndefOr[scala.Boolean] = js.undefined,
    matchPrefix: js.UndefOr[scala.Boolean] = js.undefined,
    matchSuffix: js.UndefOr[scala.Boolean] = js.undefined,
    matchWholeWord: js.UndefOr[scala.Boolean] = js.undefined,
    matchWildcards: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IgnorePunct = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignorePunct)) __obj.updateDynamic("ignorePunct")(ignorePunct)
    if (!js.isUndefined(ignoreSpace)) __obj.updateDynamic("ignoreSpace")(ignoreSpace)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (!js.isUndefined(matchPrefix)) __obj.updateDynamic("matchPrefix")(matchPrefix)
    if (!js.isUndefined(matchSuffix)) __obj.updateDynamic("matchSuffix")(matchSuffix)
    if (!js.isUndefined(matchWholeWord)) __obj.updateDynamic("matchWholeWord")(matchWholeWord)
    if (!js.isUndefined(matchWildcards)) __obj.updateDynamic("matchWildcards")(matchWildcards)
    __obj.asInstanceOf[Anon_IgnorePunct]
  }
}

