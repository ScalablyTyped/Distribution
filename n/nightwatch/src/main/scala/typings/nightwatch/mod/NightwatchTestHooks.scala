package typings.nightwatch.mod

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
    asyncHookTimeout: js.UndefOr[Double] = js.undefined,
    before: NightwatchTestHook = null,
    beforeEach: NightwatchTestHook = null,
    throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined,
    waitForConditionPollInterval: js.UndefOr[Double] = js.undefined,
    waitForConditionTimeout: js.UndefOr[Double] = js.undefined
  ): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnAssertionFailure)) __obj.updateDynamic("abortOnAssertionFailure")(abortOnAssertionFailure.get.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncHookTimeout)) __obj.updateDynamic("asyncHookTimeout")(asyncHookTimeout.get.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnMultipleElementsReturned)) __obj.updateDynamic("throwOnMultipleElementsReturned")(throwOnMultipleElementsReturned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForConditionPollInterval)) __obj.updateDynamic("waitForConditionPollInterval")(waitForConditionPollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForConditionTimeout)) __obj.updateDynamic("waitForConditionTimeout")(waitForConditionTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestHooks]
  }
}

