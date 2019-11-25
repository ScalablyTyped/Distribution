package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestHooks
  extends NightwatchGlobals
     with NightwatchTests {
  var after: js.UndefOr[NightwatchTestHook] = js.undefined
  var afterEach: js.UndefOr[NightwatchTestHook] = js.undefined
  var before: js.UndefOr[NightwatchTestHook] = js.undefined
  var beforeEach: js.UndefOr[NightwatchTestHook] = js.undefined
}

object NightwatchTestHooks {
  @scala.inline
  def apply(
    abortOnAssertionFailure: js.UndefOr[Boolean] = js.undefined,
    after: NightwatchTestHook = null,
    afterEach: NightwatchTestHook = null,
    asyncHookTimeout: Int | Double = null,
    before: NightwatchTestHook = null,
    beforeEach: NightwatchTestHook = null,
    throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined,
    waitForConditionPollInterval: Int | Double = null,
    waitForConditionTimeout: Int | Double = null
  ): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnAssertionFailure)) __obj.updateDynamic("abortOnAssertionFailure")(abortOnAssertionFailure.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach.asInstanceOf[js.Any])
    if (asyncHookTimeout != null) __obj.updateDynamic("asyncHookTimeout")(asyncHookTimeout.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnMultipleElementsReturned)) __obj.updateDynamic("throwOnMultipleElementsReturned")(throwOnMultipleElementsReturned.asInstanceOf[js.Any])
    if (waitForConditionPollInterval != null) __obj.updateDynamic("waitForConditionPollInterval")(waitForConditionPollInterval.asInstanceOf[js.Any])
    if (waitForConditionTimeout != null) __obj.updateDynamic("waitForConditionTimeout")(waitForConditionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestHooks]
  }
}

