package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReactionScheduler extends js.Object {
  var computedRequiresReaction: js.UndefOr[scala.Boolean] = js.undefined
  var disableErrorBoundaries: js.UndefOr[scala.Boolean] = js.undefined
  var enforceActions: js.UndefOr[
    scala.Boolean | mobxLib.mobxLibStrings.strict | mobxLib.mobxLibStrings.never | mobxLib.mobxLibStrings.always | mobxLib.mobxLibStrings.observed
  ] = js.undefined
  var isolateGlobalState: js.UndefOr[scala.Boolean] = js.undefined
  var reactionScheduler: js.UndefOr[js.Function1[/* f */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
}

