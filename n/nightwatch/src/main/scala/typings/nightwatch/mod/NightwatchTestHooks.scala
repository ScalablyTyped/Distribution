package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestHooks
  extends NightwatchGlobals
     with NightwatchTests {
  var after: js.UndefOr[GlobalNightwatchTestHook] = js.undefined
  var afterEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.undefined
  var before: js.UndefOr[GlobalNightwatchTestHook] = js.undefined
  var beforeEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.undefined
}

object NightwatchTestHooks {
  @scala.inline
  def apply(
    abortOnAssertionFailure: js.UndefOr[Boolean] = js.undefined,
    after: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit = null,
    afterEach: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit = null,
    asyncHookTimeout: js.UndefOr[Double] = js.undefined,
    before: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit = null,
    beforeEach: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit = null,
    throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined,
    waitForConditionPollInterval: js.UndefOr[Double] = js.undefined,
    waitForConditionTimeout: js.UndefOr[Double] = js.undefined
  ): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnAssertionFailure)) __obj.updateDynamic("abortOnAssertionFailure")(abortOnAssertionFailure.get.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction2(afterEach))
    if (!js.isUndefined(asyncHookTimeout)) __obj.updateDynamic("asyncHookTimeout")(asyncHookTimeout.get.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction2(beforeEach))
    if (!js.isUndefined(throwOnMultipleElementsReturned)) __obj.updateDynamic("throwOnMultipleElementsReturned")(throwOnMultipleElementsReturned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForConditionPollInterval)) __obj.updateDynamic("waitForConditionPollInterval")(waitForConditionPollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForConditionTimeout)) __obj.updateDynamic("waitForConditionTimeout")(waitForConditionTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestHooks]
  }
}

