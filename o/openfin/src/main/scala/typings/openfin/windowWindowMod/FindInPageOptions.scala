package typings.openfin.windowWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindInPageOptions extends js.Object {
  var findNext: js.UndefOr[Boolean] = js.undefined
  var forward: js.UndefOr[Boolean] = js.undefined
  var matchCase: js.UndefOr[Boolean] = js.undefined
  var medialCapitalAsWordStart: js.UndefOr[Boolean] = js.undefined
  var wordStart: js.UndefOr[Boolean] = js.undefined
}

object FindInPageOptions {
  @scala.inline
  def apply(
    findNext: js.UndefOr[Boolean] = js.undefined,
    forward: js.UndefOr[Boolean] = js.undefined,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    medialCapitalAsWordStart: js.UndefOr[Boolean] = js.undefined,
    wordStart: js.UndefOr[Boolean] = js.undefined
  ): FindInPageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(findNext)) __obj.updateDynamic("findNext")(findNext.asInstanceOf[js.Any])
    if (!js.isUndefined(forward)) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.asInstanceOf[js.Any])
    if (!js.isUndefined(medialCapitalAsWordStart)) __obj.updateDynamic("medialCapitalAsWordStart")(medialCapitalAsWordStart.asInstanceOf[js.Any])
    if (!js.isUndefined(wordStart)) __obj.updateDynamic("wordStart")(wordStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindInPageOptions]
  }
}

