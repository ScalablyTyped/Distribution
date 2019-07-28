package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchGlobals extends js.Object {
  /**
    * this controls whether to abort the test execution when an assertion failed and skip the rest
    * it's being used in waitFor commands and expect assertions
    * @default true
    */
  var abortOnAssertionFailure: js.UndefOr[Boolean] = js.undefined
  /**
    * controls the timeout time for async hooks. Expects the done() callback to be invoked within this time
    * or an error is thrown
    * @default 10000
    */
  var asyncHookTimeout: js.UndefOr[Double] = js.undefined
  /**
    * this will cause waitFor commands on elements to throw an error if multiple
    * elements are found using the given locate strategy and selector
    * @default true
    */
  var throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined
  /**
    * this will overwrite the default polling interval (currently 500ms) for waitFor commands
    * and expect assertions that use retry
    * @default 300
    */
  var waitForConditionPollInterval: js.UndefOr[Double] = js.undefined
  /**
    * default timeout value in milliseconds for waitFor commands and implicit waitFor value for
    * expect assertions
    * @default 5000
    */
  var waitForConditionTimeout: js.UndefOr[Double] = js.undefined
}

object NightwatchGlobals {
  @scala.inline
  def apply(
    abortOnAssertionFailure: js.UndefOr[Boolean] = js.undefined,
    asyncHookTimeout: Int | Double = null,
    throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined,
    waitForConditionPollInterval: Int | Double = null,
    waitForConditionTimeout: Int | Double = null
  ): NightwatchGlobals = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnAssertionFailure)) __obj.updateDynamic("abortOnAssertionFailure")(abortOnAssertionFailure)
    if (asyncHookTimeout != null) __obj.updateDynamic("asyncHookTimeout")(asyncHookTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnMultipleElementsReturned)) __obj.updateDynamic("throwOnMultipleElementsReturned")(throwOnMultipleElementsReturned)
    if (waitForConditionPollInterval != null) __obj.updateDynamic("waitForConditionPollInterval")(waitForConditionPollInterval.asInstanceOf[js.Any])
    if (waitForConditionTimeout != null) __obj.updateDynamic("waitForConditionTimeout")(waitForConditionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchGlobals]
  }
}

