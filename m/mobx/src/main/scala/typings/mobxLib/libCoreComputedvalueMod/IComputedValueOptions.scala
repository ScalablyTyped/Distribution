package typings
package mobxLib.libCoreComputedvalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputedValueOptions[T] extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  @JSName("equals")
  var equals_FIComputedValueOptions: js.UndefOr[mobxLib.libUtilsComparerMod.IEqualsComparer[T]] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var requiresReaction: js.UndefOr[scala.Boolean] = js.undefined
  var set: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
}

