package typings.nightwatch.nightwatchMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nightwatch.nightwatchMod.NightwatchTestFunctions
  - typings.nightwatch.nightwatchMod.NightwatchTestHooks
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
    if (!js.isUndefined(`@disabled`)) __obj.updateDynamic("@disabled")(`@disabled`.asInstanceOf[js.Any])
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
    after: NightwatchTestHook = null,
    afterEach: NightwatchTestHook = null,
    asyncHookTimeout: Int | Double = null,
    before: NightwatchTestHook = null,
    beforeEach: NightwatchTestHook = null,
    throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined,
    waitForConditionPollInterval: Int | Double = null,
    waitForConditionTimeout: Int | Double = null
  ): NightwatchTests = {
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
    __obj.asInstanceOf[NightwatchTests]
  }
}

