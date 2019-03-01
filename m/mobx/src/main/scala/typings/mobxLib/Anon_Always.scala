package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  var computedRequiresReaction: js.UndefOr[scala.Boolean] = js.undefined
  var disableErrorBoundaries: js.UndefOr[scala.Boolean] = js.undefined
  var enforceActions: js.UndefOr[
    scala.Boolean | mobxLib.mobxLibStrings.strict | mobxLib.mobxLibStrings.never | mobxLib.mobxLibStrings.always | mobxLib.mobxLibStrings.observed
  ] = js.undefined
  var isolateGlobalState: js.UndefOr[scala.Boolean] = js.undefined
  var reactionScheduler: js.UndefOr[js.Function1[/* f */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
}

object Anon_Always {
  @scala.inline
  def apply(
    computedRequiresReaction: js.UndefOr[scala.Boolean] = js.undefined,
    disableErrorBoundaries: js.UndefOr[scala.Boolean] = js.undefined,
    enforceActions: scala.Boolean | mobxLib.mobxLibStrings.strict | mobxLib.mobxLibStrings.never | mobxLib.mobxLibStrings.always | mobxLib.mobxLibStrings.observed = null,
    isolateGlobalState: js.UndefOr[scala.Boolean] = js.undefined,
    reactionScheduler: js.Function1[/* f */ js.Function0[scala.Unit], scala.Unit] = null
  ): Anon_Always = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(computedRequiresReaction)) __obj.updateDynamic("computedRequiresReaction")(computedRequiresReaction)
    if (!js.isUndefined(disableErrorBoundaries)) __obj.updateDynamic("disableErrorBoundaries")(disableErrorBoundaries)
    if (enforceActions != null) __obj.updateDynamic("enforceActions")(enforceActions.asInstanceOf[js.Any])
    if (!js.isUndefined(isolateGlobalState)) __obj.updateDynamic("isolateGlobalState")(isolateGlobalState)
    if (reactionScheduler != null) __obj.updateDynamic("reactionScheduler")(reactionScheduler)
    __obj.asInstanceOf[Anon_Always]
  }
}

