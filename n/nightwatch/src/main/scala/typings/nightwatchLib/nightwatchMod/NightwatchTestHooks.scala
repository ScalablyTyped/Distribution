package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestHooks extends NightwatchTests {
  var `@disabled`: js.UndefOr[scala.Boolean] = js.undefined
  var after: js.UndefOr[NightwatchTestHook] = js.undefined
  var afterEach: js.UndefOr[NightwatchTestHook] = js.undefined
  var before: js.UndefOr[NightwatchTestHook] = js.undefined
  var beforeEach: js.UndefOr[NightwatchTestHook] = js.undefined
}

object NightwatchTestHooks {
  @scala.inline
  def apply(
    `@disabled`: js.UndefOr[scala.Boolean] = js.undefined,
    after: NightwatchTestHook = null,
    afterEach: NightwatchTestHook = null,
    before: NightwatchTestHook = null,
    beforeEach: NightwatchTestHook = null
  ): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`@disabled`)) __obj.updateDynamic("@disabled")(`@disabled`)
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach)
    __obj.asInstanceOf[NightwatchTestHooks]
  }
}

