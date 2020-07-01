package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nightwatch.mod.NightwatchTestFunctions
  - typings.nightwatch.mod.NightwatchTestHooks
*/
trait NightwatchTests extends js.Object

object NightwatchTests {
  @scala.inline
  def NightwatchTestFunctions(
    `@disabled`: js.UndefOr[Boolean] = js.undefined,
    `@tags`: String | js.Array[String] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    after: NightwatchTestHook = null,
    afterEach: NightwatchTestHook = null,
    before: NightwatchTestHook = null,
    beforeEach: NightwatchTestHook = null
  ): NightwatchTests = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`@disabled`)) __obj.updateDynamic("@disabled")(`@disabled`.get.asInstanceOf[js.Any])
    if (`@tags` != null) __obj.updateDynamic("@tags")(`@tags`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTests]
  }
  @scala.inline
  def NightwatchTestHooks(
    abortOnAssertionFailure: js.UndefOr[Boolean] = js.undefined,
    after: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit = null,
    afterEach: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit = null,
    asyncHookTimeout: js.UndefOr[Double] = js.undefined,
    before: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit = null,
    beforeEach: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit = null,
    throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined,
    waitForConditionPollInterval: js.UndefOr[Double] = js.undefined,
    waitForConditionTimeout: js.UndefOr[Double] = js.undefined
  ): NightwatchTests = {
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
    __obj.asInstanceOf[NightwatchTests]
  }
}

