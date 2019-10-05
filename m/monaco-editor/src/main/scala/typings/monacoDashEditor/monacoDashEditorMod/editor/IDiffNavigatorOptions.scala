package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffNavigatorOptions extends js.Object {
  val alwaysRevealFirst: js.UndefOr[Boolean] = js.undefined
  val followsCaret: js.UndefOr[Boolean] = js.undefined
  val ignoreCharChanges: js.UndefOr[Boolean] = js.undefined
}

object IDiffNavigatorOptions {
  @scala.inline
  def apply(
    alwaysRevealFirst: js.UndefOr[Boolean] = js.undefined,
    followsCaret: js.UndefOr[Boolean] = js.undefined,
    ignoreCharChanges: js.UndefOr[Boolean] = js.undefined
  ): IDiffNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysRevealFirst)) __obj.updateDynamic("alwaysRevealFirst")(alwaysRevealFirst)
    if (!js.isUndefined(followsCaret)) __obj.updateDynamic("followsCaret")(followsCaret)
    if (!js.isUndefined(ignoreCharChanges)) __obj.updateDynamic("ignoreCharChanges")(ignoreCharChanges)
    __obj.asInstanceOf[IDiffNavigatorOptions]
  }
}

